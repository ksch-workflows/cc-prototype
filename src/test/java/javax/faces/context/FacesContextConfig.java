package javax.faces.context;

import javax.servlet.http.HttpSession;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FacesContextConfig
{
    public static void enableUnitTesting()
    {
        FacesContext.setCurrentInstance(getFacesContextMock());
    }

    private static FacesContext getFacesContextMock()
    {
        FacesContext facesContext = mock(FacesContext.class);
        ExternalContext externalContext = getExternalContentMock();
        // Every time a mock returns a mock a fairy dies.
        when(facesContext.getExternalContext()).thenReturn(externalContext);
        return facesContext;
    }

    private static ExternalContext getExternalContentMock()
    {
        ExternalContext externalContext = mock(ExternalContext.class);
        // Every time a mock returns a mock a fairy dies.
        when(externalContext.getSession(true)).thenReturn(mock(HttpSession.class));
        return externalContext;
    }
}
