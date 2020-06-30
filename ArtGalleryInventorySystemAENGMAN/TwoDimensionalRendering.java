package ArtGalleryInventorySystem;

/* This Class Represents the Abstract Concept of a Two Dimensional Rendering
* @param surfMaterial represents surface Material
* @Author Anders Engman
* @version 1.0
 */
abstract class TwoDimensionalRendering extends PhysicalArt {
    private String surfMaterial;

    public void setSurfaceMaterial(String surfaceMaterial) {
        this.surfMaterial = surfaceMaterial;
    }

    public String getSurfaceMaterial() {
        return this.surfMaterial;
    }
}