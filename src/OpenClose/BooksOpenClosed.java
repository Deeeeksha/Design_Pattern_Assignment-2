package OpenClose;

public class BooksOpenClosed extends Book {
    String category;
    public String getCategory()
    {
        return this.category;
    }
    public void setId(int id)
    {
        this.id=id;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public void setAuthor(String author)
    {
        this.author=author;
    }

    public void setCategory(String category){
        this.category=category;
    }

    BooksOpenClosed(){
        setId(124);
        setName("THE NOTEBOOK");
        setAuthor("NICHOLAS SPARKS");
        setCategory("ROMANTIC");

    }
}
