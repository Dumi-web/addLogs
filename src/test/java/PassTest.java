import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassTest {


    @Test
    void passwordIsValid() {
        assertEquals("Try again: Password Should exist.\n" +
                "Try again: Password Should be longer than 8 Characters.\n" +
                "Try again: Password does not have a digit.\n" +
                "Try again: Password does not have uppercase.\n" +
                "Try again: Password does not have lowercase.\n" +
                "Try again: Password does not have special character.", Pass.passwordIsValid(""));

        assertEquals("Try again: Password Should be longer than 8 Characters.\n", Pass.passwordIsValid("pA1!"));
        assertEquals("Try again: Password does not have a digit.\n", Pass.passwordIsValid("hPhjbjhjgv@"));
        assertEquals("Try again: Password does not have uppercase.\n", Pass.passwordIsValid("bgxdrytpo3@"));
        assertEquals("Try again: Password does not have lowercase.\n", Pass.passwordIsValid("HHHHOPTYP1@"));
        assertEquals("Try again: Password does not have special character.", Pass.passwordIsValid("hdhhjHuyi1"));
    }




   @Test
    void passwordIsOkay(){

        Pass.passwordIsValid("p");
        assertEquals("User password is okay.",Pass.passwordIsOkay());
        assertEquals("User password is not okay.",Pass.passwordIsOkay());

    }
}
