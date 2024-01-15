public class ChildrenBook extends Book{
    private String bookCatagory;
    public ChildrenBook(String title, String author, int ISBN, int borrowFee) {
        super(title, author, ISBN, borrowFee);
        this.bookCatagory = "ChildrenBook";
    }
    public ChildrenBook() {

    }
}
