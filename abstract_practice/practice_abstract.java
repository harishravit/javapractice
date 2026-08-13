abstract class HappimaFriedRiceMix{
    int boilTime=10;
    void masala(){
        System.out.println("fried rice masala");
    }
    void pasmathiRice(){
        System.out.println("pasmathi rice");
    }
    void packet(){
        pasmathiRice();
    }
    void foodReady(){System.out.println("Food is ready");}
    abstract void getPan();
    abstract void addWater();
    abstract void boil();
    abstract void addVegetables();
}
class Cook extends HappimaFriedRiceMix{
    @Override
    void addWater() {
        System.out.println("pour water");
    }
    @Override
    void addVegetables() {
        System.out.println("ready vegetables");
    }
    @Override
    void boil() {
        System.out.println("wait 10 minutes");
    }
    @Override
    void getPan() {
        addWater();
        packet();
        addVegetables();
        masala();
    }
    void cook(){
        getPan();
        boil();
        foodReady();
    }
}
public class practice_abstract {
    public static void main(String[] args) {
        Cook cook=new Cook();
        cook.cook();
    }
}