import { paths } from "@utils/paths";
import { ReactElement, lazy } from "react";
import { BrowserRouter, Route, Routes } from "react-router-dom";

const ContentWrapper = lazy(() => import("./ContentWrapper/ContentWrapper"));
const LandingPage = lazy(() => import("./LandingPage/LandingPage"));

export const Router = (): ReactElement => {
  return (
    <BrowserRouter>
      <Routes>
        <Route element={<ContentWrapper />}>
          <Route element={<LandingPage />} path={paths.landingPage} />
        </Route>
      </Routes>
    </BrowserRouter>
  );
};
