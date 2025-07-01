package constant;

public class Message {

    // private constructor
    private Message() {

    }

    // Message
    public static final String PROMPT_MONEY = "Money: ";
    public static final String PROMPT_CONTENT = "Content: ";
    public static final String PROMPT_ID = "ID: ";
    
    
    public static final String ERROR_INVALID_ID = "Invalid id";
    public static final String ERROR_CHOICE_LIMIT_IN_RANGE = "Please choice 1 -> 4";
    public static final String ERROR_INVALID_MONEY = "Please input double number > 0";
    public static final String ERROR_INVALID_STRING = "Input cannot be empty";

    public static final String HEADER_LIST_EXPENSES = String.format("%-5s%-13s%-8s%-15s\n", "ID", "DATE", "MONEY",
            "CONTENT");
}
