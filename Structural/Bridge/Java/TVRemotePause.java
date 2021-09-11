public class TVRemotePause extends RemoteButton {
    public TVRemotePause(EntertaimentDevice newDevice) {
        super(newDevice);
    }

    @Override
    public void buttonNinePressed() {
        System.out.println("TV was Muted");
    }

}
