import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;
    public Filter(int treshold) {
        this.treshold = treshold;
    }
    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        for (Integer element : source) {
            if (element>= treshold) {
                logger.log("Элемент " + element + " подходит");
                result.add(element);
            } else {
                logger.log("Элемент " + element + " не подходит");
            }
        }
        logger.log("Прошло фильтр " + result.size() + " элементов из " + source.size());
        return result;
    }
}