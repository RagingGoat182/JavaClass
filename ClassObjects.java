public class ClassObjects
{
    public static void main(String[] args)
    {
        Person joe = new Person("Joe", "Regular");

        joe.setAddress("oofergang lane");
        //joe.setDateOfBirth(27, 05,2020);
        joe.setDateOfBirth(27, 5,2020);
        joe.setFullName("Parry", "Hotter");

        System.out.println("Author: " + Person.getClassAuthor());

        System.out.println("Name: " + joe.getFullName());
        System.out.println("DOB: " + joe.getDOB());
        System.out.println("Address: " + joe.getAddress());
    }


}