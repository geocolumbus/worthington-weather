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
        String expected = "\n" +
                "\u001B[32mTONIGHT\u001B[0m Cloudy, with a low around 55. Southeast wind around 6 mph.\n" +
                "\n" +
                "\u001B[32mSUNDAY\u001B[0m A slight chance of showers after 3pm. Partly sunny, with a high\n" +
                "near 75. Northwest wind 6 to 8 mph. Chance of precipitation is 20%.\n" +
                "\n" +
                "\u001B[32mSUNDAY NIGHT\u001B[0m A chance of showers before 9pm, then a chance of showers\n" +
                "and thunderstorms between 9pm and midnight, then a chance of showers after\n" +
                "midnight. Mostly cloudy, with a low around 49. North wind around 9 mph. Chance\n" +
                "of precipitation is 50%. New precipitation amounts between a tenth and quarter\n" +
                "of an inch, except higher amounts possible in thunderstorms.\n" +
                "\n" +
                "\u001B[32mMONDAY\u001B[0m A slight chance of showers before noon. Partly sunny, with a\n" +
                "high near 66. Northeast wind around 11 mph. Chance of precipitation is 20%.\n" +
                "\n" +
                "\u001B[32mMONDAY NIGHT\u001B[0m Mostly clear, with a low around 44. Northeast wind 6 to 9\n" +
                "mph.\n" +
                "\n" +
                "\u001B[32mTUESDAY\u001B[0m Mostly sunny, with a high near 71.\n";
        weather = new Weather();
        assertEquals(expected,weather.formatDwml(dwml));
    }
}