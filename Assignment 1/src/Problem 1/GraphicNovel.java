//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    System.out.printf("Hello and welcome!");

    for (int i = 1; i <= 5; i++) {
      //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
      // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
      System.out.println("i = " + i);
    }
  }
}

// Data definition for a GraphicNovel
// A GraphicNovel is represented by:
//  - title: String
//  - author: String
//  - artist: String
//  - year: int
//  - cost: double
//  - monochrome: boolean
//
// Interpretation:
//   title = the name of the novel
//   author = who wrote the story
//   artist = who drew the art
//   year = year published
//   cost = price of the book in USD
//   monochrome = true if black & white, false if color

// Purpose: to initialize a new GraphicNovel with the given title, author, artist, year, cost, and monochrome flag
class GraphicNovel {
  String title;
  String author;
  String artist;
  int year;
  double cost;
  boolean monochrome;

  // Constructor for GraphicNovel
  // Purpose: to initialize a new GraphicNovel with the given title, author, artist, year, cost, and monochrome flag
  GraphicNovel (String title, String Author, String Artist, int year, double cost, boolean monochrome) {
    this.title = title;
    this.author = Author;
    this.artist = Artist;
    this.year = year;
    this.cost = cost;
    this.monochrome = monochrome;
  }

  // Template:
  // ... this.title ...       -- String
  // ... this.author ...     -- String
  // ... this.artist ...     -- String
  // ... this.year ...       -- int
  // ... this.cost ...      -- double
  // ... this.monochrome ...  -- boolean
}

// Examples of GraphicNovels
// ExamplesGraphicNovel provides sample data to use in testing
class ExamplesGraphicNovel {
  GraphicNovel g1;
  GraphicNovel g2;
  GraphicNovel g3;

  // Constructor: initializes three sample GraphicNovels
  ExamplesGraphicNovel() {
    g1 = new GraphicNovel("Maus", "Spiegelman", "Spiegelman", 1980, 17.90, true);
    g2 = new GraphicNovel("Logicomix", "Doxiadis", "Papadatos", 2009, 21.00, false);
    g3 = new GraphicNovel("Objects 1", "Jason Hemann", "Fady", 2025, 50_000, true); // no comma
  }
}
