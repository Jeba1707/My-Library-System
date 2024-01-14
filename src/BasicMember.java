public class BasicMember extends Member {
    private  int bookLimit;
    private String membership;
    private int returnDaysLimit;

    public BasicMember(String userName, String phoneNumber, String address, String password, Encryptor encryptor) {
        super(userName, phoneNumber, address, password, encryptor);
        this.bookLimit = 5 ;
        this.membership = "Basic";
        this.returnDaysLimit = 12;
    }

    public BasicMember() {
    }

    public int getBookLimit() {
        return bookLimit;
    }

    public void setBookLimit(int bookLimit) {
        this.bookLimit = bookLimit;
    }

    public String getMembership() {
        return membership;
    }

    public void setMembership(String membership) {
        this.membership = membership;
    }

    public int getReturnDaysLimit() {
        return returnDaysLimit;
    }

    public void setReturnDaysLimit(int returnDaysLimit) {
        this.returnDaysLimit = returnDaysLimit;
    }

    @Override
    public void details() {
        System.out.println("(A Basic member) Member ID :"+getID()+" User name :"+getUserName()+" Adress :"+getAddress()+" Phone Number :"+getPhoneNumber());
    }
}
