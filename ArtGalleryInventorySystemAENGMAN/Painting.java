package ArtGalleryInventorySystem;

/* This class represents all of the major traits of a painting, though most of the dimensions
* and other traits are inhereted through parent and grandparent classes
*
* @Param TypeOfPaint represents what variety of paint was used to create the painting.
*
* @Author Anders Engman
* @Version 1.0
*/

public class Painting extends TwoDimensionalRendering {
    private String typeOfPaint;

    public Painting() {
        this.typeOfPaint = "Unknown Type of Paint";
        this.width = 0.0;
        this.height = 0.0;
    }

    public Painting(String paintType) {
        this.typeOfPaint = paintType;
        this.width = 0.0;
        this.height = 0.0;
    }

    public Painting(String paintType, double width, double height) {
        this.typeOfPaint = paintType;
        this.width = width;
        this.height = height;
    }

    public Painting(String title, int year, String paintType) {
        this.title = title;
        this.year = year;
        this.typeOfPaint = paintType;
    }

    public Painting(String title, int year, String paintType, double witdth, double height) {
        this.title = title;
        this.year = year;
        this.typeOfPaint = paintType;
        this.width = width;
        this.height = height;
    }

    public void setTypeOfPaint(String typeOfPaint) {
        this.typeOfPaint = typeOfPaint;
    }

    public String getTypeOfPaint() {
        return typeOfPaint;
    }
}