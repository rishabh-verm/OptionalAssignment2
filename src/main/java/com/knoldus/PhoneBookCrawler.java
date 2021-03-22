package com.knoldus;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

/**
 * The type Phone book crawler.
 */
public final class PhoneBookCrawler {
    private PhoneBookCrawler() {
    }
    /**
     * main method to start execution.
     * @param args string variable
     */
    public static void main(final String[] args) {

        PhoneBook person = new PhoneBook();
        person.addinphonebook("RIshbh", 1);
        person.addinphonebook("kritz", 2);
        person.addinphonebook("dad", 0);

        //Exercise 1
        System.out.println("Exercise 1");
        System.out.println(person.findPhoneByName("kritz"));
        //Exercise 2
        System.out.println("Exercise 2");
        findPhoneByNameAndPunishIfNothingFound(person);
        //Exercise 3
        System.out.println("Exercise 3");
        findPhoneByNameAndPrintPhoneBookIfNothingFound(person, "rob");
        //Exercise 4
        System.out.println("Exercise 4");
        findPhoneByNameAndPrintPhoneBookIfNothingFound(person, "kritz");
        //Exercise 5
        System.out.println("Exercise 5");
        exercise5.accept(person, "rob");
        //Exercise 6
        System.out.println("Exercise 6");
        exercise6.accept(person, "rob");
        //Exercise 7
        System.out.println("Exercise 7");
        findPhoneNumberByNameOrNameByPhoneNumber(person, "rish", 1);
    }
    /**
     * Find phone by name and punish if nothing found.
     * Exercise 2
     * @param per the per is instance of class PhoneBook
     */
    static void findPhoneByNameAndPunishIfNothingFound(final PhoneBook per) {
        Optional<Integer> a = per.findPhoneByName("rob");
        if (a.get() == 0) {
            System.out.println("Contact not found");
        } else {
            System.out.println(a.get());
        }
    }


    /**
     * Find phone by name and print phone book if nothing found.
     * Exercise 3
     * @param per the per is instance of class PhoneBook
     * @param n n is the string naem to be passes in the function
     */
    static void findPhoneByNameAndPrintPhoneBookIfNothingFound(final PhoneBook per, final String n) {
        Optional<Integer> a = per.findPhoneByName(n);
        if (a.get() == 0) {
            System.out.println(per.getMap());
        } else {
            System.out.println(per.toString() + " " + n + " number " + a.get());
        }
    }
    /**
     * The Exercise 5 function implements exercise 5 in assignment.
     */
    private static  BiConsumer<PhoneBook, String> exercise5 = (per, str) -> {
        List<Integer> list = per.getMap().entrySet()
                .stream().filter(e -> e.getKey().equals(str))
                .map(Map.Entry::getValue).collect(Collectors.toList());
        if (list.isEmpty()) {
            System.out.println("Contact not found");
        } else {
            System.out.println(list);
        }
    };

    /**
     * The Exercise 6 implements exercise 6 in assignment.
     */
    private static  BiConsumer<PhoneBook, String> exercise6 = (per, str) -> {
        List<Integer> list = per.getMap().entrySet()
                .stream().filter(e -> e.getKey().equals(str))
                .map(Map.Entry::getValue).collect(Collectors.toList());
        if (list.isEmpty()) {
            System.out.println(per.getMap());
        } else {
            System.out.println(list);
        }
    };

    /**
     * Find phone number by name or name by phone number.
     * Exercise 7
     * @param per  Phonebook class object
     * @param str  name to search in map
     * @param numb number to search in map incase search by name fails
     */
    static void findPhoneNumberByNameOrNameByPhoneNumber(final PhoneBook per, final String str, final int numb) {
        Optional<Integer> a = per.findPhoneByName(str);
        if (a.get() == 0) {
            Optional<String> b = per.findNameByPhone(numb);
            if (b.get() == "") {
                System.out.println("Contact not found");
            } else {
                System.out.println(b);
            }
        }
    }
}
