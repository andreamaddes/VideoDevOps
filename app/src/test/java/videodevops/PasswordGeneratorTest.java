package videodevops;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordGeneratorTest {
    
    @Test
    void MinMaxlength(){
        String generatedpassword = PasswordGenerator.generatePassword();
        assertTrue(generatedpassword.length() >= 10 &&
        generatedpassword.length()  <= 20, "Password must be min 10 und max 20 characters.");
    }

    @Test
    void PasswordComposition(){
        String generatedpassword = PasswordGenerator.generatePassword();
        assertTrue(generatedpassword.matches("^[^a-zA-Z0-9]*$"), "Password must be composed by symbols only.");
    }

}
