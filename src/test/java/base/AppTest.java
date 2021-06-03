package base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    public void output_string_includes_correct_length_and_name() {
        App myApp = new App();

        String input = "Homer";
        int length = 5;

        String expectedOutput = "Homer has 5 characters." ;
        String actualOutput = myApp.generateOutput(input, length);

        assertEquals(expectedOutput, actualOutput);
    }
}