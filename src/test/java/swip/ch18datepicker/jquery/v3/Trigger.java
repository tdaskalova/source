package swip.ch18datepicker.jquery.v3;


import swip.ch18datepicker.framework.Browser;

import java.util.function.Consumer;

import static swip.ch17jquerydatepicker.JQueryById.DATE_FIELD;

public class Trigger implements Consumer<Browser> {

    @Override
    public void accept(Browser browser) {
        browser.click(DATE_FIELD);
    }
}