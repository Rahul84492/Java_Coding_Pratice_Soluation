public class enumDay {

    public static void main(String[] args) {

        System.out.println("printing all the Day: ");

        for(enumDay.day days:day.values()){
            System.out.println(days);
        }
    }
    public enum day{
        Sunday, Monday, Tuesday, Wednesday, Thrusday, Friday, Saturday 
    }

    
    
}
