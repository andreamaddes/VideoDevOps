package videodevops;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PassGenTest {
    
    @Test
    void MinMaxLength(){
        String generatedpassword = PassGen.passwordgenerator();
        assertTrue(generatedpassword.length() >= 10 && generatedpassword.length() <= 20, "Password must be min 10 and max 20 characters.");

    }

    @Test
    void Composition(){
        String generatedpassword = PassGen.passwordgenerator();
        assertTrue(generatedpassword.matches("^[^a-zA-Z0-9]*$"), "Password must be symbols only.");
    }
}
