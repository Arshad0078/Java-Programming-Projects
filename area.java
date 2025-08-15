import java.util.Scanner;
public class area {    
    public static void main(String[] args) {
        double area,circum,pi=3.14;
        int radius;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius of circle:");
        radius = scanner.nextInt();
        area = pi*radius*radius;
        circum = 2*pi*radius;
        System.out.printf("Radius:%d\nArea:%.2f\nCircumference:%.2f\n",radius,area,circum);
        scanner.close();
    }
}
