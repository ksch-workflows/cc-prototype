package org.eclnt.jsfserver.managedbean;

public class HotDeployManagerConfig
{
    public static void enableUnitTesting()
    {
        HotDeployManager.s_hotDeploymentIsActive = true;
        HotDeployManager.s_createNewHotDeplayManagerInstance = true;
    }
}
