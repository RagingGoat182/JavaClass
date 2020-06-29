package ap;

public class Homework {
    public static void main (String[] args)
    {
        String str1 = new String("I am Inevitable");
        String str2 = "And I am Iron Man";

        System.out.println(str1.length());
        System.out.println(str2.length());

        System.out.print(str1.substring(0, 3));
        System.out.println("        " + str2.substring(9, 16));

        System.out.println(str1.indexOf("Inevitable"));
        System.out.println(str2.indexOf("Iron"));

        System.out.println(str1.compareTo(str2));

        String word = "Chandler";
        String firstLetterUpper = word.substring(0,1);
        String firstLetter = firstLetterUpper.toLowerCase();
        String restOfWord = word.substring(1, word.length());
        String pigWord = restOfWord + firstLetter + "ay";
        System.out.println(pigWord);

        int x = 8;
        int y = 6;
        //float answer = 8^8+4(x^4)(1/(y^4))+√(x+y);
        //System.out.println(answer);
    }
}
