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

class GraphicNovel {
  String title;
  String author;
  String artist;
  int year;
  double cost;
  boolean monochrome;

  GraphicNovel(String title, String author, String artist,
               int year, double cost, boolean monochrome) {
    this.title = title;
    this.author = author;
    this.artist = artist;
    this.year = year;
    this.cost = cost;
    this.monochrome = monochrome;
  }

  /* TEMPLATE
   Fields:
   ... this.title ...       -- String
   ... this.author ...      -- String
   ... this.artist ...      -- String
   ... this.year ...        -- int
   ... this.cost ...        -- double
   ... this.monochrome ...  -- boolean
   */
}

// EXAMPLES CLASS
class ExamplesGraphicNovel {
  /* TEMPLATE
   Fields:
   ... this.maus ... -- GraphicNovel
   ... this.logicomix ... -- GraphicNovel
   ... this.objects_1 ... -- GraphicNovel
   */

  GraphicNovel maus = new GraphicNovel("Maus", "Spiegelman", "Spiegelman", 1980, 17.90, true);
  GraphicNovel logicomix = new GraphicNovel("Logicomix", "Doxiadis", "Papadatos", 2009, 21.00, false);
  GraphicNovel objects_1 = new GraphicNovel("Objects 1", "Jason Hemann", "Fady", 2025, 50000, true);
}
