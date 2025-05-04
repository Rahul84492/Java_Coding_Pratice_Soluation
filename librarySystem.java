class Book{
    static int totalNumberOfBook;
    String author;
    String tittle;
    String isbn;

    boolean isBorrowed;

    static{
        totalNumberOfBook=0;
    }{
        totalNumberOfBook++;
    }
    Book(String isbn, String tittle, String author){
        this.tittle=tittle;
        this.author=author;
        this.isbn=isbn;

    }

    Book(String isbn){
        this(isbn,"Unknown","Unknown");
    }
    static int getTotalNumberOfBooks(){
        return totalNumberOfBook;
    }
    void borrowBook(){
       if (isBorrowed) {
         System.out.println("Book is Already Borrowed");
       }
       else{
        this.isBorrowed= true;
        System.out.println("Enjoy the book");
       }
    }
    void returnBook(){
        if (isBorrowed) {
            this.isBorrowed=false;
        System.out.println("Hope you Enjoyed,please leave a review");
        }
        else{
            System.out.println("Book is Already in the library");
    }
   
    }
    public static void main(String[] args) {
        Book designOfThings = new Book("1", "Design", "James Goshlin");
        Book myBook = new Book("2");
        designOfThings.borrowBook();
        myBook.borrowBook();
        designOfThings.borrowBook();
        designOfThings.returnBook();
        designOfThings.returnBook();
    }
}
