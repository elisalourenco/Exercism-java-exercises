class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        if (operation == null || operation.isEmpty() || operation == "") {
            throw new IllegalArgumentException("Operation cannot be null");
        } else if (operation != "+" && operation != "-" && operation != "*" && operation != "/") {
            throw new IllegalArgumentException("Operation " + operation + " does not exist");
        }

        if (operation.equals("add")) {
            return operand1 + " " + operation + " " + operand2 + " = " + Integer.toString(operand1 + operand2);
        } else if (operation.equals("subtract")) {
            return operand1 + " " + operation + " " + operand2 + " = " + Integer.toString(operand1 - operand2);
        } else if (operation.equals("multiply")) {
            return operand1 + " " + operation + " " + operand2 + " = " + Integer.toString(operand1 * operand2);
        } else if (operation.equals("divide")) {
            if (operand2 == 0) {
                throw new IllegalArgumentException("Division by zero is not allowed");
            }
            return operand1 + " " + operation + " " + operand2 + " = " + Integer.toString(operand1 / operand2);
        } else {
            throw new IllegalArgumentException("Something went wrong");
        }
    }
}