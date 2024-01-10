public class Mystry extends Book{
    private String bookCatagory;
    public Mystry(String title, String author, int ISBN, int borrowFee) {
        super(title, author, ISBN, borrowFee);
        this.bookCatagory = "Mystry";
    }
}
