import java.util.Random;
import java.util.Scanner;

public class manufactoring2_0 {


    public static void main(String[] args) {

            double sugarPrice = 0.05;
            double lemonPrice = 0.20;
            double cupPrice = 0.20;
            double money = 20.00;

            double sugar = 0;
            double lemon = 0;
            double cup = 0;
            double day = 7;

            System.out.println("Welcome to the lemonade stand.");
            while (day <= 7) ;

            System.out.println("Day" + day + "Money is at" + money);
            System.out.println("Your current inventory is: Lemons" + lemon + ", sugar:" + sugar + "Cups are at:" + cup + ",");
            System.out.println("***********************************\n");

            System.out.println("lemon cost" + lemonPrice + "per unit: How many would you like to buy?");

            Scanner in1 = new Scanner(System.in);
            double boughtLemon = in1.nextDouble();
            if (money - (lemonPrice * boughtLemon) >= 0) {
                lemon += lemon + boughtLemon;

                money = money - (lemonPrice * boughtLemon);

            } else if ((money - (lemonPrice * boughtLemon) <= 0)) {
                System.out.println("you don'y have enough money. Input a different number");
                Scanner In2 = new Scanner(System.in);
                double boughtLemon2 = In2.nextDouble();

                lemon += lemon + boughtLemon2;
            }
            System.out.println("Now lets make your lemonade");
            System.out.println("How many lemons would you like to use?");

            Scanner lemon1 = new Scanner(System.in);
            double lemonPitcher = lemon1.nextDouble();
            if ((lemon - lemonPitcher) >= 0) {

                lemon = lemon - lemonPitcher;
                System.out.println(lemon);

            }else if ((lemon - lemonPitcher)< 0);{
                System.out.println("You do not have enough lemons. Please input a lower number ");
                Scanner lemon2= new Scanner(System.in);
                double lemonPitcher2= lemon2.nextDouble();
                lemon = lemon- lemonPitcher2;
            }
            System.out.println("How many sugar would you like to use");
            Scanner sugar1= new Scanner(System.in);
            double sugarPerPicher= sugar1.nextDouble();
            if((sugar-sugarPerPicher) >=0);{
                System.out.println("How much for each cup of lemonade?");
                Scanner price1= new Scanner (System.in);
                double price = price1.nextDouble();


                Random rand = new Random();
            }
        }
    }



