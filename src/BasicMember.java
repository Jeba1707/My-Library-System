public class BasicMember extends Member {
    private  int bookLimit;
    private String membership;
    private int returnDaysLimit;
    public BasicMember(String userName, String phoneNumber, String address, String password) {
        super(userName, phoneNumber, address, password);
        this.bookLimit = 5;
        this.membership = "Basic";
        this.returnDaysLimit = 12;
    }

    public BasicMember() {
    }

    @Override
    public void details() {
        System.out.println("(A Basic member) Member ID :"+getID()+" User name :"+getUserName()+" Adress :"+getAddress()+" Phone Number :"+getPhoneNumber());
    }
}
