package io.github.kschworkflows.common;

import io.github.kschworkflows.PageController;
import io.github.kschworkflows.registration.RegisterPatientActivity;
import lombok.Getter;
import lombok.Setter;
import org.eclnt.jsfserver.pagebean.IPageBean;

@Getter
@Setter
public class ActivityFrame extends PageController
{
    private String m_activityName;

    private IPageBean m_activity = new RegisterPatientActivity();

    public ActivityFrame()
    {
        super("#{d.common.ActivityFrame}", "/common/activity-frame.jsp");
    }
}
