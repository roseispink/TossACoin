import { Button, Divider, Flex, Input, Text } from "@chakra-ui/react";
import { Facebook } from "@components/Facebook/Facebook";
import { Google } from "@components/Google/Google";
import { ReactElement } from "react";
/*
import { useAnonService, useSessionStatus } from "@services/SessionService";
import { useMutation } from "@tanstack/react-query";*/

import { paths } from "@utils/paths";
import { Link } from "react-router-dom";
import { useFormik } from "formik";
import bg from "./assets/bg.svg";

export const SignUpPage = (): ReactElement => {
  /*const status = useSessionStatus();
  const anonService = useAnonService();
  const { mutate } = useMutation(anonService.signIn);*/

  const formik = useFormik({
    initialValues: {
      name: "",
      email: "",
      password: "",
    },
    onSubmit: (values) => {
      alert(JSON.stringify(values, null, 2));
    },
  });

  return (
    <>
      <Link to={paths.landingPage}>
        <Flex
          alignItems="center"
          fontSize="3xl"
          fontWeight="semibold"
          gap="2"
          left="8"
          position="absolute"
          top="7"
        >
          <Text color="red.400">Toss</Text>
          <Text color="white">A</Text>
          <Text color="green.100">Coin</Text>
        </Flex>
      </Link>
      <Flex bg="dark.400" h="100vh" w="full">
        <Flex
          alignItems="center"
          bgImage={bg}
          bgRepeat="no-repeat"
          bgSize="cover"
          flexDir="column"
          gap="8"
          justifyContent="center"
          textAlign="center"
          textColor="dark.400"
          w="40%"
        >
          <Text fontSize="3xl" fontWeight="semibold" maxW="96">
            Welcome back!
          </Text>
          <Text fontSize="2xl" fontWeight="regular" maxW="96">
            To check out your collections
          </Text>
          <Link to={paths.signIn}>
            <Button
              bg="green.100"
              boxShadow="md"
              fontSize="2xl"
              fontWeight="semibold"
              h="fit-content"
              px="16"
              py="4"
              textColor="white"
              w="fit-content"
            >
              <Text>Sign In</Text>
            </Button>
          </Link>
        </Flex>
        <Flex
          alignItems="center"
          flexDir="column"
          gap="8"
          justifyContent="center"
          textAlign="center"
          textColor="white"
          w="60%"
        >
          <Text fontSize="3xl" fontWeight="semibold" maxW="96">
            Login to Your Account
          </Text>
          <form onSubmit={formik.handleSubmit}>
            <Flex alignItems="center" flexDir="column" gap="4" w="96">
              <Input
                _placeholder={{ color: "white", opacity: "0.5" }}
                id="name"
                name="name"
                onChange={formik.handleChange}
                placeholder="Name"
                textColor="white"
                type="name"
                value={formik.values.name}
              />
              <Input
                _placeholder={{ color: "white", opacity: "0.5" }}
                id="email"
                name="email"
                onChange={formik.handleChange}
                placeholder="Email"
                textColor="white"
                type="email"
                value={formik.values.email}
              />
              <Input
                _placeholder={{ color: "white", opacity: "0.5" }}
                id="password"
                name="password"
                onChange={formik.handleChange}
                placeholder="Password"
                textColor="white"
                type="password"
                value={formik.values.password}
              />
              <Flex alignItems="center" w="full">
                <Divider orientation="horizontal" />
                <Text fontSize="sm" px="3">
                  OR
                </Text>

                <Divider orientation="horizontal" />
              </Flex>
              <Flex gap="4">
                <Google />
                <Facebook />
              </Flex>
              <Button
                bg="green.100"
                fontSize="2xl"
                fontWeight="semibold"
                h="fit-content"
                px="16"
                py="4"
                textColor="white"
                type="submit"
                w="fit-content"
              >
                <Text>Sign Up</Text>
              </Button>
            </Flex>
          </form>
        </Flex>
      </Flex>
    </>
  );
};
