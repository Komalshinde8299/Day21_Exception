import org.junit.Assert;
import org.junit.Test;

public class TestMoodAnalyzer {
    @Test
    public void givenMsg_when_sadReturnTrue(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in sad mood");
        String result = moodAnalyzer.analyseMood();
        Assert.assertEquals("Sad", result);
    }
    @Test
    public void givenMsg_when_notSadReturnTrue(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in happy mood");
        String result = moodAnalyzer.analyseMood();
        Assert.assertEquals("Happy", result);
    }
}
