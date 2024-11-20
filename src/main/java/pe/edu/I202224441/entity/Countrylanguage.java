package pe.edu.I202224441.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity

public class Countrylanguage {

    @Id

    private char CountryCode;
    private char Language;
    private String IsOfficial;
    private BigDecimal Percentage;

    @ManyToOne
    private City city;


    @Override
    public String toString() {
        return "Countrylanguage{" +
                "CountryCode=" + CountryCode +
                ", Language=" + Language +
                ", IsOfficial='" + IsOfficial + '\'' +
                ", Percentage=" + Percentage +
                '}';
    }

    public Countrylanguage() {
    }

    public Countrylanguage(char countryCode, char language, String isOfficial, BigDecimal percentage) {
        this.CountryCode = countryCode;
        this.Language = language;
        this.IsOfficial = isOfficial;
        this.Percentage = percentage;
    }

    public char getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(char countryCode) {
        CountryCode = countryCode;
    }

    public char getLanguage() {
        return Language;
    }

    public void setLanguage(char language) {
        Language = language;
    }

    public String getIsOfficial() {
        return IsOfficial;
    }

    public void setIsOfficial(String isOfficial) {
        IsOfficial = isOfficial;
    }

    public BigDecimal getPercentage() {
        return Percentage;
    }

    public void setPercentage(BigDecimal percentage) {
        Percentage = percentage;
    }
}
