enum Day {
    MONDAY(true), 
    TUESDAY(true), 
    WEDNESDAY(true), 
    THURSDAY(true), 
    FRIDAY(true), 
    SATURDAY(false), 
    SUNDAY(false);

    private final boolean isWeekday;

    
    Day(boolean isWeekday) {
        this.isWeekday = isWeekday;
    }

    
    public boolean isWeekday() {
        return isWeekday;
    }
}

public class enumDayWeekandWeekend {
    public static void main(String[] args) {
      
        Day today = Day.MONDAY; 

      
        System.out.println("Today is: " + today);
        if (today.isWeekday()) {
            System.out.println(today + " is a Weekday.");
        } else {
            System.out.println(today + " is a Weekend.");
        }
    }
}
