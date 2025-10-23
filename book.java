public class book{
    private String title; //using encapsulation
    private String author;
    private boolean isIssued;

    public book(String title , String author){
        this.title = title;
        this.author = author;
        this.isIssued = false;

    }//constructor is used to initialize the book object

    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public boolean isIssued(){ 
        return isIssued;
    }
    public void issueBook(){
        isIssued=true;
    }//marks a book as issued
    public void returnBook(){
        isIssued=false;
    }//marks a book as returned

    public String toString(){
        return "Book :" + title + "by" +author+(isIssued ? "[Issued]": "[Available]");

    }//print the information about the book in readable manner
}