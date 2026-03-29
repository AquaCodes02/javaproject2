import java.util.* ;
public class compound_interest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the sum:") ;
        int sum = sc.nextInt() ;
        System.out.print("Enter r1=") ;
        int r1 = sc.nextInt() ;
        System.out.print("Enter r2=") ;
        int r2 = sc.nextInt() ;
        System.out.print("Enter r3=") ;
        int r3 = sc.nextInt() ;
        double amount, ci ;
        amount = sum*(1+(r1/100.0))*(1+(r2/100.0))*(1+(r3/100.0)) ;
        ci = amount-sum ;
        System.out.println("The Final Amount is = " +amount) ;
        System.out.println("Compound interest compounded annually is = " +ci) ;
    }
}
