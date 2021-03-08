package com.example.simpleparadox.listycity;

/**
 * This is a city class
 */
public class City implements Comparable<City>{
    private String city;
    private String province;

    /**
     * This is a constructor of a City class
     *
     * @param city This is a name of the city
     * @param province This is a name of the province
     */
    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * This gets the name of the city
     *
     * @return Return city name
     */
    String getCityName(){
        return this.city;
    }

    /**
     * This gets the name of the province
     *
     * @return Return province name
     */
    String getProvinceName(){
        return this.province;
    }

    /**
     * This is a required method for this class to extend Comparable
     * It returns the result of the comparison between the current city and the target city
     *
     * @param city Target city object to compare with
     * @return result of the comparison
     */
    @Override
    public int compareTo(City city) {
        return this.city.compareTo(city.getCityName());
    }
}
