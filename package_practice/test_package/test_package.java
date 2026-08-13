package package_practice.test_package;
import package_practice.package_main;
public class test_package {
    public static void main(String[] args) {
        package_main testPackage;
        testPackage=new package_main();
        testPackage.display();
        System.out.println(testPackage.total);
        testPackage=new package_main();
        System.out.println(testPackage.total);
    }
}
