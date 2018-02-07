package OOPlap9;

public class myPersonApp {
    public static void main(String[] args) {
        Person person = new Person("359211110088",
                "Ketsarapon Srilamun",
                new Address("2 M.3", "Phattalung",
                        "93000"),
                new Job("Student", 4000));

        System.out.println(person.toString());
        person.getJob().setSalary(2000);
        System.out.println("Name: "+person.getName()+
                " Salary: "+person.getJob().getSalary());


    }   //main

}