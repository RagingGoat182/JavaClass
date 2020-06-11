public class HelloString
{
    public static void main(String[] args)
    {
        System.out.println("Hello String".getClass());
        String greeting = null;
        System.out.println(greeting);
        greeting = new String("Hello");
        System.out.println(greeting);

        greeting = "Hello using literal";
        System.out.println(greeting);

        boolean flag = true;
        int radius = 20;
        double PI = 3.142;
        String subject = "World";

        String strConcat = greeting + subject;
        String boolConcat = "state of flag: " + flag;
        String intConcat = "radius of circle: " +  radius;
        String doubleConcat = "Value of PI: " + PI;
        String area = "Area of cirle: " + PI * radius * radius;
        String concatCatch = "The catch is: " + 12 + 3+5;

        System.out.println(strConcat);
        System.out.println(boolConcat);
        System.out.println(intConcat);
        System.out.println(doubleConcat);
        System.out.println(area);
        System.out.println(concatCatch);

        String strQuote = "\"First, solve the problem. Then, write the code\" - John Johnson";
        System.out.println(strQuote);

        String strNewLine = "First line\nSecond line\nThird line";
        System.out.println(strNewLine);

        String strSpace = "This string" + " " + "is" + " " + "with " + "spaces";
        System.out.println(strSpace);

        System.out.println("This\tApart");

        System.out.println("\\\\\\\\");
    }
}
