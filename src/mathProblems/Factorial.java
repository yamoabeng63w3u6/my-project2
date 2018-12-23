package mathProblems;

public class Factorial {

    public static void main(String[] args) {

        //Factorial of 5
        //Using Iteration
        int n = 5;
        int result = 1;
        for (int i =1; i <=n; i++){
            result = result * i;
            System.out.println("The Factorial variable is : "+ result);
        }
        System.out.println("The Factorial of 5 is : "+ result);

        System.out.println("The Factorial of 5 is : "+ factorial( 10));
        System.out.println("The Factorial of 5 is : "+ factorial( 5));

    }
    //Factorial of 5
    //Using Recursion
    public static int factorial(int n){
        if (n==0) {
            return 1;
        }else{
            return n * factorial(n-1);
        }
    }




}
