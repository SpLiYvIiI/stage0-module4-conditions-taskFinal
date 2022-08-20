package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if(month < 0 || month > 12 || year < 0){
            System.out.println("invalid date");
        }
        else{
            if (month != 2) {
                System.out.println(31 - (month - 1) % 7 % 2);
            }
            else {
                if ((year & 3) == 0 && ((year % 25) != 0 || (year & 15) == 0)) { // leap year
                    System.out.println(29);
                } else {
                    System.out.println(28);
                }
            }
        }
    }
}
