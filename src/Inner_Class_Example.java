class OuterClass {
    int x = 10;

    class InnerClass
    {
        int y = 5;
    }
}

public class Inner_Class_Example
{
    public static void main(String[] args)
    {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);
    }
}
