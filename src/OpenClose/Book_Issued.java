package OpenClose;

public class Book_Issued {
    String date= "25/10/2021";
    void issuedBook(String name,String userName,String c){

        System.out.println("The book "+name+" issued to "+userName+" on "+date);
        System.out.println("The category of "+name+" is "+c);
    }

    public static void main(String[] args) {
        BooksOpenClosed B1 =new BooksOpenClosed();
        User u1 = new User();
        Book_Issued i1 =new Book_Issued();
        i1.issuedBook(B1.getName(),u1.getName(),B1.category);
    }
}
