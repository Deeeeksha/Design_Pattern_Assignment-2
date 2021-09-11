package SingleResponsibility;

public class Book_Issued {
    String date= "25/10/2021";
    void issuedBook(String name,String n){

        System.out.println("The book "+name+" issued to "+n+" on "+date);
    }

    public static void main(String[] args) {
        Books B1 =new Books();
        User u1 = new User();
        Book_Issued i1 =new Book_Issued();
        i1.issuedBook(B1.getName(),u1.getName());
    }
}
