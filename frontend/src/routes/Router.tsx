import { paths } from "@utils/paths";
import { lazy, ReactElement, Suspense } from "react";
import { BrowserRouter, Route, Routes } from "react-router-dom";

const ContentWrapper = lazy(() => import("./ContentWrapper/ContentWrapper"));
const SignIn = lazy(() => import("./SignIn/SignIn"));
const Protected = lazy(() => import("./Protected/Protected"));
const LandingPage = lazy(() => import("./LandingPage/LandingPage"));

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
