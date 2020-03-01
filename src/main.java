import java.util.Scanner;

public class main {


    //Implementing the design pattern to create dynamic runtime enemy ships
    // Keeps code clean and clear

    public static void main(String args[])
    {
        EnemyShipFactory shipFactory = new EnemyShipFactory();

        EnemyShip enemyShip = null;

        Scanner input = new Scanner(System.in);

        System.out.println("Would you like a UFO or Rocket Enemy Ship? [U/R]");

        if(input.hasNextLine())
        {
            String typeOfShip = input.nextLine();
            //Using the Factory to dynamically create an object at run time
            enemyShip = shipFactory.makeEnemyShip(typeOfShip);
        }

        if(enemyShip != null)
        {
            doStuffEnemy(enemyShip);
        }
    }


    public static void doStuffEnemy(EnemyShip currentEnemyShip)
    {
        currentEnemyShip.displayEnemyShip();
        currentEnemyShip.followHeroShip();
        currentEnemyShip.enemyShipShoots();
    }


}
