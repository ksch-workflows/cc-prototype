package io.github.kschworkflows;

public class ConventionViolationException extends RuntimeException
{
    public ConventionViolationException(String errorMessage)
    {
        super(errorMessage);
    }
}
