

public class MoodAnalyzer {

    public String analyseMood(String msg){
        msg=msg.toLowerCase();

        if(msg.contains("happy")){
            return "Happy";
        } else if (msg.contains("sad")) {
            return "Sad";

        }else {
            return "Not Valid";
        }
    }

//    public static void main(String[] args) {
//        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
//        moodAnalyzer.analyseMood("I am Happy");
//
//    }

}
