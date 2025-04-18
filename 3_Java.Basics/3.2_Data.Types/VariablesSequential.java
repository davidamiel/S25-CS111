public class VariablesSequential
{
    public static void main(String[] args)
    {
        int a = 1234;
        int b = 99;
        int t = a;
        a = a + b;
        b = a - t;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("t = " + t);
    }
}