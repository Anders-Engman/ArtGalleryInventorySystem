package ArtGalleryInventorySystem;

/* This class represents a collage and relevant details, although most of the details are
* inhereted.
*
* @Param CompMaterials represents what composite materials were used in order to create the
*   collage.
*
* @Author Anders Engman
* @Version 1.0
*/

public class Collage extends TwoDimensionalRendering {
    private String CompMaterials;

    public Collage() {
        this.CompMaterials = "Unknown Materials";
        this.provenance = "No Recorded Provenance";
    }

    public Collage(String title, int year, String materials) {
        this.title = title;
        this.year = year;
        this.CompMaterials = materials;
    }

    public void setCompMaterials(String compMaterials) {
        this.CompMaterials = compMaterials;
    }

    public String getCompMaterials() {
        return CompMaterials;
    }
}