import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class PasswordOk {

    private static final Logger logger = LogManager.getLogger(PasswordOk.class.getName());

    public static void main(String[] args) {

        Pass obj1 = new Pass();
        logger.error(obj1.passwordIsValid("pU"));

        Pass.passwordIsOkay();
        logger.debug(Pass.passwordIsOkay());
    }

    }




