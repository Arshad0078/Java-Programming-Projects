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
                System.out.println("Enter if you want to give another two numbers(y) or operate on the same numbers");
                m = scanner.next();
                if (m=="y"){
                    System.out.println("Enter a number:");
                    n = scanner.nextInt();
                    System.out.println("Enter another number");
                    k = scanner.nextInt();
                }
            }
            System.out.println("Enter the type of operation:\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
            l = scanner.nextInt();
            switch (l){
                case 1:
                    System.out.println("Addition Operation");
                    System.out.println("a:"+n+"\nb:"+k+"\nTotal:"+(n+k));
                    break;
                case 2:
                    System.out.println("Subtraction Operation");
            }
        };
        scanner.close();
    }
}