// A Resource is one of:
//  - new Denial(String subject, int believability)
//  - new Bribe(String target, int value)
//  - new Apology(String excuse, boolean reusable)

// Interpretation:
//   Denial: a denial of knowledge/action, with believability 0–100
//   Bribe:  an attempt to buy influence with a target at some value
//   Apology: an excuse, with a flag showing if it can be reused
interface Resource { }

// DATA DEFINITION: Denial
class Denial implements Resource {
    String subject;
    int believability;

    Denial(String subject, int believability) {
        this.subject = subject;
        this.believability = believability;
    }

  /* TEMPLATE
   Fields:
   ... this.subject ...        -- String
   ... this.believability ...  -- int
   */
}

// DATA DEFINITION: Bribe
class Bribe implements Resource {
    String target;
    int value;

    Bribe(String target, int value) {
        this.target = target;
        this.value = value;
    }

  /* TEMPLATE
   Fields:
   ... this.target ...         -- String
   ... this.value ...          -- int
   */
}

// DATA DEFINITION: Apology
class Apology implements Resource {
    String excuse;
    boolean reusable;

    Apology(String excuse, boolean reusable) {
        this.excuse = excuse;
        this.reusable = reusable;
    }

  /* TEMPLATE
   Fields:
   ... this.excuse ...         -- String
   ... this.reusable ...       -- boolean
   */
}

// An Action is one of:
//  - new Purchase(int cost, Resource item)
//  - new Swap(Resource consumed, Resource received)

// Interpretation:
//   Purchase: spend some cost to acquire a Resource
//   Swap:     exchange one Resource for another
interface Action { }

// DATA DEFINITION: Purchase
class Purchase implements Action {
    int cost;
    Resource item;

    Purchase(int cost, Resource item) {
        this.cost = cost;
        this.item = item;
    }

  /* TEMPLATE
   Fields:
   ... this.cost ...           -- int
   ... this.item ...           -- Resource
   */
}

// DATA DEFINITION: Swap
class Swap implements Action {
    Resource consumed;
    Resource received;

    Swap(Resource consumed, Resource received) {
        this.consumed = consumed;
        this.received = received;
    }

  /* TEMPLATE
   Fields:
   ... this.consumed ...       -- Resource
   ... this.received ...       -- Resource
   */
}

// EXAMPLES CLASS
class ExamplesGame {
  /* TEMPLATE
   Fields:
   ... this.iDidntKnow ...     -- Resource
   ... this.witness ...        -- Resource
   ... this.iWontDoItAgain ... -- Resource
   ... this.Seif ...           -- Resource
   ... this.Fady ...           -- Resource
   ... this.Jason ...          -- Resource
   ... this.purchase1 ...      -- Action
   ... this.purchase2 ...      -- Action
   ... this.swap1 ...          -- Action
   ... this.swap2 ...          -- Action
   */

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
