package ap;

public class Homework2 {
    public static int randomInt()
    {
        double random = Math.random();
        int minOfRange = 1;
        int maxRange = 9;
        int range = maxRange - minOfRange;
        int randomInRange = (int)(random * range);
        int result = minOfRange + randomInRange;
        return result;
    }
    public static int randomInt100()
    {
        double random = Math.random();
        int minOfRange = 1;
        int maxRange = 101;
        int range = maxRange - minOfRange;
        int randomInRange = (int)(random * range);
        int result = minOfRange + randomInRange;
        return result;
    }
    public static int randomDice()
    {
        double random = Math.random();
        int minOfRange = 1;
        int maxRange = 7;
        int range = maxRange - minOfRange;
        int randomInRange = (int)(random * range);
        int result = minOfRange + randomInRange;
        return result;
    }

    public boolean more20(int a)
    {
        if(a==22||a==24||a==26||a==28||a==42||a==44||a==46||a==48||a==62||a==64||a==66||a==68||a==82||a==84||a==86||a==88)
            return true;
        return false;
    }

    public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep)
    {
        if(isAsleep)
            return false;
        if(isMorning)
            if(isMom)
                return true;
            else
                return false;
        return true;
    }

    public static void main (String[] args)
    {
        //Point game
        int points = 3;
        int roll = randomDice();
        if(roll % 2 == 1)
        {
            points += roll;
        }
        else
        {
            points -= roll;
        }
        System.out.println("Roll: "+roll);
        System.out.println("Points: "+points);
        if(points < 0)
            System.out.println("Loss");
        else if(points >= 0 && points <= 3)
            System.out.println("Safe");
        else if(points >= 4 && points <= 7)
            System.out.println("Lucky");
        else
            System.out.println("Out of bounds");

        //Phone call
        System.out.println(answerCell(true, true, false)); //True
        System.out.println(answerCell(false, false, false)); //True
        System.out.println(answerCell(false, true, true)); //False



        //Magic 8 ball
        if(randomInt() == 1)
        {
            System.out.println("It is certain");
        }
        else if(randomInt() == 2)
        {
            System.out.println("Without a doubt");
        }
        else if(randomInt() == 3)
        {
            System.out.println("You may rely on it");
        }
        else if(randomInt() == 4)
        {
            System.out.println("Signs point to yes");
        }
        else if(randomInt() == 5)
        {
            System.out.println("My sources say no");
        }
        else if(randomInt() == 6)
        {
            System.out.println("Don’t count on it");
        }
        else if(randomInt() == 7)
        {
            System.out.println("Very doubtful");
        }
        else
        {
            System.out.println("Ask again later");
        }


    }
}
