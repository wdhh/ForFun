import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Created by User on 23.12.2016.
 */
public class Listeners {
    public static void main(String[] args){
        Result result = JUnitCore.runClasses(Google.class);
        System.out.println("Tutorial" + result.getRunCount());
        System.out.println("Tutorial" + result.getFailureCount());

        for (Failure failure : result.getFailures())

        {System.out.println(failure.getMessage());
        }
         System.out.println(result.wasSuccessful());

    }

}
