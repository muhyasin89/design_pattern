import java.util.Scanner;
public class EnemyShipTesting {
    public static void main(String[] args){
        //Example One
        // EnemyShip ufoShip = new UFOEnemyShip();

        // EnemyShip theEnemy = null;
        // Scanner userInput =  new Scanner(System.in);

        // String enemyShipOption = "";

        // System.out.print("What Type of Ships? (Ufo/Rocket)");

        // if(userInput.hasNextLine()){
        //     enemyShipOption = userInput.nextLine();
        // }

        // if(enemyShipOption.equals("Ufo")){
        //     theEnemy = new UFOEnemyShip();
        // }else{
        //     if(enemyShipOption.equals("R")){
        //         theEnemy = new RocketEnemyShip(); 
        //     }
        // }
        
        // doStuffEnemy(ufoShip);

        EnemyShipFactory shipFactory = new EnemyShipFactory();

        EnemyShip theEnemy = null;

        Scanner userInput = new Scanner(System.in);

        System.out.println("What Type of Ships? (Ufo/Rocket/BigShip)");

        if(userInput.hasNextLine()){
            String typeOfShip = userInput.nextLine();
            
            theEnemy = shipFactory.makeEnemyShip(typeOfShip);
        }

        if(theEnemy != null){
            doStuffEnemy(theEnemy);
        }else{
            System.out.println("Please Enter Ufo/Rocket/BigShip next time");
        }

        
    }

    public static void doStuffEnemy(EnemyShip anEnemyShip){
        anEnemyShip.displayEnemyShip();
        anEnemyShip.followHeroShip();
        anEnemyShip.enemyShipShoots();
    }
}