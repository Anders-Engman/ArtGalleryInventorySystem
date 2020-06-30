package ArtGalleryInventorySystem;

/* This class represents a drawing or illustration.
*
* @Param DrawingImplement represents what variety of marking tool(s) was used to create the
* drawing/ illustration.
*
* @Author Anders Engman
* @Version 1.0
*/

public class Drawing extends TwoDimensionalRendering {
    private String drawingImplement;

    public Drawing() {
        this.drawingImplement = "Unknown Implement";
    }

    public Drawing(String title, int year, String drawingImplement) {
        this.title = title;
        this.year = year;
        this.drawingImplement = drawingImplement;
    }

    public void setDrawingImplement(String drawingImplement) {
        this.drawingImplement = drawingImplement;
    }

    public String getDrawingImplement() {
        return drawingImplement;
    }
}