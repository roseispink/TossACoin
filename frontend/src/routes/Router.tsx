import { paths } from "@utils/paths";
import { lazy, ReactElement, Suspense } from "react";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import { LandingPage } from "./LandingPage/LandingPage";

const ContentWrapper = lazy(() => import("./ContentWrapper/ContentWrapper"));
const SignIn = lazy(() => import("./SignIn/SignIn"));
const Protected = lazy(() => import("./Protected/Protected"));
const CollectionPage = lazy(() => import("./CollectionPage/CollectionPage"));

export const Router = (): ReactElement => {
  return (
    <BrowserRouter>
      <Routes>
        <Route
          element={
            <Suspense fallback={null}>
              <SignIn />
            </Suspense>
          }
          path={paths.signIn}
        />
        <Route
          element={
            <Suspense fallback={null}>
              <LandingPage />
            </Suspense>
          }
          path={paths.landingPage}
        />
        <Route
          element={
            <Suspense fallback={null}>
              <CollectionPage />
            </Suspense>
          }
          path={"/collection"}
        />
        {/* Collections
          AboutUs */}
        <Route
          element={
            <Suspense fallback={null}>
              <Protected />
            </Suspense>
          }
        >
          <Route element={<ContentWrapper />}>
            {/* ----Temp--- */}
            <Route
              element={
                <Suspense fallback={null}>
                  <LandingPage />
                </Suspense>
              }
              path={paths.profile}
            />
            {/* ---------- */}
            {/* afterLogIn for example profile settings create collectons etc*/}
          </Route>
        </Route>
      </Routes>
    </BrowserRouter>
  );
};
