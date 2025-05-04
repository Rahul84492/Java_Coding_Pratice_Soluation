import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class mapCountryName {
    public static void main(String[] args) {
        Map<String,  String >map=new HashMap<>();
        map.put("India", "Delhi");
        map.put("Germany", "Berlin");
        map.put("Russia ", "Moscow");
        map.put("United Kingdom", "London");
        map.put("Sweden", "Stockholm");
        map.put("Italy", "Rome");
      

        Scanner input = new Scanner(System.in);
        System.out.println("PLease Enter the Country Name: ");
        String Country = input.nextLine();

        if (map.containsKey(Country)) {
            System.out.printf("Capital of %s is %s ",Country,map.get(Country));
        }else{
            System.out.println("Sorry We Dont know the Capital");
        }

        
    }
}

