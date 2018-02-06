package managedbeans;

import org.eclnt.editor.annotations.CCGenClass;
import org.eclnt.jsfserver.pagebean.IPageBean;
import org.eclnt.workplace.IWorkpageDispatcher;
import org.eclnt.workplace.WorkpageDispatchedPageBean;

import javax.faces.event.ActionEvent;
import java.io.Serializable;

@CCGenClass (expressionBase="#{d.ApplicationFrameBean}")

public class ApplicationFrameBean
    extends WorkpageDispatchedPageBean
    implements Serializable
{
    // ------------------------------------------------------------------------
    // inner classes
    // ------------------------------------------------------------------------
    
    /* Listener to the user of the page bean. */
    public interface IListener
    {
    }
    
    // ------------------------------------------------------------------------
    // members
    // ------------------------------------------------------------------------
    
    private IListener m_listener;
    
    private IPageBean m_currentPage;
    
    // ------------------------------------------------------------------------
    // constructors & initialization
    // ------------------------------------------------------------------------

    public ApplicationFrameBean(IWorkpageDispatcher dispatcher)
    {
        super(dispatcher);
        m_currentPage = new ActivityDashboardBean(dispatcher);
    }

    public String getPageName()
    {
        return "/common/application-frame.jsp";
    }
    
    public String getRootExpressionUsedInPage()
    {
        return "#{d.ApplicationFrameBean}";
    }

    // ------------------------------------------------------------------------
    // public usage
    // ------------------------------------------------------------------------

    public void onStartActivity(ActionEvent actionEvent)
    {
        String actionKey = (String) actionEvent.getComponent().getAttributes().get("clientname");

        System.out.println(actionKey);

        if ("register-patient".equals(actionKey)) {
            ActivityFrameBean activityFrameBean = new ActivityFrameBean(getOwningDispatcher());
            activityFrameBean.setActivityName("Register patient");
            activityFrameBean.setActivity(new RegisterPatientActivityBean());
            m_currentPage = activityFrameBean;
        } else if ("receive-payment".equals(actionKey)) {

        } else {
            System.out.println("ERROR: Cannot handle action key: " + actionKey);
        }
//
//        System.out.println(actionEvent.getComponent().getId());
//        System.out.println(actionEvent.getPhaseId());
//        actionEvent.getComponent().getAttributes().keySet().stream().forEach(s -> System.out.println(s));
//        System.out.println(actionEvent.getComponent().getId());
//        System.out.println();
    }

    /**
     * @return the page which is currently displayed in the main frame of the application.
     */
    public IPageBean getCurrentPage() {
    		return m_currentPage;
    }
    
    /* Initialization of the bean. Add any parameter that is required within your scenario. */
    public void prepare(IListener listener)
    {
        m_listener = listener;
    }

    // ------------------------------------------------------------------------
    // private usage
    // ------------------------------------------------------------------------
}
