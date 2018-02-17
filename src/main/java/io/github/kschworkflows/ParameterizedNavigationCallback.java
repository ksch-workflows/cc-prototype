package io.github.kschworkflows;

@FunctionalInterface
public interface ParameterizedNavigationCallback<T>
{
    void execute(T parameter);
}
