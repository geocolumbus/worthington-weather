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
        assertEquals("--------------------------------------------------------------------------------\n" +
                        "THIS AFTERNOON - Sunny, with a high near 45. Southwest wind around 15 mph, with\n" +
                        "gusts as high as 26 mph.\n" +
                        "\n" +
                        "TONIGHT - Mostly clear, with a low around 35. Southwest wind around 9 mph.\n" +
                        "\n" +
                        "SUNDAY - Sunny, with a high near 61. Windy, with a southwest wind 9 to 14 mph\n" +
                        "increasing to 21 to 26 mph in the afternoon. Winds could gust as high as 47 mph.\n" +
                        "\n" +
                        "SUNDAY NIGHT - Showers likely, mainly before 2am. Increasing clouds, with a low\n" +
                        "around 37. Breezy, with a southwest wind 13 to 23 mph becoming northwest after\n" +
                        "midnight. Winds could gust as high as 37 mph. Chance of precipitation is 60%.\n" +
                        "New precipitation amounts of less than a tenth of an inch possible.\n" +
                        "\n" +
                        "MONDAY - Mostly sunny, with a high near 48. Northwest wind around 9 mph becoming\n" +
                        "southwest in the afternoon.\n" +
                        "\n" +
                        "MONDAY NIGHT - Mostly cloudy, with a low around 36.\n" +
                        "--------------------------------------------------------------------------------\n",
                weather.formatDwml(dwml));
    }
}