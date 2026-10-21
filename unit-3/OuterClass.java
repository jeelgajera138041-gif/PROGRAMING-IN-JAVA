class Outer
{
    int number = 10;
    class Inner
    {
        void display()
        {
            System.out.println("Number = " + number);
        }
    }
    public static void main(String args[])
    {
        Outer obj = new Outer();
        Outer.Inner inner = obj.new Inner();
        inner.display();
    }
}