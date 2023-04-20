import { Box, Image } from "@chakra-ui/react";
import { ReactElement } from "react";
import { Carousel } from "react-responsive-carousel";
import "react-responsive-carousel/lib/styles/carousel.min.css";

type Props = {
  imgArray: string[];
};

export const ImgCarousel = ({ imgArray }: Props): ReactElement => {
  return (
    <Carousel width="auto">
      {imgArray.map((value, key) => {
        return (
          <Box h="full" key={key}>
            <Image borderRadius="lg" fit="cover" maxH="560px" src={value} />
          </Box>
        );
      })}
    </Carousel>
  );
};
