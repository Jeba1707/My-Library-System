import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Encryptor v1 = new EncryptorV1();
        Encryptor v2 = new EncryptorV2();
        Encryptor v3 = new EncryptorV3();


        Book b1 = new Comic("A comic book","jeba",12345,40);
        Book b2 = new History("A history Book","jebin",23456,50);
        Book b3 = new IT("A IT book","Tasnim",34567,60);
        Book b4 = new Mystry("A Mystry book","RAhim",112233,60);
        Book b5 = new ChildrenBook("A Children book","Ripon",221133,60);
        Book b6 = new IT("B IT book","renoy",331122,60);
        Book b7 = new Comic("B Comic book","Tasnim",123123,60);


        library.addBooks(b1);
        library.addBooks(b2);
        library.addBooks(b3);
        library.addBooks(b4);
        library.addBooks(b5);
        library.addBooks(b6);
        library.addBooks(b7);

        library.displayITBookList();

        for(Book book :library.ITbookList)
        {
            book.setDiscount(10);
        }
        library.displayITBookList();
        Member member1 = new BasicMember("basicJeba","0162537","dhaka","jeba",v1);
        Member member2 = new PremiumMember("preJeba","0162537","dhaka","jeba",v2);
        Member member3 = new BasicMember("basicJebin","0162537","dhaka","jeba",v3);
        Member member4 = new PremiumMember("PreJebin","0162537","dhaka","jeba",v1);

       library.addMember(member1);
       library.addMember(member2);
       library.addMember(member3);
       library.addMember(member4);
       library.displayBasicMemberList();



      //library.memberlist = List.of(member1,member2,member3);



      //  library.displayBookList();

       // library.booklist.remove(b3);
      //  library.getBooklist();
       // library.searchBook("A comic book");


//        library.addToCart(12345);
//        library.addToCart(34567);
//        library.displayCartList();
//        library.borrow(member2);
//         b1.details();
//        library.addToReturnList(b1);
//        library.returnbook(member2);
//        b1.details();


//borrowBook number,return book number
    }
}