public class libraryItem {
   private String itemID;
   private  String tittle;
   private String author;
 

   public void checkout(){
    System.out.println("Checkout");
   }
   public void returnItem(){
    System.out.println("Return Successfully");
   }
   public class Book extends libraryItem{
     private String ISBN;
   }
   public class Magazine extends libraryItem{
      private  int IssuseNumber;
   }
   public class DVD extends libraryItem{
private int duratioInSeconds;
   }
}

