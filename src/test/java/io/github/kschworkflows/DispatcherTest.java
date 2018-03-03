package io.github.kschworkflows;

import com.google.common.reflect.ClassPath;
import lombok.SneakyThrows;
import org.eclnt.jsfserver.managedbean.HotDeployManagerConfig;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.faces.context.FacesContextConfig;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static io.github.kschworkflows.TestUtils.existsInXmlFile;
import static io.github.kschworkflows.TestUtils.getResourceAsFile;
import static io.github.kschworkflows.TestUtils.getStringFromXmlFile;

public class DispatcherTest {

    @BeforeClass
    public static void prepareEnvironment()
    {
        FacesContextConfig.enableUnitTesting();
        HotDeployManagerConfig.enableUnitTesting();
    }

    @Test
    public void should_provide_default_root_expression()
    {
        Assert.assertEquals("Dispatcher doesn't provide the root expression used in all page beans.",
                "#d", new Dispatcher().getRootExpression());
    }

    @Test
    @SneakyThrows
    public void should_register_dispatcher()
    {
        File facesConfig = getResourceAsFile("WEB-INF/faces-config.xml");
        String managedBeanClass = getStringFromXmlFile(facesConfig, "//managed-bean-class/text()");

        Assert.assertEquals("Dispatcher class isn't registered in 'faces-config.xml'.",
                Dispatcher.class.getName(), managedBeanClass);
    }

    @Test
    @SneakyThrows
    public void should_register_all_page_controller_packages()
    {
        File dispatcherInfo = getResourceAsFile("io/github/kschworkflows/dispatcherinfo.xml");

        String rootPackage = Dispatcher.class.getPackage().getName();

        for (String packageName : getAllSubPackages(rootPackage)) {
            Assert.assertTrue(String.format("Cannot find package '%s' in 'dispatcherinfo.xml'.", packageName),
                    existsInXmlFile(dispatcherInfo, String.format("//managedpackage[@name='%s']", packageName)));
        }
    }

    private List<String> getAllSubPackages(String rootPackageName) throws IOException {
        ClassLoader cl = getClass().getClassLoader();
        Set<ClassPath.ClassInfo> classesInPackage = ClassPath.from(cl).getTopLevelClassesRecursive(rootPackageName);

        return classesInPackage.stream()
                .map(c -> c.getPackageName())
                .distinct()
                .filter(p -> !p.equals(rootPackageName))
                .collect(Collectors.toList());
    }
}
