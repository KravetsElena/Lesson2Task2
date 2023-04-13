public class Main {
    public static void main(String[] args) {

        int cash = 100;
        int refill = 1300;


        int bonus;
        if (refill>=1000) {
            bonus = refill/100;
        } else {bonus =0;
        }

        int totalCash = cash+refill+bonus;

        System.out.println(totalCash);
        System.out.println(bonus);
    }
}