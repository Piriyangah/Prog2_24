package vorlesung5_140524;

public class SwitchCaseBeispiele {
    public static void main(String[] args) {
        
        weekdayFromIfElse(4);
        weekdayFromIfElse(8);
        weekdayFromSwitch(4);
        weekdayFromSwitch(8);
        weekdayFrom(4);
        weekdayFrom(8);
        weekdayFrom(4);
        weekdayFrom(8);
    }

    private static String weekdayFromSwitch(int day) {
        /*String dayString;
        switch(day){
            case 1:
                dayString = "MO";
                break;
            case 2:
                dayString = "DI";
                break;
            case 3:
                dayString = "MI";
                break;
            case 4:
                dayString = "DO";
                break;
            case 5:
                dayString = "FR";
                break;
            case 6:
                dayString = "SA";
                break;
            case 7:
                dayString = "SO";
                break;
        }
         */
        switch(day) {
            case 1:
                return "MO";
            case 2:
                return "DI";
            case 3:
                return "MI";
            case 4:
                return "DO";
            case 5:
                return "FR";
            case 6:
                return "SA";
            case 7:
                return "SO";
            default:
                return "no valid day";
        }

        /*
         * Oder einfache Schreibweise:
         * return switch (day) {
            case 1 -> "MO";
            case 2 -> "DI";
            case 3 -> "MI";
            case 4 -> "DO";
            case 5 -> "FR";
            case 6 -> "SA";
            case 7 -> "SO";
            default -> "no valid day";
            *
            * --- hier ist durch -> welche eine zuweisung inkl break
         */
    }

    private static void weekdayFrom(int day) {


    }

    private static void weekdayFromIfElse(int day) {
        System.out.println("");
    }
}
