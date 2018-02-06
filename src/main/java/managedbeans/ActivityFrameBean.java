package managedbeans;

import java.io.Serializable;
import org.eclnt.editor.annotations.CCGenClass;
import org.eclnt.jsfserver.pagebean.IPageBean;
import org.eclnt.jsfserver.pagebean.PageBean;
import org.eclnt.workplace.IWorkpageDispatcher;
import org.eclnt.workplace.WorkpageDispatchedPageBean;

import javax.faces.event.ActionEvent;

@CCGenClass (expressionBase="#{d.ActivityFrameBean}")

public class ActivityFrameBean
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

    private String m_activityName;

    private IPageBean m_activity = new RegisterPatientActivityBean();

    // ------------------------------------------------------------------------
    // constructors & initialization
    // ------------------------------------------------------------------------

    public ActivityFrameBean(IWorkpageDispatcher workpageDispatcher)
    {
        super(workpageDispatcher);

    }

    public String getPageName() { return "/common/activity-frame.jsp"; }
    public String getRootExpressionUsedInPage() { return "#{d.ActivityFrameBean}"; }

    // ------------------------------------------------------------------------
    // public usage
    // ------------------------------------------------------------------------

    public void setActivityName(String name)
    {
        m_activityName = name;
    }

    public String getActivityName() {
        return m_activityName;
    }

    public void setActivity(IPageBean activity)
    {
        m_activity = activity;
    }

    public IPageBean getActivity() {
        return m_activity;
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
