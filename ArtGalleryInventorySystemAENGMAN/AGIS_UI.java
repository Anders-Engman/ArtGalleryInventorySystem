package ArtGalleryInventorySystem;

import java.util.*;

public class AGIS_UI {
    /*
     * Art Gallery Inventory System (AGIS)
     * This program functions as an inventory system for a metaphorical art gallery.
     * It features full CRUD functionality (Create, Read, Update, Delete) for a wide variety of artworks.
     * Users can also input artists that will persist for the session if they aim to add additional pieces created by
     * the same artist.
     *
     * Additionally, the program features a fully integrated testing suite for all custom classes (which can be accessed
     * via the main menu).
     *
     * Errors from the user are handled with polite prompts and generally offer a chance to resubmit information save
     * for a few specific cases in which defaults or process termination is necessary. In such cases, users are clearly
     * informed about the nature of what is happening and what to do in response.
     *
     * @author Anders Engman
     *
     * @version 1.0
     */

    /* This function pre-loads 4 works and 4 artists upon the first load of the application
    * which enables users to test out the functionality of the application without having to input a large amount of data
    * @param the various arraylists that hold relevant piece and artist data
    * @return void, no value is returned.
    */
    public static void starterData(ArrayList<Sculpture> sculptureArrayList, ArrayList<Painting> paintingArrayList, ArrayList<Collage> collageArrayList, ArrayList<Drawing> drawingArrayList, ArrayList<Print> printArrayList, ArrayList<PerformanceArt> performanceArtArrayList, ArrayList<Artist> artistArrayList) {
        Artist Picasso = new Artist(false, "Pablo", "Picasso", true);
        Painting starterPainting = new Painting("The Old Guitarist", 1904, "oil", 3.0, 5.0);
        starterPainting.setArtist(Picasso);

        Artist Engman = new Artist(false, "Robert", "Engman", true);
        Sculpture starterSculpt = new Sculpture("Triune", 1975, "Brass");
        starterSculpt.setArtist(Engman);

        Artist Strong = new Artist(true, "Emily", "Strong", true);
        Painting starterPainting2 = new Painting("Braced", 2020, "acrylic", 1.5, 1.5);
        starterPainting2.setArtist(Strong);

        Artist Stumpfman = new Artist(true, "Sko", "Stumpfman", false);
        Collage starterCollage = new Collage("Garbage Day", 2010, "Garbage");
        starterCollage.setArtist(Stumpfman);

        artistArrayList.add(Picasso);
        artistArrayList.add(Engman);
        artistArrayList.add(Strong);
        artistArrayList.add(Stumpfman);

        paintingArrayList.add(starterPainting);
        paintingArrayList.add(starterPainting2);
        sculptureArrayList.add(starterSculpt);
        collageArrayList.add(starterCollage);
    }

    /* This function runs a full suite of tests on the custom classes involved in this application
    * @param no params
    * @return no return, void
    */
    public static void testMod() {
        Artist testArtist = new Artist();
        testArtist.setAlive(true);
        testArtist.setFirstName("Jim");
        testArtist.setLastName("Johnson");
        testArtist.setMultipleGalleries(true);

        Sculpture testSculpture = new Sculpture();
        testSculpture.setDepth(1.0);
        testSculpture.setWeight(10.0);
        testSculpture.setMaterials("Brass");
        testSculpture.setArtist(testArtist);
        testSculpture.setTitle("Test Title");
        testSculpture.setYear(1900);

        Collage testCollage = new Collage();
        testCollage.setCompMaterials("Cheese");

        Drawing testDrawing = new Drawing();
        testDrawing.setDrawingImplement("Crayon");

        Painting testPainting = new Painting();
        testPainting.setTypeOfPaint("Oil");
        testPainting.setPrice(100.0);
        testPainting.setIsArtistProof(true);
        testPainting.setWidth(10.0);
        testPainting.setHeight(15.0);
        testPainting.setStyle("Modern");
        testPainting.setProvenance("Private Collections");

        PerformanceArt testPA = new PerformanceArt();
        testPA.setHonorarium(1000.00);
        testPA.setDuration(1.5);
        testPA.setMaxOcc(50);
        testPA.setPerformanceRights("Public Domain");

        Print testPrint = new Print();
        testPrint.setMultipleOriginal(true);
        testPrint.setSurfaceMaterial("Panel");

        System.out.println();
        System.out.println("Starting Tests:");
        System.out.println();

        // Artist Test
        System.out.println("Starting Artist Test: ");
        System.out.println("Expecting 'true', Actual: " + testArtist.getAlive());
        System.out.println("Expecting 'Jim', Actual: " + testArtist.getFirstName());
        System.out.println("Expecting 'Johnson', Actual: " + testArtist.getLastName());
        System.out.println("Expecting 'true', Actual: " + testArtist.getMultipleGalleries());
        System.out.println("Artist Test Complete.");
        System.out.println();

        // Sculpture Test
        System.out.println("Starting Sculpture Test:");
        System.out.println("Expecting '1.0', Actual: " + testSculpture.getDepth());
        System.out.println("Expecting '10.0', Actual: " + testSculpture.getWeight());
        System.out.println("Expecting 'Brass', Actual: " + testSculpture.getMaterials());
        System.out.println("Sculpture Test Complete.");
        System.out.println();

        // Artwork Test
        System.out.println("Starting Artwork Test: (Abstract, using Sculpture)");
        System.out.println("Expecting 'Jim Johnson', Actual: " + testSculpture.getArtist().getArtistName());
        System.out.println("Expecting 'Test Title', Actual: " + testSculpture.getTitle());
        System.out.println("Expecting '1900', Actual: " + testSculpture.getYear());
        System.out.println("Artwork Test Complete.");
        System.out.println();

        // Collage Test
        System.out.println("Starting Collage Test:");
        System.out.println("Expecting 'Cheese', Actual: " + testCollage.getCompMaterials());
        System.out.println("Collage Test Complete.");
        System.out.println();

        // Drawing Test
        System.out.println("Starting Drawing Test:");
        System.out.println("Expecting 'Crayon', Actual: " + testDrawing.getDrawingImplement());
        System.out.println("Drawing Test Complete.");
        System.out.println();

        // Painting Test
        System.out.println("Starting Painting Test");
        System.out.println("Expecting 'Oil', Actual: " + testPainting.getTypeOfPaint());
        System.out.println("Painting Test Complete.");
        System.out.println();

        // Performance Art Test
        System.out.println("Starting Performance Art Test");
        System.out.println("Expecting '1000.0', Actual: " + testPA.getHonorarium());
        System.out.println("Expecting '1.5', Actual: " + testPA.getDuration());
        System.out.println("Expecting '50', Actual: " + testPA.getMaxOcc());
        System.out.println("Expecting 'Public Domain', Actual: " + testPA.getPerformanceRights());
        System.out.println("Performance Art Test Complete.");
        System.out.println();

        // Physical Art Test
        System.out.println("Starting Physical Art Test: (Abstract, using Painting)");
        System.out.println("Expecting '100.0', Actual: " + testPainting.getPrice());
        System.out.println("Expecting 'true', Actual: " + testPainting.getIsArtistProof());
        System.out.println("Expecting '10.0', Actual: " + testPainting.getWidth());
        System.out.println("Expecting '15.0', Actual: " + testPainting.getHeight());
        System.out.println("Expecting 'Modern', Actual: " + testPainting.getStyle());
        System.out.println("Expecting 'Private Collections', Actual: " + testPainting.getProvenance());
        System.out.println("Physical Art Test Complete.");
        System.out.println();

        // Print Test
        System.out.println("Starting Print Test:");
        System.out.println("Expecting 'true', Actual: " + testPrint.getMultipleOriginal());
        System.out.println("Print Test Complete.");
        System.out.println();

        // Two Dimensional Rendering Test
        System.out.println("Starting Two Dimensional Rendering Test: (Abstract, using Print)");
        System.out.println("Expecting 'Panel', Actual: " + testPrint.getSurfaceMaterial());
        System.out.println("Two Dimensional Rendering Test Complete.");
        System.out.println();

        System.out.println("All Tests Finished.");
        System.out.println();
    }

    // This function outputs the main menu
    // No return or params
    public static void menuOutput() {
        System.out.println("---------------------------------------------------------------------");
        System.out.println("    Please select one of the following options");
        System.out.println("        D - Display Inventory");
        System.out.println("        I - Input New Artwork");
        System.out.println("        R - Remove Piece from Collection");
        System.out.println("        F - Find Piece(s)");
        System.out.println("        U - Update A Piece Record");
        System.out.println("        T - Run Tests");
        System.out.println("        E - Exit Program");
        System.out.println("---------------------------------------------------------------------");
        System.out.println();
    }

    // This function provides users with the ability to check the inventory of the application based on certain criteria
    // @param All arraylists involved in storing and persisting data in the application per session
    // @return no return, void
    public static void displayInventory(ArrayList<Sculpture> sculptureArrayList, ArrayList<Painting> paintingArrayList, ArrayList<Collage> collageArrayList, ArrayList<Drawing> drawingArrayList, ArrayList<Print> printArrayList, ArrayList<PerformanceArt> performanceArtArrayList, ArrayList<Artist> artistArrayList) {
        Scanner disScan = new Scanner(System.in);
        int userNum = 0;
        int u = 1;
        // Check if inventory is completely empty
        if ((sculptureArrayList.size() == 0) && (paintingArrayList.size() == 0) && (collageArrayList.size() == 0) && (drawingArrayList.size() == 0) && (printArrayList.size() == 0) && (performanceArtArrayList.size() == 0)) {
            System.out.println("");
            System.out.println("Unfortunately, our inventory is currently empty");
            return;
        }

        while (userNum == 0) {
            System.out.println("");
            System.out.println("Please input the menu number for what types of works you would like to display: ");
            System.out.println("Note: You will see both Titles of Works and the Last Names of the artists using this service.");
            System.out.println("If you would like to get more in-depth information, please use the 'Find' service from the main menu.");
            System.out.println("    1. All 2 Dimensional Pieces (ex Painting, Collage, Drawing, and Print)");
            System.out.println("    2. Paintings");
            System.out.println("    3. Collages");
            System.out.println("    4. Drawings");
            System.out.println("    5. Prints");
            System.out.println("    6. Sculpture");
            System.out.println("    7. Performance Art");
            System.out.println("    8. All Pieces");

            userNum = disScan.nextInt();

            System.out.println();
            switch (userNum) {
                case 1:
                    // All 2D
                    u = 1;
                    // Paintings
                    if (paintingArrayList.size() > 0) {
                        System.out.println("Paintings:");

                        for (Painting painting : paintingArrayList) {
                            System.out.println("    " + u + ". " + painting.getTitle() + " - " + painting.getArtist().getFirstName() + " " + painting.getArtist().getLastName());
                            u = u + 1;
                        }
                    }
                    // Collages
                    if (collageArrayList.size() > 0) {
                        System.out.println();
                        System.out.println("Collages:");

                        for (Collage collage : collageArrayList) {
                            System.out.println("    " + u + ". " + collage.getTitle() + " - " + collage.getArtist().getFirstName() + " " + collage.getArtist().getLastName());
                            u = u + 1;
                        }
                    }
                    // Drawings
                    if (drawingArrayList.size() > 0) {
                        System.out.println();
                        System.out.println("Drawings:");

                        for (Drawing drawing : drawingArrayList) {
                            System.out.println("    " + u + ". " + drawing.getTitle() + " - " + drawing.getArtist().getFirstName() + " " + drawing.getArtist().getLastName());
                            u = u + 1;
                        }
                    }
                    // Prints
                    if (printArrayList.size() > 0) {
                        System.out.println();
                        System.out.println("Prints:");

                        for (Print print : printArrayList) {
                            System.out.println("    " + u + ". " + print.getTitle() + " - " + print.getArtist().getFirstName() + " " + print.getArtist().getLastName());
                            u = u + 1;
                        }
                    }

                    break;
                case 2:
                    // Paintings
                    if (paintingArrayList.size() > 0) {
                        u = 1;

                        System.out.println("Paintings:");

                        for (Painting painting : paintingArrayList) {
                            System.out.println("    " + u + ". " + painting.getTitle() + " - " + painting.getArtist().getFirstName() + " " + painting.getArtist().getLastName());
                            u = u + 1;
                        }
                    } else {
                        System.out.println("I'm sorry, there are currently no Paintings in our inventory.");
                        System.out.println();
                    }
                    break;
                case 3:
                    // Collages
                    u = 1;

                    if (collageArrayList.size() > 0) {
                        System.out.println("Collages:");

                        for (Collage collage : collageArrayList) {
                            System.out.println("    " + u + ". " + collage.getTitle() + " - " + collage.getArtist().getFirstName() + " " + collage.getArtist().getLastName());
                            u = u + 1;
                        }
                    } else {
                        System.out.println("I'm sorry, there are currently no Collages in our inventory.");
                        System.out.println();
                    }
                    break;
                case 4:
                    // Drawings
                    u = 1;

                    if (drawingArrayList.size() > 0) {
                        System.out.println("Drawings:");

                        for (Drawing drawing : drawingArrayList) {
                            System.out.println("    " + u + ". " + drawing.getTitle() + " - " + drawing.getArtist().getFirstName() + " " + drawing.getArtist().getLastName());
                            u = u + 1;
                        }
                    } else {
                        System.out.println("I'm sorry, there are currently no Collages in our inventory.");
                        System.out.println();
                    }
                    break;
                case 5:
                    // Prints
                    u = 1;

                    if (printArrayList.size() > 0) {
                        System.out.println("Prints:");

                        for (Print print : printArrayList) {
                            System.out.println("    " + u + ". " + print.getTitle() + " - " + print.getArtist().getFirstName() + " " + print.getArtist().getLastName());
                            u = u + 1;
                        }
                    } else {
                        System.out.println("I'm sorry, there are currently no Prints in our inventory.");
                        System.out.println();
                    }
                    break;
                case 6:
                    // Sculpture
                    u = 1;

                    if (sculptureArrayList.size() > 0) {
                        System.out.println("Sculptures:");

                        for (Sculpture sculpture : sculptureArrayList) {
                            System.out.println("    " + u + ". " + sculpture.getTitle() + " - " + sculpture.getArtist().getFirstName() + " " + sculpture.getArtist().getLastName());
                            u = u + 1;
                        }
                    } else {
                        System.out.println("I'm sorry, there are currently no Sculptures in our inventory.");
                        System.out.println();
                    }
                    break;
                case 7:
                    // Performance Art
                    u = 1;

                    if (performanceArtArrayList.size() > 0) {
                        System.out.println("Performance Art Records:");

                        for (PerformanceArt performanceArt : performanceArtArrayList) {
                            System.out.println("    " + u + ". " + performanceArt.getTitle() + " - " + performanceArt.getArtist().getFirstName() + " " + performanceArt.getArtist().getLastName());
                            u = u + 1;
                        }
                    } else {
                        System.out.println("I'm sorry, there are currently no records of Performance Art in our inventory.");
                        System.out.println();
                    }
                    break;
                case 8:
                    // Everything
                    u = 1;

                    if (paintingArrayList.size() > 0) {
                        System.out.println("Paintings:");

                        for (Painting painting : paintingArrayList) {
                            System.out.println("    " + u + ". " + painting.getTitle() + " - " + painting.getArtist().getFirstName() + " " + painting.getArtist().getLastName());
                            u = u + 1;
                        }
                    }

                    if (collageArrayList.size() > 0) {
                        System.out.println("Collages:");

                        for (Collage collage : collageArrayList) {
                            System.out.println("    " + u + ". " + collage.getTitle() + " - " + collage.getArtist().getFirstName() + " " + collage.getArtist().getLastName());
                            u = u + 1;
                        }
                    }

                    if (drawingArrayList.size() > 0) {
                        System.out.println();
                        System.out.println("Drawings:");

                        for (Drawing drawing : drawingArrayList) {
                            System.out.println("    " + u + ". " + drawing.getTitle() + " - " + drawing.getArtist().getFirstName() + " " + drawing.getArtist().getLastName());
                            u = u + 1;
                        }
                    }

                    if (printArrayList.size() > 0) {
                        System.out.println();
                        System.out.println("Prints:");

                        for (Print print : printArrayList) {
                            System.out.println("    " + u + ". " + print.getTitle() + " - " + print.getArtist().getFirstName() + " " + print.getArtist().getLastName());
                            u = u + 1;
                        }
                    }

                    if (sculptureArrayList.size() > 0) {
                        System.out.println("Sculptures:");

                        for (Sculpture sculpture : sculptureArrayList) {
                            System.out.println("    " + u + ". " + sculpture.getTitle() + " - " + sculpture.getArtist().getFirstName() + " " + sculpture.getArtist().getLastName());
                            u = u + 1;
                        }
                    }

                    if (performanceArtArrayList.size() > 0) {
                        System.out.println("Performance Art Records:");

                        for (PerformanceArt performanceArt : performanceArtArrayList) {
                            System.out.println("    " + u + ". " + performanceArt.getTitle() + " - " + performanceArt.getArtist().getFirstName() + " " + performanceArt.getArtist().getLastName());
                            u = u + 1;
                        }
                    }
                    break;
                default:
                    // Provide user with polite error message
                    System.out.println("I'm sorry, Your input was not recognized.");
                    System.out.println("    Please enter your choice again");
                    System.out.println("            Thank you!");
                    userNum = 0;
                    break;
            }
        }
    }

    public static Artist createNewArtist() {
        Scanner inputScan = new Scanner(System.in);
        String firstName = "First";
        String lastName = "Last";
        String answerStr = "No";
        char answerChar = 'n';
        boolean isAlive = false;
        boolean multipleGalleries = false;

        // Questions to Ascertain Important Artist Info
        System.out.println("");
        System.out.println("First, what is the artist's First Name?");
        firstName = inputScan.nextLine();

        System.out.println("");
        System.out.println("Second, what is the artist's Last Name?");
        lastName = inputScan.nextLine();

        System.out.println("");
        System.out.println("Third, is the artist alive currently?");
        System.out.println("Please answer 'Yes', if the artist is alive");
        System.out.println("Please answer 'No', if they are not or you aren't sure");

        answerStr = inputScan.nextLine();
        answerStr = answerStr.toLowerCase();
        answerChar = answerStr.charAt(0);

        if (answerChar == 'y') {
            isAlive = true;
        } if ((answerChar != 'n') && (answerChar != 'y')) {
            // If unexpected user input is found, a polite prompt informs the user as to what is happening
            System.out.println("");
            System.out.println("I'm sorry, your answer was not recognized.");
            System.out.println("The artist will be marked as deceased.");
            System.out.println("This information can be changed using the 'Update' service.");
        }

        System.out.println("");
        System.out.println("Finally, is the artist's work displayed in multiple galleries?");
        System.out.println("Please answer 'Yes', if the artist's work is displayed in multiple galleries");
        System.out.println("Please answer 'No', if their work is not displayed in multiple galleries or you are not sure");

        answerStr = inputScan.nextLine();
        answerStr = answerStr.toLowerCase();
        answerChar = answerStr.charAt(0);

        if (answerChar == 'y') {
            multipleGalleries = true;
        } else if ((answerChar != 'n') && (answerChar != 'y')) {
            System.out.println("");
            System.out.println("I'm sorry, your answer was not recognized.");
            System.out.println("The artist will be marked as not having work displayed in multiple galleries.");
            System.out.println("This information can be changed using the 'Update' service.");
        }

        Artist newArtist = new Artist(isAlive, firstName, lastName, multipleGalleries);

        return newArtist;
    }

    public static void inputNewWork(ArrayList<Sculpture> sculptureArrayList, ArrayList<Painting> paintingArrayList, ArrayList<Collage> collageArrayList, ArrayList<Drawing> drawingArrayList, ArrayList<Print> printArrayList, ArrayList<PerformanceArt> performanceArtArrayList, ArrayList<Artist> artistArrayList) {
        Scanner newWorkScanner = new Scanner(System.in);
        String userAns = "no";
        char userChar = 'n';
        int i = 1;
        int userNumber = 0;
        boolean userCheck = false;
        Artist selectArtist = new Artist();

        if (artistArrayList.size() > 0) {
            System.out.println("Current Artists in the DataBase: ");

            for (Artist artist : artistArrayList) {
                System.out.println(i + ". " + artist.getFirstName() + " " + artist.getLastName());
                i++;
            }

            do {
                System.out.println("");
                System.out.println("Are any of the listed artists responsible for creating the new piece you're inputting?");
                System.out.println("Please answer 'Yes' if your artist is listed above.");
                System.out.println("Please answer 'No' if your artist is not listed above.");

                userAns = newWorkScanner.nextLine();
                userAns = userAns.toLowerCase();
                userChar = userAns.charAt(0);

                if (userChar == 'y') {
                    System.out.println("");
                    System.out.println("Fantastic! Please input the corresponding number beside the artist from the list above.");
                    userAns = newWorkScanner.nextLine();
                    userNumber = Integer.parseInt(userAns);
                    userNumber = userNumber - 1;

                    if ((userNumber >= 0) && (userNumber < artistArrayList.size())) {

                        System.out.println("Reached copy function");
                        System.out.println("");

                        boolean selectMortality = artistArrayList.get(userNumber).getAlive();
                        String selectFirst = artistArrayList.get(userNumber).getFirstName();
                        String selectLast = artistArrayList.get(userNumber).getLastName();
                        boolean selectGalleries = artistArrayList.get(userNumber).getMultipleGalleries();

                        selectArtist.setAlive(selectMortality);
                        selectArtist.setFirstName(selectFirst);
                        selectArtist.setLastName(selectLast);
                        selectArtist.setMultipleGalleries(selectGalleries);
                        userChar = 'y';
                    }
                } else if (userChar == 'n') {
                    System.out.println("Since your artist wasn't found in the database, please enter the following information: ");
                    selectArtist = createNewArtist();

                    artistArrayList.add(selectArtist);
                } else {
                    System.out.println("I'm sorry, Your input was not recognized.");
                    System.out.println("    Please enter your choice again");
                    System.out.println("            Thank you!");
                }
            } while ((userChar != 'n') && (userChar != 'y'));
        } else {
            System.out.println("Since no artists were found in the database, please enter the following information: ");
            selectArtist = createNewArtist();

            artistArrayList.add(selectArtist);
        }

        System.out.println("");
        System.out.println("Now that we've designated the artist, let's input the artwork itself.");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("        Please input the number for the desired option:");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("            What type of artwork are you inputting?");
        System.out.println("            1. Sculpture");
        System.out.println("            2. Painting");
        System.out.println("            3. Collage");
        System.out.println("            4. Drawing");
        System.out.println("            5. Print");
        System.out.println("            6. Performance Art");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("");

        userNumber = -1;

        do {
            System.out.println("Please input the number of the work that you want to input from the list above");

            userAns = newWorkScanner.nextLine();
            userNumber = Integer.parseInt(userAns);
            userNumber = userNumber - 1;

            if ((userNumber < 0) || (userNumber >= 7)) {
                System.out.println("I'm sorry, Your input was not recognized.");
                System.out.println("    Please enter your choice again");
                System.out.println("            Thank you!");
                userNumber = -1;
            } else {
                do {
                    String userTitle = "None";
                    int year = 1776;

                    switch (userNumber) {
                        case 0:
                            String userMaterials = "Unknown";

                            System.out.println("You have elected to input a piece of Sculpture.");
                            System.out.println("---------------------------------------------------------------------");
                            System.out.println("First, please input a Title for the Sculpture");
                            userTitle = newWorkScanner.nextLine();
                            System.out.println();

                            System.out.println("Second, please input a full four digit Year for the sculpture");
                            userAns = newWorkScanner.nextLine();
                            year = Integer.parseInt(userAns);
                            System.out.println();

                            System.out.println("Finally, please input the predominant material used in the creation of this piece.");
                            userMaterials = newWorkScanner.nextLine();

                            Sculpture newSculpt = new Sculpture(userTitle, year, userMaterials);
                            newSculpt.setArtist(selectArtist);
                            System.out.println(userMaterials);

                            System.out.println("If you would like to input additional information about this sculpture, it can be done via the Update Service");
                            System.out.println();

                            sculptureArrayList.add(newSculpt);
                            userCheck = true;

                            break;
                        case 1:
                            String paintType = "Unknown";

                            System.out.println("You have elected to input a Painting.");
                            System.out.println("---------------------------------------------------------------------");
                            System.out.println("First, please input a Title for the Painting");
                            userTitle = newWorkScanner.nextLine();
                            System.out.println();

                            System.out.println("Second, please input a full four digit Year for the Painting");
                            userAns = newWorkScanner.nextLine();
                            year = Integer.parseInt(userAns);
                            System.out.println();

                            System.out.println("Finally, please input the type of paint used in the creation of the painting");
                            paintType = newWorkScanner.nextLine();
                            System.out.println();

                            Painting newPainting = new Painting(userTitle, year, paintType);
                            newPainting.setArtist(selectArtist);
                            System.out.println("");

                            System.out.println("If you would like to input additional information about this painting, it can be done via the Update Service");
                            System.out.println();

                            paintingArrayList.add(newPainting);
                            userCheck = true;
                            break;
                        case 2:
                            String compositionalMaterials = "Unknown";

                            System.out.println("You have elected to input a Collage.");
                            System.out.println("---------------------------------------------------------------------");
                            System.out.println("First, please input a Title for the Collage");
                            userTitle = newWorkScanner.nextLine();
                            System.out.println();

                            System.out.println("Second, please input a full four digit Year for the Collage");
                            userAns = newWorkScanner.nextLine();
                            year = Integer.parseInt(userAns);
                            System.out.println();

                            System.out.println("Finally, please input the type of materials used in the creation of the Collage");
                            compositionalMaterials = newWorkScanner.nextLine();
                            System.out.println();

                            Collage newCollage = new Collage(userTitle, year, compositionalMaterials);
                            newCollage.setArtist(selectArtist);
                            System.out.println("");

                            System.out.println("If you would like to input additional information about this Collage, it can be done via the Update Service");
                            System.out.println();

                            collageArrayList.add(newCollage);
                            userCheck = true;
                            break;
                        case 3:
                            String drawingImp = "Unknown";

                            System.out.println("You have elected to input a Drawing.");
                            System.out.println("---------------------------------------------------------------------");
                            System.out.println("First, please input a Title for the Drawing");
                            userTitle = newWorkScanner.nextLine();
                            System.out.println();

                            System.out.println("Second, please input a full four digit Year for the Drawing");
                            userAns = newWorkScanner.nextLine();
                            year = Integer.parseInt(userAns);
                            System.out.println();

                            System.out.println("Finally, please input the type of drawing implement used in the creation of the Drawing");
                            drawingImp = newWorkScanner.nextLine();
                            System.out.println();

                            Drawing newDrawing = new Drawing(userTitle, year, drawingImp);
                            newDrawing.setArtist(selectArtist);
                            System.out.println("");

                            System.out.println("If you would like to input additional information about this Drawing, it can be done via the Update Service");
                            System.out.println();

                            drawingArrayList.add(newDrawing);
                            userCheck = true;
                            break;
                        case 4:
                            boolean isMultOrig = false;

                            System.out.println("You have elected to input a Print.");
                            System.out.println("---------------------------------------------------------------------");
                            System.out.println("First, please input a Title for the Print");
                            userTitle = newWorkScanner.nextLine();
                            System.out.println();

                            System.out.println("Second, please input a full four digit Year for the Print");
                            userAns = newWorkScanner.nextLine();
                            year = Integer.parseInt(userAns);
                            System.out.println();

                            System.out.println("Finally, please denote if the Print is a multiple original or not");
                            System.out.println("Please input 'Yes' if this print is a multiple original.");
                            System.out.println("Please input 'No' if this print is not a multiple original or you do not know");
                            userAns = newWorkScanner.nextLine();
                            userAns = userAns.toLowerCase();
                            userChar = userAns.charAt(0);

                            if (userChar == 'y') {
                                isMultOrig = true;
                            } else if (userChar == 'n') {
                                isMultOrig = false;
                            } else {
                                System.out.println("        I'm sorry, Your input was not recognized.");
                                System.out.println("    The print will be denoted as not being a multiple original");
                                System.out.println("If this is erroneous, you can rectify the issue via the Update Service.");
                            }
                            System.out.println();

                            Print newPrint = new Print(userTitle, year, isMultOrig);
                            newPrint.setArtist(selectArtist);
                            System.out.println("");

                            System.out.println("If you would like to input additional information about this Print");
                            System.out.println("it can be done via the Update Service");
                            System.out.println();

                            printArrayList.add(newPrint);
                            userCheck = true;
                            break;
                        case 5:
                            double honorarium = 0.0;
                            double duration = 0.0;
                            int maxOcc = 0;

                            System.out.println("You have elected to input a Performance Art Record.");
                            System.out.println("---------------------------------------------------------------------");
                            System.out.println("First, please input a Title for the Performance");
                            userTitle = newWorkScanner.nextLine();
                            System.out.println();

                            System.out.println("Second, please input a full four digit Year in which the Performance took place");
                            userAns = newWorkScanner.nextLine();
                            year = Integer.parseInt(userAns);
                            System.out.println();

                            System.out.println("Third, please input the honorarium of the performance to the hundreths place.");
                            System.out.println("Note: This is a dollar amount but inputting a dollar sign is unnecessary.");
                            userAns = newWorkScanner.nextLine();
                            honorarium = Double.parseDouble(userAns);
                            System.out.println();

                            System.out.println("Next, please input the duration of the performance rounded to the tenths place");
                            System.out.println("Note: this is measured in hours so 1 1/2 hour would be written as 1.5.");
                            userAns = newWorkScanner.nextLine();
                            duration = Double.parseDouble(userAns);
                            System.out.println();

                            System.out.println("Finally, please input the maximum occupancy for the performance.");
                            System.out.println("Note: Input 0 if you are unsure or there is not a maximum occupancy.");
                            userAns = newWorkScanner.nextLine();
                            maxOcc = Integer.parseInt(userAns);
                            System.out.println();

                            PerformanceArt newPerformance = new PerformanceArt(userTitle, year, honorarium, duration, maxOcc);
                            newPerformance.setArtist(selectArtist);
                            System.out.println("");

                            System.out.println("If you would like to input the performance rights for this Performance, ");
                            System.out.println("it can be done via the Update Service");
                            System.out.println();

                            performanceArtArrayList.add(newPerformance);
                            userCheck = true;
                            break;
                        default:
                            System.out.println("I'm sorry, Your input was not recognized.");
                            System.out.println("    Please enter your choice again");
                            System.out.println("            Thank you!");
                            break;
                    }
                } while (userCheck == false);
            }
        } while (userNumber == -1);

        return;
    }

    /* This function is used for location specific pieces within the database
    * @params standard arraylists that comprise the database
    * @return this function returns the title and last name of the artist searched
    * @return if any inputs are invalid, it returns 'none' which corresponds with other
    * polite error handling
    */
    public static String findWork(ArrayList<Sculpture> sculptureArrayList, ArrayList<Painting> paintingArrayList, ArrayList<Collage> collageArrayList, ArrayList<Drawing> drawingArrayList, ArrayList<Print> printArrayList, ArrayList<PerformanceArt> performanceArtArrayList, ArrayList<Artist> artistArrayList) {
        Scanner findScan = new Scanner(System.in);
        String pieceTitle = "none";
        String artistLast = "none";
        String returnString = "none";
        int count = 1;
        boolean found = false;

        // Take in User Inputs for Search
        // Starting with Piece Title
        System.out.println();
        System.out.println("------------------------------  Find  ----------------------------------");
        System.out.println("        Please enter the title of the piece you're looking for.");
        System.out.println("        If you don't know the title please simply enter 'Title'.");

        pieceTitle = findScan.nextLine();

        // Last name prompting
        System.out.println();
        System.out.println("   Next, please enter the last name of the artist who created the piece.");
        System.out.println("   If you don't know the artist's last name, please simply enter 'Artist'.");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("            Note: if you have entered Title and Artist ");
        System.out.println("you will be sent to the main menu as that query won't find any artwork.");
        System.out.println("------------------------------------------------------------------------");
        System.out.println();

        artistLast = findScan.nextLine();

        artistLast = artistLast.toLowerCase();
        pieceTitle = pieceTitle.toLowerCase();

        System.out.println();

        // Different Cases for if Title and Last Name are default or specific
        if ((pieceTitle.equalsIgnoreCase("title")) && (artistLast.equalsIgnoreCase("artist"))) {
            // 1. If all are default, return
            return returnString;
        } else if ((pieceTitle.equalsIgnoreCase("title")) && !(artistLast.equalsIgnoreCase("artist"))) {
            // 2. If title is default but artist is known, return all works of that artist
            for (Sculpture sculpture : sculptureArrayList) {
                String lastName = sculpture.getArtist().getLastName();
                if (lastName.equalsIgnoreCase(artistLast)) {
                    System.out.println(count + ". " + sculpture.getTitle() + ", " + sculpture.getYear() + ", " + sculpture.getArtist().getFirstName() + " " + sculpture.getArtist().getLastName());
                    count = count + 1;
                    found = true;
                }
            }

            for (Painting painting : paintingArrayList) {
                String lastName = painting.getArtist().getLastName();
                if (lastName.equalsIgnoreCase(artistLast)) {
                    System.out.println(count + ". " + painting.getTitle() + ", " + painting.getYear() + ", " + painting.getArtist().getFirstName() + " " + painting.getArtist().getLastName());
                    count = count + 1;
                    found = true;
                }
            }

            for (Collage collage : collageArrayList) {
                String lastName = collage.getArtist().getLastName();
                if (lastName.equalsIgnoreCase(artistLast)) {
                    System.out.println(count + ". " + collage.getTitle() + ", " + collage.getYear() + ", " + collage.getArtist().getFirstName() + " " + collage.getArtist().getLastName());
                    count = count + 1;
                    found = true;
                }
            }

            for (Drawing drawing : drawingArrayList) {
                String lastName = drawing.getArtist().getLastName();
                if (lastName.equalsIgnoreCase(artistLast)) {
                    System.out.println(count + ". " + drawing.getTitle() + ", " + drawing.getYear() + ", " + drawing.getArtist().getFirstName() + " " + drawing.getArtist().getLastName());
                    count = count + 1;
                    found = true;
                }
            }

            for (Print print : printArrayList) {
                String lastName = print.getArtist().getLastName();
                if (lastName.equalsIgnoreCase(artistLast)) {
                    System.out.println(count + ". " + print.getTitle() + ", " + print.getYear() + ", " + print.getArtist().getFirstName() + " " + print.getArtist().getLastName());
                    count = count + 1;
                    found = true;
                }
            }

            for (PerformanceArt performanceArt : performanceArtArrayList) {
                String lastName = performanceArt.getArtist().getLastName();
                if (lastName.equalsIgnoreCase(artistLast)) {
                    System.out.println(count + ". " + performanceArt.getTitle() + ", " + performanceArt.getYear() + ", " + performanceArt.getArtist().getFirstName() + " " + performanceArt.getArtist().getLastName());
                    count = count + 1;
                    found = true;
                }
            }

            if (found == false) {
                System.out.println("I'm sorry, the piece you were looking for was not found.");
                System.out.println("Please consult the Display Service to view what pieces are in our inventory.");
                return returnString;
            }


        } else if (!(pieceTitle.equalsIgnoreCase("title")) && (artistLast.equalsIgnoreCase("artist"))) {
            // 3. If artist is default but title is known, return all works by that name

            for (Sculpture sculpture : sculptureArrayList) {
                String title = sculpture.getTitle();
                if (title.equalsIgnoreCase(pieceTitle)) {
                    System.out.println(count + ". " + sculpture.getTitle() + ", " + sculpture.getYear() + ", " + sculpture.getArtist().getFirstName() + " " + sculpture.getArtist().getLastName());
                    count = count + 1;
                    found = true;
                }
            }

            for (Painting painting : paintingArrayList) {
                String title = painting.getTitle();
                if (title.equalsIgnoreCase(pieceTitle)) {
                    System.out.println(count + ". " + painting.getTitle() + ", " + painting.getYear() + ", " + painting.getArtist().getFirstName() + " " + painting.getArtist().getLastName());
                    count = count + 1;
                    found = true;
                }
            }

            for (Collage collage : collageArrayList) {
                String title = collage.getTitle();
                if (title.equalsIgnoreCase(pieceTitle)) {
                    System.out.println(count + ". " + collage.getTitle() + ", " + collage.getYear() + ", " + collage.getArtist().getFirstName() + " " + collage.getArtist().getLastName());
                    count = count + 1;
                    found = true;
                }
            }

            for (Drawing drawing : drawingArrayList) {
                String title = drawing.getTitle();
                if (title.equalsIgnoreCase(pieceTitle)) {
                    System.out.println(count + ". " + drawing.getTitle() + ", " + drawing.getYear() + ", " + drawing.getArtist().getFirstName() + " " + drawing.getArtist().getLastName());
                    count = count + 1;
                    found = true;
                }
            }

            for (Print print : printArrayList) {
                String title = print.getTitle();
                if (title.equalsIgnoreCase(pieceTitle)) {
                    System.out.println(count + ". " + print.getTitle() + ", " + print.getYear() + ", " + print.getArtist().getFirstName() + " " + print.getArtist().getLastName());
                    count = count + 1;
                    found = true;
                }
            }

            for (PerformanceArt performanceArt : performanceArtArrayList) {
                String title = performanceArt.getTitle();
                if (title.equalsIgnoreCase(pieceTitle)) {
                    System.out.println(count + ". " + performanceArt.getTitle() + ", " + performanceArt.getYear() + ", " + performanceArt.getArtist().getFirstName() + " " + performanceArt.getArtist().getLastName());
                    count = count + 1;
                    found = true;
                }
            }

            if (found == false) {
                System.out.println("I'm sorry, the piece you were looking for was not found.");
                System.out.println("Please consult the Display Service to view what pieces are in our inventory.");
                return returnString;
            }

        } else if (!(pieceTitle.equalsIgnoreCase("title")) && !(artistLast.equalsIgnoreCase("artist"))) {
            // 4. If both artist and title are known, return that piece
            for (Sculpture sculpture : sculptureArrayList) {
                String title = sculpture.getTitle();
                String lastName = sculpture.getArtist().getLastName();
                if ((title.equalsIgnoreCase(pieceTitle)) && (lastName.equalsIgnoreCase(artistLast))) {
                    System.out.println(count + ". " + sculpture.getTitle() + ", " + sculpture.getYear() + ", " + sculpture.getArtist().getFirstName() + " " + sculpture.getArtist().getLastName());
                    count = count + 1;
                    found = true;
                }
            }

            for (Painting painting : paintingArrayList) {
                String title = painting.getTitle();
                String lastName = painting.getArtist().getLastName();
                if ((title.equalsIgnoreCase(pieceTitle)) && (lastName.equalsIgnoreCase(artistLast))) {
                    System.out.println(count + ". " + painting.getTitle() + ", " + painting.getYear() + ", " + painting.getArtist().getFirstName() + " " + painting.getArtist().getLastName());
                    count = count + 1;
                    found = true;
                }
            }

            for (Collage collage : collageArrayList) {
                String title = collage.getTitle();
                String lastName = collage.getArtist().getLastName();
                if ((title.equalsIgnoreCase(pieceTitle)) && (lastName.equalsIgnoreCase(artistLast))) {
                    System.out.println(count + ". " + collage.getTitle() + ", " + collage.getYear() + ", " + collage.getArtist().getFirstName() + " " + collage.getArtist().getLastName());
                    count = count + 1;
                    found = true;
                }
            }

            for (Drawing drawing : drawingArrayList) {
                String title = drawing.getTitle();
                String lastName = drawing.getArtist().getLastName();
                if ((title.equalsIgnoreCase(pieceTitle)) && (lastName.equalsIgnoreCase(artistLast))) {
                    System.out.println(count + ". " + drawing.getTitle() + ", " + drawing.getYear() + ", " + drawing.getArtist().getFirstName() + " " + drawing.getArtist().getLastName());
                    count = count + 1;
                    found = true;
                }
            }

            for (Print print : printArrayList) {
                String title = print.getTitle();
                String lastName = print.getArtist().getLastName();
                if ((title.equalsIgnoreCase(pieceTitle)) && (lastName.equalsIgnoreCase(artistLast))) {
                    System.out.println(count + ". " + print.getTitle() + ", " + print.getYear() + ", " + print.getArtist().getFirstName() + " " + print.getArtist().getLastName());
                    count = count + 1;
                    found = true;
                }
            }

            for (PerformanceArt performanceArt : performanceArtArrayList) {
                String title = performanceArt.getTitle();
                String lastName = performanceArt.getArtist().getLastName();
                if ((title.equalsIgnoreCase(pieceTitle)) && (lastName.equalsIgnoreCase(artistLast))) {
                    System.out.println(count + ". " + performanceArt.getTitle() + ", " + performanceArt.getYear() + ", " + performanceArt.getArtist().getFirstName() + " " + performanceArt.getArtist().getLastName());
                    count = count + 1;
                    found = true;
                }
            }

            if (found == false) {
                System.out.println("I'm sorry, the piece you were looking for was not found.");
                System.out.println("Please consult the Display Service to view what pieces are in our inventory.");
                return returnString;
            }
        }

        returnString = pieceTitle + " " + artistLast;

        return returnString;

    }

    /* Similar to the "findwork" function, updateFind only returns a piece if both title
    * and artist last name are valid.
    * @params standard arraylists that comprise the database
    * @return like findwork, this returns either piece title and last name of artist
    * or 'none' depending on user inputs and accuracy
    */
    public static String updateFind(ArrayList<Sculpture> sculptureArrayList, ArrayList<Painting> paintingArrayList, ArrayList<Collage> collageArrayList, ArrayList<Drawing> drawingArrayList, ArrayList<Print> printArrayList, ArrayList<PerformanceArt> performanceArtArrayList, ArrayList<Artist> artistArrayList) {
        Scanner findScan = new Scanner(System.in);
        String pieceTitle = "none";
        String artistLast = "none";
        String returnString = "none";
        int count = 1;
        boolean found = false;

        // Take in User Inputs for Search
        // Starting with Piece Title
        System.out.println();
        System.out.println("---------------------------  Update Find  ------------------------------");
        System.out.println("        Please enter the title of the piece you're looking for.");
        System.out.println("        If you don't know the title please simply enter 'Title'.");

        pieceTitle = findScan.nextLine();

        System.out.println();
        System.out.println("   Next, please enter the last name of the artist who created the piece.");
        System.out.println("   If you don't know the artist's last name, please simply enter 'Artist'.");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("            Note: if you have entered Title and Artist ");
        System.out.println("you will be sent to the main menu as that query won't find any artwork.");
        System.out.println("------------------------------------------------------------------------");
        System.out.println();

        artistLast = findScan.nextLine();

        artistLast = artistLast.toLowerCase();
        pieceTitle = pieceTitle.toLowerCase();

        System.out.println();

        if ((pieceTitle.equalsIgnoreCase("title")) && (artistLast.equalsIgnoreCase("artist"))) {
            // 1. If all are default, return
            return returnString;
        } else if (!(pieceTitle.equalsIgnoreCase("title")) && !(artistLast.equalsIgnoreCase("artist"))) {
            // 4. If both artist and title are known, return that piece
            for (Sculpture sculpture : sculptureArrayList) {
                String title = sculpture.getTitle();
                String lastName = sculpture.getArtist().getLastName();
                if ((title.equalsIgnoreCase(pieceTitle)) && (lastName.equalsIgnoreCase(artistLast))) {
                    System.out.println(count + ". " + sculpture.getTitle() + ", " + sculpture.getYear() + ", " + sculpture.getArtist().getFirstName() + " " + sculpture.getArtist().getLastName());
                    count = count + 1;
                    found = true;
                }
            }

            for (Painting painting : paintingArrayList) {
                String title = painting.getTitle();
                String lastName = painting.getArtist().getLastName();
                if ((title.equalsIgnoreCase(pieceTitle)) && (lastName.equalsIgnoreCase(artistLast))) {
                    System.out.println(count + ". " + painting.getTitle() + ", " + painting.getYear() + ", " + painting.getArtist().getFirstName() + " " + painting.getArtist().getLastName());
                    count = count + 1;
                    found = true;
                }
            }

            for (Collage collage : collageArrayList) {
                String title = collage.getTitle();
                String lastName = collage.getArtist().getLastName();
                if ((title.equalsIgnoreCase(pieceTitle)) && (lastName.equalsIgnoreCase(artistLast))) {
                    System.out.println(count + ". " + collage.getTitle() + ", " + collage.getYear() + ", " + collage.getArtist().getFirstName() + " " + collage.getArtist().getLastName());
                    count = count + 1;
                    found = true;
                }
            }

            for (Drawing drawing : drawingArrayList) {
                String title = drawing.getTitle();
                String lastName = drawing.getArtist().getLastName();
                if ((title.equalsIgnoreCase(pieceTitle)) && (lastName.equalsIgnoreCase(artistLast))) {
                    System.out.println(count + ". " + drawing.getTitle() + ", " + drawing.getYear() + ", " + drawing.getArtist().getFirstName() + " " + drawing.getArtist().getLastName());
                    count = count + 1;
                    found = true;
                }
            }

            for (Print print : printArrayList) {
                String title = print.getTitle();
                String lastName = print.getArtist().getLastName();
                if ((title.equalsIgnoreCase(pieceTitle)) && (lastName.equalsIgnoreCase(artistLast))) {
                    System.out.println(count + ". " + print.getTitle() + ", " + print.getYear() + ", " + print.getArtist().getFirstName() + " " + print.getArtist().getLastName());
                    count = count + 1;
                    found = true;
                }
            }

            for (PerformanceArt performanceArt : performanceArtArrayList) {
                String title = performanceArt.getTitle();
                String lastName = performanceArt.getArtist().getLastName();
                if ((title.equalsIgnoreCase(pieceTitle)) && (lastName.equalsIgnoreCase(artistLast))) {
                    System.out.println(count + ". " + performanceArt.getTitle() + ", " + performanceArt.getYear() + ", " + performanceArt.getArtist().getFirstName() + " " + performanceArt.getArtist().getLastName());
                    count = count + 1;
                    found = true;
                }
            }

            if (found == false) {
                System.out.println("I'm sorry, the piece you were looking for was not found.");
                System.out.println("Please consult the Display Service to view what pieces are in our inventory.");
                return returnString;
            }
        }

        returnString = pieceTitle + " " + artistLast;

        return returnString;
    }

    /* This function is used to remove pieces from the database via user input
    * @params standard arraylists that comprise the database
    * @return nothing, this function does not return anything
    */
    public static void removePiece(ArrayList<Sculpture> sculptureArrayList, ArrayList<Painting> paintingArrayList, ArrayList<Collage> collageArrayList, ArrayList<Drawing> drawingArrayList, ArrayList<Print> printArrayList, ArrayList<PerformanceArt> performanceArtArrayList, ArrayList<Artist> artistArrayList) {
        System.out.println();
        System.out.println("------------------------- Entry Removal -------------------------");
        System.out.println("Before we can remove a piece, we must locate it using the Find Service.");
        System.out.println();
        String queryStr = findWork(sculptureArrayList, paintingArrayList, collageArrayList, drawingArrayList, printArrayList, performanceArtArrayList, artistArrayList);

        if (queryStr == "none") {
            System.out.println("Please select the remove function again and re-input your information");
            System.out.println("In order to remove a piece, the system must have an exact information about the piece.");
            System.out.println("If you need to find an exact last name or piece name");
            System.out.println("use the 'Display Pieces' function to find the name of the piece you'd like to delete.");
            return;
        }

        int spaceFind = queryStr.lastIndexOf(" ");
        String targTitle = queryStr.substring(0, spaceFind);
        String targName = queryStr.substring(spaceFind + 1);

        if (targTitle.equalsIgnoreCase("title")) {
            System.out.println("Please select the remove function again and re-input the title of the piece");
            System.out.println("In order to remove a piece, the system must have an exact piece name");
            System.out.println("If you need to find an exact name, use the 'Display Pieces' function to find");
            System.out.println("the name of the piece you'd like to delete.");
            return;
        } else if (targName.equalsIgnoreCase("artist")) {
            System.out.println("Please select the remove function again and re-input the last name of the artist");
            System.out.println("In order to remove a piece, the system must have an exact last name");
            System.out.println("If you need to find an exact last name, use the 'Display Pieces' function to find");
            System.out.println("the name of the piece you'd like to delete.");
            return;
        }

        System.out.println();

        for (int i = 0; i < sculptureArrayList.size(); i++) {
            Sculpture sculpture = sculptureArrayList.get(i);
            if ((targTitle.equalsIgnoreCase(sculpture.getTitle())) && (targName.equalsIgnoreCase(sculpture.getArtist().getLastName()))) {
                sculptureArrayList.remove(i);
                System.out.println(sculpture.getTitle() + " by " + sculpture.getArtist().getArtistName() + " has been deleted.");
                return;
            }
        }

        for (int o = 0; o < paintingArrayList.size(); o++) {
            Painting painting = paintingArrayList.get(o);
            if ((targTitle.equalsIgnoreCase(painting.getTitle())) && (targName.equalsIgnoreCase(painting.getArtist().getLastName()))) {
                paintingArrayList.remove(o);
                System.out.println(painting.getTitle() + " by " + painting.getArtist().getArtistName() + " has been deleted.");
                return;
            }
        }

        for (int u = 0; u < collageArrayList.size(); u++) {
            Collage collage = collageArrayList.get(u);
            if ((targTitle.equalsIgnoreCase(collage.getTitle())) && (targName.equalsIgnoreCase(collage.getArtist().getLastName()))) {
                paintingArrayList.remove(u);
                System.out.println(collage.getTitle() + " by " + collage.getArtist().getArtistName() + " has been deleted.");
                return;
            }
        }

        for (int y = 0; y < drawingArrayList.size(); y++) {
            Drawing drawing = drawingArrayList.get(y);
            if ((targTitle.equalsIgnoreCase(drawing.getTitle())) && (targName.equalsIgnoreCase(drawing.getArtist().getLastName()))) {
                drawingArrayList.remove(y);
                System.out.println(drawing.getTitle() + " by " + drawing.getArtist().getArtistName() + " has been deleted.");
                return;
            }
        }

        for (int a = 0; a < drawingArrayList.size(); a++) {
            Print print = printArrayList.get(a);
            if ((targTitle.equalsIgnoreCase(print.getTitle())) && (targName.equalsIgnoreCase(print.getArtist().getLastName()))) {
                printArrayList.remove(a);
                System.out.println(print.getTitle() + " by " + print.getArtist().getArtistName() + " has been deleted.");
                return;
            }
        }

        for (int e = 0; e < performanceArtArrayList.size(); e++) {
            PerformanceArt performanceArt = performanceArtArrayList.get(e);
            if ((targTitle.equalsIgnoreCase(performanceArt.getTitle())) && (targName.equalsIgnoreCase(performanceArt.getArtist().getLastName()))) {
                performanceArtArrayList.remove(e);
                System.out.println(performanceArt.getTitle() + " by " + performanceArt.getArtist().getArtistName() + " has been deleted.");
                return;
            }
        }
    }

    /* This function is used to update entries in the database
    * @params standard arraylists that comprise the database
    * @return void, no return
    */
    public static void updatePiece(ArrayList<Sculpture> sculptureArrayList, ArrayList<Painting> paintingArrayList, ArrayList<Collage> collageArrayList, ArrayList<Drawing> drawingArrayList, ArrayList<Print> printArrayList, ArrayList<PerformanceArt> performanceArtArrayList, ArrayList<Artist> artistArrayList) {
        Scanner updateScan = new Scanner(System.in);
        String userInput = "none";
        int userNumber = 0;
        double userDouble = 0.0;
        boolean updateStatus;

        System.out.println();
        System.out.println("--------------------------- Entry Update ----------------------------");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("        Please input the number for the desired option:");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("        What type of artwork would you like to update?");
        System.out.println("            1. Sculpture");
        System.out.println("            2. Painting");
        System.out.println("            3. Collage");
        System.out.println("            4. Drawing");
        System.out.println("            5. Print");
        System.out.println("            6. Performance Art");
        System.out.println("---------------------------------------------------------------------");
        System.out.println();

        userInput = updateScan.nextLine();

        if (Character.isDigit(userInput.charAt(0)) == false) {
            System.out.println("            I'm sorry, your input was not valid.");
            System.out.println("    Please begin a new entry update attempt via the Update Service.");
            System.out.println("");
            return;
        } else {
            userNumber = Integer.parseInt(userInput);
        }

        do {
            switch (userNumber) {
                case 1:
                    // Sculpture
                    System.out.println();
                    System.out.println("        You have chosen to edit a piece of sculpture: ");
                    System.out.println("---------------------------------------------------------------------");
                    System.out.println("Next, please input the title of the piece and last name of the artist.");
                    System.out.println("Note: please input exact information such as full title and artist last name");
                    System.out.println("              or you will be brought back to the main menu");
                    System.out.println();

                    String findStr = updateFind(sculptureArrayList, paintingArrayList, collageArrayList, drawingArrayList, printArrayList, performanceArtArrayList, artistArrayList);

                    if (findStr.equalsIgnoreCase("none")) {return;}

                    int spaceFinder = findStr.lastIndexOf(" ");
                    String updateTitle = findStr.substring(0, spaceFinder);
                    String updateName = findStr.substring(spaceFinder + 1);

                    if ((updateTitle.equalsIgnoreCase("title")) || (updateName.equalsIgnoreCase("artist"))) {
                        System.out.println("Unfortunately, the system cannot update a specific piece without an exact");
                        System.out.println("piece title and artist last name, you'll be returned to the main menu.");
                        return;
                    }

                    // Data display of pertinent fields for user modification
                    for (int i = 0; i < sculptureArrayList.size(); i++) {
                        Sculpture sculpture = sculptureArrayList.get(i);
                        if ((updateTitle.equalsIgnoreCase(sculpture.getTitle())) && (updateName.equalsIgnoreCase(sculpture.getArtist().getLastName()))) {
                            System.out.println();
                            System.out.println("1. Title: " + sculpture.getTitle());
                            System.out.println("2. Artist: " + sculpture.getArtist().getFirstName() + " " + sculpture.getArtist().getLastName());
                            System.out.println("3. Year: " + sculpture.getYear());
                            System.out.println("4. Material: " + sculpture.getMaterials());
                            System.out.println("5. Depth: " + sculpture.getDepth() + " inches");
                            System.out.println("6. Width: " + sculpture.getWidth() + " inches");
                            System.out.println("7. Height: " + sculpture.getHeight() + " inches");
                            System.out.println("8. Weight: " + sculpture.getWeight() + " pounds");
                            System.out.println("9. Price: $" + sculpture.getPrice());
                            System.out.println();
                            System.out.println("Please choose the field you would like to update by inputting the");
                            System.out.println("                    corresponding number");
                            System.out.println("If you would like to get back to the main menu, input '0'");
                            System.out.println("---------------------------------------------------------------------");
                            System.out.println();
                            userInput = updateScan.nextLine();
                            userNumber = Integer.parseInt(userInput);

                            switch (userNumber) {
                                case 0:
                                    return;
                                case 1:
                                    System.out.println("The title of this piece is currently: " + sculpture.getTitle());
                                    System.out.println("What would you like to change it to?");
                                    userInput = updateScan.nextLine();
                                    sculpture.setTitle(userInput);
                                    System.out.println("The title is now: " + sculpture.getTitle());
                                    return;
                                case 2:
                                    System.out.println("The Artististry of this piece is attributed to: " + sculpture.getArtist().getArtistName());
                                    System.out.println("What would you like to change it to?");
                                    System.out.println("Note: Please input both a first and a last name, separated by a space");
                                    userInput = updateScan.nextLine();
                                    String newFirst = "none";
                                    String newLast = "none";
                                    Artist newArtist = new Artist();

                                    if (userInput.contains(" ") == true) {
                                        int spaceIndex = userInput.lastIndexOf(" ");
                                        newFirst = userInput.substring(0, spaceIndex);
                                        newLast = userInput.substring(spaceIndex + 1);
                                        newArtist.setFirstName(newFirst);
                                        newArtist.setLastName(newLast);

                                    } else {
                                        System.out.println("I'm sorry, your input did not contain a space.");
                                        System.out.println("Please retry the update name process using a space.");
                                        return;
                                    }

                                    sculpture.setArtist(newArtist);
                                    System.out.println();
                                    System.out.println("The Artist is now: " + sculpture.getArtist().getArtistName());
                                    return;
                                case 3:
                                    System.out.println("The year of this piece is currently: " + sculpture.getYear());
                                    System.out.println("What would you like to change it to?");
                                    userInput = updateScan.nextLine();
                                    userNumber = Integer.parseInt(userInput);
                                    sculpture.setYear(userNumber);
                                    System.out.println("The Year is now: " + sculpture.getYear());
                                    return;
                                case 4:
                                    System.out.println("The materials this piece is comprised of are currently listed as:");
                                    System.out.println(sculpture.getTitle());
                                    System.out.println("What would you like to change them to?");
                                    userInput = updateScan.nextLine();
                                    sculpture.setMaterials(userInput);
                                    System.out.println("The materials are now: " + sculpture.getMaterials());
                                    return;
                                case 5:
                                    System.out.println("The Depth of this piece is currently: " + sculpture.getDepth() + " inches");
                                    System.out.println("What would you like to change it to?");
                                    userInput = updateScan.nextLine();
                                    userDouble = Double.parseDouble(userInput);
                                    sculpture.setDepth(userDouble);
                                    System.out.println("The Depth is now: " + sculpture.getDepth() + " inches");
                                    return;
                                case 6:
                                    System.out.println("The Width of this piece is currently: " + sculpture.getWidth() + " inches");
                                    System.out.println("What would you like to change it to?");
                                    userInput = updateScan.nextLine();
                                    userDouble = Double.parseDouble(userInput);
                                    sculpture.setWidth(userDouble);
                                    System.out.println("The Width is now: " + sculpture.getDepth() + " inches");
                                    return;
                                case 7:
                                    System.out.println("The Height of this piece is currently: " + sculpture.getHeight() + " inches");
                                    System.out.println("What would you like to change it to?");
                                    userInput = updateScan.nextLine();
                                    userDouble = Double.parseDouble(userInput);
                                    sculpture.setHeight(userDouble);
                                    System.out.println("The Height is now: " + sculpture.getHeight() + " inches");
                                    return;
                                case 8:
                                    System.out.println("The Weight of this piece is currently: " + sculpture.getWeight() + " pounds");
                                    System.out.println("What would you like to change it to?");
                                    userInput = updateScan.nextLine();
                                    userDouble = Double.parseDouble(userInput);
                                    sculpture.setWeight(userDouble);
                                    System.out.println("The Weight is now: " + sculpture.getWeight() + " pounds");
                                    return;
                                case 9:
                                    System.out.println("The Price of this piece is currently: $" + sculpture.getPrice() + " USD");
                                    System.out.println("What would you like to change it to?");
                                    userInput = updateScan.nextLine();
                                    userDouble = Double.parseDouble(userInput);
                                    sculpture.setPrice(userDouble);
                                    System.out.println("The Price is now: $" + sculpture.getPrice() + " USD");
                                    return;
                                default:
                                    System.out.println("I'm sorry, Your input was not recognized.");
                                    System.out.println("    Please enter your choice again");
                                    System.out.println("            Thank you!");
                                    break;
                            }
                        }
                    }
                    break;
                case 2:
                    // Painting
                    System.out.println();
                    System.out.println("            You have chosen to edit a painting: ");
                    System.out.println("---------------------------------------------------------------------");
                    System.out.println("Next, please input the title of the piece and last name of the artist.");
                    System.out.println("Note: please input exact information such as full title and artist last name");
                    System.out.println("              or you will be brought back to the main menu");
                    System.out.println();

                    String findStr2 = updateFind(sculptureArrayList, paintingArrayList, collageArrayList, drawingArrayList, printArrayList, performanceArtArrayList, artistArrayList);

                    if (findStr2.equalsIgnoreCase("none")) {return;}

                    int spaceFinder2 = findStr2.lastIndexOf(" ");
                    String updateTitle2 = findStr2.substring(0, spaceFinder2);
                    String updateName2 = findStr2.substring(spaceFinder2 + 1);
                    boolean userBoolean = false;

                    if ((updateTitle2.equalsIgnoreCase("title")) || (updateName2.equalsIgnoreCase("artist"))) {
                        System.out.println("Unfortunately, the system cannot update a specific piece without an exact");
                        System.out.println("piece title and artist last name, you'll be returned to the main menu.");
                        return;
                    }

                    for (int i = 0; i < paintingArrayList.size(); i++) {
                        Painting painting = paintingArrayList.get(i);
                        if ((updateTitle2.equalsIgnoreCase(painting.getTitle())) && (updateName2.equalsIgnoreCase(painting.getArtist().getLastName()))) {
                            System.out.println();
                            System.out.println("1. Title: " + painting.getTitle());
                            System.out.println("2. Artist: " + painting.getArtist().getArtistName());
                            System.out.println("3. Year: " + painting.getYear());
                            System.out.println("4. Paint: " + painting.getTypeOfPaint());
                            System.out.println("5. Proof: " + painting.getIsArtistProof());
                            System.out.println("6. Width: " + painting.getWidth() + " inches");
                            System.out.println("7. Height: " + painting.getHeight() + " inches");
                            System.out.println("8. Price: $" + painting.getPrice());
                            System.out.println();
                            System.out.println("Please choose the field you would like to update by inputting the");
                            System.out.println("                    corresponding number");
                            System.out.println("If you would like to get back to the main menu, input '0'");
                            System.out.println("---------------------------------------------------------------------");
                            System.out.println();
                            userInput = updateScan.nextLine();
                            userNumber = Integer.parseInt(userInput);

                            switch (userNumber) {
                                case 0:
                                    return;
                                case 1:
                                    System.out.println("The title of this piece is currently: " + painting.getTitle());
                                    System.out.println("What would you like to change it to?");
                                    userInput = updateScan.nextLine();
                                    painting.setTitle(userInput);
                                    System.out.println("The title is now: " + painting.getTitle());
                                    return;
                                case 2:
                                    System.out.println("The Artististry of this piece is attributed to: " + painting.getArtist().getArtistName());
                                    System.out.println("What would you like to change it to?");
                                    System.out.println("Note: Please input both a first and a last name, separated by a space");
                                    userInput = updateScan.nextLine();
                                    String newFirst = "none";
                                    String newLast = "none";
                                    Artist newArtist = new Artist();

                                    if (userInput.contains(" ") == true) {
                                        int spaceIndex = userInput.lastIndexOf(" ");
                                        newFirst = userInput.substring(0, spaceIndex);
                                        newLast = userInput.substring(spaceIndex + 1);
                                        newArtist.setFirstName(newFirst);
                                        newArtist.setLastName(newLast);

                                    } else {
                                        System.out.println("I'm sorry, your input did not contain a space.");
                                        System.out.println("Please retry the update name process using a space.");
                                        return;
                                    }

                                    painting.setArtist(newArtist);
                                    System.out.println();
                                    System.out.println("The Artist is now: " + painting.getArtist().getArtistName());
                                    return;
                                case 3:
                                    System.out.println("The year of this piece is currently: " + painting.getYear());
                                    System.out.println("What would you like to change it to?");
                                    userInput = updateScan.nextLine();
                                    userNumber = Integer.parseInt(userInput);
                                    painting.setYear(userNumber);
                                    System.out.println("The Year is now: " + painting.getYear());
                                    return;
                                case 4:
                                    System.out.println("The Paint used to paint this piece is currently listed as:");
                                    System.out.println(painting.getTypeOfPaint());
                                    System.out.println("What would you like to change it to?");
                                    userInput = updateScan.nextLine();
                                    painting.setTypeOfPaint(userInput);
                                    System.out.println("The paint is now: " + painting.getTypeOfPaint());
                                    return;
                                case 5:
                                    System.out.println("This painting's Proof status is: " + painting.getIsArtistProof());
                                    System.out.println("What would you like to change it to?");
                                    userInput = updateScan.nextLine();
                                    userBoolean = Boolean.parseBoolean(userInput);
                                    painting.setIsArtistProof(userBoolean);
                                    System.out.println("The Proof Status is now: " + painting.getIsArtistProof());
                                    return;
                                case 6:
                                    System.out.println("The Width of this piece is currently: " + painting.getWidth() + " inches");
                                    System.out.println("What would you like to change it to?");
                                    userInput = updateScan.nextLine();
                                    userDouble = Double.parseDouble(userInput);
                                    painting.setWidth(userDouble);
                                    System.out.println("The Width is now: " + painting.getWidth() + " inches");
                                    return;
                                case 7:
                                    System.out.println("The Height of this piece is currently: " + painting.getHeight() + " inches");
                                    System.out.println("What would you like to change it to?");
                                    userInput = updateScan.nextLine();
                                    userDouble = Double.parseDouble(userInput);
                                    painting.setHeight(userDouble);
                                    System.out.println("The Height is now: " + painting.getHeight() + " inches");
                                    return;
                                case 8:
                                    System.out.println("The Price of this piece is currently: $" + painting.getPrice() + " USD");
                                    System.out.println("What would you like to change it to?");
                                    userInput = updateScan.nextLine();
                                    userDouble = Double.parseDouble(userInput);
                                    painting.setPrice(userDouble);
                                    System.out.println("The Price is now: $" + painting.getPrice() + " USD");
                                    return;
                                default:
                                    System.out.println("I'm sorry, Your input was not recognized.");
                                    System.out.println("    Please enter your choice again");
                                    System.out.println("            Thank you!");
                                    break;
                            }
                        }
                    }
                    break;
                case 3:
                    // Collage
                    System.out.println();
                    System.out.println("            You have chosen to edit a collage: ");
                    System.out.println("---------------------------------------------------------------------");
                    System.out.println("Next, please input the title of the piece and last name of the artist.");
                    System.out.println("Note: please input exact information such as full title and artist last name");
                    System.out.println("              or you will be brought back to the main menu");
                    System.out.println();

                    String findStr3 = updateFind(sculptureArrayList, paintingArrayList, collageArrayList, drawingArrayList, printArrayList, performanceArtArrayList, artistArrayList);

                    if (findStr3.equalsIgnoreCase("none")) {return;}

                    int spaceFinder3 = findStr3.lastIndexOf(" ");
                    String updateTitle3 = findStr3.substring(0, spaceFinder3);
                    String updateName3 = findStr3.substring(spaceFinder3 + 1);

                    if ((updateTitle3.equalsIgnoreCase("title")) || (updateName3.equalsIgnoreCase("artist"))) {
                        System.out.println("Unfortunately, the system cannot update a specific piece without an exact");
                        System.out.println("piece title and artist last name, you'll be returned to the main menu.");
                        return;
                    }

                    for (int i = 0; i < collageArrayList.size(); i++) {
                        Collage collage = collageArrayList.get(i);
                        if ((updateTitle3.equalsIgnoreCase(collage.getTitle())) && (updateName3.equalsIgnoreCase(collage.getArtist().getLastName()))) {
                            System.out.println();
                            System.out.println("1. Title: " + collage.getTitle());
                            System.out.println("2. Artist: " + collage.getArtist().getArtistName());
                            System.out.println("3. Year: " + collage.getYear());
                            System.out.println("4. Materials: " + collage.getCompMaterials());
                            System.out.println("5. Provenance: " + collage.getProvenance());
                            System.out.println("6. Width: " + collage.getWidth() + " inches");
                            System.out.println("7. Height: " + collage.getHeight() + " inches");
                            System.out.println("8. Price: $" + collage.getPrice());
                            System.out.println();
                            System.out.println("Please choose the field you would like to update by inputting the");
                            System.out.println("                    corresponding number");
                            System.out.println("If you would like to get back to the main menu, input '0'");
                            System.out.println("---------------------------------------------------------------------");
                            System.out.println();
                            userInput = updateScan.nextLine();
                            userNumber = Integer.parseInt(userInput);

                            switch (userNumber) {
                                case 0:
                                    return;
                                case 1:
                                    System.out.println("The title of this piece is currently: " + collage.getTitle());
                                    System.out.println("What would you like to change it to?");
                                    userInput = updateScan.nextLine();
                                    collage.setTitle(userInput);
                                    System.out.println("The title is now: " + collage.getTitle());
                                    return;
                                case 2:
                                    System.out.println("The Artististry of this piece is attributed to: " + collage.getArtist().getArtistName());
                                    System.out.println("What would you like to change it to?");
                                    System.out.println("Note: Please input both a first and a last name, separated by a space");
                                    userInput = updateScan.nextLine();
                                    String newFirst = "none";
                                    String newLast = "none";
                                    Artist newArtist = new Artist();

                                    if (userInput.contains(" ") == true) {
                                        int spaceIndex = userInput.lastIndexOf(" ");
                                        newFirst = userInput.substring(0, spaceIndex);
                                        newLast = userInput.substring(spaceIndex + 1);
                                        newArtist.setFirstName(newFirst);
                                        newArtist.setLastName(newLast);

                                    } else {
                                        System.out.println("I'm sorry, your input did not contain a space.");
                                        System.out.println("Please retry the update name process using a space.");
                                        return;
                                    }

                                    collage.setArtist(newArtist);
                                    System.out.println();
                                    System.out.println("The Artist is now: " + collage.getArtist().getArtistName());
                                    return;
                                case 3:
                                    System.out.println("The year of this piece is currently: " + collage.getYear());
                                    System.out.println("What would you like to change it to?");
                                    userInput = updateScan.nextLine();
                                    userNumber = Integer.parseInt(userInput);
                                    collage.setYear(userNumber);
                                    System.out.println("The Year is now: " + collage.getYear());
                                    return;
                                case 4:
                                    System.out.println("The composite materials used to create this piece are currently listed as:");
                                    System.out.println(collage.getCompMaterials());
                                    System.out.println("What would you like to change it to?");
                                    userInput = updateScan.nextLine();
                                    collage.setCompMaterials(userInput);
                                    System.out.println("The composite materials are now: " + collage.getCompMaterials());
                                    return;
                                case 5:
                                    System.out.println("This collages provenance is listed as: " + collage.getProvenance());
                                    System.out.println("What would you like to change it to?");
                                    userInput = updateScan.nextLine();
                                    collage.setProvenance(userInput);
                                    System.out.println("The Proof Status is now: " + collage.getProvenance());
                                    return;
                                case 6:
                                    System.out.println("The Width of this piece is currently: " + collage.getWidth() + " inches");
                                    System.out.println("What would you like to change it to?");
                                    userInput = updateScan.nextLine();
                                    userDouble = Double.parseDouble(userInput);
                                    collage.setWidth(userDouble);
                                    System.out.println("The Width is now: " + collage.getWidth() + " inches");
                                    return;
                                case 7:
                                    System.out.println("The Height of this piece is currently: " + collage.getHeight() + " inches");
                                    System.out.println("What would you like to change it to?");
                                    userInput = updateScan.nextLine();
                                    userDouble = Double.parseDouble(userInput);
                                    collage.setHeight(userDouble);
                                    System.out.println("The Height is now: " + collage.getHeight() + " inches");
                                    return;
                                case 8:
                                    System.out.println("The Price of this piece is currently: $" + collage.getPrice() + " USD");
                                    System.out.println("What would you like to change it to?");
                                    userInput = updateScan.nextLine();
                                    userDouble = Double.parseDouble(userInput);
                                    collage.setPrice(userDouble);
                                    System.out.println("The Price is now: $" + collage.getPrice() + " USD");
                                    return;
                                default:
                                    System.out.println("I'm sorry, Your input was not recognized.");
                                    System.out.println("    Please enter your choice again");
                                    System.out.println("            Thank you!");
                                    break;
                            }
                        }
                    }
                    break;
                case 4:
                    // Drawing
                    System.out.println();
                    System.out.println("            You have chosen to edit a drawing: ");
                    System.out.println("---------------------------------------------------------------------");
                    System.out.println("Next, please input the title of the piece and last name of the artist.");
                    System.out.println("Note: please input exact information such as full title and artist last name");
                    System.out.println("              or you will be brought back to the main menu");
                    System.out.println();

                    String findStr4 = updateFind(sculptureArrayList, paintingArrayList, collageArrayList, drawingArrayList, printArrayList, performanceArtArrayList, artistArrayList);

                    if (findStr4.equalsIgnoreCase("none")) {return;}

                    int spaceFinder4 = findStr4.lastIndexOf(" ");
                    String updateTitle4 = findStr4.substring(0, spaceFinder4);
                    String updateName4 = findStr4.substring(spaceFinder4 + 1);

                    if ((updateTitle4.equalsIgnoreCase("title")) || (updateName4.equalsIgnoreCase("artist"))) {
                        System.out.println("Unfortunately, the system cannot update a specific piece without an exact");
                        System.out.println("piece title and artist last name, you'll be returned to the main menu.");
                        return;
                    }

                    for (int i = 0; i < drawingArrayList.size(); i++) {
                        Drawing drawing = drawingArrayList.get(i);
                        if ((updateTitle4.equalsIgnoreCase(drawing.getTitle())) && (updateName4.equalsIgnoreCase(drawing.getArtist().getLastName()))) {
                            System.out.println();
                            System.out.println("1. Title: " + drawing.getTitle());
                            System.out.println("2. Artist: " + drawing.getArtist().getArtistName());
                            System.out.println("3. Year: " + drawing.getYear());
                            System.out.println("4. Implement: " + drawing.getDrawingImplement());
                            System.out.println("5. Style: " + drawing.getStyle());
                            System.out.println("6. Width: " + drawing.getWidth() + " inches");
                            System.out.println("7. Height: " + drawing.getHeight() + " inches");
                            System.out.println("8. Price: $" + drawing.getPrice());
                            System.out.println();
                            System.out.println("Please choose the field you would like to update by inputting the");
                            System.out.println("                    corresponding number");
                            System.out.println("If you would like to get back to the main menu, input '0'");
                            System.out.println("---------------------------------------------------------------------");
                            System.out.println();
                            userInput = updateScan.nextLine();
                            userNumber = Integer.parseInt(userInput);

                            switch (userNumber) {
                                case 0:
                                    return;
                                case 1:
                                    System.out.println("The title of this piece is currently: " + drawing.getTitle());
                                    System.out.println("What would you like to change it to?");
                                    userInput = updateScan.nextLine();
                                    drawing.setTitle(userInput);
                                    System.out.println("The title is now: " + drawing.getTitle());
                                    return;
                                case 2:
                                    System.out.println("The Artististry of this piece is attributed to: " + drawing.getArtist().getArtistName());
                                    System.out.println("What would you like to change it to?");
                                    System.out.println("Note: Please input both a first and a last name, separated by a space");
                                    userInput = updateScan.nextLine();
                                    String newFirst = "none";
                                    String newLast = "none";
                                    Artist newArtist = new Artist();

                                    if (userInput.contains(" ") == true) {
                                        int spaceIndex = userInput.lastIndexOf(" ");
                                        newFirst = userInput.substring(0, spaceIndex);
                                        newLast = userInput.substring(spaceIndex + 1);
                                        newArtist.setFirstName(newFirst);
                                        newArtist.setLastName(newLast);

                                    } else {
                                        System.out.println("I'm sorry, your input did not contain a space.");
                                        System.out.println("Please retry the update name process using a space.");
                                        return;
                                    }

                                    drawing.setArtist(newArtist);
                                    System.out.println();
                                    System.out.println("The Artist is now: " + drawing.getArtist().getArtistName());
                                    return;
                                case 3:
                                    System.out.println("The year of this piece is currently: " + drawing.getYear());
                                    System.out.println("What would you like to change it to?");
                                    userInput = updateScan.nextLine();
                                    userNumber = Integer.parseInt(userInput);
                                    drawing.setYear(userNumber);
                                    System.out.println("The Year is now: " + drawing.getYear());
                                    return;
                                case 4:
                                    System.out.println("The drawing implement used to create this piece is currently listed as:");
                                    System.out.println(drawing.getDrawingImplement());
                                    System.out.println("What would you like to change it to?");
                                    userInput = updateScan.nextLine();
                                    drawing.setDrawingImplement(userInput);
                                    System.out.println("The composite materials are now: " + drawing.getDrawingImplement());
                                    return;
                                case 5:
                                    System.out.println("This drawing's style is listed as: " + drawing.getStyle());
                                    System.out.println("What would you like to change it to?");
                                    userInput = updateScan.nextLine();
                                    drawing.setStyle(userInput);
                                    System.out.println("The Proof Status is now: " + drawing.getStyle());
                                    return;
                                case 6:
                                    System.out.println("The Width of this piece is currently: " + drawing.getWidth() + " inches");
                                    System.out.println("What would you like to change it to?");
                                    userInput = updateScan.nextLine();
                                    userDouble = Double.parseDouble(userInput);
                                    drawing.setWidth(userDouble);
                                    System.out.println("The Width is now: " + drawing.getWidth() + " inches");
                                    return;
                                case 7:
                                    System.out.println("The Height of this piece is currently: " + drawing.getHeight() + " inches");
                                    System.out.println("What would you like to change it to?");
                                    userInput = updateScan.nextLine();
                                    userDouble = Double.parseDouble(userInput);
                                    drawing.setHeight(userDouble);
                                    System.out.println("The Height is now: " + drawing.getHeight() + " inches");
                                    return;
                                case 8:
                                    System.out.println("The Price of this piece is currently: $" + drawing.getPrice() + " USD");
                                    System.out.println("What would you like to change it to?");
                                    userInput = updateScan.nextLine();
                                    userDouble = Double.parseDouble(userInput);
                                    drawing.setPrice(userDouble);
                                    System.out.println("The Price is now: $" + drawing.getPrice() + " USD");
                                    return;
                                default:
                                    System.out.println("I'm sorry, Your input was not recognized.");
                                    System.out.println("    Please enter your choice again");
                                    System.out.println("            Thank you!");
                                    break;
                            }
                        }
                    }
                    break;
                case 5:
                    // Print
                    System.out.println();
                    System.out.println("            You have chosen to edit a print: ");
                    System.out.println("---------------------------------------------------------------------");
                    System.out.println("Next, please input the title of the piece and last name of the artist.");
                    System.out.println("Note: please input exact information such as full title and artist last name");
                    System.out.println("              or you will be brought back to the main menu");
                    System.out.println();

                    String findStr5 = updateFind(sculptureArrayList, paintingArrayList, collageArrayList, drawingArrayList, printArrayList, performanceArtArrayList, artistArrayList);

                    if (findStr5.equalsIgnoreCase("none")) {return;}

                    int spaceFinder5 = findStr5.lastIndexOf(" ");
                    String updateTitle5 = findStr5.substring(0, spaceFinder5);
                    String updateName5 = findStr5.substring(spaceFinder5 + 1);
                    boolean userBoolean2 = false;

                    if ((updateTitle5.equalsIgnoreCase("title")) || (updateName5.equalsIgnoreCase("artist"))) {
                        System.out.println("Unfortunately, the system cannot update a specific piece without an exact");
                        System.out.println("piece title and artist last name, you'll be returned to the main menu.");
                        return;
                    }

                    for (int i = 0; i < printArrayList.size(); i++) {
                        Print print = printArrayList.get(i);
                        if ((updateTitle5.equalsIgnoreCase(print.getTitle())) && (updateName5.equalsIgnoreCase(print.getArtist().getLastName()))) {
                            System.out.println();
                            System.out.println("1. Title: " + print.getTitle());
                            System.out.println("2. Artist: " + print.getArtist().getArtistName());
                            System.out.println("3. Year: " + print.getYear());
                            System.out.println("4. Multiple Original: " + print.getMultipleOriginal());
                            System.out.println("5. Style: " + print.getStyle());
                            System.out.println("6. Width: " + print.getWidth() + " inches");
                            System.out.println("7. Height: " + print.getHeight() + " inches");
                            System.out.println("8. Price: $" + print.getPrice());
                            System.out.println();
                            System.out.println("Please choose the field you would like to update by inputting the");
                            System.out.println("                    corresponding number");
                            System.out.println("If you would like to get back to the main menu, input '0'");
                            System.out.println("---------------------------------------------------------------------");
                            System.out.println();
                            userInput = updateScan.nextLine();
                            userNumber = Integer.parseInt(userInput);

                            switch (userNumber) {
                                case 0:
                                    return;
                                case 1:
                                    System.out.println("The title of this piece is currently: " + print.getTitle());
                                    System.out.println("What would you like to change it to?");
                                    userInput = updateScan.nextLine();
                                    print.setTitle(userInput);
                                    System.out.println("The title is now: " + print.getTitle());
                                    return;
                                case 2:
                                    System.out.println("The Artististry of this piece is attributed to: " + print.getArtist().getArtistName());
                                    System.out.println("What would you like to change it to?");
                                    System.out.println("Note: Please input both a first and a last name, separated by a space");
                                    userInput = updateScan.nextLine();
                                    String newFirst = "none";
                                    String newLast = "none";
                                    Artist newArtist = new Artist();

                                    if (userInput.contains(" ") == true) {
                                        int spaceIndex = userInput.lastIndexOf(" ");
                                        newFirst = userInput.substring(0, spaceIndex);
                                        newLast = userInput.substring(spaceIndex + 1);
                                        newArtist.setFirstName(newFirst);
                                        newArtist.setLastName(newLast);

                                    } else {
                                        System.out.println("I'm sorry, your input did not contain a space.");
                                        System.out.println("Please retry the update name process using a space.");
                                        return;
                                    }

                                    print.setArtist(newArtist);
                                    System.out.println();
                                    System.out.println("The Artist is now: " + print.getArtist().getArtistName());
                                    return;
                                case 3:
                                    System.out.println("The year of this piece is currently: " + print.getYear());
                                    System.out.println("What would you like to change it to?");
                                    userInput = updateScan.nextLine();
                                    userNumber = Integer.parseInt(userInput);
                                    print.setYear(userNumber);
                                    System.out.println("The Year is now: " + print.getYear());
                                    return;
                                case 4:
                                    System.out.println("The Multiple Original status for this piece is currently listed as:");
                                    System.out.println(print.getMultipleOriginal());
                                    System.out.println("What would you like to change it to?");
                                    userInput = updateScan.nextLine();
                                    userBoolean = Boolean.parseBoolean(userInput);
                                    print.setMultipleOriginal(userBoolean);
                                    System.out.println("The composite materials are now: " + print.getMultipleOriginal());
                                    return;
                                case 5:
                                    System.out.println("This print's style is listed as: " + print.getStyle());
                                    System.out.println("What would you like to change it to?");
                                    userInput = updateScan.nextLine();
                                    print.setStyle(userInput);
                                    System.out.println("The Proof Status is now: " + print.getStyle());
                                    return;
                                case 6:
                                    System.out.println("The Width of this piece is currently: " + print.getWidth() + " inches");
                                    System.out.println("What would you like to change it to?");
                                    userInput = updateScan.nextLine();
                                    userDouble = Double.parseDouble(userInput);
                                    print.setWidth(userDouble);
                                    System.out.println("The Width is now: " + print.getWidth() + " inches");
                                    return;
                                case 7:
                                    System.out.println("The Height of this piece is currently: " + print.getHeight() + " inches");
                                    System.out.println("What would you like to change it to?");
                                    userInput = updateScan.nextLine();
                                    userDouble = Double.parseDouble(userInput);
                                    print.setHeight(userDouble);
                                    System.out.println("The Height is now: " + print.getHeight() + " inches");
                                    return;
                                case 8:
                                    System.out.println("The Price of this piece is currently: $" + print.getPrice() + " USD");
                                    System.out.println("What would you like to change it to?");
                                    userInput = updateScan.nextLine();
                                    userDouble = Double.parseDouble(userInput);
                                    print.setPrice(userDouble);
                                    System.out.println("The Price is now: $" + print.getPrice() + " USD");
                                    return;
                                default:
                                    System.out.println("I'm sorry, Your input was not recognized.");
                                    System.out.println("    Please enter your choice again");
                                    System.out.println("            Thank you!");
                                    break;
                            }
                        }
                    }
                    break;
                case 6:
                    // Performance Art
                    System.out.println();
                    System.out.println("           You have chosen to edit a performance art record: ");
                    System.out.println("---------------------------------------------------------------------");
                    System.out.println("Next, please input the title of the piece and last name of the artist.");
                    System.out.println("Note: please input exact information such as full title and artist last name");
                    System.out.println("              or you will be brought back to the main menu");
                    System.out.println();

                    String findStr6 = updateFind(sculptureArrayList, paintingArrayList, collageArrayList, drawingArrayList, printArrayList, performanceArtArrayList, artistArrayList);

                    if (findStr6.equalsIgnoreCase("none")) {return;}

                    int spaceFinder6 = findStr6.lastIndexOf(" ");
                    String updateTitle6 = findStr6.substring(0, spaceFinder6);
                    String updateName6 = findStr6.substring(spaceFinder6 + 1);
                    int userInt = 0;

                    if ((updateTitle6.equalsIgnoreCase("title")) || (updateName6.equalsIgnoreCase("artist"))) {
                        System.out.println("Unfortunately, the system cannot update a specific piece without an exact");
                        System.out.println("piece title and artist last name, you'll be returned to the main menu.");
                        return;
                    }

                    for (int i = 0; i < performanceArtArrayList.size(); i++) {
                        PerformanceArt performanceArt = performanceArtArrayList.get(i);
                        if ((updateTitle6.equalsIgnoreCase(performanceArt.getTitle())) && (updateName6.equalsIgnoreCase(performanceArt.getArtist().getLastName()))) {
                            System.out.println();
                            System.out.println("1. Title: " + performanceArt.getTitle());
                            System.out.println("2. Artist: " + performanceArt.getArtist().getArtistName());
                            System.out.println("3. Year: " + performanceArt.getYear());
                            System.out.println("4. Honorarium: " + performanceArt.getHonorarium());
                            System.out.println("5. Duration: " + performanceArt.getDuration());
                            System.out.println("6. Max Occupancy: " + performanceArt.getMaxOcc());
                            System.out.println("7. Performance Rights: " + performanceArt.getPerformanceRights());
                            System.out.println();
                            System.out.println("Please choose the field you would like to update by inputting the");
                            System.out.println("                    corresponding number");
                            System.out.println("If you would like to get back to the main menu, input '0'");
                            System.out.println("---------------------------------------------------------------------");
                            System.out.println();
                            userInput = updateScan.nextLine();
                            userNumber = Integer.parseInt(userInput);

                            switch (userNumber) {
                                case 0:
                                    return;
                                case 1:
                                    System.out.println("The title of this piece is currently: " + performanceArt.getTitle());
                                    System.out.println("What would you like to change it to?");
                                    userInput = updateScan.nextLine();
                                    performanceArt.setTitle(userInput);
                                    System.out.println("The title is now: " + performanceArt.getTitle());
                                    return;
                                case 2:
                                    System.out.println("The Artististry of this piece is attributed to: " + performanceArt.getArtist().getArtistName());
                                    System.out.println("What would you like to change it to?");
                                    System.out.println("Note: Please input both a first and a last name, separated by a space");
                                    userInput = updateScan.nextLine();
                                    String newFirst = "none";
                                    String newLast = "none";
                                    Artist newArtist = new Artist();

                                    if (userInput.contains(" ") == true) {
                                        int spaceIndex = userInput.lastIndexOf(" ");
                                        newFirst = userInput.substring(0, spaceIndex);
                                        newLast = userInput.substring(spaceIndex + 1);
                                        newArtist.setFirstName(newFirst);
                                        newArtist.setLastName(newLast);

                                    } else {
                                        System.out.println("I'm sorry, your input did not contain a space.");
                                        System.out.println("Please retry the update name process using a space.");
                                        return;
                                    }

                                    performanceArt.setArtist(newArtist);
                                    System.out.println();
                                    System.out.println("The Artist is now: " + performanceArt.getArtist().getArtistName());
                                    return;
                                case 3:
                                    System.out.println("The year of this piece is currently: " + performanceArt.getYear());
                                    System.out.println("What would you like to change it to?");
                                    userInput = updateScan.nextLine();
                                    userNumber = Integer.parseInt(userInput);
                                    performanceArt.setYear(userNumber);
                                    System.out.println("The Year is now: " + performanceArt.getYear());
                                    return;
                                case 4:
                                    System.out.println("The Honorarium Amount for this piece is currently listed as:");
                                    System.out.println(performanceArt.getHonorarium());
                                    System.out.println("What would you like to change it to?");
                                    userInput = updateScan.nextLine();
                                    userDouble = Double.parseDouble(userInput);
                                    performanceArt.setHonorarium(userDouble);
                                    System.out.println("The composite materials are now: " + performanceArt.getHonorarium());
                                    return;
                                case 5:
                                    System.out.println("This performance art's duration is listed as: " + performanceArt.getDuration());
                                    System.out.println("What would you like to change it to?");
                                    userInput = updateScan.nextLine();
                                    userDouble = Double.parseDouble(userInput);
                                    performanceArt.setDuration(userDouble);
                                    System.out.println("The duration is now: " + performanceArt.getDuration());
                                    return;
                                case 6:
                                    System.out.println("The Maximum Occupancy of this piece is currently: " + performanceArt.getMaxOcc());
                                    System.out.println("What would you like to change it to?");
                                    userInput = updateScan.nextLine();
                                    userInt = Integer.parseInt(userInput);
                                    performanceArt.setMaxOcc(userInt);
                                    System.out.println("The Maximum Occupancy is now: " + performanceArt.getMaxOcc() + " people");
                                    return;
                                case 7:
                                    System.out.println("The Rights associated with this piece are currently: " + performanceArt.getPerformanceRights() + ".");
                                    System.out.println("What would you like to change it to?");
                                    userInput = updateScan.nextLine();
                                    performanceArt.setPerformanceRights(userInput);
                                    System.out.println("The Rights are now: " + performanceArt.getPerformanceRights() + ".");
                                    return;
                                default:
                                    System.out.println("I'm sorry, Your input was not recognized.");
                                    System.out.println("    Please enter your choice again");
                                    System.out.println("            Thank you!");
                                    break;
                            }
                        }
                    }
                    break;
                default:
                    // Provide user with polite error message
                    System.out.println("I'm sorry, Your input was not recognized.");
                    System.out.println("     Please enter your choice again");
                    System.out.println("            Thank you!");
                    break;
            }
        } while (updateStatus = false);


        userInput = updateScan.nextLine();

        System.out.println(userNumber);
        System.out.println(userInput);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName = "Default";
        String userInput = "None";
        char refUI = 'a';
        boolean firstStart = true;

        ArrayList<Sculpture> sculptureArrayList = new ArrayList<>();
        ArrayList<Painting> paintingArrayList = new ArrayList<>();
        ArrayList<Collage> collageArrayList = new ArrayList<>();
        ArrayList<Drawing> drawingArrayList = new ArrayList<>();
        ArrayList<Print> printArrayList = new ArrayList<>();
        ArrayList<PerformanceArt> performanceArtArrayList = new ArrayList<>();
        ArrayList<Artist> artistArrayList = new ArrayList<>();

        if (firstStart == true) {
            starterData(sculptureArrayList, paintingArrayList, collageArrayList, drawingArrayList, printArrayList, performanceArtArrayList, artistArrayList);
            firstStart = false;
        }

        System.out.println("---------------------------------------------------------------------");
        System.out.println("-------------------------- Welcome to -------------------------------");
        System.out.println("----------------------------- AGIS ----------------------------------");
        System.out.println("------------------ Art Gallery Inventory System ---------------------");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("-------------------- Please Input your Name -------------------------");
        System.out.println("---------------------------------------------------------------------");
        System.out.println();
        userName = scanner.nextLine();

        if (userName.length() <= 0) {
            userName = "Default User";
        }

        System.out.println("");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("                       Welcome " + userName + "!");
        System.out.println("---------------------------------------------------------------------");
        System.out.println();

        do {
            menuOutput();
            userInput = scanner.nextLine();
            userInput = userInput.toLowerCase();
            refUI = userInput.charAt(0);

            // determines function based on user inputs, error handles
            switch (refUI) {
                // Display
                case 'd':
                    displayInventory(sculptureArrayList, paintingArrayList, collageArrayList, drawingArrayList, printArrayList, performanceArtArrayList, artistArrayList);
                    break;
                // Input
                case 'i':
                    inputNewWork(sculptureArrayList, paintingArrayList, collageArrayList, drawingArrayList, printArrayList, performanceArtArrayList, artistArrayList);
                    break;
                // Remove
                case 'r':
                    removePiece(sculptureArrayList, paintingArrayList, collageArrayList, drawingArrayList, printArrayList, performanceArtArrayList, artistArrayList);
                   break;
                // Find
                case 'f':
                    String find = findWork(sculptureArrayList, paintingArrayList, collageArrayList, drawingArrayList, printArrayList, performanceArtArrayList, artistArrayList);
                    break;
                // Update
                case 'u':
                    updatePiece(sculptureArrayList, paintingArrayList, collageArrayList, drawingArrayList, printArrayList, performanceArtArrayList, artistArrayList);
                    break;
                case 't':
                    testMod();
                    break;
                // Exit
                case 'e':
                    System.out.println("                Thank you for using AGIS, " + userName);
                    System.out.println("                        Have a fantastic day!");
                    scanner.close();
                    return;
                default:
                    // Provide user with polite error message
                    System.out.println();
                    System.out.println("I'm sorry, Your input was not recognized.");
                    System.out.println("    Please enter your choice again");
                    System.out.println("            Thank you!");
                    // reset refUI
                    refUI = 'a';
                    break;
            }
        } while (refUI != 'e');

        if (refUI == 'e') {
            return;
        }
    }
}