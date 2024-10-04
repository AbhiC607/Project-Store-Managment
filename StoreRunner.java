import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

 
    Scanner input = new Scanner(System.in);
pizza pizza = new pizza();

    pasta pasta = new pasta("spaghetti", 8.99, "Large", true);
    sushi sushi = new sushi("tuna", 24.99, "soy sauce", 3);

    /*
 * First question
 */
    System.out.print("What kind of pizza do you want? ");
String newkind = input.nextLine();

pizza.setkind(newkind);
      /*
 * second question
 */
    System.out.print("What kind of pasta do you want? ");
String newpasta = input.nextLine();
pasta.setkind(newpasta);
      /*
 * third question
 */
System.out.print("Do you want cheese on your pasta? true or false? ");
    
boolean newcheese = input.nextBoolean();
pasta.setcheese(newcheese);

     /*
 * fourth question
 */
 System.out.print("What fish do you want for your sushi? ");
String newsushi = input.next();

sushi.setkind(newsushi);
    
      /*
 * fifth question
 */
      System.out.print("What kind of sauce do you want for the sushi? ");
    String newfish = input.next();

sushi.setfish(newfish);
  /*
 * last question
 */
System.out.print("How many pieces of sushi?");
int newpieces= input.nextInt();

sushi.setpieces(newpieces);
  /*
 * prints out pizza receipt
 */
    System.out.println();

  System.out.println("pizza");
    System.out.println("----------------");
    System.out.println(pizza);
    System.out.println();

   
    
     /*
 * prints out pasta receipt
 */
    System.out.println("pasta");
    System.out.println("----------------");
    System.out.println(pasta);
    System.out.println();
     /*
 * prints out sushi receipt
 */
      System.out.println("sushi");
System.out.println("----------------");
    
    System.out.println(sushi);
    
  }
}