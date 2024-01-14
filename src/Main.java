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
                                      Scanner sc2 = new Scanner(System.in);
                                      listNum = sc2.nextInt();

                                  } catch (Exception e) {
                                      System.out.println("Exception = " + e);
                                      System.out.println("you must enter between 1 and 5");
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
                          case 2:{ System.out.println("Booklist");
                              count2=1;
                              break;}
                          case 3:{ System.out.println("Booklist");
                              count2=1;
                              break;}
                          case 4:{ System.out.println("Booklist");
                              count2=1;
                              break;}
                          case 5:{ System.out.println("Booklist");
                              count2=1;
                              break;}
                          case 6:{ System.out.println("Booklist");
                              count2=1;
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