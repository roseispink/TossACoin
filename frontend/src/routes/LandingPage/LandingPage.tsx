import {
  Button,
  Flex,
  Heading,
  Input,
  NumberInput,
  NumberInputField,
} from "@chakra-ui/react";
import { TopBar } from "@components/TopBar/TopBar";
import { ReactElement } from "react";
import lp from "./assets/lp.png";

export const LandingPage = (): ReactElement => {
  return (
    <>
      <TopBar />
      <Flex
        bgImage={lp}
        bgPosition="top"
        bgRepeat="no-repeat"
        bgSize="cover"
        h="calc(100vh - 80px)"
        w="full"
      >
        <Flex
          alignItems="center"
          flexDir="column"
          gap="4"
          h="full"
          justifyContent="center"
          w="full"
        >
          <Heading color="white">Create your collection</Heading>
          <Input
            _focusVisible={{
              borderColor: "red.500",
            }}
            bgColor="white"
            borderColor="dark.300"
            borderRadius="lg"
            placeholder="Purpose"
            w="80"
          />

          <NumberInput bgColor="white" borderRadius="lg" w="40">
            <NumberInputField
              _focusVisible={{
                borderColor: "red.500",
              }}
              borderColor="dark.300"
              placeholder="Amount"
            />
          </NumberInput>
          <Button
            _hover={{
              bgColor: "red.300",
            }}
            bg="red.500"
            border="1px"
            borderColor="dark.400"
            color="white"
            fontSize="xl"
            px="7"
            py="2"
            transitionDuration="0.4s"
          >
            Set up a collection
          </Button>
        </Flex>
      </Flex>
    </>
  );
};
