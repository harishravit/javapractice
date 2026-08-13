package package_practice;

public class package_main {
    public int total;
    public package_main(){
        this(90);
    }
    public package_main(int a){
        this.total+=a;
    }
    public void display(){
        System.out.println("Package is running");
    }
}
