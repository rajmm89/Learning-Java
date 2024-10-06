import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        if(button==1){
            System.out.println("Hello");
        }
        if(button==4){
            System.out.println("Hello 4");
        }
        else if (button==2){
            System.out.println("Namaste");
        } else if (button==3) {
            System.out.println("Bonjour");
        }
        else if (button==5) {
            System.out.println("Bonjour 5");
        else {
            System.out.println("invalid");
        }
    }
}