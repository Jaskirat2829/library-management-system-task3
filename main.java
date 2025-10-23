public class main{
    public static void main(String[] args){
        library library=new library();

        //create some books
        book b1=new book("ABC"," Simon");
        book b2=new book("XYZ"," Jack");

        //adding books to library
        library.addBook(b1);
        library.addBook(b2);

        //create users
        user u1=new user("Raman",101);
        user u2=new user("Ramesh",102);

        //show books
        library.showBooks();

        //issue and return books
        library.issueBook("ABC",u1);
        library.showBooks();
        library.returnBook("ABC",u1);
        library.showBooks();

        library.issueBook("XYZ",u2);
        library.showBooks();
        library.returnBook("XYZ",u2);
        library.showBooks();
    }
}//controller of the library management system
