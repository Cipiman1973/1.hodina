import java.util.Scanner;

class prvocislo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Zadejte cislo pro zkontrolováni zda je prvocislo");
        int num = scan.nextInt();
        boolean flag = false;
        for(int i = 2; i <= num/2; ++i)
        {
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " je prvocislo.");
        else
            System.out.println(num + " neni prvocislo.");
    }
}
