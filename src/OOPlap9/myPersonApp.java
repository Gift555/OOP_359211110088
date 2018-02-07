package OOPlap9;

public class myPersonApp {
    public static void main(String[] args) {
        Person person = new Person("1111111111111",
                "Ketsarapon Srilamun",
                new Address("2 M.3", "Phattalung",
                        "93000"),
                new Job("Student", 4000));

        System.out.println(person.toString());


    }   //main

}