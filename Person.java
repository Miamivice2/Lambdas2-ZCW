import java.time.LocalDate;


    public class Person {

        public enum Sex {
            MALE, FEMALE
        }

        String name;
        LocalDate birthday;
        Sex gender;
        String emailAddress;

        public int getAge() {

        }

        public void printPerson() {
            System.out.println(toString());
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", birthday=" + birthday +
                    ", gender=" + gender +
                    ", emailAddress='" + emailAddress + '\'' +
                    '}';
        }
    }


