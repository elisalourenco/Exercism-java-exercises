class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        if (operation == null) {
            throw new IllegalArgumentException("Operation cannot be null");
        } else if (operation == "") {
            throw new IllegalArgumentException("Operation cannot be empty");
        } else if (operation != "+" && operation != "*" && operation != "/") {
            throw new IllegalOperationException("Operation " + operation + " does not exist");
        }

        if (operation.equals("+")) {
            return operand1 + " " + operation + " " + operand2 + " = " + Integer.toString(operand1 + operand2);
        } else if (operation.equals("*")) {
            return operand1 + " " + operation + " " + operand2 + " = " + Integer.toString(operand1 * operand2);
        } else if (operation.equals("/")) {
            if (operand2 == 0) {
                throw new IllegalOperationException("Division by zero is not allowed");
            }
            return operand1 + " " + operation + " " + operand2 + " = " + Integer.toString(operand1 / operand2);
        } else {
            throw new IllegalArgumentException("Something went wrong");
        }
    }
}