import java.util.Scanner;

public class MyShoeStore {
  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);

    // introduction
    System.out.println("Welcome to the shoe store!");

    //Adidas
    Adidas sambas = new Adidas();
    Nike airforces = new Nike();

    //get choice
    int choice = 0;

    while (choice >= 0 ) {

      System.out.println("Enter 1 for Adidas, or 2 for Nike (-1 to quit): ");
      choice = input.nextInt();
      input.nextLine();

      //if 
      if (choice == 1 ) {

    //set model
    System.out.println("\nWhat model are you interested in (sambas) \nModel: ");
    String model = input.nextLine();
    sambas.setModel(model);

    //getmethod
    int size = sambas.getSize();
    System.out.println("\nOk! I have the " + model + " for you, and they are size " + size);

    //setmethod
    System.out.println("\nThese look nice! What is this shoe called?\nName: ");
    String name = input.nextLine();
    sambas.setName(name);
    System.out.println("Dope, I could buy some " + name + " for myself too!");
    //final
    System.out.println("\nAll done! They look great on you! \n" + sambas);
      }
     
      
      if (choice == 2){

        // set material
        System.out.print("What material of these shoes would you like? \nMaterial: ");
        String material = input.nextLine();
        airforces.setMaterial(material);

        //get method
        int size = airforces.getSize();
        System.out.println("\nNice! I have shoes made of " + material + " and they are all size " + size);

        //set method 
        System.out.println("/nWhat's the name of the shoe you'd like?\nName: ");
        String name = input.nextLine();
        airforces.setName(name);
        System.out.println("I've heard of the " + name + " before, it's trending everywhere!");
        //final
        System.out.println("\nYou're all set! They look great on you! \n" + airforces);

        
      }
    }
    input.close();
  }
}