package io.github.kschworkflows;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.eclnt.workplace.IWorkpageContainer;
import org.eclnt.workplace.WorkpageDispatcher;

/**
 * The purpose of the Dispatcher is to connect the layout files with the page beans.
 * <p>
 * It is proclaimed to the CaptainCasa framework via the "faces-config.xml" file.
 * All packages with page beans need to be added in the "dispatcherinfo.xml" file.
 */
@NoArgsConstructor
public class Dispatcher extends WorkpageDispatcher
{
    /**
     * The expression under which the dispatcher can be reached.
     */
    @Getter
    private final String m_rootExpression = "#d";
}
