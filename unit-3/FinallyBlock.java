class FinallyBlock
{
    public static void main(String args[])
    {
        int a = 10 , b = 0 ;
        try
        {
            System.out.println("div = " + (a/b) ) ;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by zero.");
        }
        finally
        {
            System.out.println("The Program END Here");
        }
    }
}