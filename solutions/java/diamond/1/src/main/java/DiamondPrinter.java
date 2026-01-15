import java.util.ArrayList;
import java.util.List;

class DiamondPrinter {

    List<String> printToList(char a) {
        int distance = a - 'A';
        int size = 2 * distance + 1;
        int middle = size / 2;

        List<String> result = new ArrayList<>();

        for (int row = 0; row < size; row++) {
            int rowDistance = Math.abs(row - middle);
            int letterIndex = distance - rowDistance;
            char letter = (char) ('A' + letterIndex);

            int leadingSpaces = rowDistance;
            StringBuilder line = new StringBuilder();

            line.append("·".repeat(leadingSpaces));

            if (letter == 'A') {
                line.append(letter);
            } else {
                int innerSpaces = 2 * letterIndex - 1;
                line.append(letter);
                line.append("·".repeat(innerSpaces));
                line.append(letter);
            }

            line.append("·".repeat(leadingSpaces));

            result.add(line.toString());
        }

        return result;
    }

}
