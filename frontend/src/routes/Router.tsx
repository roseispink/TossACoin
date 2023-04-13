import { paths } from "@utils/paths";
import { lazy, ReactElement, Suspense } from "react";
import { BrowserRouter, Route, Routes } from "react-router-dom";

import { LandingPage } from "./LandingPage/LandingPage";
import { SignUpPage } from "./SignUpPage/SignUpPage";
import { SignIn } from "./SignIn/SignIn";
import { Collections } from "./Collections/Collections";

const ContentWrapper = lazy(() => import("./ContentWrapper/ContentWrapper"));

export const Router = (): ReactElement => {
  return (
    <BrowserRouter>
      <Routes>
        <Route element={<ContentWrapper />}>
          <Route element={<LandingPage />} path={paths.landingPage} />
          <Route element={<SignUpPage />} path={paths.profile} />
          <Route element={<SignIn />} path={paths.signIn} />
          <Route element={<Collections />} path={paths.collections} />
        </Route>
      </Routes>
    </BrowserRouter>
  );
};
