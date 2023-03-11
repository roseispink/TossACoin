import { ChakraProvider, extendTheme } from "@chakra-ui/react";
import { Router } from "@routes/Router";
import { rawTheme } from "@styles/theme";
import { ReactElement } from "react";

const theme = extendTheme(rawTheme);

const App = (): ReactElement => {
  return (
    <ChakraProvider theme={theme}>
      <Router />
    </ChakraProvider>
  );
};

export default App;
