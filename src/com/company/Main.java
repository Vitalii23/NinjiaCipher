package com.company;

import java.util.*;

import static java.util.Map.*;

public class Main {

    public static void main(String[] args) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] alphabetChar = alphabet.toCharArray();
        byte j = 0;
        LinkedHashMap<Byte, Character> alphabetLowerLinkedHashMap = new LinkedHashMap<Byte, Character>();
        LinkedHashMap<Byte, Character> alphabetUpperLinkedHashMap = new LinkedHashMap<Byte, Character>();

        for (byte i = -25; i < 27; i++){
            if (j == 26){
                j = 0;
                i--;
            } else {
                alphabetUpperLinkedHashMap.put(i, alphabetChar[j]);
                j++;
            }
        }

        Set<Map.Entry<Byte, Character>> set = alphabetUpperLinkedHashMap.entrySet();

        for (Object o : set) {
            var mapEntry = (Entry) o;
            System.out.print("Key is: " + mapEntry.getKey() + " & Value is: " + mapEntry.getValue() + "\n");
        }
    }
}
