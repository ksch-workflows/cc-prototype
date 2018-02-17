package io.github.kschworkflows;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
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
        m_rootExpressionUsedInPage = pageRoot;
        m_pageName = pageFile;
    }
}
