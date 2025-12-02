package astalakshmi.example;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ExerciseString {
    static void main() {
        // 1. Length Of String.
        //Java counts how many characters are inside.
        String s = "Java";
        System.out.println("Ex 1 :" + s.length());

        // 2. Character at index 6 "Long Example Sentence".
        String s1 = "Long Example Sentence";
        System.out.println("Ex 2 : " + s1.charAt(6));

        // 3. Index of O- "Even Longer Example Sentence"
        String s2 = "Even longer example Sentence";
        System.out.println("Ex 3 :" + s2.indexOf('o'));

        // 4. Substring  "Not as long"
        String s3 = "Ok this is not as long";
        String sub = s3.substring(11,22);
        System.out.println("Ex 4 :" + sub);

        // 5. Lowercase and Uppercase of the string.
        String s4 = "CAPS EQUALS SCREAMING";
        System.out.println("Ex 5 :" + s4.toLowerCase());
        System.out.println("Ex 5 :" + s4.toUpperCase());

        //6. Replacing the incorrect word.
        String sentence = "Java is the worst programming language!";
        String s5 = sentence.replace("worst" , "best");
        System.out.println("Ex 6 :" + s5);

        //7. Trim Stings.
        String s6 = "\tJ\ta\tv\ta\t";
        String trim = s6.trim();
        System.out.println("Ex 7:" + s6);

        //8. Parse int 20 to string and add 20 to the end.
        int num = 20;
        String s7 = String.valueOf(num)+ 20;
        System.out.println("Ex 8:" + s7);

        //9. Split the words.
        String s8 = "Oil and Water";
        String [] parts = s8.split("and");
        System.out.println("Ex 8:" + parts [0]);
        System.out.println(parts [1]);

        //10. Split the string using Array.
        String s9 = "Carl,Susie,Fredrick,Bob,Erik";
        String [] names = s9.split(",");
        // Here using for each loop.
        for (String name : names)
        {
        System.out.println("Ex 9:" + name);
    }

        // 11. Convert the string to char array.
        String s10 = "ThisShouldbeConverted";
        char [] chars = s10.toCharArray();
        for (char ch : chars)
        {
            System.out.println("Ex 10:" + ch);
        }

        //12.Convert char to String.
        char [] ch = {'J','a','v','a'};
        String word = new String(ch);
        System.out.println("Ex 12:" + word);

}

}