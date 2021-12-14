import java.util.ArrayList;
import java.util.List;

public class NumberUtils {
    public int getSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum;
    }

    public List<Integer> multiplyOddNumber(List numbers) {
        List<Integer> resul = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i = i + 2) {

            resul.add((Integer) numbers.get(i) * 2);
        }
        return resul;
    }
}
