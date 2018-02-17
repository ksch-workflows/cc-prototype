package io.github.kschworkflows;

import io.github.kschworkflows.common.Header;
import io.github.kschworkflows.registration.ActivityDashboard;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.java.Log;
import org.eclnt.jsfserver.pagebean.IPageBean;

@Getter
@Setter
@Log
public class RegistrationApp extends PageController
{
    private IPageBean m_header;

    private IPageBean m_currentPage;

    public RegistrationApp()
    {
        super("#{d.RegistrationApp}", "/registration/app.jsp");

        Header header = new Header();
        header.setDisplayHomePage(() -> displayActivityDashboard());
        m_header = header;

        displayActivityDashboard();
    }

    public void displayActivityDashboard()
    {
        ActivityDashboard activityDashboard = new ActivityDashboard(this);

        m_currentPage = activityDashboard;
    }
}
