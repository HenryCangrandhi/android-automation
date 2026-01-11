package hooks;

import base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseTest {

    @Before
    public void setUpCucumber() throws Exception {
        setUp(); // panggil BaseTest.setUp()
    }

    @After
    public void tearDownCucumber() {
        tearDown(); // panggil BaseTest.tearDown()
    }
}
