package base;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ashley Mojica
 */

/*
Exercise 2 - Counting the Number of Characters
Create a program that prompts for an input string and displays output that shows the input string
and the number of characters the string contains.

Example Output:
What is the input string? Homer
Homer has 5 characters.

Constraints:
Be sure the output contains the original string.
Use a single output statement to construct the output.
Use a built-in function of the programming language to determine the length of the string.

Challenges:
If the user enters nothing, state that the user must enter something into the program.
Implement this program using a graphical user interface and update the character counter every
time a key is pressed.
If your language doesn’t have a particularly friendly GUI library, try doing this exercise with
HTML and JavaScript instead.
 */
public class App 
{
    static Scanner input = new Scanner(System.in);

    public static void main( String[] args )
    {
        App myApp = new App();
        String in = myApp.getInput();
        int stringLength = myApp.strLength(in);
        String output = myApp.generateOutput(in, stringLength);
        myApp.printOutput(output);
    }

    public String getInput() {
        System.out.println( "What is the input string?" );
        String inputString = input.nextLine();
        return inputString;
    }

    public int strLength(String input) {
        return input.length();
    }

    public String generateOutput(String input, int length) {
        return input + " has " + length + " characters.";
    }

    public void printOutput(String output){
        System.out.println(output);
    }
}
