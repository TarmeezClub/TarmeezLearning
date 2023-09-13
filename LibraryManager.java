import java.util.ArrayList;
import java.util.List;

public class LibraryManager implements Manageable<Library> {
    private List<Library> BookList;

    public LibraryManager() {
        // Initialize the studentList as an empty list
        BookList = new ArrayList<>();
    }

    @Override
    public void add(Library library) {
        BookList.add(library);
        System.out.println("[+] Book Added: " + library.getISBN() );
    }

    @Override
    public void update(Library library) {
        // Assuming student information can be updated based on some criteria, implement the update logic here.
        // You might want to find the student in the list and update their information.
        // No Need to implement this method .!
    }

    @Override
    public void delete(Library library) {
        BookList.remove(library);
        System.out.println("[-] Student deleted: " + library.getISBN() );
    }

    @Override
    public List<Library> list() {
        return BookList;
    }
}

class Library{
    private String ISBN;
    private String title;
    private String author;
    Library(String ISBN,String title, String author){
        this.ISBN=ISBN;
        this.title=title;
        this.author=author;
    }
    String getISBN(){
        return ISBN;
    }
    String getTitle(){
        return title;
    }
    String getAuthor(){
        return author;
    }
    void setISBN(String ISBN){
      this.ISBN=ISBN;
    }
    void setTitle(String title){
      this.title=title;
    }
    void setAuthor(String author){
      this.author=author;
    }
    public String toString() {
        return "ISBN : " + ISBN + "\n" +
               "TItle : " + title + "\n" +
               "Author's name: " + author + "\n" ;
               
    }
}