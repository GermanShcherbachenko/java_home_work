import java.util.Scanner;

public class Gun {

    private int magazineCapacity;
    private String gunType;
    private String exactName;

    Scanner sc = new Scanner(System.in);

    public void setFullInformationOfGun() {
        System.out.print("Enter gun type: ");
        gunType = sc.nextLine();
        System.out.print("Enter gun name: ");
        exactName = sc.nextLine();
        System.out.print("Enter magazine capacity: ");
        magazineCapacity = sc.nextInt();
    }

    public void showGunType() {
        System.out.println("----------------------------");
        System.out.println(this.gunType);
    }

    public void showFullInformationOfGun() {
        System.out.println("----------------------------");
        System.out.println(this.gunType);
        System.out.println(this.exactName);
        System.out.println(this.magazineCapacity);
    }

    public String exactGunName() {
        return this.exactName;
    }

}
