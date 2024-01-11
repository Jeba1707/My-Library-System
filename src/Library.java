import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Library {
    List<Book> booklist ;
    List<Member> memberlist;
    List<Member> basicMemberList;
    List<Member> premiumMemberList;
    List<Book> cartList ;
    List<Book> borrowedBookList;

    List<Book> returnList;

    Borrow borrow;
    List<Book> borrowHistory ;
    List<Book> comicBookList;
    List<Book> historyBookList;
    List<Book> childrenBookList;
    List<Book> ITbookList;
    List<Book> mystryBookList;

    public Library() {
        this.booklist = new ArrayList<>();
        this.memberlist = new ArrayList<>();
        this.cartList = new ArrayList<>();
        this.borrowedBookList = new ArrayList<>();
        this.returnList = new ArrayList<>();
        this.borrowHistory = new ArrayList<>();
        this.comicBookList = new ArrayList<>();
        this.historyBookList = new ArrayList<>();
        this.childrenBookList = new ArrayList<>();
        this.ITbookList = new ArrayList<>();
        this.mystryBookList=new ArrayList<>();
        this.basicMemberList=new ArrayList<>();
        this.premiumMemberList=new ArrayList<>();
    }

    public void addBooks(Book book){
        booklist.add(book);
        if(book instanceof Comic)
            comicBookList.add(book);
        else if (book instanceof History)
            historyBookList.add(book);
        else if (book instanceof ChildrenBook)
            childrenBookList.add(book);
        else if (book instanceof Mystry)
            mystryBookList.add(book);
         else
                ITbookList.add(book);

    }

    public List<Book> getBooklist() {
      return booklist;
    }
    public void displayBookList(){
        for(Book book :booklist){
            book.details();
        }
    }
    public void displayComicBookList(){
        for(Book book :comicBookList){
            book.details();
        }
    }
    public void displayITBookList(){
        for(Book book :ITbookList){
            book.details();
        }
    }
    public void displayHistoryBookList(){
        for(Book book :historyBookList){
            book.details();
        }
    }
    public void displayChildrenBookList(){
        for(Book book :childrenBookList){
            book.details();
        }
    }
    public void displayMystryBookList(){
        for(Book book :mystryBookList){
            book.details();
        }
    }

    public void setBooklist(List<Book> booklist) {
        this.booklist = booklist;
    }

    public void setMemberlist(List<Member> memberlist) {
        this.memberlist = memberlist;
    }

    public List<Member> getBasicMemberList() {
        return basicMemberList;
    }

    public void setBasicMemberList(List<Member> basicMemberList) {
        this.basicMemberList = basicMemberList;
    }

    public List<Member> getPremiumMemberList() {
        return premiumMemberList;
    }

    public void setPremiumMemberList(List<Member> premiumMemberList) {
        this.premiumMemberList = premiumMemberList;
    }

    public List<Book> getMystryBookList() {
        return mystryBookList;
    }

    public void setMystryBookList(List<Book> mystryBookList) {
        this.mystryBookList = mystryBookList;
    }

    public void setCartList(List<Book> cartList) {
        this.cartList = cartList;
    }

    public void setBorrowedBookList(List<Book> borrowedBookList) {
        this.borrowedBookList = borrowedBookList;
    }

    public void setReturnList(List<Book> returnList) {
        this.returnList = returnList;
    }

    public Borrow getBorrow() {
        return borrow;
    }

    public void setBorrow(Borrow borrow) {
        this.borrow = borrow;
    }

    public List<Book> getBorrowHistory() {
        return borrowHistory;
    }

    public void setBorrowHistory(List<Book> borrowHistory) {
        this.borrowHistory = borrowHistory;
    }

    public List<Book> getComicBookList() {
        return comicBookList;
    }

    public void setComicBookList(List<Book> comicBookList) {
        this.comicBookList = comicBookList;
    }

    public List<Book> getHistoryBookList() {
        return historyBookList;
    }

    public void setHistoryBookList(List<Book> historyBookList) {
        this.historyBookList = historyBookList;
    }

    public List<Book> getChildrenBookList() {
        return childrenBookList;
    }

    public void setChildrenBookList(List<Book> childrenBookList) {
        this.childrenBookList = childrenBookList;
    }

    public List<Book> getITbookList() {
        return ITbookList;
    }

    public void setITbookList(List<Book> ITbookList) {
        this.ITbookList = ITbookList;
    }

    public void addMember(Member member){
       memberlist.add(member);
       if(member instanceof BasicMember)
           basicMemberList.add(member);
       else
           premiumMemberList.add(member);
    }
    public List<Member> getMemberlist() {
      return memberlist;
    }
   public void displayMemberList(){
       for(Member member :memberlist){
           member.details();
       }
   }
    public void displayBasicMemberList(){
        for(Member member :basicMemberList){
            member.details();
        }
    }
    public void displayPremiumMemberList(){
        for(Member member :premiumMemberList){
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



