import
java.util.Scanner;
public class Manufacturing {

    public static void main(String[] args){
        int item7;
        int item6;
        int item5;
        int item4;
        int item3;
        int item2;
        int item1;
        int day1,day2,day3,day4,day5,day6;
        int totalcups;
        double item1cost;
        double item2cost;
        double item3cost;
        double item4cost;
        double item5cost;
        double item6cost;
        double item7cost;
        double item1total;
        double item2total;
        double item3total;
        double item4total;
        double item5total;
        double item6total;
        double item7total;
        double totalsales;
        double overalltotal;
        double finalamount;
        double costpercup;
        double salestotal;
        double allItemTotal;
        String items;
        double profit;
        String name;
        Scanner keyboard;

keyboard = new Scanner(System.in);

        System.out.println("Hello, welcome to the lemonade stand");
        System.out.println("What is your name");
name = keyboard.nextLine();
        System.out.println("well, nice to meet you " + name);

        System.out.println("how much of item 1 are you getting?");
item1 = keyboard.nextInt();
        System.out.println("how much does item 1 cost?");
item1cost = keyboard.nextDouble();
item1total = item1*item1cost;
        System.out.println("your total cost for item 1 is "+ item1total);

        System.out.println("how much of item 2 are you getting?");
item2 = keyboard.nextInt();
        System.out.println("how much does item 2 cost?");
item2cost = keyboard.nextDouble();
item2total= item2*item2cost;
        System.out.println("your total cost for item 2 is "+ item2total);

        System.out.println("how much of item 3 are you getting?");
item3 = keyboard.nextInt();
        System.out.println("how much does item 3 cost?");
item3cost = keyboard.nextDouble();
item3total = item3*item3cost;
        System.out.println("your total cost for item 3 is "+ item3total);

        System.out.println("how much of item 4 are you getting?");
item4 = keyboard.nextInt();
        System.out.println("how much does item 4 cost?");
item4cost = keyboard.nextDouble();
item4total = item4*item4cost;
        System.out.println("your total cost for item 4 is "+ item4total);

        System.out.println("how much of item 5 are you getting?");
item5 = keyboard.nextInt();
        System.out.println("how much does item 5 cost?");
item5cost = keyboard.nextDouble();
item5total = item5*item5cost;
        System.out.println("your total cost for item 5 is "+ item5total);

        System.out.println("how much of item 6 are you getting?");
item6 = keyboard.nextInt();
        System.out.println("how much does item 6 cost?");
item6cost = keyboard.nextDouble();
item6total = item6*item6cost;
        System.out.println("your total cost for item 6 is "+ item6total);

        System.out.println("how much of item 7 are you getting?");
item7 = keyboard.nextInt();
        System.out.println("how much does item 7 cost?");
item7cost = keyboard.nextDouble();
item7total = item7*item7cost;
        System.out.println("your total cost for item 7 is "+ item7total);
overalltotal = item1total+item2total+item3total+item4total+item5total+item6total+item7total;
        System.out.println("your overall cost for everything is "+ overalltotal);

        System.out.println("How much did you make from sales?");
totalsales = keyboard.nextDouble();
finalamount = totalsales - overalltotal;
        System.out.println("You made in total "+finalamount);

        System.out.println("How many cups did you sell on the first day.");
day1 =keyboard.nextInt();
        System.out.println("How many cups did you sell on the second day.");
day2 =keyboard.nextInt();
        System.out.println("How many cups did you sell on the third day.");
day3 =keyboard.nextInt();
        System.out.println("How many cups did you sell on the fourth day.");
...


