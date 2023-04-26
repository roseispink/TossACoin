import {
  Button,
  Flex,
  Modal,
  ModalBody,
  ModalCloseButton,
  ModalContent,
  ModalFooter,
  ModalHeader,
  ModalOverlay,
  useDisclosure,
  Box,
  Text,
  Checkbox,
  Input,
  InputGroup,
  InputRightAddon
} from "@chakra-ui/react";
import { getDefaultDonations } from "@utils/mock";
import { ReactElement, useState } from "react";

type Props = {
  id: number;
  title: string;
};

export const DonateModal = ({ id, title }: Props): ReactElement => {
  const { isOpen, onOpen, onClose } = useDisclosure();
  const defaultDonations = getDefaultDonations();
  const [isCustom, setIsCustom] = useState(false);
  const [amount, setAmount] = useState<number | undefined>(undefined);
  return (
    <>
      <Button fontSize="3xl" h="16" onClick={onOpen}>
        DONATE
      </Button>
      <Modal isOpen={isOpen} onClose={onClose} size="xl">
        <ModalOverlay />
        <ModalContent>
          <ModalHeader>Donate to: {title}</ModalHeader>
          <ModalCloseButton />
          <ModalBody>
            <Flex alignItems="center" flexDir="column">
              <Flex alignItems="center" flexDir="column" gap="4" my="8">
                <Flex flexWrap="wrap" gap="4" justifyContent="center">
                  {defaultDonations.map((value, key) => {
                    return (
                      <Button
                        key={key}
                        onClick={() => setAmount(value)}
                        variant="secondary"
                      >
                        <Text>{value}$</Text>
                      </Button>
                    );
                  })}
                </Flex>
                <Button onClick={() => setIsCustom(true)} variant="secondary">
                  <Text>Custom payment</Text>
                </Button>
                {isCustom && (
                  <InputGroup>
                    <Input
                      onChange={(e) => setAmount(Number(e.target.value))}
                      type="number"
                      value={amount}
                    />{" "}
                    <InputRightAddon children="$" />
                  </InputGroup>
                )}
              </Flex>

              <Checkbox colorScheme="green">
                Accepts Toss A Coin and Tpay regulations
              </Checkbox>
            </Flex>
          </ModalBody>
          <ModalFooter justifyContent="center">
            <Button onClick={onClose}>Donate {amount && amount + "$"}</Button>
          </ModalFooter>
        </ModalContent>
      </Modal>
    </>
  );
};
