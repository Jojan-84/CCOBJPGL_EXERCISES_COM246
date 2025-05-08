public class Monitor {
    public void connect(VGA charger) {
        System.out.println("Desktop expecting VGA...");
        charger.VGAconnect();
        System.out.println("VGA connected.");
    }
}