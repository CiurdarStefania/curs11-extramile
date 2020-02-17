package ro.fasttrackit.curs11;

public class Main {
    public static void main(String[] args) {
        Company company = new Company(new Person("Ana", 30, "manager"));
        boolean result = company.employ(new Person("Alin", 22, "manager"));
        System.out.println("Employ " + result);
        result = company.employ(new Person("Dorel", 40, "instalator"));
        result = company.employ(new Person("Costel", 34, "instalator"));
        System.out.println("employ " + result);
        System.out.println(company.getManeger());
        System.out.println(company.getPersons("instalator"));

        System.out.println(company.getOlder(24));
    }

}

