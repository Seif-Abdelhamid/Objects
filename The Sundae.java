// A Sundae is one of:
// - Scoop
// - Topping

// to represent a Sundae
interface Sundae {}

// a Scoop is a (make-scoop String)
class Scoop implements Sundae {
    String flavor;

    Scoop(String flavor) {
        this.flavor = flavor;
    }
}

// a Topping is a (make-topping Sundae String)
class Topping implements Sundae {
    Sundae inner;
    String name;

    Topping(Sundae inner, String name) {
        this.inner = inner;
        this.name = name;
    }
}

// examples and tests for sundaes
class ExamplesSundae {
    // build yummy
    Sundae choc = new Scoop("chocolate");
    Sundae withSprinkles = new Topping(choc, "rainbow sprinkles");
    Sundae withCaramel = new Topping(withSprinkles, "caramel");
    Sundae yummy = new Topping(withCaramel, "whipped cream");

    // build noThankYou
    Sundae vanilla = new Scoop("vanilla");
    Sundae withChocoSprinkles = new Topping(vanilla, "chocolate sprinkles");
    Sundae withFudge = new Topping(withChocoSprinkles, "fudge");
    Sundae noThankYou = new Topping(withFudge, "plum sauce");
}

