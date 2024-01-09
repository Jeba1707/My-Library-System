public class Member {
    private static int lastId = 100;
    private int ID ;
    private String userName ;
    private String phoneNumber;
    private String Address;
    private String password;


    public Member(String userName, String phoneNumber, String address, String password) {
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        Address = address;
        this.password = password;
        this.ID = ++lastId;
    }

    public Member() {

    }

    public int getID() {
        return ID;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   public void details(){
       System.out.println("Membere ID :"+getID()+" User name :"+getUserName()+" Adress :"+getAddress()+" Phone Number :"+getPhoneNumber());
   }

}
