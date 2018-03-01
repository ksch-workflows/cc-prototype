package io.github.kschworkflows;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.eclnt.jsfserver.pagebean.PageBean;

import java.io.Serializable;
import java.lang.reflect.Constructor;


@Log
public abstract class PageController extends PageBean implements Serializable
{
    @Getter
    private final String m_rootExpressionUsedInPage;

    @Getter
    private final String m_pageName;

    /**
     * @param pageRoot e.g. #{d.ExperimentFrame}
     * @param pageFile e.g. /experiment-frame.jsp
     */
    public PageController(String pageRoot, String pageFile)
    {
        checkConstructorConvention();

        m_rootExpressionUsedInPage = pageRoot;
        m_pageName = pageFile;
    }

    private void checkConstructorConvention()
    {
        String errorMessage = "Only the default constructor is allowed for page controllers.";

        Constructor<?>[] constructors = getClass().getConstructors();
        if (constructors.length != 1) {
            log.severe(errorMessage);
            throw new ConventionViolationException(errorMessage);
        }

        if(constructors[0].getParameterCount() != 0) {
            log.severe(errorMessage);
            throw new ConventionViolationException(errorMessage);
        }
    }
}
