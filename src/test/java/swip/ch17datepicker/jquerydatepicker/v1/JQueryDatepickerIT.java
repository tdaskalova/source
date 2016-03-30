package swip.ch17datepicker.jquerydatepicker.v1;


import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import swip.ch15pageflow.v2.framework.Browser;
import swip.ch15pageflow.v2.framework.BrowserRunner;
import swip.framework.TestTimer;

import javax.inject.Inject;

import static java.time.Month.APRIL;
import static org.junit.Assert.assertEquals;

@RunWith(BrowserRunner.class)
public class JQueryDatepickerIT extends TestTimer {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();
    @Inject
    private Browser browser;

    private JQueryDatepicker jQueryDatepicker;

    @Before
    public void setup() {
        browser.get("/datepicker.html");
        jQueryDatepicker = new JQueryDatepicker(browser);
    }

    @Test
    public void muchBetterDatePicker() {
        jQueryDatepicker.pick(APRIL, 1, 2014);
        assertEquals("04/01/2014", jQueryDatepicker.getDate());
    }
}