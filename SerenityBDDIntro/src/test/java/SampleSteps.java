import net.serenitybdd.annotations.Step;
import org.junit.Assert;


public class SampleSteps {

    private int result;

    @Step
    public void performSomeAction(int num1, int num2) {
        // Implement your test steps here
        this.result = num1 + num2;
    }

    @Step
    public void verifyResult() {
        // Implement assertions or verifications here
        Assert.assertEquals("Result should be 11", 11, result);
    }
}