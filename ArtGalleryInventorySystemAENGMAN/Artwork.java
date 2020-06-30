package ArtGalleryInventorySystem;

/* This class represents the abstract concept of artwork. The parameters included are universal
*   to works of art ranging from paintings to performance art.
*
* @Param Title represents the title of the piece given to it by the artist
* @Param Artist is an Artist object that represents the author of the work.
* @Param Year represents the Gregorian Calendar year in which the artwork was completed
*
* @Author Anders Engman
* @Version 1.0
 */

abstract class Artwork {
    protected String title;
    protected Artist artist;
    protected int year;

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return this.title;
    }

    public int getYear() {
        return this.year;
    }

    public Artist getArtist() {return this.artist; }
}