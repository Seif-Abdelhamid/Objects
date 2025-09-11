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
    // a "chocolate" scoop topped by "rainbow sprinkles" topped by "caramel" topped by "whipped cream"
    Sundae yummy = new Topping(new Topping(new Topping(new Scoop("chocolate"), "rainbow sprinkles"), "caramel"), "whipped cream");

    // a "vanilla" scoop topped by "chocolate sprinkles" topped by "fudge" topped by "plum sauce"
    Sundae noThankYou = new Topping(new Topping(new Topping(new Scoop("vanilla"), "chocolate sprinkles"), "fudge"), "plum sauce");

}
