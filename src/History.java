public class History extends Book{
    private String bookCatagory;

    public History(String title, String author, int ISBN, int borrowFee) {
        super(title, author, ISBN, borrowFee);
        this.bookCatagory = "History";
    }
    public History() {

    }
}
