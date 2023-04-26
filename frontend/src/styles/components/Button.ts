import { ComponentStyleConfig } from "@chakra-ui/react";

export const Button: ComponentStyleConfig = {
  baseStyle: {
    fontWeight: "semibold"
  },
  variants: {
    primary: {
      backgroundColor: "red.500",
      color: "white",
      _hover: {
        backgroundColor: "red.300"
      }
    },
    secondary: {
      backgroundColor: "transparent",
      borderWidth: "1px",
      borderColor: "red.500",
      color: "red.500",
      fontWeight: "semibold",
      fontSize: "3xl",
      minW: "40",
      textAlign: "center",
      py: "2",
      h: "fit-content",
      _hover: {
        backgroundColor: "red.500",
        color: "white"
      },
      _active: {
        backgroundColor: "red.500",
        color: "white"
      }
    }
  },
  defaultProps: {
    variant: "primary"
  }
};
