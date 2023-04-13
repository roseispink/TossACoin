import { ChakraProvider, extendTheme } from "@chakra-ui/react";
import { GoogleOAuthProvider } from "@react-oauth/google";
import { Router } from "@routes/Router";
import { CollectionServiceProvider } from "@services/CollectionService";
import { SessionServiceProvider } from "@services/SessionService";
import { rawTheme } from "@styles/theme";
import { QueryClient, QueryClientProvider } from "@tanstack/react-query";
import { ReactElement, useState } from "react";

const theme = extendTheme(rawTheme);

const App = (): ReactElement => {
  const [client] = useState(() => new QueryClient());

  return (
    <QueryClientProvider client={client}>
      <ChakraProvider theme={theme}>
        <SessionServiceProvider>
          <GoogleOAuthProvider clientId="<your_client_id>">
            <CollectionServiceProvider>
              <Router />
            </CollectionServiceProvider>
          </GoogleOAuthProvider>
        </SessionServiceProvider>
      </ChakraProvider>
    </QueryClientProvider>
  );
};

export default App;
