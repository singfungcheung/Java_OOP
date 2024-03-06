public class Abstract_Example
{
    static abstract class Main
    {
        public String character_name = "SF";
        public int age = 27;
        public abstract void print_info();
    }

    // Subclass inheritance from abstract class Main.
    static class rich_guy extends Abstract_Example.Main
    {
        public double net_worth = 543843105942.38;
        public void print_info()
        {
            System.out.println("Hello. My name is " + this.character_name
                                + ".\nI am " + this.age + " years old.\n"
                                + "My networth is " + this.net_worth);
        }
    }
}
