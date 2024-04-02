package customexception;

public class EntranceExamFailException extends Exception{
    @Override
    public String getMessage() {
        return "you failed the entrance exam";
    }
}
