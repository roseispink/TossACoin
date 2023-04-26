import { Collection } from "@services/CollectionService";

export const getCollection = (id: string): Collection | undefined => {
  if (Number(id) === 2) {
    return {
      title: "Lorem ipsum dolor sit amet, consectetur adipiscing elit",
      goal: 10000,
      value: 2000,
      imgs: ["/assets/img.png", "/assets/img.png", "/assets/img.png"],
      description: [
        ` Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
  eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut
  enim ad minim veniam, quis nostrud exercitation ullamco laboris
  nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in
  reprehenderit in voluptate velit esse cillum dolore eu fugiat
  nulla pariatur.`,
        ` Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
  eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut
  enim ad minim veniam, quis nostrud exercitation ullamco laboris
  nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in
  reprehenderit in voluptate velit esse cillum dolore eu fugiat
  nulla pariatur.`,
      ],
      id: 2,
      donation: [
        {
          _id: "2$",
          value: 10,
        },
        {
          _id: "5$",
          value: 100,
        },
        {
          _id: "20$",
          value: 25,
        },
        {
          _id: "100$",
          value: 5,
        },
      ],
    };
  }
  return undefined;
};

export const getDefaultDonations = ():number[] => {
  const defaultDonations = [5, 10, 20, 50, 100, 200]
  return defaultDonations;
}