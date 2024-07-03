import java.util.Scanner;

class App2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ascii;
        ascii = sc.next().charAt(0);

        if(ascii >= 65 && ascii <= 90)
            System.out.println("\nIt is a capital letter");
        else if(ascii >= 97 && ascii <= 122)
            System.out.println("\nIt is a small letter");
        else if(ascii >= 48 && ascii <= 57)
            System.out.println("\nIt is a number");
        else
            System.out.println("\nIt is a special symbol");
    }
};