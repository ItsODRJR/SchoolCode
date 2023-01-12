import java.util.List;
import java.util.ArrayList;

public class SystemLog {

    private List<LogMessage> messageList;

    public List<LogMessage> removeMessages(String keyword) {
        ArrayList<LogMessage> removed = new ArrayList<LogMessage>();

        for (int i = 0; i < messageList.size(); i++) {
            if (messageList.get(i).containsWord(keyword)) {
                removed.add(messageList.remove(i));
                i--;
            }
        }

        return removed;
    }

}