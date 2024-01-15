public class Comic extends Book{

    private String bookCatagory ;

    public Comic() {

    }

    public Comic(String title, String author, int ISBN, int borrowFee) {
        super(title, author, ISBN, borrowFee);
        this.bookCatagory="Comic";
    }


}
