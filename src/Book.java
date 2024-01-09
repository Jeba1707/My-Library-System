public class Book {
    private String title ;
    private String author;
    private int ISBN ;
    private int borrowFee;
    private  boolean isAvailable;
    private int discountedFee;
    private boolean hasDiscount ;
    private String bookCatagory ;
    public Book(String title, String author, int ISBN, int borrowFee) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.borrowFee = borrowFee;
        this.isAvailable = true;
    }
   public Book(){
   }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getBorrowFee() {
        return borrowFee;
    }

    public void setBorrowFee(int borrowFee) {
        this.borrowFee = borrowFee;

    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public int setDiscount(int rate){
     this.discountedFee=getBorrowFee()-(getBorrowFee()/rate);
     this.hasDiscount=true;
        return discountedFee;

    }


    public int getDiscountedFee() {
        return discountedFee;
    }

    public boolean isHasDiscount() {
        return hasDiscount;
    }


    public void details(){
        if(isAvailable()==true){
            if(hasDiscount==true){
        System.out.println("Book title :"+getTitle()+" Author :"+getAuthor()+" ISBN :"+getISBN()+" Borrow Fee:" + getBorrowFee() +"tk after discount:"+getDiscountedFee()+"tk Available");}
            else {
                System.out.println("Book title :" + getTitle() + " Author :" + getAuthor() + " ISBN :" + getISBN() + " Borrow Fee:" + getBorrowFee() + "tk Available");
            }
        }
        else {
            System.out.println("Book title :" + getTitle() + " Author :" + getAuthor() + " ISBN :" + getISBN() + " Borrow Fee:" + getBorrowFee() + "tk Not Available");
        }
    }


}













