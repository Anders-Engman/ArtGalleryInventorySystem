package ArtGalleryInventorySystem;

/* The Sculpture class represents a physical piece of sculpture and
* all of it's definining traits.
* @param depth represents the measurement of depth in inches
* @param weight represents the weight of the piece
* @param materials represents a string of the materials used in creating the piece
* @Author Anders Engman
* @version 1.0
*/

public class Sculpture extends PhysicalArt {
    private double depth;
    private double weight;
    private String materials;

    public Sculpture() {
        this.title = "Unknown Title";
        this.year = 1776;
        this.depth = 0.0;
        this.weight = 0.0;
        this.materials = "unknown";
    }

    public Sculpture(String title, int year, String materials) {
        this.title = title;
        this.year = year;
        this.depth = 0.0;
        this.weight = 0.0;
        this.materials = materials;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setMaterials(String materials) {
        this.materials = materials;
    }

    public String getMaterials() {return materials;}

    public double getDepth() {return depth;}

    public double getWeight() {return weight;}
}