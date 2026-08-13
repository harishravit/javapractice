package Interface_practice;
interface Device{
    int a=20;
    // void gpu();
    // void cpu();
    // void processer();
    // void ram();
    void battery();
    void speaker();
    // void volumne();
    void powerOn();
    void powerOff();
    // void restart();
}
class JBL{
    void bass(){
        System.out.println("High JBL bass");
    }
    void tribble(){
        System.out.println("High JBL bass");
    }
    void noise(){
        System.out.println("High JBL bass");
    }
}
class infinix_note_30_5g extends JBL implements Device{
    @Override
    public void battery() {
        System.out.println("Battery is full");
    }
    @Override
    public void powerOn() {
        System.out.println("Power on");
        
    }
    @Override
    public void powerOff() {
        System.out.println("Power on");
        
    }
    @Override
    public void speaker(){
        bass();
        noise();
        tribble();
    }
    void useMobile(){
        battery();
        powerOn();
        speaker();
    }
}
public class practice_interface {
    public static void main(String[] args) {
        infinix_note_30_5g infinixNote305g=new infinix_note_30_5g();
        infinixNote305g.useMobile();
        System.out.println(Device.a);
    }
}
