import java.util.*;
class Main{
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          System.out.print("Enter your name: ");
          String name = scanner.nextLine();

          for (int i = 0; i < 3; i++) {
              System.out.println(name);
          }

          scanner.close();
      }
  }
