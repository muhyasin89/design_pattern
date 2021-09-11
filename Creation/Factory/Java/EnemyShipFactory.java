public class EnemyShipFactory {
    public EnemyShip makeEnemyShip(String newShipType) {
        EnemyShip newShip = null;

        if (newShipType.equals("Ufo")) {
            return new UFOEnemyShip();
        } else if (newShipType.equals("Rocket")) {
            return new RocketEnemyShip();
        } else if (newShipType.equals("BigShip")) {
            return new BigUFOEnemyShip();
        } else {
            return null;
        }
    }
}