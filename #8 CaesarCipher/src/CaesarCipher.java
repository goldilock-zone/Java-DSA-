import java.util.Random;

public class CaesarCipher {

    protected char[] encoder = new char[26];
    protected char[] decoder = new char[26];

    public CaesarCipher(int rotation){
        for (int i = 0; i < 26; i++){
            encoder[i] = (char) ('A' + (i + rotation) % 26);
            decoder[i] = (char) ('A' + (i - rotation + 26) % 26);
        }
    }

    private String transform(String original, char[] code) {
        char[] msg = original.toCharArray();
        for (int k = 0; k < msg.length; k++){
            if (Character.isUpperCase(msg[k])){
                int j = msg[k] - 'A';
                msg[k] = code[j]; //here the code is either encoder or decoder
            }
        }
        return new String(msg);
    }

    public String encrypt(String message){
        return transform(message, encoder);
    }

    public String decrypt(String message){
        return transform(message, decoder);
    }

    public static void main(String[] args) throws Exception {
        Random rand = new Random(System.currentTimeMillis());
        CaesarCipher cipher = new CaesarCipher(rand.nextInt(26));
        System.out.println("Encryption Code: " + new String(cipher.encoder));
        System.out.println("Decryption Code: " + new String(cipher.decoder));

        String message = "I AM A SARBI DUCKY";

        String coded = cipher.encrypt(message);
        System.out.println("Encrypted message: " + coded);
        String answer = cipher.decrypt(coded);
        System.out.println("Decrypted message: " + answer);
    }
}
