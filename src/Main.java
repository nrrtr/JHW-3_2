import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BmiService bms = new BmiService();
        System.out.println("Введите ваш вес: ");
        int weight = sc.nextInt();
        System.out.println("Введите ваш рост в см: ");
        int height = sc.nextInt();
        double bmi = bms.calculate(weight, height);
        System.out.println(bmi);
    }
}
