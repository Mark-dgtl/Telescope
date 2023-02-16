public class Main {

    static double price = 14_000;
    static double account = 1000;
    static double stipend = 2500;
    static double percentBank = 5;
    static double procentMonth = 5.0 / 12.0;

    static double countMonth = 0;


    public static void main(String[] args) {
        System.out.println("Ïîòðåáîâàëîñü " + countMonth() + " ìåñÿöåâ");
        System.out.println("Îñòàëîñü " + (account - price) + " ìîíåò");
    }


    static double countMonth() {

        while (price > account) {
            countMonth = countMonth + 1;
            account = account + (account * procentMonth) / 100 + stipend;
        }
        return countMonth;
    }

}
