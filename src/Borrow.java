import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Borrow {
    private List<Book> books;
    private Member member;

    private LocalDate borrowedDate;
    private Double totalFee;
    private LocalDate returnDate;

    public Borrow(Member member) {
        this.books = new ArrayList<>();
        this.borrowedDate = LocalDate.now();
        this.totalFee = 0.0;
        this.member= member;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
       this.books=books;

    }
    public void addBooks(Book book){
   books.add(book);

    }
    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
          this.member= member;
    }

    public LocalDate getBorrowedDate() {
        return borrowedDate;
    }

    public void setBorrowedDate(LocalDate borrowedDate) {
        this.borrowedDate = borrowedDate;
    }

    public Double getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(Double totalFee) {
        this.totalFee = totalFee;
    }
    public void membershipSpecialize(){
        returnDate=borrowedDate.plusDays(member.getReturnDaysLimit());
        for(Book book:books){
            totalFee= totalFee+book.getBorrowFee();
        }
        if( member.getMembership().equalsIgnoreCase("premium")){
            totalFee=totalFee-(totalFee/10);
        }
    }

    public void returndate(){

    }
    public void borrowDetails(){
        System.out.println("Borrowed Date :"+ getBorrowedDate());
        for (Book book:books){
            System.out.println("Book Title :"+book.getTitle());}
        System.out.println("Total fee :"+getTotalFee());
        System.out.println("Return before Date:"+returnDate);
    }

}
