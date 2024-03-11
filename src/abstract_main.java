// Abstract Class
abstract class Animal
{
    // Abstract Method (does not have a body)
    public abstract void animalSound();

    // Regular method
    public void sleep()
    {
        System.out.println("Zzzzzz");
    }
}

class Mouse extends Animal
{
    public void animalSound()
    {
        System.out.println("Squeak!");
    }
}
public class abstract_main
{
    public static void main(String[] args)
    {
        Mouse myMouse = new Mouse();
        myMouse.animalSound();
        myMouse.sleep();
    }
}
