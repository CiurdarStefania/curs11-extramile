package ro.fasttrackit.curs11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Company {
    private final Set<Person> employees;

    public Company(Person manager){
        this.employees= new HashSet<>();
        employ(new Person(manager.getName(), manager.getAge(),"manager"));
    }
    public boolean employ(Person person){
        return employees.add(person);
    }
    public Person getManeger(){
        for(Person person: employees){
            if(person.getPosition().equals("manager")){
                return person;
            }
        }
        return null;
    }
    public List<Person> getPersons(String position){
        List<Person> result= new ArrayList<>();
        for(Person person: employees){
            if(person.getPosition().equals(position)){
                result.add(person);
            }
        }
        return result;
    }
    public List<Person> getOlder(int age){
        List<Person> result= new ArrayList<>();
        for(Person person:employees){
            if(person.getAge() > age){
                result.add(person);
            }
        }
        return result;
    }
    public List<Person> getPersonByName(String name){
        List<Person> result= new ArrayList<>();
        for(Person person: employees){
            if(person.getName().contains(name)){
                result.add(person);
            }
        }
        return result;
    }
}


