package by.epam.SiarheiHuba.src.Task1.Model.AssetClasses;


import by.epam.SiarheiHuba.src.Task1.Model.AssetClasses.Gear.*;

public class Biker {
    private Helmet helmet;
    private Jacket jacket;
    private Gloves gloves;
    private Pants pants;
    private Boots boots;
    private String name = "Unknown Biker";

    public Biker() {
    }

    public Biker(String name){
        this.name = name;
    }

    public Biker (Helmet helmet, Jacket jacket, Gloves gloves, Pants pants, Boots boots){
        this.helmet = helmet;
        this.jacket = jacket;
        this.gloves = gloves;
        this.pants = pants;
        this.boots = boots;
    }

    public Biker (String name, Helmet h, Jacket j, Gloves g, Pants p, Boots b){
        this.name = name;
        this.helmet = helmet;
        this.jacket = jacket;
        this.gloves = gloves;
        this.pants = pants;
        this.boots = boots;
    }

    public Helmet getHelmet() {
        return helmet;
    }

    public Jacket getJacket() {
        return jacket;
    }

    public Gloves getGloves() {
        return gloves;
    }

    public Pants getPants() {
        return pants;
    }

    public void putOnHelmet(Helmet helmet) {
        this.helmet = helmet;
    }

    public void putOnJacket(Jacket jacket) {
        this.jacket = jacket;
    }

    public void putOnGloves(Gloves gloves) {
        this.gloves = gloves;
    }

    public void putOnPants(Pants pants) {
        this.pants = pants;
    }

    public void putOnBoots(Boots boots) {
        this.boots = boots;
    }

    public Boots getBoots() {
        return boots;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Biker: " +
                "Name=" + name + ", " + helmet + ", " + jacket + ", " + gloves + ", " + pants + ", " + boots;
    }
}
