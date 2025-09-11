// A Sundae is one of:
//  - new Scoop(String flavor)
//  - new Topping(Sundae inner, String name)

// Interpretation:
//   Scoop: a single scoop with a flavor
//   Topping: a topping layered on top of another Sundae

// TEMPLATE for a Sundae:
//   if (s instanceof Scoop)   { ((Scoop) s).flavor; }
//   if (s instanceof Topping) { ((Topping) s).inner; ((Topping) s).name; }

// to represent a Sundae
interface Sundae { }

// DATA DEFINITION: Scoop

// Fields:
//  - flavor : String

// Interpretation: the flavor of this scoop

// Constructor Signature:
//   Scoop(String flavor) -> Scoop

// TEMPLATE:
//   this.flavor
class Scoop implements Sundae {
    String flavor;

    Scoop(String flavor) {
        this.flavor = flavor;
    }
}

// DATA DEFINITION: Topping

// Fields:
//  - inner : Sundae
//  - name  : String

// Interpretation: a topping called `name` placed on top of `inner`

// Constructor Signature:
//   Topping(Sundae inner, String name) -> Topping
// TEMPLATE (inside Topping methods):
//   this.inner   // (apply Sundae template)
//   this.name
class Topping implements Sundae {
    Sundae inner;
    String name;

    Topping(Sundae inner, String name) {
        this.inner = inner;
        this.name = name;
    }
}

// EXAMPLES CLASS
// for illustrating the data definitions
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
