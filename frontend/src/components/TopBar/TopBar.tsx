import { Flex, Icon, Text } from "@chakra-ui/react";
import PersonOutlineIcon from "@mui/icons-material/PersonOutline";
import { paths } from "@utils/paths";
import { ReactElement } from "react";
import { Link } from "react-router-dom";

export const TopBar = (): ReactElement => {
  return (
    <Flex
      alignItems="center"
      bg="white"
      borderBottomRadius="2xl"
      boxShadow="0px 4px 4px rgba(0, 0, 0, 0.25)"
      flexDir="row"
      h="20"
      justifyContent="space-between"
      px="8"
      py="2"
    >
      <Flex gap="16">
        <Link to={paths.landingPage}>
          <Flex
            alignItems="center"
            fontSize="3xl"
            fontWeight="semibold"
            gap="2"
          >
            <Text color="red.400">Toss</Text>
            <Text color="dark.400">A</Text>
            <Text color="green.100">Coin</Text>
          </Flex>
        </Link>
        <Flex alignItems="center" fontSize="2xl" fontWeight="semibold" gap="8">
          <Link to={paths.collections}>
            <Text
              _hover={{
                color: "red.200",
              }}
              transitionDuration="0.2s"
            >
              Collections
            </Text>
          </Link>
          <Link to={paths.about}>
            <Text
              _hover={{
                color: "red.200",
              }}
              transitionDuration="0.2s"
            >
              About us
            </Text>
          </Link>
        </Flex>
      </Flex>
      <Link to={paths.profile}>
        <Icon
          _hover={{
            color: "red.200",
          }}
          as={PersonOutlineIcon}
          h="12"
          transitionDuration="0.2s"
          w="12"
        />
      </Link>
    </Flex>
  );
};
