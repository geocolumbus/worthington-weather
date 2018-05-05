package com.tallgeorge.dwml.schema;

import org.junit.Before;
import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class DwmlTest {

    private Dwml dwml;

    @Before
    public void getDwml() throws Exception {
        File file = new File("src/test/resources/WGS_1984_sample.dwml");
        JAXBContext jaxbContext = JAXBContext.newInstance(Dwml.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        dwml = (Dwml) jaxbUnmarshaller.unmarshal(file);
    }

    @Test
    public void testDWML() throws Exception {
        assertEquals("2018-05-05T15:17:31-04:00", dwml.getHead().getProduct().getCreationDate().getValue().toString());
        assertEquals("Riverlea", dwml.data.get(0).getLocation().get(0).getCity().getValue());
    }
}