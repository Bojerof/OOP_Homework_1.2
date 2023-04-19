import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class CoffeAvtomat {
    private List<Coffe> coffeList = new ArrayList<>();
    public List<Coffe> getCoffeList() {
        return coffeList;
    }
    private void PercentTime(){
        try {
            System.out.println("Товар готовится...");
            System.out.println("Кофе готово на 20%");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("Кофе готово на 40%");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("Кофе готово на 60%");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("Кофе готово на 80%");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("Кофе готово\n Хорошего дня");
        }catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
    }
    public CoffeAvtomat addCoffe(Coffe coffe) {
        coffeList.add(coffe);
        return this;
    }

    private Coffe findCoffe(String string) {
        for (int i = 0; i < getCoffeList().size(); i++) {
            if (getCoffeList().get(i).getName().equals(string))
                return getCoffeList().get(i);
        }
        return null;
    }

    public void byeCoffe(String name) {
        Coffe coffe = findCoffe(name);
        if (coffe == null)
            System.out.println("Товар не найден!");
        else {
            Scanner in = new Scanner(System.in);
            System.out.printf("Кофе стоит: %d rub\n", coffe.getCost());
            System.out.print("Введите сумму: ");
            int summ = in.nextInt();
            if (coffe.getCost() == summ) {
                PercentTime();
            } else if (coffe.getCost() < summ) {
                int change = summ - coffe.getCost();
                PercentTime();
                System.out.printf("Ваша сдача: %d rub", change);
            } else {
                System.out.println("Нехватает средств!");
                byeCoffe(name);
            }
            in.close();
        }
    }
}
