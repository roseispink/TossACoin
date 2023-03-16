import { Text } from "@chakra-ui/react";
import FacebookLogin from "@greatsumini/react-facebook-login";
import { ReactElement } from "react";

export const Facebook = (): ReactElement => {
  return (
    <FacebookLogin
      appId="1088597931155576"
      style={{
        backgroundColor: "#4267b2",
        color: "#fff",
        fontSize: "16px",
        display: "flex",
        border: "none",
        borderRadius: "100%",
        width: "40px",
        height: "40px",
        justifyContent: "center",
        alignItems: "center",
        fontWeight: "bold",
      }}
    >
      <Text>f</Text>
    </FacebookLogin>
  );
};
