package io.github.kschworkflows;

import lombok.SneakyThrows;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.faces.context.FacesContext;
import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.File;
import java.io.IOException;


public class TestUtils
{
    @SneakyThrows
    public static File getResourceAsFile(String resourcePath)
    {
        return new File(ClassLoader.getSystemResource(resourcePath).toURI());
    }

    @SneakyThrows
    public static String getStringFromXmlFile(File file, String xPath)
    {
        return (String) evaluateXPathExpression(file, xPath, XPathConstants.STRING);
    }

    @SneakyThrows
    public static boolean existsInXmlFile(File file, String xPath)
    {
        NodeList result = (NodeList) evaluateXPathExpression(file, xPath, XPathConstants.NODESET);
        return result.getLength() == 1;
    }

    private static Object evaluateXPathExpression(File file, String xpath, QName returnType) throws
            ParserConfigurationException, IOException, SAXException, XPathExpressionException
    {
        // https://stackoverflow.com/a/2811101/2339010
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(file);
        XPathFactory xPathfactory = XPathFactory.newInstance();
        XPath x = xPathfactory.newXPath();
        XPathExpression expr = x.compile(xpath);

        return expr.evaluate(doc, returnType);
    }
}
