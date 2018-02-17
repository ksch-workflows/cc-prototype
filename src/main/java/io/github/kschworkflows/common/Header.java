package io.github.kschworkflows.common;

import io.github.kschworkflows.Callback;
import io.github.kschworkflows.PageController;
import lombok.Getter;
import lombok.Setter;

import javax.faces.event.ActionEvent;

@Getter
@Setter
public class Header extends PageController
{
    @Setter
    private Callback m_displayHomePage;

    public Header()
    {
        super("#{d.common.Header}", "/common/header.jsp");
    }

    public void onHomeButtonClicked(ActionEvent actionEvent)
    {
        m_displayHomePage.execute();
    }

    public void onLogoutButtonClicked(ActionEvent actionEvent)
    {
        throw new UnsupportedOperationException("Logout not implemented yet.");
    }
}
