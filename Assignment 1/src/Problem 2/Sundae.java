// A Sundae is one of:
//  - new Scoop(String flavor)
//  - new Topping(Sundae inner, String name)

// to represent a Sundae
interface ISundae { }

// DATA DEFINITION: Scoop
// Interpretation: a single scoop with a flavor
class Scoop implements ISundae {
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
class Topping implements ISundae {
  ISundae inner;
  String name;

  Topping(ISundae inner, String name) {
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
  ISundae choc = new Scoop("chocolate");
  ISundae withSprinkles = new Topping(choc, "rainbow sprinkles");
  ISundae withCaramel = new Topping(withSprinkles, "caramel");
  ISundae yummy = new Topping(withCaramel, "whipped cream");

  // build noThankYou
  ISundae vanilla = new Scoop("vanilla");
  ISundae withChocoSprinkles = new Topping(vanilla, "chocolate sprinkles");
  ISundae withFudge = new Topping(withChocoSprinkles, "fudge");
  ISundae noThankYou = new Topping(withFudge, "plum sauce");
