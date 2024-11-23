package pages;

import org.testng.annotations.Test;

public class RechargeTest extends BaseTest{

    @Test(priority = 2)
    public void testRecharge(){
        RechargePage rechargePage = new RechargePage(driver);

        rechargePage.recharge("01687663220", "100");
    }
}
