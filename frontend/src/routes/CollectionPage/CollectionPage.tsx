import {
  Box,
  Button,
  Flex,
  Heading,
  Highlight,
  Image,
  Progress,
  Text,
} from "@chakra-ui/react";
import { TopBar } from "@components/TopBar/TopBar";
import { useCollectionService } from "@services/CollectionService";
import { useQuery } from "@tanstack/react-query";
import { paths } from "@utils/paths";
import { ReactElement } from "react";
import { Navigate, useSearchParams } from "react-router-dom";
import { Bubble } from "./Bubble/Bubble";
import { ImgCarousel } from "./ImgCarousel/ImgCarousel";

const CollectionPage = (): ReactElement => {
  const [queryParameters] = useSearchParams();
  const id = queryParameters.get("id");
  const collectionService = useCollectionService();
  if (!id) {
    return <Navigate to={paths.notFound} />;
  }

  const query = useQuery(
    collectionService.collectionKey(id),
    collectionService.collection
  );
  return (
    <>
      <TopBar />
      {query.status === "loading" ? (
        <Box>loading</Box>
      ) : !query.data ? (
        <Box>Error</Box>
      ) : (
        <Flex flexDir="column" gap="16" px="40" py="16">
          <Flex
            gap="8"
            maxH="calc(100vh - 80px - 128px)"
            maxW="calc(100vw - 256px)"
          >
            <ImgCarousel imgArray={query.data.imgs} />
            <Flex flexDir="column" gap="6" maxH="560px">
              <Text fontSize="4xl" fontWeight="semibold">
                {query.data.title}
              </Text>
              <Text fontSize="2xl" fontWeight="semibold">
                <Highlight
                  query={`${query.data.goal}$`}
                  styles={{ fontWeight: "bold" }}
                >
                  {`${query.data.value}$ of ${query.data.goal}$`}
                </Highlight>
              </Text>
              <Progress borderRadius="lg" colorScheme="red" h="9" value={20} />
              <Button fontSize="3xl" h="16">
                DONATE
              </Button>
            </Flex>
          </Flex>
          <Flex flexDir="column" gap="8">
            <Heading>Description</Heading>
            <Flex flexDir="column" fontSize="xl" gap="4">
              {query.data.description.map((desc, key) => {
                return (
                  <>
                    <Text key={key}>{desc}</Text>
                    {query.data?.imgs[key] && (
                      <Image
                        key={key}
                        margin="auto"
                        src={query.data.imgs[key]}
                        w="30%"
                      />
                    )}
                  </>
                );
              })}
            </Flex>
          </Flex>
          <Flex
            border="1px"
            borderColor="dark.200"
            borderRadius="md"
            justifyContent="center"
            overflow="hidden"
            p="6"
          >
            <Bubble data={query.data?.donation} />
          </Flex>
        </Flex>
      )}
    </>
  );
};

export default CollectionPage;
