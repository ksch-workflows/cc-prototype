package io.github.kschworkflows;

import org.junit.Test;

public class PageControllerTest {

    @Test(expected = ConventionViolationException.class)
    public void should_not_allow_controller_without_default_constructor()
    {
        new ControllerWithoutDefaultConstructor("${d.UnitTest}", "/unit-test.jsp");
    }

    @Test(expected = ConventionViolationException.class)
    public void should_not_allow_controller_with_multiple_constructors()
    {
        new ControllerWithMultipleConstructors();
    }
}

class ControllerWithoutDefaultConstructor extends PageController
{
    public ControllerWithoutDefaultConstructor(String pageRoot, String pageFile)
    {
        super(pageRoot, pageFile);
    }
}

class ControllerWithMultipleConstructors extends PageController
{

    public ControllerWithMultipleConstructors()
    {
        super("${d.UnitTest}", "/unit-test.jsp");
    }

    public ControllerWithMultipleConstructors(String pageRoot, String pageFile) {
        super(pageRoot, pageFile);
    }
}
