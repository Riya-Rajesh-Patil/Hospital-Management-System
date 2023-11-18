/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package city;

/**
 *
 * @author patil
 */
public class city {

    private String state;
    private String city;
    private int zipCode;
    private String communtiy;
    private String nHouses;

    public city(String state, String city, int zipCode, String communtiy, String nHouses) {
        this.state = state;
        this.city = city;
        this.zipCode = zipCode;
        this.communtiy = communtiy;
        this.nHouses = nHouses;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getCommuntiy() {
        return communtiy;
    }

    public void setCommuntiy(String communtiy) {
        this.communtiy = communtiy;
    }

    public String getnHouses() {
        return nHouses;
    }

    public void setnHouses(String nHouses) {
        this.nHouses = nHouses;
    }

}
