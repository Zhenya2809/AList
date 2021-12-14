import java.util.List;

public class StringUtils {
    public String getShortestWord(List<String> list) {
        var shortestWord = list.get(0);
        for (String s : list) {
            if (shortestWord.length() > s.length()) {
                shortestWord = s;
            }
        }
        return shortestWord;
    }
}
