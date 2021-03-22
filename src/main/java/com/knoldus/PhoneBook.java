package com.knoldus;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * The type Phone book.
 */
public class PhoneBook {
    /**
     *name has string type input.
     */
    private String name;
    /**
     * phone number is used to take phone number as input.
     */
    private int phoneNumber;
    /**
     * hashmap is used to maintain records of names and phonenumbers.
     */
    private HashMap<String, Integer> map = new HashMap<String, Integer>();

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param setName the name
     */
    public void setName(final String setName) {
        this.name = setName;
    }

    /**
     * Gets phone number.
     *
     * @return the phone number
     */
    public int getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets phone number.
     *
     * @param setPhoneNumber the phone number
     */
    public void setPhoneNumber(final int setPhoneNumber) {
        this.phoneNumber = setPhoneNumber;
    }

    /**
     * Gets map.
     *
     * @return the map
     */
    public HashMap<String, Integer> getMap() {
        return map;
    }

    /**
     * Sets map.
     *
     * @param setMap the map
     */
    public void setMap(final HashMap<String, Integer> setMap) {
        this.map = setMap;
    }

    /**
     * Addintophonebookk.
     *
     * @param setName       inserts the name as key in map
     * @param setPhoneNumber inserts the phone number as value in map
     */
    public void addinphonebook(final String setName, final int setPhoneNumber) {
        map.put(setName, setPhoneNumber);
    }

    /**
     * Find phone by name optional.
     *
     * @param setName the name
     * @return the optional
     */
    public Optional findPhoneByName(final String setName) {
        int numb = 0;

        for (String i : map.keySet()) {
            if (i == setName) {
                numb = map.get(i);
            }
        }
        return Optional.of(numb);
    }

    /**
     * Find name by phone optional.
     *
     * @param setPhoneNumber the set phone number
     * @return the optional
     */
    public Optional findNameByPhone(final int setPhoneNumber) {
        String nam = "";

        for (Map.Entry<String, Integer> entry: map.entrySet()) {
            if (entry.getValue() == setPhoneNumber) {
                nam = entry.getKey();
            }
        }
        return Optional.of(nam);
    }
    /**
     * @return toString method returns hello message.
     */
    public String toString() {
        return "Hello";
    }
}
