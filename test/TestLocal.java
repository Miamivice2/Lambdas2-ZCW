package test;

import main.Person;
import main.PersonService;
import org.junit.Test;

import java.util.ArrayList;

public class TestLocal{

    @Test
    public void testPersonChecker(){
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Andre", Person.Sex.MALE, "andredavis@gmail.com" ));
        people.add(new Person("Zach", Person.Sex.MALE, "Zachdavis@gmail.com" ));
        people.add(new Person("Heiup", Person.Sex.MALE, "Heiupdavis@gmail.com" ));

        String expected = p.printPerson();

        String actual = PersonService.printPersons(people, new PersonChecker());
    }


}
