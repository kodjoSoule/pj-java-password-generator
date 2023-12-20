public class App {
    public static void main(String[] args) throws Exception {
        Generator generator = new Generator();
        generator.setPassLenght(15);
        for(int i = 0; i < 10; i++){
        System.out.println("New password: ");
        System.out.println(generator.getPassLenght());
        System.out.println(generator.generatePswd());
        }
    }
}