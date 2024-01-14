public class PremiumMember extends Member{
    private  int bookLimit;
    private String membership;
    private int returnDaysLimit;

    public PremiumMember(String userName, String phoneNumber, String address, String password, Encryptor encryptor) {
        super(userName, phoneNumber, address, password, encryptor);
        this.bookLimit = 7 ;
        this.membership = "Premium";
        this.returnDaysLimit = 15;
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

    public PremiumMember() {
    }

    @Override
    public void details() {

        System.out.println("(A Premium member) Member ID :"+getID()+" User name :"+getUserName()+" Adress :"+getAddress()+" Phone Number :"+getPhoneNumber());
    }

}
