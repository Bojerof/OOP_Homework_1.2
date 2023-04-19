import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CoffeAvtomat coffeAvtomat = new CoffeAvtomat();
        coffeAvtomat.addCoffe(new Coffe("Capuchino", 60, 60, 200))
                .addCoffe(new Coffe("Late", 60, 60, 200))
                .addCoffe(new Coffe("Americano", 50, 60, 200))
                .addCoffe(new Coffe("Espresso", 45, 60, 100));

        for (int i = 0; i < coffeAvtomat.getCoffeList().size(); i++) {
            System.out.println(coffeAvtomat.getCoffeList().get(i));
        }


        Scanner in = new Scanner(System.in);
        System.out.println("Какой кофе вы хотите?");
        String name = in.next();
        coffeAvtomat.byeCoffe(name);
        in.close();
    }
}