public abstract class RemoteButton {
    private EntertaimentDevice theDevice;

    public RemoteButton(EntertaimentDevice newDevice) {
        theDevice = newDevice;
    }

    public void buttonFivePressed() {
        theDevice.buttonFivePressed();
    }

    public void buttonSixPressed() {
        theDevice.buttonSixPressed();
    }

    public void deviceFeedback() {
        theDevice.deviceFeedback();
    }

    public abstract void buttonNinePressed();
}
