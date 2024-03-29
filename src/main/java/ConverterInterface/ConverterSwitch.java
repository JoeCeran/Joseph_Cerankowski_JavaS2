package ConverterInterface;

public class ConverterSwitch implements Converter{

    private String month;
    private String day;

    public String getMonth() {
        return month;
    }

    public String getDay() {
        return day;
    }

    public String convertMonth(int monthNumber) {
        switch (monthNumber) {
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
            default:
                month = "You have entered an invalid number. " +
                        "You must enter a number between 1 and 12. Goodbye.\"";
                break;
        }
        return month;
    }

    public String convertDay(int dayNumber){
        switch (dayNumber){
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "You have entered an invalid number. " +
                        "You must enter a number between 1 and 7. Goodbye.\"";
                break;
        }
        return day;
    }
}
