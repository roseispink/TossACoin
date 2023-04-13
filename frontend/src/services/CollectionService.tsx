import { QueryFunction } from "@tanstack/react-query";
import { getCollection } from "@utils/mock";
import {
  createContext,
  ReactElement,
  ReactNode,
  useContext,
  useMemo,
} from "react";

export type DonationData = {
  _id: string;
  value: number;
};

export type Collection = {
  title: string;
  goal: number;
  value: number;
  imgs: string[];
  description: string[];
  id: number;
  donation: DonationData[];
};

type CollectionKey = ["collection", string] | ["collection"];

export type CollectionService = {
  collection: QueryFunction<Collection | undefined, CollectionKey>;
  collectionKey: (query?: string) => CollectionKey;
};

export type CollectionServiceNullableValue =
  | {
      isInitialized: false;
    }
  | {
      isInitialized: true;
      value: CollectionService;
    };

export const CollectionService = createContext<CollectionServiceNullableValue>({
  isInitialized: false,
});

export const useCollectionService = (): CollectionService => {
  const context = useContext(CollectionService);

  if (context.isInitialized !== true) {
    throw new Error("CollectionService not defined");
  }

  return context.value;
};

export const getSessionQueryKey = (): string[] => {
  return ["session"];
};

type Props = {
  children: ReactNode;
};

export const CollectionServiceProvider = ({
  children,
}: Props): ReactElement => {
  const value = useMemo<CollectionServiceNullableValue>(() => {
    return {
      isInitialized: true,
      value: {
        collection: async ({ queryKey }) => {
          const [, query] = queryKey;

          if (!query) {
            return undefined;
          }
          const result = await Promise.resolve(getCollection(query));

          return result;
        },

        collectionKey: (query) => {
          return query ? ["collection", query] : ["collection"];
        },
      },
    };
  }, []);

  return (
    <CollectionService.Provider value={value}>
      {children}
    </CollectionService.Provider>
  );
};
