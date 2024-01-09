public class PremiumMember extends Member{
    private  int bookLimit;
    private String membership;
    private int returnDaysLimit;

    public PremiumMember(String userName, String phoneNumber, String address, String password) {
        super(userName, phoneNumber, address, password);
        this.bookLimit = 7 ;
        this.membership = "Premium";
        this.returnDaysLimit = 15;

    }

    public PremiumMember() {
    }

    @Override
    public void details() {

        System.out.println("(A Premium member) Member ID :"+getID()+" User name :"+getUserName()+" Adress :"+getAddress()+" Phone Number :"+getPhoneNumber());
    }

}
