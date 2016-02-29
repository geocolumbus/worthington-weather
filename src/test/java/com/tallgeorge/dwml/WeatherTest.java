package com.tallgeorge.dwml;

import com.tallgeorge.dwml.schema.Dwml;
import org.junit.Before;
import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;

import static org.junit.Assert.*;

public class WeatherTest {

    private Dwml dwml;
    private Weather weather;

    @Before
    public void setUp() throws Exception {
        File file = new File("src/test/resources/WGS_1984_sample.dwml");
        JAXBContext jaxbContext = JAXBContext.newInstance(Dwml.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        dwml = (Dwml) jaxbUnmarshaller.unmarshal(file);
    }

    @Test
    public void testFormatDwml() throws Exception {
        weather = new Weather();
        assertTrue(weather.formatDwml(dwml).length() > 800);
    }
}