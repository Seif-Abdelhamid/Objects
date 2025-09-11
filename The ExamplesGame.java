// A Resource is one of:
//  - new Denial(String subject, int believability)
//  - new Bribe(String target, int value)
//  - new Apology(String excuse, boolean reusable)
//
//   Denial:     a denial of knowledge/action, with believability score as integer 0–100
//   Bribe:      an attempt to buy influence with a target at some integer value
//   Apology:    an excuse with a boolean value determining if it can be reused
//
interface Resource { }

// DATA DEFINITION: Denial
// Fields:
//  - subject : String
//  - believability : int
// Interpretation: the subject being denied and its believability rating
// Constructor Signature:
//   Denial(String subject, int believability) -> Denial
// TEMPLATE (inside Denial methods):
//   this.subject
//   this.believability
class Denial implements Resource {
  String subject;
  int believability;

  Denial(String subject, int believability) {
    this.subject = subject;
    this.believability = believability;
  }
}

// DATA DEFINITION: Bribe
// Fields:
//  - target : String
//  - value : int
// Interpretation: the person/entity being bribed and the bribe’s value
// Constructor Signature:
//   Bribe(String target, int value) -> Bribe
// TEMPLATE (inside Bribe methods):
//   this.target
//   this.value
class Bribe implements Resource {
  String target;
  int value;

  Bribe(String target, int value) {
    this.target = target;
    this.value = value;
  }
}

// DATA DEFINITION: Apology
// Fields:
//  - excuse : String
//  - reusable : boolean
// Interpretation: an apology’s text and whether it can be reused
// Constructor Signature:
//   Apology(String excuse, boolean reusable) -> Apology
// TEMPLATE (inside Apology methods):
//   this.excuse
//   this.reusable
class Apology implements Resource {
  String excuse;
  boolean reusable;

  Apology(String excuse, boolean reusable) {
    this.excuse = excuse;
    this.reusable = reusable;
  }
}

// DATA DEFINITION (Union via interface)
// An Action is one of:
//  - new Purchase(int cost, Resource item)
//  - new Swap(Resource consumed, Resource received)
//
// Interpretation:
//   Purchase: spend some cost to acquire a Resource
//   Swap:     exchange one Resource for another
//
// TEMPLATE for an Action a:
//   if (a instanceof Purchase) { ((Purchase) a).cost; ((Purchase) a).item; }
//   if (a instanceof Swap)     { ((Swap) a).consumed; ((Swap) a).received; }
interface Action { }

// DATA DEFINITION: Purchase
// Fields:
//  - cost : int
//  - item : Resource
// Interpretation: pay `cost` to get `item`
// Constructor Signature:
//   Purchase(int cost, Resource item) -> Purchase
// TEMPLATE (inside Purchase methods):
//   this.cost
//   this.item   // (apply Resource template)
class Purchase implements Action {
  int cost;
  Resource item;

  Purchase(int cost, Resource item) {
    this.cost = cost;
    this.item = item;
  }
}

// DATA DEFINITION: Swap
// Fields:
//  - consumed : Resource
//  - received : Resource
// Interpretation: trade away one Resource for another
// Constructor Signature:
//   Swap(Resource consumed, Resource received) -> Swap
// TEMPLATE (inside Swap methods):
//   this.consumed   // (apply Resource template)
//   this.received   // (apply Resource template)
class Swap implements Action {
  Resource consumed;
  Resource received;

  Swap(Resource consumed, Resource received) {
    this.consumed = consumed;
    this.received = received;
  }
}

// EXAMPLES CLASS
// for testing and illustration of the data definitions
class ExamplesGame {
  // Six Resource examples
  Resource iDidntKnow = new Denial("knowledge", 51);
  Resource witness = new Bribe("innocent witness", 49);
  Resource iWontDoItAgain = new Apology("I won't do it again", false);

  Resource Seif = new Denial("action", 30);
  Resource Fady = new Bribe("journalist", 52);
  Resource Jason = new Apology("We regret the oversight", true);

  // Two Purchase Actions
  Action purchase1 = new Purchase(5, this.Seif);
  Action purchase2 = new Purchase(12, this.iWontDoItAgain);

  // Two Swap Actions
  Action swap1 = new Swap(this.Jason, this.Fady);
  Action swap2 = new Swap(this.iDidntKnow, this.witness);

}

