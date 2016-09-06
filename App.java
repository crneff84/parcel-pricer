import java.io.Console;


public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("What is the height of your parcel?");
    String stringHeight = myConsole.readLine();

    System.out.println("What is the length of your parcel?");
    String stringLength = myConsole.readLine();

    System.out.println("What is the width of your parcel?");
    String stringWidth = myConsole.readLine();

    System.out.println("What is the weight of your parcel?");
    String stringWeight = myConsole.readLine();

    Parcels name = new Parcels(Integer.parseInt(stringHeight), Integer.parseInt(stringLength), Integer.parseInt(stringWidth), Integer.parseInt(stringWeight));

    name.costToShip();
  }
}
