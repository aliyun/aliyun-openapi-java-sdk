package com.aliyuncs.utils;

import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.List;

public class XmlUtilsTest {

    @Test
    public void testConstructor() {
        new XmlUtils();
    }

    @Test
    public void getDocument() throws ParserConfigurationException, SAXException, IOException {
        Assert.assertEquals(null, XmlUtils.getDocument(null));
        Assert.assertEquals(null, XmlUtils.getDocument(""));

        Document doc = XmlUtils
                .getDocument("<?xml version=\"1.0\"?>" + "<note>" + "<to>George</to>" + "<from>John</from>"
                        + "<heading>Reminder</heading>" + "<body>Don't forget the meeting!</body>" + "</note>");
        Assert.assertNotNull(doc);

        try {
            XmlUtils.getDocument("invalid xml");
        } catch (Exception e) {
            Assert.assertTrue("should be SAXParseException", e instanceof SAXException);
            return;
        }

        Assert.fail("should throw exception");
    }

    @Test
    public void testGetRootElementFromString() throws ParserConfigurationException, SAXException, IOException {
        Assert.assertNull(XmlUtils.getRootElementFromString(null));
        Element elem = XmlUtils
                .getRootElementFromString("<?xml version=\"1.0\"?>" + "<note>" + "<to>George</to>" + "<from>John</from>"
                        + "<heading>Reminder</heading>" + "<body>Don't forget the meeting!</body>" + "</note>");
        Assert.assertNotNull(elem);
    }

    @Test
    public void testGetChildElements() throws ParserConfigurationException, SAXException, IOException {
        Assert.assertNull(XmlUtils.getChildElements(null, null));
        Element elem = XmlUtils.getRootElementFromString("<?xml version=\"1.0\"?>" + "<note>" + "<to>George</to>"
                + "<from>John</from>" + "<heading>Reminder</heading>" + "<body>Don't forget the meeting!</body>"
                + "<n><to>depth to</to></n>" + "<!-- This is a comment -->" + "</note>");
        Assert.assertNotNull(elem);
        List<Element> list = XmlUtils.getChildElements(elem, "to");
        Assert.assertNotNull(list);
        Assert.assertEquals(1, list.size());
        Assert.assertEquals("George", list.get(0).getTextContent());

        // getChildElements(Element parent)
        Assert.assertNull(XmlUtils.getChildElements(null));
        List<Element> list2 = XmlUtils.getChildElements(elem);
        Assert.assertNotNull(list2);
        Assert.assertEquals(5, list2.size());
    }
}