import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        Book b1 = new Comic("A comic book","jeba",12345,40);
        Book b2 = new History("A history Book","jeba",12345,40);
        Book b3 = new IT("A IT book","jeba",12345,40);

        Member member1 = new BasicMember("basicJeba","0162537","dhaka","jeba1212");
        Member member2 = new PremiumMember("preJeba","0162537","dhaka","jeba1212");
        Member member3 = new BasicMember("basJeba","0162537","dhaka","jeba1212");


        Library library = new Library();
library.addMember(member1);
        library.addMember(member2);
        library.addMember(member3);
        library.getMemberlist();

        library.addBooks(b1);
        library.addBooks(b2);
        library.addBooks(b3);
        library.getBooklist();

   //more things to do :remove member,book,search,borrow,return,history,cart


    }
}