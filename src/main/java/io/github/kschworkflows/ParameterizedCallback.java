package io.github.kschworkflows;

@FunctionalInterface
public interface ParameterizedCallback<T>
{
    void execute(T parameter);
}
