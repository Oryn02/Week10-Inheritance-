package ie.atu.week10;

public class testPerson
{
    public static void main(String[] args)
    {
        Person dave = new Person();
        dave.setName("Dave");
        dave.setAddress("The streets");
        dave.setPhoneNo("087 299 8369");

        System.out.println("Here are Dave's Details" + dave.toString());


    }
}
