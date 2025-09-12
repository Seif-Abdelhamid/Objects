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
