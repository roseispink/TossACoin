import {
  Flex,
  Heading,
  Text,
  Card,
  Stack,
  CardBody,
  Progress,
  SimpleGrid,
  Image,
} from "@chakra-ui/react";
import { ReactElement } from "react";

export const Collections = (): ReactElement => {
  const data: any = [
    { id: 1, title: "title1" },
    { id: 2, title: "title2" },
    { id: 3, title: "title3" },
    { id: 4, title: "title4" },
    { id: 5, title: "title5" },
    { id: 6, title: "title6" },
    { id: 7, title: "title7" },
    { id: 8, title: "title8" },
  ];

  return (
    <>
      <Flex bg="dark.400" h="100vh" justifyContent="center" w="full">
        <SimpleGrid columns={4} spacingX="40px" spacingY="20px">
          {data.map((item: any, index: number) => {
            return (
              <Card height={"450px"} maxW="sm">
                <CardBody>
                  <Image src="../assets/img.png" />
                  <Stack mt="6" spacing="3">
                    <Heading size="xl">Lorem ipsum</Heading>
                    <Progress colorScheme='red' value={20} />
                    <Text color='black' fontSize='xl' fontWeight={'bold'}>
                      2000$ of 10000$
                    </Text>
                  </Stack>
                </CardBody>
              </Card>
            );
          })}
        </SimpleGrid>
      </Flex>
    </>
  );
};
