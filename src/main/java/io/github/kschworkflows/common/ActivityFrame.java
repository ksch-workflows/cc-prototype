package io.github.kschworkflows.common;

import io.github.kschworkflows.Callback;
import io.github.kschworkflows.PageController;
import lombok.Getter;
import lombok.Setter;
import org.eclnt.jsfserver.pagebean.IPageBean;

import javax.faces.event.ActionEvent;

@Getter
@Setter
public class ActivityFrame extends PageController
{
    private String m_activityName;

    private IPageBean m_activity;

    private Callback m_displayPreviousPage;

    public ActivityFrame()
    {
        super("#{d.common.ActivityFrame}", "/common/activity-frame.jsp");
    }

    public void onBackButtonClicked(ActionEvent actionEvent)
    {
        // TODO How to make sure that this cannot be null?
        m_displayPreviousPage.execute();
    }
}
