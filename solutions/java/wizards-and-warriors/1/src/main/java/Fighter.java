class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

// TODO: define the Warrior class

class Warrior extends Fighter {

    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    public boolean isVulnerable() {
        return false;
    }

    @Override
    public int getDamagePoints(Fighter target) {
        if (target.isVulnerable()) {
            return 10;
        } else {
            return 6;
        }
    }
}

// TODO: define the Wizard class
class Wizard extends Fighter {
    boolean spellPrepared = false;

    public String toString() {
        return "Fighter is a Wizard";
    }

    public void prepareSpell() {
        spellPrepared = true;

    }

    @Override
    public boolean isVulnerable() {
        if (spellPrepared) {
            return false;
        }
        return true;
    }

    @Override
    public int getDamagePoints(Fighter target) {
        if (spellPrepared) {
            spellPrepared = false;
            return 12;
        } else {
            return 3;
        }
    }
}
