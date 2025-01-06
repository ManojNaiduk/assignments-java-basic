import java.util.*;
public class sumoffirstandlastandproductofmiddle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String str = Integer.toString(n);

        if(str.length() < 2 ){
            System.out.println("Number should have atleast two digits ");
        }
        int f = Character.getNumericValue(str.charAt(0));
        int l = Character.getNumericValue(str.charAt(str.length()-1));
        int sum = f+l;
        int product = 1;
        boolean b = false;
        for(int i=1;i<str.length()-1;i++){
            b = true;
            product *= Character.getNumericValue(i);
        }
        if(b == true){
            System.out.println("sum : "+sum+" "+"product : "+product);
        }
        else{
            System.out.println(sum);
            System.out.println("There are no middle numbers");
        }
    }
}