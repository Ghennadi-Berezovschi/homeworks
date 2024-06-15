package ru.otus.project.dz.lesson17;

import java.util.HashMap;
import java.util.Map;

public class PersonDateBase {
    private final Map<Long, Person> personMap;

    public PersonDateBase() {
        this.personMap = new HashMap<>();
    }

    public Person findById(Long id) {
        return personMap.get(id);
    }

    public void add(Person person) {
        personMap.put(person.id, person);
    }

    public boolean isManager(Person person) {
        Position position = person.position;
        return position == Position.MANAGER || position == Position.DIRECTOR ||
                position == Position.BRANCH_DIRECTOR || position == Position.SENIOR_MANAGER;
    }

    public boolean isEmployee(Long id) {
        Person person = findById(id);
        if (person == null) return false;
        return !isManager(person);
    }
}
