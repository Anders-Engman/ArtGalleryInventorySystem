package ArtGalleryInventorySystem;

/* This class represents a recording of Performance Art
*
* @Param Honorarium represents the initial fee paid to the artist to show up and perform.
*   It is largely based on the weight of the performer's reputation.
* @Param Duration represents the duration in hours of the recording
* @Param MaxOcc represents the maximum occupancy if the performance is to be replicated
* @Param PerformanceRights represents the legal restrictions and permissions attached
*   to the performance itself and what lengths need to be taken in order to replicate
*   the performance itself.
*
* @Author Anders Engman
* @Version 1.0
*/

class PerformanceArt extends Artwork {
    private double honorarium;
    private double duration;
    private int maxOcc;
    private String performanceRights;

    public PerformanceArt() {
        this.honorarium = 0.0;
        this.duration = 1.0;
        this.maxOcc = 50;
        this.performanceRights = "Unknown Rights";
    }

    public PerformanceArt(String title, int year, double honorarium, double duration, int maxOcc) {
        this.title = title;
        this.year = year;
        this.honorarium = honorarium;
        this.duration = duration;
        this.maxOcc = maxOcc;
    }

    public void setHonorarium(double honorarium) {this.honorarium = honorarium;};

    public void setDuration(double duration) {this.duration = duration;};

    public void setMaxOcc(int maxOcc) {this.maxOcc = maxOcc;};

    public void setPerformanceRights(String performanceRights) {this.performanceRights = performanceRights;};

    public double getHonorarium() {
        return this.honorarium;
    }

    public double getDuration() {
        return this.duration;
    }

    public int getMaxOcc() {
        return this.maxOcc;
    }

    public String getPerformanceRights() {
        return this.performanceRights;
    }
}