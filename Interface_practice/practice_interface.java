package Interface_practice;

interface writingTools{
    void writerName();
    void writerTextColor();
    void writeBodyType();
}
class Pencil implements writingTools{
    @Override
    public void writerName() {
        System.out.println("Pencil is writing");
    }
    @Override
    public void writerTextColor() {
        System.out.println("Black");
    }
    @Override
    public void writeBodyType() {
        System.out.println("Wooden");
    }
}
class Pen implements writingTools{
    @Override
    public void writerName() {
        System.out.println("Pen is writing");
    }
    @Override
    public void writerTextColor() {
        System.out.println("Blue");
    }
    @Override
    public void writeBodyType() {
        System.out.println("glass");
    }
}
public class practice_interface {    
    public static void main(String[] args) {
        writingTools pencil=new Pencil();
        pencil.writerName();
        pencil.writerTextColor();
        pencil.writeBodyType();
        System.out.println("--------------------");
        writingTools pen=new Pen();
        pen.writerName();
        pen.writerTextColor();
        pen.writeBodyType();
    }
}