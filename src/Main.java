import org.w3c.dom.Text;

public class Main {
    public static void main(String[] args) {
        System.out.println(goOut(30, -25));

    }

    public static String goOut(int age, int temp) {
        if ((age >= 20 && age <= 45 && temp >= -20 && temp <= 30) || (
                age <= 20 && temp <= 0 && temp <= 28
        )
                || (age >= 45 && temp >= -10 && temp <= 25)
        ) {
            return "Можно идти гулять";
        } else {

            return "Оставайтесь дома";
        }
    }
}
