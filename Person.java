public class Person
{
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private int monthOfBirth;
    private int dayOfBirth;
    private int hourOfBirth;
    private String address;

    public Person()
    {
        System.out.println("Default constructor called");
        firstName = "";
        lastName = "";
        yearOfBirth = 2000;
        monthOfBirth = 1;
        dayOfBirth = 1;
        hourOfBirth = 0;
        address = "";
    }

    public Person(String first, String lastName)
    {
        this();
        System.out.println("Parameter Constructor called");
        firstName = first;
        this.lastName= lastName;
    }

    public String getFullName()
    {
        String fullName = firstName +" "+ lastName;
        return fullName;
    }

    public String getDOB()
    {
        String dob = dayOfBirth+"/"+monthOfBirth+"/"+yearOfBirth;
        return dob;
    }

    public String getAddress()
    {
        return address;
    }

    public void setFullName(String first, String last)
    {
        firstName = first;
        lastName = last;
    }

    public void setDateOfBirth(int day, int month, int year)
    {
        if(month <= 0 || month > 12)
        {
            throw (new IllegalArgumentException("Month can only be between 1 - 12"));
        }
        if(day <= 0 || day > 31)
        {
            throw (new IllegalArgumentException("Day can only be between 1 - 31"));
        }
        dayOfBirth = day;
        monthOfBirth = month;
        yearOfBirth = year;
    }

    public void setDateOfBirth(int day, String month, int year)
    {
        System.out.println("Overloaded method called with month as: "+ month.toString());
        dayOfBirth = day;
        yearOfBirth = year;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public static String getClassAuthor()
    {
        return "Zane";
    }

}
