package io.github.kschworkflows.registration;

import io.github.kschworkflows.PageController;
import io.github.kschworkflows.common.Header;
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
        ActivityDashboard activityDashboard = new ActivityDashboard();
        activityDashboard.setAppFrame(this);

        m_currentPage = activityDashboard;
    }
}
