import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        Person person1 = new Person("Marciek","Adamowski","2131");
        Person person2 = new Person("Bartek","Klon","212331");
        PersonDatabase test = new PersonDatabase();

        test.addPerson(person1);
        test.addPerson(person2);
        test.addPerson(new Person("Kotek","bla eada ","221313"));
        test.addPerson(new Person("dupa","bladdadaa ","213"));
        test.addPerson(new Person("Szprotek","blondaeada ","213"));
        System.out.println(test.print());
        System.out.println(test.size());
        System.out.println(test.getPerson(1));
        test.deletePersonFromArray(test.getPerson(4));
        test.deletePersonFromArray(person2);
        System.out.println(test.print());

    }
}
