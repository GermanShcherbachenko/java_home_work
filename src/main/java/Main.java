public class Main {
    public static void main(String[] args) {
        Person unarmedPerson = new Person();
        Person armedPerson = new Person();


        unarmedPerson.setFullInformationOmPerson();
        unarmedPerson.showFullInformationOfPerson();

        System.out.println("\n\n\n\n\n\n");

        armedPerson.setFullInformationOmPerson();
        armedPerson.showFullInformationOfPerson();
    }
}
