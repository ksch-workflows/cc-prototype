package io.github.kschworkflows;

import lombok.Getter;
import org.eclnt.jsfserver.pagebean.PageBean;

import java.io.Serializable;
import java.lang.reflect.Constructor;

@Getter
public abstract class PageController extends PageBean implements Serializable
{
    private final String m_rootExpressionUsedInPage;

    private final String m_pageName;

    /**
     * @param pageRoot e.g. #{d.ExperimentFrame}
     * @param pageFile e.g. /experiment-frame.jsp
     */
    public PageController(String pageRoot, String pageFile)
    {
        checkConstructorConvention();
        // TODO Check page root expression is valid
        // TODO Check page file exists

        m_rootExpressionUsedInPage = pageRoot;
        m_pageName = pageFile;
    }

    private void checkConstructorConvention()
    {
        // TODO Define custom exception for framework convention exception
        Constructor<?>[] constructors = getClass().getConstructors();
        if (constructors.length != 1) {
            throw new RuntimeException("FrameworkConventionViolation. Only the default constructor is allowed for page controllers.");
        }

        if(constructors[0].getParameterCount() != 0) {
            throw new RuntimeException("FrameworkConventionViolation. Only the default constructor is allowed for page controllers.");
        }
    }
}
