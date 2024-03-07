public class Inheritance
{
    public static class Vehicle
    {
        protected String brand = "Rivian";
        public void brand_name()
        {
            System.out.println(this.brand + " is awesome!");
        }
    }

    public static class car extends Vehicle
    {
        String car;

        public car(String car)
        {
            this.car = car;
        }

        public void brand_name()
        {
            System.out.println(this.brand + ": " + this.car);
        }

    }

    class main
    {
        public static void main(String[] arg)
        {
            car R1S = new car("R1S");
            car R1T = new car("R1T");
            R1S.brand_name();
            R1T.brand_name();
        }
    }

}
