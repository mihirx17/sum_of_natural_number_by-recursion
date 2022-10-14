public class Main {
    public static int Sum_of_natural_number(int n)
    {
        if(n==1)
        {
            return 1;
        }

     int result=n+Sum_of_natural_number(n-1);
        return result;

    }
    public static void main(String[] args) {
        int number=5;
        System.out.println(Sum_of_natural_number(number));
       
    }
}