package io.github.kschworkflows.registration;

import io.github.kschworkflows.PageController;
import io.github.kschworkflows.RegistrationApp;
import io.github.kschworkflows.common.ActivityFrame;

import javax.faces.event.ActionEvent;

public class ActivityDashboard extends PageController
{
    private final RegistrationApp m_appFrame;

    public ActivityDashboard(RegistrationApp appFrame)
    {
        super("#{d.registration.ActivityDashboard}", "/registration/activity-dashboard.jsp");

        m_appFrame = appFrame;
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
