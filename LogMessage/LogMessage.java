public class LogMessage {

    private String machineId;
    private String description;

    public LogMessage(String message) {
        machineId = message.substring(0, message.indexOf(":"));
        description = message.substring(message.indexOf(":") + 1);
    }

    public boolean containsWord(String keyword) {
        String a = " " + description + " ";
        return a.indexOf(" " + keyword + " ") != -1;
    }

    public String getMachineId() {
        return machineId;
    }

    public String getDescription() {
        return description;
    }
}