package edu.miu.cs.cs544.oderdene;

import edu.miu.cs.cs544.oderdene.model.Publisher;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Publisher> publishers = new ArrayList<>();
        publishers.add(new Publisher(1, "odkoo", "odkoo@miu.edu"));
        publishers.stream().forEach(publisher -> System.out.println(publisher));
    }
}