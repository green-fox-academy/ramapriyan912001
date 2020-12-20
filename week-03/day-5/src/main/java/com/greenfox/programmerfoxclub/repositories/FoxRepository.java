package com.greenfox.programmerfoxclub.repositories;

import com.greenfox.programmerfoxclub.models.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FoxRepository {

    private List<Fox> foxes;

    @Autowired
    public FoxRepository() {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();
        list1.add("write HTML");
        list2.add("code in Java");
        list1.add("code in Java");
        foxes = new ArrayList<>();
        foxes.add(new Fox("Mike", list1, "Biscuits", "Lemonade"));
        foxes.add(new Fox("Peter", list2, "Cookies", "Coke"));
        foxes.add(new Fox("Dev", list3, "Fries", "Pepsi"));
        foxes.add(new Fox("Roy", list1, "Pizza", "Orange juice"));
    }

    public FoxRepository(List<Fox> foxes) {
        this.foxes = foxes;
    }

    public List<Fox> getFoxes() {
        return foxes;
    }

    public void setFoxes(List<Fox> foxes) {
        this.foxes = foxes;
    }

    public void add(Fox fox) {
        this.foxes.add(fox);
    }

    public boolean containsFox(String name) {
        return !(foxes.stream().noneMatch(x -> x.getName().equals(name)));
    }

    public Fox getFoxByName(String name) {
        return foxes.stream().filter(x -> x.getName().equals(name)).findFirst().get();
    }

    public String toString() {
        return foxes.toString();
    }
}
