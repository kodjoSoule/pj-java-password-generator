import java.util.Random;

public class Generator {
private int passLenght = 0 ;
    public char[] generatePswd(){
        String charsCaps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String chars = "abcdefghijklmnopqrstuvwxyz";
        String nums = "0123456789";
        String symbols = "!@#$%^&*_=+-/€.?<>)";
        Random rd = new Random();
        String passString = charsCaps + chars + nums + symbols;

        char[] password = new char[passLenght];


        for (int i = 0; i < passLenght; i++)
        {
            password[i] = passString.charAt(rd.nextInt(passString.length()));

        }
        return password;

    }
    //getter and setter
    public int getPassLenght() {
        return passLenght;
    }
    public void setPassLenght(int passLenght) {
        this.passLenght = passLenght;
    }
}
