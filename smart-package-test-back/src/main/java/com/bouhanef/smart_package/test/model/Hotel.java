package com.bouhanef.smart_package.test.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.common.base.Objects;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

/**
 * Created by bouhanef on 13/03/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Hotel implements Serializable {

    @Id
    private String id;

    private String commune;

    private Integer classement;

    private String codePostal;

    private String courriel;

    private String adresse;

    private String datePublicationEtablissement;

    private String dateClassement;

    private String nomCommercial;

    private String dept;

    private String capaciteAccueilPersonnes;

    private String nombreChambres;

    private String nbChambresRest;

    private String telephone;

    private String lng;

    private String lat;

    private String siteInternet;

    public Hotel() {
    }

    public Hotel(String id, String commune, Integer classement,
                 String codePostal, String courriel, String adresse,
                 String datePublicationEtablissement, String dateClassement, String nomCommercial,
                 String dept, String capaciteAccueilPersonnes, String nombreChambres,
                 String nbChambresRest, String telephone, String lng,
                 String lat, String siteInternet) {
        this.id = id;
        this.commune = commune;
        this.classement = classement;
        this.codePostal = codePostal;
        this.courriel = courriel;
        this.adresse = adresse;
        this.datePublicationEtablissement = datePublicationEtablissement;
        this.dateClassement = dateClassement;
        this.nomCommercial = nomCommercial;
        this.dept = dept;
        this.capaciteAccueilPersonnes = capaciteAccueilPersonnes;
        this.nombreChambres = nombreChambres;
        this.nbChambresRest = nbChambresRest;
        this.telephone = telephone;
        this.lng = lng;
        this.lat = lat;
        this.siteInternet = siteInternet;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCommune() {
        return commune;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public Integer getClassement() {
        return classement;
    }

    public void setClassement(Integer classement) {
        this.classement = classement;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getCourriel() {
        return courriel;
    }

    public void setCourriel(String courriel) {
        this.courriel = courriel;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getDatePublicationEtablissement() {
        return datePublicationEtablissement;
    }

    public void setDatePublicationEtablissement(String datePublicationEtablissement) {
        this.datePublicationEtablissement = datePublicationEtablissement;
    }

    public String getDateClassement() {
        return dateClassement;
    }

    public void setDateClassement(String dateClassement) {
        this.dateClassement = dateClassement;
    }

    public String getNomCommercial() {
        return nomCommercial;
    }

    public void setNomCommercial(String nomCommercial) {
        this.nomCommercial = nomCommercial;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getCapaciteAccueilPersonnes() {
        return capaciteAccueilPersonnes;
    }

    public void setCapaciteAccueilPersonnes(String capaciteAccueilPersonnes) {
        this.capaciteAccueilPersonnes = capaciteAccueilPersonnes;
    }

    public String getNombreChambres() {
        return nombreChambres;
    }

    public void setNombreChambres(String nombreChambres) {
        this.nombreChambres = nombreChambres;
    }

    public String getNbChambresRest() {
        return nbChambresRest;
    }

    public void setNbChambresRest(String nbChambresRest) {
        this.nbChambresRest = nbChambresRest;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getSiteInternet() {
        return siteInternet;
    }

    public void setSiteInternet(String siteInternet) {
        this.siteInternet = siteInternet;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "id='" + id + '\'' +
                ", commune='" + commune + '\'' +
                ", classement=" + classement +
                ", codePostal='" + codePostal + '\'' +
                ", courriel='" + courriel + '\'' +
                ", adresse='" + adresse + '\'' +
                ", datePublicationEtablissement='" + datePublicationEtablissement + '\'' +
                ", dateClassement='" + dateClassement + '\'' +
                ", nomCommercial='" + nomCommercial + '\'' +
                ", dept='" + dept + '\'' +
                ", capaciteAccueilPersonnes='" + capaciteAccueilPersonnes + '\'' +
                ", nombreChambres='" + nombreChambres + '\'' +
                ", nbChambresRest='" + nbChambresRest + '\'' +
                ", telephone='" + telephone + '\'' +
                ", lng='" + lng + '\'' +
                ", lat='" + lat + '\'' +
                ", siteInternet='" + siteInternet + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hotel hotel = (Hotel) o;
        return Objects.equal(id, hotel.id) &&
                Objects.equal(commune, hotel.commune) &&
                Objects.equal(classement, hotel.classement) &&
                Objects.equal(codePostal, hotel.codePostal) &&
                Objects.equal(courriel, hotel.courriel) &&
                Objects.equal(adresse, hotel.adresse) &&
                Objects.equal(datePublicationEtablissement, hotel.datePublicationEtablissement) &&
                Objects.equal(dateClassement, hotel.dateClassement) &&
                Objects.equal(nomCommercial, hotel.nomCommercial) &&
                Objects.equal(dept, hotel.dept) &&
                Objects.equal(capaciteAccueilPersonnes, hotel.capaciteAccueilPersonnes) &&
                Objects.equal(nombreChambres, hotel.nombreChambres) &&
                Objects.equal(nbChambresRest, hotel.nbChambresRest) &&
                Objects.equal(telephone, hotel.telephone) &&
                Objects.equal(lng, hotel.lng) &&
                Objects.equal(lat, hotel.lat) &&
                Objects.equal(siteInternet, hotel.siteInternet);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id, commune, classement, codePostal, courriel, adresse, datePublicationEtablissement, dateClassement, nomCommercial, dept, capaciteAccueilPersonnes, nombreChambres, nbChambresRest, telephone, lng, lat, siteInternet);
    }
}
