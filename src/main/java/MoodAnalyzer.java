

public class MoodAnalyzer {
    private String message;


    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyseMood(){
        String msg = message.toLowerCase();
        msg=msg.toLowerCase();

        if(msg.contains("happy")){
            return "Happy";
        } else if (msg.contains("sad")) {
            return "Sad";
        } else {
            return "Not Valid";
        }
    }

//    public static void main(String[] args) {
//        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
//        moodAnalyzer.analyseMood("I am Happy");
//
//    }

}
