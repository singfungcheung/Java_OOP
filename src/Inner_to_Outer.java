class OuterClass3
{
    int x = 5;
    class InnerClass
    {
        public int myInnerMethod()
        {
            return x;
        }
    }
}

public class Inner_to_Outer {
    public static void main(String[] args)
    {
        OuterClass3 myOuter = new OuterClass3();
        OuterClass3.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.myInnerMethod());

    }
}
