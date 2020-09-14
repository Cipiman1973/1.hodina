import java.util.Scanner;

class delitel {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Zadejte cislo pro kontrolu delitelnosti 7");
        int cislo = scan.nextInt();

        if (cislo % 7 ==0 ){

            System.out.println("cislo je delitelne 7");

        }else {

            System.out.println("cislo neni delitelne 7");
        }
    }
}