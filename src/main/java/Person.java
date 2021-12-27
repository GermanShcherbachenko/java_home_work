import java.util.Scanner;

public class Person {

    boolean armed;
    int age;
    String gender;

    Scanner sc = new Scanner(System.in);
    Gun gun = new Gun();

    public void setFullInformationOmPerson() {
        System.out.print("Let me know if you have a gun: ");
        armed = sc.nextBoolean();
        if (this.armed) {
            gun.setFullInformationOfGun();
        }
        System.out.print("What's your gender: ");
        gender = sc.next();
        System.out.print("What's your age: ");
        age = sc.nextInt();
    }

    public void showFullInformationOfPerson() {
        System.out.printf("This %s year old %s is ", this.age, this.gender);
        if (this.armed) {
            System.out.printf("armed with a %s\n", gun.exactGunName());
        }else {
            System.out.print("unarmed\n");
        }
    }
}
