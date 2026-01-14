class ReverseString {

    String reverse(String inputString) {
        String reversed_string = "";

        for (int i = inputString.length() - 1; i >= 0; i--) {
            reversed_string += inputString.charAt(i);
        }
        return reversed_string;
    }

}
