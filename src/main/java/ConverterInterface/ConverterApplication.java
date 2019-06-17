package ConverterInterface;
import java.util.Scanner;

public class ConverterApplication {

    public static void main(String[] args){

        //Input for month
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter the number of a month: ");
        int monthNumber = Integer.parseInt(myScanner.nextLine());

        //Input for day
        System.out.println("Please enter the number of a day: ");
        int dayNumber = Integer.parseInt(myScanner.nextLine());

        //If converting
        ConverterIf convertIf = new ConverterIf();
        convertIf.convertMonth(monthNumber);
        convertIf.convertDay(dayNumber);

        System.out.println("------------"+
                         "\nConverterIf"+
                         "\n------------");
        System.out.println("Month: " + convertIf.getMonth() + "\nDay: " +
                convertIf.getDay());

        //Switch converting
        ConverterSwitch convertSwitch = new ConverterSwitch();
        convertSwitch.convertMonth(monthNumber);
        convertSwitch.convertDay(dayNumber);

        System.out.println("\n------------"+
                "\nConverterSwitch"+
                "\n------------");
        System.out.println("Month: " + convertSwitch.getMonth() + "\nDay: " +
                convertSwitch.getDay());
    }
}
