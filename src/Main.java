import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //encryptor object creat for use
        Library library = new Library();
        Encryptor v1 = new EncryptorV1();
        Encryptor v2 = new EncryptorV2();
        Encryptor v3 = new EncryptorV3();
        //creat and added 4 members
        Member member1 = new BasicMember("basicJeba","0162537","dhaka","jeba",v3);
        Member member2 = new PremiumMember("preJeba","0162537","dhaka","jeba",v2);
        Member member3 = new BasicMember("basicJebin","0162537","dhaka","jeba",v1);
        Member member4 = new PremiumMember("PreJebin","0162537","dhaka","jeba",v1);

        library.addMember(member1);
        library.addMember(member2);
        library.addMember(member3);
        library.addMember(member4);


        Book b1 = new Comic("A comic book","jeba",123456,50);
        Book b7 = new Comic("B Comic book","Tasnim",123123,60);
        Book b2 = new History("A history Book","jebin",234567,50);
        Book b9 = new History("B history Book","rahim",987654,50);
        Book b3 = new IT("A IT book","Tasnim",345678,60);
        Book b6 = new IT("B IT book","renoy",331122,45);
        Book b4 = new Mystry("A Mystry book","RAhim",112233,60);
        Book b8 = new Mystry("B Mystry book","RAhim",112255,55);
        Book b5 = new ChildrenBook("A Children book","Ripon",221133,45);
        Book b10 = new ChildrenBook("A Children book","Ripon",221199,50);


        library.addBooks(b1);
        library.addBooks(b2);
        library.addBooks(b3);
        library.addBooks(b4);
        library.addBooks(b5);
        library.addBooks(b6);
        library.addBooks(b7);
        library.addBooks(b8);
        library.addBooks(b9);
        library.addBooks(b10);
        System.out.println(b4.getISBN());
        System.out.println("Welcome!");
        int count = 1 ;
        do
        {  int option=6;
            System.out.println("1.librarian  2.Customer ");
            try{

                Scanner input = new Scanner(System.in);
                System.out.print("please enter option = ");
                option = input.nextInt();
                count = 1;
            }
            catch(Exception e){
                System.out.println("Exception = "+e);
                System.out.println("you must enter between 1 and 2 ");
            }
            System.out.println();
            if(option==1 || option==2) {
                if(option==1){
                   int count2 = 1;
                   do {int option2 = 9;
                      try {
                          System.out.println("1.See booklist.\n2.search book.\n3.Add a book to the list.\n4.remove a book from the list.\n5.update book fee.\n6.add Discount \n7.see memberlist\n8.return to main dashboard\n0.exit");
                          System.out.println("Enter option :");
                          Scanner sc = new Scanner(System.in);
                          option2 = sc.nextInt();
                          count2 = 1;
                      }catch (Exception e){
                          System.out.println("Exception = "+e);
                          System.out.println("you must enter between 0 and 8 ");
                      }
                      switch (option2)
                      {

                          case 1:{int listNum = 8;
                              int booklistCount=1;
                              do {
                                  System.out.println("1.Comic booklist\n2.IT booklist\n3.History booklist.\n4.Mystry booklist\n5.Children booklist\n6.Return to librarians dashboard");
                                  try {
                                      System.out.println("enter option:");
                                      Scanner sc2 = new Scanner(System.in);
                                      listNum = sc2.nextInt();

                                  } catch (Exception e) {
                                      System.out.println("Exception = " + e);
                                      System.out.println("you must enter between 1 and 6");
                                      booklistCount=1;
                                  }
                                  switch (listNum) {
                                      case 1: {
                                          library.displayComicBookList();
                                          booklistCount=1;
                                          break;
                                      }
                                      case 2: {
                                          library.displayITBookList();
                                          booklistCount=1;
                                          break;
                                      }
                                      case 3: {
                                          library.displayHistoryBookList();
                                          booklistCount=1;
                                          break;
                                      }
                                      case 4: {
                                          library.displayMystryBookList();
                                          booklistCount=1;
                                          break;
                                      }
                                      case 5: {
                                          library.displayChildrenBookList();
                                          booklistCount=1;
                                          break;
                                      }
                                      case 6: {
                                          booklistCount=0;
                                          count2=1;
                                          break;
                                      }
                                      default:{
                                          System.out.println("invalid input try again");
                                          booklistCount=1;
                                      }


                                  }
                              }while (booklistCount==1);
                             // count2=1;
                              break;



                          }
                          case 2:{
                              int searchNum = 8;
                              int searchCount=1;
                              do {
                                  System.out.println("1.Enter book title to search \n2.return to librarian dashboard");
                                  try {
                                      Scanner sc2 = new Scanner(System.in);
                                      searchNum = sc2.nextInt();
                                      searchCount=0;
                                  } catch (Exception e) {
                                      System.out.println("Exception = " + e);
                                      System.out.println("you must enter between 1 and 2");


                                  }
                                  switch (searchNum)
                                  {
                                      case 1 :{
                                          System.out.print("enter title:");
                                          Scanner sc3 = new Scanner(System.in);
                                         String title =sc3.nextLine();
                                         library.searchBook(title);
                                         searchCount=1;
                                          break;
                                      }
                                      case 2 :{
                                          searchCount=0;
                                          count2=1;
                                          break;
                                      }
                                      default:{
                                          System.out.println("invalid input try again");
                                          searchCount=1;
                                      }
                                  }
                              }while (searchCount==1);
                              // count2=1;
                              break;}
                          case 3:{
                              int listNum = 8;
                              int booklistCount=1;
                              do {
                              System.out.println("1.add a comic book to the list\n2.add a IT book to the list\n3.add a mystry book to the list \n4.add a history book to the list \n5.add a children book to the list \n6.return to librarian dashboard .");
                                  try {
                                      System.out.println("enter option:");
                                      Scanner sc2 = new Scanner(System.in);
                                      listNum = sc2.nextInt();

                                  } catch (Exception e) {
                                      System.out.println("Exception = " + e);
                                      System.out.println("you must enter between 1 and 6");
                                      booklistCount=1;
                                  }
                                  switch (listNum) {
                                      case 1: {int addingloop=1;
                                          do {
                                              Book comic = new Comic();
                                              try {
                                                  Scanner input1 = new Scanner(System.in);
                                                  System.out.println("enter book title:");
                                                  String title = input1.nextLine();
                                                  System.out.println("enter book author:");
                                                  String author = input1.nextLine();
                                                  System.out.println("enter ISBN:");
                                                  int isbn = input1.nextInt();
                                                  System.out.println("enter borrow fee:");
                                                  int fee = input1.nextInt();
                                                  comic.setTitle(title);
                                                  comic.setAuthor(author);
                                                  comic.setISBN(isbn);
                                                  comic.setBorrowFee(fee);
                                                  comic.setAvailable(true);
                                                  library.addBooks(comic);
                                                  System.out.println("book added successfull");
                                                  addingloop=0;
                                              } catch (Exception e) {
                                                  System.out.println(e+": invalid input ");

                                              }

                                          }while (addingloop==1);
                                         // booklistCount=1;
                                          break;
                                      }
                                      case 2: {int addingloop=1;
                                          do {
                                              Book it = new IT();
                                              try {
                                                  Scanner input1 = new Scanner(System.in);
                                                  System.out.println("enter book title:");
                                                  String title = input1.nextLine();
                                                  System.out.println("enter book author:");
                                                  String author = input1.nextLine();
                                                  System.out.println("enter ISBN:");
                                                  int isbn = input1.nextInt();
                                                  System.out.println("enter borrow fee:");
                                                  int fee = input1.nextInt();
                                                  it.setTitle(title);
                                                  it.setAuthor(author);
                                                  it.setISBN(isbn);
                                                  it.setBorrowFee(fee);
                                                  it.setAvailable(true);
                                                  library.addBooks(it);
                                                  System.out.println("book added successfull");
                                                  addingloop=0;
                                              } catch (Exception e) {
                                                  System.out.println(e+": invalid input ");

                                              }

                                          }while (addingloop==1);
                                          // booklistCount=1;
                                          break;
                                      }
                                      case 3: {int addingloop=1;
                                          do {
                                              Book mystry = new Mystry();
                                              try {
                                                  Scanner input1 = new Scanner(System.in);
                                                  System.out.println("enter book title:");
                                                  String title = input1.nextLine();
                                                  System.out.println("enter book author:");
                                                  String author = input1.nextLine();
                                                  System.out.println("enter ISBN:");
                                                  int isbn = input1.nextInt();
                                                  System.out.println("enter borrow fee:");
                                                  int fee = input1.nextInt();
                                                  mystry.setTitle(title);
                                                  mystry.setAuthor(author);
                                                  mystry.setISBN(isbn);
                                                  mystry.setBorrowFee(fee);
                                                  mystry.setAvailable(true);
                                                  library.addBooks(mystry);
                                                  System.out.println("book added successfull");
                                                  addingloop=0;
                                              } catch (Exception e) {
                                                  System.out.println(e+": invalid input ");

                                              }

                                          }while (addingloop==1);
                                          // booklistCount=1;
                                          break;
                                      }
                                      case 4: {
                                          int addingloop=1;
                                          do {
                                              Book history = new History();
                                              try {
                                                  Scanner input1 = new Scanner(System.in);
                                                  System.out.println("enter book title:");
                                                  String title = input1.nextLine();
                                                  System.out.println("enter book author:");
                                                  String author = input1.nextLine();
                                                  System.out.println("enter ISBN:");
                                                  int isbn = input1.nextInt();
                                                  System.out.println("enter borrow fee:");
                                                  int fee = input1.nextInt();
                                                  history.setTitle(title);
                                                  history.setAuthor(author);
                                                  history.setISBN(isbn);
                                                  history.setBorrowFee(fee);
                                                  history.setAvailable(true);
                                                  library.addBooks(history);
                                                  System.out.println("book added successfull");
                                                  addingloop=0;
                                              } catch (Exception e) {
                                                  System.out.println(e+": invalid input ");

                                              }

                                          }while (addingloop==1);
                                          // booklistCount=1;
                                          break;
                                      }
                                      case 5: {int addingloop=1;
                                          do {
                                              Book childrenbook = new ChildrenBook();
                                              try {
                                                  Scanner input1 = new Scanner(System.in);
                                                  System.out.println("enter book title:");
                                                  String title = input1.nextLine();
                                                  System.out.println("enter book author:");
                                                  String author = input1.nextLine();
                                                  System.out.println("enter ISBN:");
                                                  int isbn = input1.nextInt();
                                                  System.out.println("enter borrow fee:");
                                                  int fee = input1.nextInt();
                                                  childrenbook.setTitle(title);
                                                  childrenbook.setAuthor(author);
                                                  childrenbook.setISBN(isbn);
                                                  childrenbook.setBorrowFee(fee);
                                                  childrenbook.setAvailable(true);
                                                  library.addBooks(childrenbook);
                                                  System.out.println("book added successfull");
                                                  addingloop=0;
                                              } catch (Exception e) {
                                                  System.out.println(e+": invalid input ");

                                              }

                                          }while (addingloop==1);
                                          // booklistCount=1;
                                          break;
                                      }
                                      case 6: {
                                          booklistCount=0;
                                          count2=1;
                                          break;
                                      }
                                      default:{
                                          System.out.println("invalid input try again");
                                          booklistCount=1;
                                      }


                                  }
                              }while (booklistCount==1);
                              // count2=1;
                              break;}
                          case 4:{  int removeNum = 8;
                              int removeCount=1;
                              do {
                                  System.out.println("1.Enter book ISBN to remove from list  \n2.return to librarian dashboard");
                                  try {
                                      Scanner sc2 = new Scanner(System.in);
                                      removeNum = sc2.nextInt();
                                      removeCount=0;
                                  } catch (Exception e) {
                                      System.out.println("Exception = " + e);
                                      System.out.println("you must enter between 1 and 2");


                                  }
                                  switch (removeNum)
                                  {
                                      case 1 :{
                                          System.out.print("enter ISBN:");
                                          Scanner r = new Scanner(System.in);
                                          int Isbn =r.nextInt();

                                          library.removeBook(Isbn);
                                          removeCount=1;
                                          break;
                                      }
                                      case 2 :{
                                          removeCount=0;
                                          count2=1;
                                          break;
                                      }
                                      default:{
                                          System.out.println("invalid input try again");
                                          removeCount=1;
                                      }
                                  }
                              }while (removeCount==1);
                              // count2=1;
                              break;}
                          case 5:{  int updateNum = 8;
                              int updateCount=1;
                              do {
                                  System.out.println("1.Enter book ISBN to update fee  \n2.return to librarian dashboard");
                                  try {
                                      Scanner sc2 = new Scanner(System.in);
                                      updateNum = sc2.nextInt();
                                      updateCount=0;
                                  } catch (Exception e) {
                                      System.out.println("Exception = " + e);
                                      System.out.println("you must enter between 1 and 2");


                                  }
                                  switch (updateNum)
                                  {
                                      case 1 :{
                                          Scanner i = new Scanner(System.in);
                                          System.out.print("enter ISBN:");
                                          int Isbn =i.nextInt();
                                          System.out.print("enter new fee:");
                                          int newfee =i.nextInt();

                                          library.updateFee(Isbn,newfee);
                                          updateCount=1;
                                          break;
                                      }
                                      case 2 :{
                                          updateCount=0;
                                          count2=1;
                                          break;
                                      }
                                      default:{
                                          System.out.println("invalid input try again");
                                          updateCount=1;
                                      }
                                  }
                              }while (updateCount==1);
                              // count2=1;
                              break;}
                          case 6:{  int discount = 8;
                              int discountCount=1;
                              do {
                                  System.out.println("1.discount by Catagory of books\n2.discount in all books\n3.discount on a specific book  \n4.return to librarian dashboard");
                                  try {
                                      Scanner sc2 = new Scanner(System.in);
                                      discount = sc2.nextInt();
                                      discountCount=0;
                                  } catch (Exception e) {
                                      System.out.println("Exception = " + e);
                                      System.out.println("you must enter between 1 and 4");


                                  }
                                  switch (discount)
                                  {
                                      case 1:{
                                          discountCount=1;
                                          break;
                                      }
                                      case 2:{
                                          discountCount=1;
                                          break;
                                      }
                                      case 3 :{
                                          Scanner i = new Scanner(System.in);
                                          System.out.print("enter ISBN:");
                                          int Isbn =i.nextInt();
                                          System.out.print("enter discount rate:");
                                          int rate =i.nextInt();

                                          library.discount(Isbn,rate);
                                          discountCount=1;
                                          break;
                                      }
                                      case 4 :{
                                          discountCount=0;
                                          count2=1;
                                          break;
                                      }
                                      default:{
                                          System.out.println("invalid input try again");
                                          discountCount=1;
                                      }
                                  }
                              }while (discountCount==1);
                              // count2=1;
                              break;}
                          case 7:{ System.out.println("Booklist");
                              count2=1;
                              break;}
                          case 8:{ System.out.println("Returned to main dashboard");
                              count2=0;
                              count=1;
                              break;}
                          case 0:{
                              count2=0;
                              count=0;
                              break;}
                          default:{ System.out.println("Invalid input,you must enter between 0 and 8 ");
                              count2=1;
                              break;}

                      }
                   }while(count2==1);
                }
             else{
                 count=0;
                }
            }
            else{
                System.out.println("Invalid input,you must enter between 1 and 2 ");
                count=1;
            }

        }while(count==1);







    }


}