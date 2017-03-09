package src;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by admin on 3/1/17.
 */
public class DataProviderEx {
    @DataProvider(name = "remoteServiceDP")
    public Iterator<Object[]> remoteServiceDataProvider()
    {
        Collection<Object[]> dp = new ArrayList<Object[]>()
        {
            {
                add(new Object[] {"http://10.60.1.30/am", true});
                add(new Object[] {"http://10.60.1.30:80/am", true});
                add(new Object[] {"http://10.60.1.30:-1/am", false});
                add(new Object[] {"http://10.60.1.30:80:80/am", false});
            }
        };

        return dp.iterator();
    }

    @Test(dataProvider = "remoteServiceDP")
    public void remoteServiceWithURI(String uri, Usver expected)
    {
        System.out.println("uri = [" + uri + "], expected = [" + expected + "]");
    }

    @DataProvider(name = "chooseMyMealPlannerDataProvider")
    public Object[][] createChooseMyMealPlannerData() {
        return new Object[][] {
                { "Active Lifestyle", "1700"},
                { "Balanced Slim Down", "1300"},
                { "Low-Carb Express", "2400"},
                { "Power Vegetarian", "2100"},
        };
    }
}
