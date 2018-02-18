package io.github.kschworkflows.registration;

import io.github.kschworkflows.PageController;
import io.github.kschworkflows.common.ActivityFrame;
import lombok.Setter;

import javax.faces.event.ActionEvent;

@Setter
public class ActivityDashboard extends PageController
{
    private RegistrationApp m_appFrame;

    public ActivityDashboard()
    {
        super("#{d.ActivityDashboard}", "/registration/activity-dashboard.jsp");
    }

    public void onRegisterPatientClicked(ActionEvent actionEvent)
    {
        ActivityFrame activityFrame = new ActivityFrame();

        activityFrame.setActivityName("Register patient");
        activityFrame.setActivity(new RegisterPatientActivity());
        activityFrame.setDisplayPreviousPage(() -> m_appFrame.displayActivityDashboard());

        m_appFrame.setCurrentPage(activityFrame);
    }
}
