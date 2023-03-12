import { extendTheme } from "@chakra-ui/react";

export const rawTheme = {
  components: {},
  styles: {
    global: {
      body: {
        //fontFamily: "Inter",
      },
    },
  },
  colors: {
    green: {
      100: "#6eb701",
      200: "#479200",
      300: "#1A6F00",
      400: "#004D00",
    },
    red: {
      100: "#FF889A",
      200: "#FF6B80",
      300: "#FF4C67",
      400: "#E2294F",
    },
    dark: {
      100: "#A1A2A2",
      200: "#767777",
      300: "#4D4E4E",
      400: "#282929",
    },
    white: "#fafffc",
  },
};
export const theme = extendTheme(rawTheme);
