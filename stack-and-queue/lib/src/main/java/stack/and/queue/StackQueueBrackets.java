package stack.and.queue;

public class StackQueueBrackets {


    public boolean validateBrackets(String bracket){
        char[] stringArr=bracket.toCharArray();
        Stack<Character> validatorStack=new Stack<>();
        for (char el : stringArr) {
            if (el == '{' || el == '[' || el == '(') {
                validatorStack.push(el);
            } else if (el == '}' || el == ']' || el == ')') {
                if (validatorStack.isEmpty()) {
                    return false;
                } else if (el == '}' && validatorStack.peek() != '{') {
                    return false;
                } else if (el == ']' && validatorStack.peek() != '[') {
                    return false;
                } else if (el == ')' && validatorStack.peek() != '(') {
                    return false;
                } else {
                    validatorStack.pop();
                }
            }
        }
        System.out.println("-------------------------------");
        return validatorStack.isEmpty();
    }
}
