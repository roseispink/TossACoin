import { Box } from "@chakra-ui/react";
import { TopBar } from "@components/TopBar/TopBar";
import { ReactElement } from "react";
import { Outlet } from "react-router-dom";

const ContentWrapper = (): ReactElement => {
  return (
    <Box>
      <TopBar />
      <Outlet />
    </Box>
  );
};

export default ContentWrapper;
