import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassTest {

    @Test
    void passwordIsValid() {

        assertEquals("Error: Password Should exist.\n" +
                "Error: Password Should be longer than 8 Characters.\n" +
                "Error: Password does not have a digit.\n" +
                "Error: Password does not have uppercase.\n" +
                "Error: Password does not have lowercase.\n" +
                "Error: Password does not have special character.", Pass.passwordIsValid(""));

        assertEquals("Error: Password Should be longer than 8 Characters.\n", Pass.passwordIsValid("poPuw1!"));
        assertEquals("Error: Password does not have a digit.\n", Pass.passwordIsValid("hPhjbjhjgv@"));
        assertEquals("Error: Password does not have uppercase.\n", Pass.passwordIsValid("bgxdrytpo3@"));
        assertEquals("Error: Password does not have lowercase.\n", Pass.passwordIsValid("HHHHOPTYP1@"));
        assertEquals("Error: Password does not have special character.", Pass.passwordIsValid("hdhhjHuyi1"));
    }
    @Test
    void passwordIsOkay(){
        assertTrue(Pass.passwordIsOkay());
    }
}
