import java.util.Scanner;
public class calculator{
    public static void main(String[] args){
        boolean x = true;
        int l;
        String m;
        int n=0,k=0;
        int count = 1;
        // float
        Scanner scanner = new Scanner(System.in);
        while (x) {
            if (count<=1){
                System.out.println("Enter a number:");
                n = scanner.nextInt();
                System.out.println("Enter another number");
                k = scanner.nextInt();
                count+=1;
            }
            else{
                System.out.println("\nEnter if you want to give another two numbers(y) or operate on the same numbers");
                m = scanner.next();
                if (m=="y"){
                    System.out.println("Enter a number:");
                    n = scanner.nextInt();
                    System.out.println("Enter another number");
                    k = scanner.nextInt();
                }
            }
            System.out.println("Enter the type of operation:\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit");
            l = scanner.nextInt();
            switch (l){
                case 1:
                    System.out.println("Addition Operation");
                    System.out.printf("a:%d\nb:%d\nTotal:%d",n,k,n+k);
                    break;
                case 2:
                    System.out.println("Subtraction Operation");
                    System.out.printf("a:%d\nb:%d\nTotal:%d",n,k,n-k);
                    break;
                case 3:
                    System.out.println("Multiplication operation");
                    System.out.printf("a:%d\nb:%d\nTotal:%d",n,k,n*k);
                    break;
                case 4:
                    System.out.println("Division");
                    System.out.printf("a:%d\nb:%d\nTotal:%d",n,k,n/k);
                    break;
                default:
                    System.exit(0);
            }
        };
        scanner.close();
    }
}