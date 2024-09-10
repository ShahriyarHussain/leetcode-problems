package easy;

import java.util.LinkedList;
import java.util.List;

public class Problem_412 {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new LinkedList<>();
        for (int index = 1; index <= n; index++) {
            if (index % 3 == 0 && index % 5 == 0) {
                answer.add("FizzBuzz");
                continue;
            }
            if (index % 3 == 0) {
                answer.add("Fizz");
                continue;
            }
            if (index % 5 == 0) {
                answer.add("Buzz");
                continue;
            }
            answer.add(String.valueOf(index));
        }
        return answer;
    }

}
