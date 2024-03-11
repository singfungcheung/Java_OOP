// Interface
interface AnimalType
{
    public void animalSound(); // interface method (does not have a body).
    public void sleep(); // interface method (does not have a body).
}

class Cow implements AnimalType
{
    public void animalSound()
    {
        System.out.println("Moo!");
    }

    public void sleep()
    {
        System.out.println("Ok I sleep moo xD");
    }
}
public class interface_example {
    public static void main(String[] args)
    {
        Cow myCow = new Cow();
        myCow.animalSound();
        myCow.sleep();
    }
}
