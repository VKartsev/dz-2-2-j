public class Main {
    public static void main(String[] args) {
        int client = 300;
        short payment = 1100;
        System.out.println("Сумма на счете: " + (client + payment));
        if (payment > 1000) {
            System.out.println("Бонус:" + (payment + client) / 100);

        }

    }
}

