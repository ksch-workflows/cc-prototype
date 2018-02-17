package io.github.kschworkflows.registration;

import io.github.kschworkflows.NavigationCallback;
import io.github.kschworkflows.PageController;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.java.Log;

import javax.faces.event.ActionEvent;

@Getter
@Setter
@Log
public class RegisterPatientActivity extends PageController
{


    public RegisterPatientActivity()
    {
        super("#{d.registration.RegisterPatientActivity}", "/registration/register-patient-activity.jsp");
    }

    public void onAddPatient(ActionEvent actionEvent)
    {
        log.info("Add patient button clicked.");
    }
}
