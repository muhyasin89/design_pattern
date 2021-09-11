public class EntertaimentDevice {
    public int deviceState;

    public int maxSetting;

    public int volumeSetting = 0;

    public abstract void buttonFivePressed();

    public abstract void buttonSixPressed();

    public abstract void deviceFeedback(){
        if(deviceState > maxSetting || deviceState < 0){
            deviceState = 0;
            System.out.println("On"+ deviceState);
        }
    }

    public void buttonSevenPressed() {
        volumeLevel++;
        System.out.println("Volume at " + volumeLevel);
    }
}
