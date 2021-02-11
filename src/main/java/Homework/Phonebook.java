package Homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;

public class Phonebook {
    private final HashMap<String, ArrayList<Person>> entries = new HashMap<>();

    public void add(String name, String phone) {
        if (entries.containsKey(name)) {
            ArrayList<Person> persons = entries.get(name);
            persons.add(new Person(name, phone));
        } else {
            ArrayList<Person> persons = new ArrayList<>();
            persons.add(new Person(name, phone));
            entries.put(name, persons);
        }
    }

        public ArrayList<String> getPhones(String name) {
        if (!entries.containsKey(name)) return null;
        ArrayList<Person> persons = entries.get(name);
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < persons.size(); i++) {
            result.add(persons.get(i).phone);
        }
        return result;
    }
}
