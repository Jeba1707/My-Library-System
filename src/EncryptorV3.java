public class EncryptorV3 implements Encryptor{
    private String key1 ="wk4";
    private String key2 ="8rk";

    public EncryptorV3() {

    }
    @Override
    public String encryption(String pass) {
        return key1+pass+key2 ;
    }
}
