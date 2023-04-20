import { ComponentStyleConfig } from "@chakra-ui/react";

export const Button: ComponentStyleConfig = {
  baseStyle: {
    fontWeight: "semibold",
  },
  variants: {
    primary: {
      backgroundColor: "red.500",
      color: "white",
      _hover: {
        backgroundColor: "red.300",
      },
    },
  },
  defaultProps: {
    variant: "primary",
  },
};
