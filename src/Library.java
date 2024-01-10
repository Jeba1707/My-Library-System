import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Library {
    List<Book> booklist ;
    List<Member> memberlist;
    List<Book> cartList ;
    List<Book> borrowedBookList;

    List<Book> returnList;

    Borrow borrow;
    List<Borrow> borrowHistory ;


    public Library() {
        this.booklist = new ArrayList<>();
        this.memberlist = new ArrayList<>();
        this.cartList =  new ArrayList<>();
        this.borrowedBookList =  new ArrayList<>();
        this.returnList =  new ArrayList<>();
    }

    public void addBooks(Book book){
        booklist.add(book);
    }

    public List<Book> getBooklist() {
      return booklist;
    }
    public void displayBookList(){
        for(Book book :booklist){
            book.details();
        }
    }

    public void addMember(Member member){
       memberlist.add(member);
    }
    public List<Member> getMemberlist() {
      return memberlist;
    }
   public void displayMemberList(){
       for(Member member :memberlist){
           member.details();
       }
   }


    public List<Book> getBorrowedBookList() {
        return borrowedBookList;
    }


  public  void addToReturnList(Book book){
        returnList.add(book);
  }
    public List<Book> getReturnList() {
        return returnList;
    }
    public void displayReturnList(){
        for(Book book :returnList){
            book.details();
        }
    }
    public void searchBook(String title){
        for(Book book :booklist){
            if(book.getTitle().equalsIgnoreCase(title)){
                book.details();

                break;
            }
            else{
                System.out.println("Book not found");

            }
        }
    }

    public void addToCart(int ISBN) {
    int count = 0;
        for (Book book : booklist) {
            if (book.getISBN() == ISBN) {
                cartList.add(book);
                count++;
            }
        }if(count>0)
                System.out.println("ISBN "+ISBN+" Added to cart successfull.");
            else
                System.out.println("Sorry ISBN "+ISBN+"not found");
        }

    public List<Book> getCartList() {
        return cartList;
    }
    public void displayCartList(){
        for(Book book :cartList){
            book.details();

        }
    }
    public void borrow(Member member){
        if(cartList.size()<=member.getBookLimit()){
        this.borrow= new Borrow();
        for(Book book :cartList){
            book.setAvailable(false);
            borrowedBookList.add(book);
            borrow.addBooks(book);
        }
        System.out.println("Borrow successfull");

        borrow.setMember(member);
        borrow.membershipSpecialize();
        //borrow.totalFee();
       borrow.borrowDetails();}
        else
            System.out.println("you have crossed your book limit.");
    }


    public void returnbook(Member member){
        for(Book book :returnList){
            book.setAvailable(true);
        }
        System.out.println("return successfull");
    }

}



