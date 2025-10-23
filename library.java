import java.util.*;

public class library{
    private List<book> books;//using the arraylist to store books

    public library(){
        books=new ArrayList<>();
    }
    public void addBook(book book){
        books.add(book);
        System.out.println(book.getTitle()+"added to the library");
    }//adds a new book to the library
    public void showBooks(){
        System.out.println("\nAvailable Books:");
        for(book book: books ){
            System.out.println(book);
        }
    }//displays all the books in the library and there status
    public void issueBook(String title, user user){
        for(book book:books){
            if(book.getTitle().equalsIgnoreCase(title) && !book.isIssued()){
                book.issueBook();
                System.out.println(user.getName()+"issued"+title);
                return;
            }
        }
        System.out.println("Sorry,"+title+"is not available");
    }//issues a book to a user if available

    public void returnBook(String title, user user){
        for(book book:books){
            if(book.getTitle().equalsIgnoreCase(title) && book.isIssued()){
                book.returnBook();
                System.out.println(user.getName()+"returned"+title);
                return;
            }
        }
        System.out.println("this book was not issued or not found..");
    }//returns a book to the library
}
