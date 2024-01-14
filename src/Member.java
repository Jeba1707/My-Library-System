public abstract class Member {
    private static int lastId = 100;
    private int ID ;
    private String userName ;
    private String phoneNumber;
    private String Address;
    private String password;
    private  int bookLimit;
    private String membership;
    private int returnDaysLimit;
   private Encryptor encryptor;


    public Encryptor getEncryptor() {
        return encryptor;
    }

    public Member(String userName, String phoneNumber, String address, String password,Encryptor encryptor) {
       setEncryptor(encryptor);
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        Address = address;
        setPassword(password);
        this.ID = ++lastId;

    }

    public Member() {

    }

    public void setEncryptor(Encryptor encryptor) {
        this.encryptor = encryptor;
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

    public void setID(int ID) {
        this.ID = ID;
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

    public void setAddress(String address) {
        Address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = encryptor.encryption(password);
    }

   public abstract void details();



}
