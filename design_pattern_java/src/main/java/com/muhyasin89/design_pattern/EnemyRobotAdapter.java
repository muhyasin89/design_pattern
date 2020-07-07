package com.muhyasin89.design_pattern;

public class EnemyRobotAdapter implements EnemyAttacker{

    EnemyRobot theRobot;
    
    public EnemyRobotAdapter(EnemyRobot newRobot){
        theRobot = theRobot;
    }

    @Override
    public void fireWeapon() {
        theRobot.smashWithHands();
    }

    @Override
    public void driveForward() {
        theRobot.walkForward();
    }

    @Override
    public void assignDriver(String driverName) {
        theRobot.reactToHuman(driverName);
    }
}