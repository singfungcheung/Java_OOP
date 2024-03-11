class OuterClass2
{
    int x = 5;

    static class InnerClass
    {
        int y = 2;
    }
}
public class static_inner {
    public static void main(String[] arg)
    {
        OuterClass2 myOuter = new OuterClass2();
        OuterClass2.InnerClass myInner = new OuterClass2.InnerClass();
        System.out.println(myOuter.x);
        System.out.println(myInner.y);
    }
}
