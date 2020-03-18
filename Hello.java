import java.util.Scanner;
class Hello {
    public static void main(String[] args) {
        String input;
        Scanner scnr = new Scanner(System.in);


        System.out.println("Hello. What is your name?");
        input = scnr.next();
        System.out.println("It's nice to meet you, " + input + ". How old are you?");
        input = scnr.next();
        System.out.println("I see that you are still quite young at only" + input + ". \nWhere do you live?");
        input = scnr.next();
        System.out.println("Wow! I've always wanted to go to " + input + ". Thanks for chatting with me. Bye!");
    }
}