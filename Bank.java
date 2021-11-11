public class Bank
{
    public static void main(String []args)
    {
        int Balance=50000;
        int Widrawal=60000;
        try
        {
            if (Balance<Widrawal)
                throw new ArithmeticException("insufficant balance");
            Balance=Balance-Widrawal;
            System.out.println("Transection Successful");
        }
        catch(ArithmeticException s)
        {
            System.out.println("execption"+s.getMessage());
        }
        System.out.println("Continue...");
    }
}

// Number cannot divided by zero :- ArithmeticException
// some execption are listed but some are make by the user
// throw catch finally