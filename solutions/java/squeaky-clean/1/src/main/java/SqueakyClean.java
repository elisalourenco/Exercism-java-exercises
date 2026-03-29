class SqueakyClean {
    static String clean(String identifier) {
        String newword;
        // remove spaces
        newword = identifier.replace(" ", "_");
        // kebab-case to camelCase
        newword = tocamelCase(newword);
        // Convert leetspeak
        newword = toLeetspeak(newword);
        // Remove invalid characters
        newword = newword.replaceAll("[^a-zA-Z0-9_]", "");

        return newword;
    }

    public static String toLeetspeak(String input) {
        return input
                .replace("a", "4")
                .replace("e", "3")
                .replace("o", "0")
                .replace("l", "1")
                .replace("t", "7");
    }

    public static String tocamelCase(String input) {
        String[] parts = input.split("-");
        StringBuilder result = new StringBuilder(parts[0]);
        for (int i = 1; i < parts.length; i++) {
            result.append(parts[i].substring(0, 1).toUpperCase()).append(parts[i].substring(1));
        }
        return result.toString();
    }
}
