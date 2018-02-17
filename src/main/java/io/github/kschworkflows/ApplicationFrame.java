package io.github.kschworkflows;

import io.github.kschworkflows.common.ActivityDashboard;
import io.github.kschworkflows.common.ActivityFrame;
import io.github.kschworkflows.registration.RegisterPatientActivity;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.java.Log;
import org.eclnt.jsfserver.pagebean.IPageBean;

import javax.faces.event.ActionEvent;

@Getter
@Setter
@Log
public class ApplicationFrame extends PageController
{
    /**
     * the page which is currently displayed in the main frame of the application.
     */
    private IPageBean m_currentPage;
    
    public ApplicationFrame()
    {
        super("#{d.ApplicationFrame}", "/common/application-frame.jsp");

        m_currentPage = new ActivityDashboard();
    }

    public void onStartActivity(ActionEvent actionEvent)
    {
        String actionKey = (String) actionEvent.getComponent().getAttributes().get("clientname");

        log.info("Following action was performed: " + actionKey);

        if ("register-patient".equals(actionKey)) {
            ActivityFrame activityFrame = new ActivityFrame();
            activityFrame.setActivityName("Register patient");
            activityFrame.setActivity(new RegisterPatientActivity());
            m_currentPage = activityFrame;
        } else {
            log.severe("Cannot handle action key: " + actionKey);
        }
    }
}
