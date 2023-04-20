package main;

import java.util.List;

public class PersonService {
    public List<Person> people;

    public PersonService(List<Person> people) {
        this.people = people;
    }

    public static void printPersons(List<Person> roster, CheckPerson tester) {
        StringBuilder sb = new StringBuilder();
        for (Person p : roster) {
            if (tester.test(p)) {
                sb.append(p.printPersons()).append("\n");
            }
        }
    }

    }




