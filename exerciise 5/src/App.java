public class App {
    public static void main(String[] args) {
        // The pc port, which is hdmi
        HDMI old_port = new HDMI();

        // The adapter that sticks to the vga cable to allow connection with hdmi
        //adapter connects to old_port which is the hdmi port
        VGA adapter = new VGAtoHDMI(old_port);

        // monitor connects to the pc port via adapter-modified VGA
        Monitor monitor = new Monitor();
        monitor.connect(adapter);
    }
}