package managedbeans;

import java.io.Serializable;
import java.util.Optional;

import org.eclnt.editor.annotations.CCGenClass;
import org.eclnt.jsfserver.pagebean.PageBean;
import org.eclnt.workplace.IWorkpageDispatcher;
import org.eclnt.workplace.WorkpageDispatchedPageBean;

import javax.faces.event.ActionEvent;

@CCGenClass (expressionBase="#{d.ActivityDashboardBean}")

public class ActivityDashboardBean
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
    
    // ------------------------------------------------------------------------
    // constructors & initialization
    // ------------------------------------------------------------------------

    public ActivityDashboardBean(IWorkpageDispatcher dispatcher)
    {
        super(dispatcher);
    }

    public String getPageName() { return "/registration/activity-dashboard.jsp"; }
    public String getRootExpressionUsedInPage() { return "#{d.ActivityDashboardBean}"; }

    // ------------------------------------------------------------------------
    // public usage
    // ------------------------------------------------------------------------

    /* Initialization of the bean. Add any parameter that is required within your scenario. */
    public void prepare(IListener listener)
    {
        m_listener = listener;
    }

    // ------------------------------------------------------------------------
    // private usage
    // ------------------------------------------------------------------------
}
