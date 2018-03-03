package io.github.kschworkflows;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.eclnt.workplace.IWorkpageContainer;
import org.eclnt.workplace.WorkpageDispatcher;

/*
 * The dispatcher is referenced in faces-config.xml. When changing the package
 * of the dispatcher, then also update the faces-config.xml link!
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
