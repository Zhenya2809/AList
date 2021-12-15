import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    @Test
    void testShortestWord() {
        StringUtils stringUtils = new StringUtils();
        List<String> stringList = new ArrayList<>();
        stringList.add("one");
        stringList.add("onee");
        stringList.add("three");
        stringList.add("threee");
        stringList.add("threeee");
        Assertions.assertEquals(stringUtils.getShortestWord(stringList), "one");
    }

    @Test
    void testSum() {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        NumberUtils numberUtils = new NumberUtils();
        Assertions.assertEquals(numberUtils.getSum(integerList), 15);
    }

    @Test
    void testmultiplyOddNumber() {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(1);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        NumberUtils numberUtils = new NumberUtils();
        List<Integer> testList = new ArrayList<>();
        testList.add(2);
        testList.add(2);
        testList.add(6);
        testList.add(10);
        Assertions.assertEquals(numberUtils.multiplyOddNumber(integerList), testList);

    }
}
