package pe.edu.I202224441.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "city")
public class City {

    @Id

    private int ID;
    private char name;
    private char CountryCode;
    private char District;
    private int Population;

    @OneToMany(mappedBy = "city")
    private List<Country> country;

    public City() {
    }

    public City(int ID, char name, char countryCode, char district, int population, List<Country> country) {
        this.ID = ID;
        this.name = name;
        this.CountryCode = countryCode;
        this.District = district;
        this.Population = population;
        this.country = country;
    }

    @Override
    public String toString() {
        return "city{" +
                "ID=" + ID +
                ", name=" + name +
                ", CountryCode=" + CountryCode +
                ", District=" + District +
                ", Population=" + Population +
                '}';
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
    }

    public char getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(char countryCode) {
        CountryCode = countryCode;
    }

    public char getDistrict() {
        return District;
    }

    public void setDistrict(char district) {
        District = district;
    }

    public int getPopulation() {
        return Population;
    }

    public void setPopulation(int population) {
        Population = population;
    }

    public List<Country> getCountry() {
        return country;
    }

    public void setCountry(List<Country> country) {
        this.country = country;
    }
}
