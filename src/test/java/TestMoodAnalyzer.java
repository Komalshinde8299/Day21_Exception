import org.junit.Assert;
import org.junit.Test;

public class TestMoodAnalyzer {
    @Test
    public void givenMsg_when_sadReturnTrue(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String result = moodAnalyzer.analyseMood("I am in sad mood");
        Assert.assertEquals("Sad", result);
    }
}
