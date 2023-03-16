import { Button } from "@chakra-ui/react";
import { useGoogleLogin } from "@react-oauth/google";
import { ReactElement } from "react";

export const Google = (): ReactElement => {
  const login = useGoogleLogin({
    onSuccess: (tokenResponse) => console.log(tokenResponse),
  });
  return (
    <Button
      alignItems="center"
      bgColor="#DD5144"
      borderRadius="full"
      display="flex"
      fontSize="md"
      h="40px"
      justifyContent="center"
      onClick={() => login()}
      w="40px"
    >
      G
    </Button>
  );
};
