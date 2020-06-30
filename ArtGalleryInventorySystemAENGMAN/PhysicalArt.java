package ArtGalleryInventorySystem;

/* This class represents the abstract concept of Physical Art. This is in contrast to
* Performance Art.
*
* @Param Price represents the price of the piece in USD
* @Param isArtistProof represents if the piece is a completed work or was a prototypical
*   Artist's Proof
* @Param Width is the width of the piece in inches
* @Param Height is the height of the piece in inches
* @Param Style is the genre/era of piece
* @Param Provenance describes the journey of the piece through different public and private
*   collections
*
* This class includes a variety of getters and setters for use in concrete child classes
* ranging from sculpture to paintings to collages and prints
*
* @Author Anders Engman
* @Version 1.0
*/


abstract class PhysicalArt extends Artwork{
    protected double price;
    protected boolean isArtistProof;
    protected double width;
    protected double height;
    protected String style;
    protected String provenance;

    public void setPrice(double price) {
        this.price = price;
    }

    public void setIsArtistProof(boolean isArtistProof) {
        this.isArtistProof = isArtistProof;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public void setProvenance(String provenance) {
        this.provenance = provenance;
    }

    public double getPrice() {
        return this.price;
    }

    public boolean getIsArtistProof() {
        return this.isArtistProof;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public String getStyle() {
        return this.style;
    }

    public String getProvenance() {
        return this.provenance;
    }
}