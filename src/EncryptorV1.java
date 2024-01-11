public class EncryptorV1 implements Encryptor{

    private String key ="1jw";

    public EncryptorV1() {

    }

    @Override
    public String encryption(String pass) {
        return key+pass;
    }
}
