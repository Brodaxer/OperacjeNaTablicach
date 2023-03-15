import java.util.Arrays;

class PersonDatabase {
    private int maxPeople = 1;
    private Person[] people = new Person[maxPeople];
    private int count;

    public void addPerson(Person person) {
        if (count == people.length) {
            people = copyPeople();
        }
        try {
            if (person == null) {
                throw new NullPointerException("Nie mozna przypisac wartosci null");
            } else {
                people[count] = person;
                count++;
            }
        } catch (NullPointerException e) {
            System.err.println(e.getMessage());
        }
    }

    private Person[] copyPeople() {
        return Arrays.copyOf(people, (people.length * 2));
    }

    public void deletePersonFromArray(Person person) {
        try {
            if (person == null) {
                throw new NullPointerException("Nie da sie usunac nulla");
            } else {
                for (int i = 0; i < people.length; i++) {
                    if (person.equals(people[i])) {
                        people[i] = null;
                        break;
                    }
                }
            }
        } catch (NullPointerException e) {
            System.err.println(e.getMessage());
        }
        sortArray();
    }

    private void sortArray() {
        int n = people.length;
        do {
            for (int i = 0; i < n - 1; i++) {
                if (people[i] == null) {
                    Person t = people[i + 1];
                    people[i + 1] = people[i];
                    people[i] = t;
                }
            }
            n = n - 1;
        }while (n!=0);
    }

    public Person getPerson(int a) {
        return people[a - 1];
    }

    public int size() {
        int a = 0;
        for (Person p : people
        ) {
            if (p != null) {
                a++;
            }

        }
        return a;
    }

    public String print() {
        StringBuilder s = new StringBuilder();
        for (Person p : people
        ) {
            s.append(p);
        }
        return s.toString();
    }
}
