/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package city;

import java.util.ArrayList;

/**
 *
 * @author patil
 */
public class cityDirectory {

    private ArrayList<city> citiesDirectory;

    public cityDirectory() {
        this.citiesDirectory = new ArrayList<>();
    }

    public ArrayList<city> getCitiesDirectory() {
        return citiesDirectory;
    }

    public void setCitiesDirectory(ArrayList<city> citiesDirectory) {
        this.citiesDirectory = citiesDirectory;
    }

    public city addNewCity(String state, String city, int zipCode, String communtiy, String nHouses) {
        city newCity = new city(state, city, zipCode, communtiy, nHouses);
        citiesDirectory.add(newCity);
        return newCity;
    }

}
