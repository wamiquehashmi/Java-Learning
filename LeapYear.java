import java.util.Scanner;

class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(isLeapYear(year))
            System.out.println(year + " is leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }


    public static boolean isLeapYear(int y) {
        return ((y%4==0 && y%100!=0) || y%400==0);
    }
}
