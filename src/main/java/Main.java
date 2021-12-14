import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        StringUtils stringUtils = new StringUtils();
        List<String> stringList = new ArrayList<>();
        stringList.add("one");
        stringList.add("onee");
        stringList.add("three");
        stringList.add("threee");
        stringList.add("threeee");
        System.out.println(stringUtils.getShortestWord(stringList));

        List<Integer> integerList= new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        NumberUtils numberUtils=new NumberUtils();
        System.out.println(numberUtils.getSum(integerList));
        System.out.println(numberUtils.multiplyOddNumber(integerList));
    }
}
