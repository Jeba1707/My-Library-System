import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book b1 = new Comic("A comic book","jeba",12345,40);
        Book b2 = new History("A history Book","jebin",23456,50);
        Book b3 = new IT("A IT book","Tasnim",34567,60);
        Book b4 = new Mystry("A Mystry book","RAhim",112233,60);
        Book b5 = new ChildrenBook("A Children book","Ripon",221133,60);
        Book b6 = new IT("B IT book","renoy",331122,60);
        Book b7 = new Comic("B Comic book","Tasnim",123123,60);

        library.booklist = List.of(b1,b2,b3,b4,b5,b6,b7);

        Member member1 = new BasicMember("basicJeba","0162537","dhaka","jeba1212");
        Member member2 = new PremiumMember("preJeba","0162537","dhaka","jeba1212");
        Member member3 = new BasicMember("basJeba","0162537","dhaka","jeba1212");

       library.memberlist = List.of(member1,member2,member3);


      //  library.displayBookList();

       // library.booklist.remove(b3);
      //  library.getBooklist();
       // library.searchBook("A comic book");


        library.addToCart(12345);
        library.addToCart(34567);
        library.displayCartList();
        library.borrow(member2);
         b1.details();
        library.addToReturnList(b1);
        library.returnbook(member2);
        b1.details();


    }
}