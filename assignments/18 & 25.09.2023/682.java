import java.util.Stack;

public class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for (String operation : operations) {
            if (!stack.isEmpty() && operation.equals("C")) {
                stack.pop();
            }
            else if (operation.equals("+") && !stack.isEmpty()) {
                int temp = stack.pop();
                int ans = stack.peek() + temp;
                stack.push(temp);
                stack.push(ans);
            }
            else if (operation.equals("D") && !stack.isEmpty()) {
                stack.push(2 * stack.peek());
            } 
            else {
                stack.push(Integer.parseInt(operation));
            }
        }
        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }
        return sum;
    }
}
