public class GameMaster {

    // TODO: define a 'describe' method that returns a description of a Character
    public String describe(Character character) {
        // "You're a level <LEVEL> <CLASS> with <HIT_POINTS> hit points.".
        return "You're a level " + character.getLevel() + " " + character.getCharacterClass() + " with "
                + character.getHitPoints() + " hit points.";
    }

    // TODO: define a 'describe' method that returns a description of a Destination
    public String describe(Destination destination) {
        // "You've arrived at <NAME>, which has <INHABITANTS> inhabitants."
        return "You've arrived at " + destination.getName() + ", which has " + destination.getInhabitants()
                + " inhabitants.";
    }

    // TODO: define a 'describe' method that returns a description of a TravelMethod
    public String describe(TravelMethod travelMethod) {
        // Walking, described as: "You're traveling to your destination by walking."
        // On horseback, described as: "You're traveling to your destination on
        // horseback."
        if (travelMethod == TravelMethod.WALKING) {
            return "You're traveling to your destination by walking.";
        } else if (travelMethod == TravelMethod.HORSEBACK) {
            return "You're traveling to your destination on horseback.";
        }
        return "";
    }

    // TODO: define a 'describe' method that returns a description of a Character,
    // Destination and TravelMethod
    public String describe(Character character, Destination destination, TravelMethod travelMethod) {
        // => "You're a level 4 Wizard with 28 hit points.
        // You're traveling to your destination on horseback. You've arrived at Muros,
        // which has 732 inhabitants."

        return describe(character) + " " + describe(travelMethod) + " " + describe(destination);
    }

    // TODO: define a 'describe' method that returns a description of a Character
    // and Destination
    public String describe(Character character, Destination destination) {
        // => "You're a level 4 Wizard with 28 hit points. You're traveling to your
        // destination by walking.
        // You've arrived at Muros, which has 732 inhabitants."

        return describe(character) + " " + describe(TravelMethod.WALKING) + " " + describe(destination);
    }
}
