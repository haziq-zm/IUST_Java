import java.util.Scanner;

class App1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year;
        year = sc.nextInt();

        if((year%4) == 0 && year%100 != 0 || year%400 == 0)
            System.out.println("\nIt is a leap year");
        else
            System.out.println("\nIt is not a leap year");
    }
};