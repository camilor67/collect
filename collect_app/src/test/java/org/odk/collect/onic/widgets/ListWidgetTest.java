package org.odk.collect.onic.widgets;

import android.support.annotation.NonNull;

import org.odk.collect.onic.widgets.base.GeneralSelectOneWidgetTest;
import org.robolectric.RuntimeEnvironment;

/**
 * @author James Knight
 */

public class ListWidgetTest extends GeneralSelectOneWidgetTest<ListWidget> {
    @NonNull
    @Override
    public ListWidget createWidget() {
        return new ListWidget(RuntimeEnvironment.application, formEntryPrompt, false, false);
    }
}
