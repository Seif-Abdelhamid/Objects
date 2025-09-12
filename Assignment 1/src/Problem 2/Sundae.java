// A Sundae is one of:
//  - new Scoop(String flavor)
//  - new Topping(Sundae inner, String name)

// to represent a Sundae
interface Sundae { }

// DATA DEFINITION: Scoop
// Interpretation: a single scoop with a flavor
class Scoop implements Sundae {
  String flavor;

  Scoop(String flavor) {
    this.flavor = flavor;
  }

    /*  TEMPLATE
     Fields:
     ... this.flavor ...          -- String
     */
}

// DATA DEFINITION: Topping
// Interpretation: a topping named `name` placed on top of `inner`
class Topping implements Sundae {
  Sundae inner;
  String name;

  Topping(Sundae inner, String name) {
    this.inner = inner;
    this.name = name;
  }

    /*  TEMPLATE
     Fields:
     ... this.inner ...           -- Sundae
     ... this.name  ...           -- String
     */
}

// EXAMPLES
class ExamplesSundae {
    /*  TEMPLATE
     Fields:
     ... this.choc ...               -- Sundae
     ... this.withSprinkles ...      -- Sundae
     ... this.withCaramel ...        -- Sundae
     ... this.yummy ...              -- Sundae
     ... this.vanilla ...            -- Sundae
     ... this.withChocoSprinkles ... -- Sundae
     ... this.withFudge ...          -- Sundae
     ... this.noThankYou ...         -- Sundae
     */

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
