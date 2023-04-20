import { Flex, Text } from "@chakra-ui/react";
import { DonationData } from "@services/CollectionService";
import { ReactElement } from "react";

type Props = {
  data: DonationData[];
};
export const Bubble = ({ data }: Props): ReactElement => {
  return (
    <>
      {data.map((value, key) => {
        return (
          <Flex
            alignItems="center"
            backgroundColor="green.300"
            borderRadius="full"
            height={`${value.value * 3}px`}
            justifyContent="center"
            key={key}
            minH="16"
            minW="16"
            px="4"
            py="4"
            width={`${value.value * 3}px`}
          >
            <Text
              fontSize={
                value.value > 99 ? "3xl" : value.value > 50 ? "xl" : "md"
              }
              fontWeight={
                value.value > 99
                  ? "bold"
                  : value.value > 50
                  ? "semibold"
                  : "medium"
              }
            >
              {value._id}
            </Text>
          </Flex>
        );
      })}
    </>
  );
};
