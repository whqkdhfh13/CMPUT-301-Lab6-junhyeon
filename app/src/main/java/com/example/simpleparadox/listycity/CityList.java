package com.example.simpleparadox.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps track of a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     *
     * @param city This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     *
     * @return Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * This returns true if the city exists in the list
     *
     * @param city This is a candidate city to check
     * @return Return true if the city exists in the list, false otherwise
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * This deletes a city in the list, throws Exception if the city does not exist in the list
     *
     * @param city This is a candidate city to delete
     */
    public void delete(City city) throws Exception {
        if (!(cities.contains(city))) throw new Exception();
        else cities.remove(city);
    }

    /**
     * This returns a number of cities
     *
     * @return Return the number of cities
     */
    public int countCities() {
        return cities.size();
    }
}