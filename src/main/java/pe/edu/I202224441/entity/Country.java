package pe.edu.I202224441.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "country")

public class Country {

    @Id

    private String Code;
    private char Name;
    private String Continent;
    private char Region;
    private BigDecimal SurfaceArea;
    private short IndepYear;
    private int Population;
    private BigDecimal LifeExpectancy;
    private BigDecimal GNP;
    private BigDecimal GNPOld;
    private char LocalName;
    private char GovernmentForm;
    private char HeadOfState;
    private int Capital;
    private char Code2;

    @ManyToOne

    private City city;

    public Country(String code, char name, String continent, char region, BigDecimal surfaceArea, short indepYear, int population, BigDecimal lifeExpectancy, BigDecimal GNP, BigDecimal GNPOld, char localName, char governmentForm, char headOfState, int capital, char code2) {
        this.Code = code;
        this.Name = name;
        this.Continent = continent;
        this.Region = region;
        this.SurfaceArea = surfaceArea;
        this.IndepYear = indepYear;
        this.Population = population;
        this.LifeExpectancy = lifeExpectancy;
        this.GNP = GNP;
        this.GNPOld = GNPOld;
        this.LocalName = localName;
        this.GovernmentForm = governmentForm;
        this.HeadOfState = headOfState;
        this.Capital = capital;
        this.Code2 = code2;
    }

    @Override
    public String toString() {
        return "Country{" +
                "Code=" + Code +
                ", Name=" + Name +
                ", Continent='" + Continent + '\'' +
                ", Region=" + Region +
                ", SurfaceArea=" + SurfaceArea +
                ", IndepYear=" + IndepYear +
                ", Population=" + Population +
                ", LifeExpectancy=" + LifeExpectancy +
                ", GNP=" + GNP +
                ", GNPOld=" + GNPOld +
                ", LocalName=" + LocalName +
                ", GovernmentForm=" + GovernmentForm +
                ", HeadOfState=" + HeadOfState +
                ", Capital=" + Capital +
                ", Code2=" + Code2 +
                '}';
    }

    public Country() {
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public char getName() {
        return Name;
    }

    public void setName(char name) {
        Name = name;
    }

    public String getContinent() {
        return Continent;
    }

    public void setContinent(String continent) {
        Continent = continent;
    }

    public char getRegion() {
        return Region;
    }

    public void setRegion(char region) {
        Region = region;
    }

    public BigDecimal getSurfaceArea() {
        return SurfaceArea;
    }

    public void setSurfaceArea(BigDecimal surfaceArea) {
        SurfaceArea = surfaceArea;
    }

    public short getIndepYear() {
        return IndepYear;
    }

    public void setIndepYear(short indepYear) {
        IndepYear = indepYear;
    }

    public int getPopulation() {
        return Population;
    }

    public void setPopulation(int population) {
        Population = population;
    }

    public BigDecimal getLifeExpectancy() {
        return LifeExpectancy;
    }

    public void setLifeExpectancy(BigDecimal lifeExpectancy) {
        LifeExpectancy = lifeExpectancy;
    }

    public BigDecimal getGNP() {
        return GNP;
    }

    public void setGNP(BigDecimal GNP) {
        this.GNP = GNP;
    }

    public BigDecimal getGNPOld() {
        return GNPOld;
    }

    public void setGNPOld(BigDecimal GNPOld) {
        this.GNPOld = GNPOld;
    }

    public char getLocalName() {
        return LocalName;
    }

    public void setLocalName(char localName) {
        LocalName = localName;
    }

    public char getGovernmentForm() {
        return GovernmentForm;
    }

    public void setGovernmentForm(char governmentForm) {
        GovernmentForm = governmentForm;
    }

    public char getHeadOfState() {
        return HeadOfState;
    }

    public void setHeadOfState(char headOfState) {
        HeadOfState = headOfState;
    }

    public int getCapital() {
        return Capital;
    }

    public void setCapital(int capital) {
        Capital = capital;
    }

    public char getCode2() {
        return Code2;
    }

    public void setCode2(char code2) {
        Code2 = code2;
    }


}
