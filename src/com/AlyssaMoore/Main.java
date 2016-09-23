package com.AlyssaMoore;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList languages = new LinkedList();
        languages.push("Python");
        languages.push("Java");
        languages.push("C#");

        try {
            while (true) {
                String oneLanguage = (String) languages.pop();
                System.out.println(oneLanguage);

            }
        }
        catch (Exception exception){
            System.out.println("The list is empty");
        }
    }
}