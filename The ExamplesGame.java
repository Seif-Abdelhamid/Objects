interface Resource { }

// a Denial has a subject and a believability
class Denial implements Resource {
    String subject;
    int believability;

    Denial(String subject, int believability) {
        this.subject = subject;
        this.believability = believability;
    }
}

// a Bribe has a target and a value
class Bribe implements Resource {
    String target;
    int value;

    Bribe(String target, int value) {
        this.target = target;
        this.value = value;
    }
}

// an Apology has an excuse and a reusable flag
class Apology implements Resource {
    String excuse;
    boolean reusable;

    Apology(String excuse, boolean reusable) {
        this.excuse = excuse;
        this.reusable = reusable;
    }
}

interface Action { }

// a Purchase has a cost and an item
class Purchase implements Action {
    int cost;
    Resource item;

    Purchase(int cost, Resource item) {
        this.cost = cost;
        this.item = item;
    }
}

// a Swap has a consumed resource and a received resource
class Swap implements Action {
    Resource consumed;
    Resource received;

    Swap(Resource consumed, Resource received) {
        this.consumed = consumed;
        this.received = received;
    }
}

class ExamplesGame {
    // six resources (include the three specified)
    Resource iDidntKnow = new Denial("knowledge", 51);
    Resource witness = new Bribe("innocent witness", 49);
    Resource iWontDoItAgain = new Apology("I won't do it again", false);

    Resource Seif = new Denial("action", 30);
    Resource Fady = new Bribe("journalist", 52);
    Resource Jason = new Apology("We regret the oversight", true);

    Action purchase1 = new Purchase(5, this.Seif);
    Action purchase2 = new Purchase(12, this.iWontDoItAgain);

    Action swap1 = new Swap(this.Jason, this.Fady);
    Action swap2 = new Swap(this.iDidntKnow, this.witness);

}
