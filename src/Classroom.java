public class Classroom
{
    int desks;
    boolean first_print;

    public Classroom()
    {
        // The default constructor. Whenever an object is created, the default values come from here.
        desks = 20;
        first_print = false;

    }

    public void numOfDesks()
    {
        if (!first_print)
        {
            this.first_print = true;
            System.out.println("This is the time accessing the number of desks.");
        }
        System.out.println("There are " + this.desks + " in the classroom.");

    }

    public void setNumOfDesks(int numOfDesks)
    {
        this.desks = numOfDesks;
    }
}
