package ArtGalleryInventorySystem;

/* This class represents a print. It extends 2d rendering in that it is 2 dimensional.
* @Param isMultipleOriginal denotes if the print is one amongst an original series of the same
* print
*
* Includes constructors dependant upon the parameters passed into the constructor
* @Author Anders Engman
* @Version 1.0
*/

public class Print extends TwoDimensionalRendering {
    private boolean isMultipleOriginal;

    public Print() {
        this.isMultipleOriginal = false;
    }

    public Print(boolean isMultOrig) {
        this.isMultipleOriginal = isMultOrig;
    }

    public Print(String title, int year, boolean isMultipleOriginal) {
        this.title = title;
        this.year = year;
        this.isMultipleOriginal = isMultipleOriginal;
    }

    public void setMultipleOriginal(boolean isMultipleOriginal) {
        this.isMultipleOriginal = isMultipleOriginal;
    }

    public boolean getMultipleOriginal() {
        return isMultipleOriginal;
    }
}