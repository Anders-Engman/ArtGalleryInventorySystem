package ArtGalleryInventorySystem;

/* This class represents an artist and four main fields of pertinent information related to
* the artist.
*
* @Param isAlive Represents if the artist is alive or not. This is incredibly important in
*   determining price and marketing of an artists work
* @Param firstName is the first name of the artist
* @Param lastName is the last name of the artist
* @Param multipleGalleries represents if the artist's work is being displayed in multiple galleries
*   this is highly relevant to marketing strategies and pervasiveness within an art market
*
* @Author Anders Engman
* @Version 1.0
 */

public class Artist {
    private boolean isAlive;
    private String firstName;
    private String lastName;
    private boolean multipleGalleries;

    public Artist() {
        this.isAlive = false;
        this.firstName = "Unknown";
        this.lastName = "Artist";
        this.multipleGalleries = false;
    }

    public Artist(String firstName, String lastName) {
        this.isAlive = false;
        this.firstName = firstName;
        this.lastName = lastName;
        this.multipleGalleries = false;
    }

    public Artist(boolean isAlive, String firstName, String lastName, boolean multipleGalleries) {
        this.isAlive = isAlive;
        this.firstName = firstName;
        this.lastName = lastName;
        this.multipleGalleries = multipleGalleries;
    }

    public void setAlive(boolean status) {
        this.isAlive = status;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName (String lastName) {
        this.lastName = lastName;
    }

    public void setMultipleGalleries(boolean multGal) {
        this.multipleGalleries = multGal;
    }

    public boolean getAlive() {
        return isAlive;
    }

    public String getArtistName() {
        String fullName = this.firstName + " " + this.lastName;
        return fullName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public boolean getMultipleGalleries() {
        return multipleGalleries;
    }
}