package io.github.kschworkflows.registration;

import io.github.kschworkflows.common.ActivityFrame;
import org.junit.Before;
import org.junit.Test;

import javax.faces.event.ActionEvent;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class ActivityDashboardTest
{
    private RegistrationApp registrationApp;

    @Before
    public void setup()
    {
        registrationApp = new RegistrationApp();
    }

    @Test
    public void should_open_patient_registration()
    {
        // GIVEN
        ActivityDashboard activityDashboard = new ActivityDashboard();
        activityDashboard.setAppFrame(registrationApp);

        // WHEN
        activityDashboard.onRegisterPatientClicked(mock(ActionEvent.class));

        // THEN
        assertEquals("The activity frame was not displayed.",
                ActivityFrame.class, registrationApp.getCurrentPage().getClass());
        ActivityFrame activityFrame = (ActivityFrame) registrationApp.getCurrentPage();
        assertEquals("Patient registration page was not opened.",
                "/registration/register-patient-activity.jsp", activityFrame.getActivity().getPageName());
    }

}
