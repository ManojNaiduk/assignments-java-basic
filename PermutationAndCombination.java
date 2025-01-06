import java.util.*;
public class PermutationAndCombination {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter n value : ");
        int n = s.nextInt();
        System.out.println("enter r value : ");
        int r = s.nextInt();
        if(n < r || n < 0 || r < 0){
            System.out.println("Enter valid data ");
        }
        long per = factorial(n)/factorial(n-r);
        long com = per/factorial(r);
        System.out.println("Permutation : "+per+" Combination : "+com);
    }
    public static long factorial(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
}