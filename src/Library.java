import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Library {
    List<Book> booklist ;
    List<Member> memberlist;
    List<Book> cartList ;
    List<Book> borrowedList;
    Date date ;
    List<Book> returnList;

    public Library() {
        this.booklist = new ArrayList<>();
        this.memberlist = new ArrayList<>();
        this.cartList =  new ArrayList<>();
        this.borrowedList =  new ArrayList<>();
        this.returnList =  new ArrayList<>();

    }

    public void addBooks(Book book){
        booklist.add(book);
    }

    public void getBooklist() {
      for(Book book :booklist){
          book.details();
      }

    }
    public void addMember(Member member){
       memberlist.add(member);
    }
    public void getMemberlist() {
        for(Member member :memberlist){
            member.details();
        }
    }

    public List<Book> getCartList() {
        return cartList;
    }

    public List<Book> getBorrowedList() {
        return borrowedList;
    }

//    public Date getDate() {
//        return date;
//    }

    public List<Book> getReturnList() {
        return returnList;
    }
}
