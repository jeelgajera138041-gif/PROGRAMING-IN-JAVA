class ArithmeticException
{
    public static void main(String args[])
    {
        int a = 10 , b = 2 ;
        try
        {
            System.out.println("div = " + (a/b) ) ;
        }
        catch(Exception e)
        {
            System.out.println("Cannot divide by zero.");
        }
    }
}