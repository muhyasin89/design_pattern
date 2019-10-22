public class EnemyShipTesting {
    public static void main(String[] args){
        EnemyShip ufoShip = new UFOEnemyShip();

        doStuffEnemy(ufoShip);
    }

    public static void doStuffEnemy(EnemyShip anEnemyShip){
        anEnemyShip.displayEnemyShip();
        anEnemyShip.followHeroShip();
        anEnemyShip.enemyShipShoots();
    }
}