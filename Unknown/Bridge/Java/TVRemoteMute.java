public class TVRemoteMute extends RemoteButton {
    public TVRemoteMute(EntertaimentDevice newDevice) {
        super(newDevice);
    }

    @Override
    public void buttonNinePressed() {
        System.out.println("TV was Muted");
    }

}
