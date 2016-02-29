package com.tallgeorge.dwml;

import com.tallgeorge.dwml.schema.Dwml;
import com.tallgeorge.dwml.schema.StartValidTimeType;
import com.tallgeorge.dwml.schema.TimeLayoutElementType;
import org.apache.commons.lang.WordUtils;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Parse and format the weather provided by a dwml endpoint.
 */
public class Weather {

    private Dwml dwml;

    /**
     * No arg constructor for test.
     */
    public Weather() {
    }

    /**
     * Get and parse the weather url, a dwml formatted file at the url provided.
     *
     * @param url, the endpoint of the dwml file.
     */
    public Weather(String url) {
        if (url != null && !url.equals("")) {
            try {
                this.dwml = getDwml(url);
            } catch (JAXBException | MalformedURLException e) {
                this.dwml = new Dwml();
                System.out.println(e);
            }
        } else {
            System.out.println("Invalid URL.");
        }
    }

    /**
     * Load and parse the dwml file.
     *
     * @param url, the endpoint of the dwml file.
     * @return a Dwml object that contains the JaxB parsed dwml.
     * @throws Exception
     */
    private Dwml getDwml(String url) throws JAXBException, MalformedURLException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Dwml.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        return (Dwml) jaxbUnmarshaller.unmarshal(new URL(url));
    }

    /**
     * The dwml to string formatter.
     *
     * @param dwml The parsed dwml file.
     * @return a String, the formatted output from the dwml file.
     */
    public String formatDwml(Dwml dwml) {
        if (dwml == null) {
            return "Weather unavailable";
        }
        String formattedWeather = "";
        for (TimeLayoutElementType timeLayoutElementType : dwml.getData().get(0).getTimeLayout()) {
            if (timeLayoutElementType.getLayoutKey().contains("k-p12h")) {
                int counter = 0;
                for (Object obj : timeLayoutElementType.getStartValidTimeAndEndValidTime()) {
                    StartValidTimeType startValidTimeType = (StartValidTimeType) obj;
                    String date = startValidTimeType.getPeriodName();
                    String forecast = dwml.getData().get(0).getParameters().get(0).getWordedForecast().getText().get(counter++);
                    forecast = forecast.replaceAll("\n", " ").replaceAll("( )+", " ").trim();
                    String weatherLine = ColorText.GREEN.getColor() + date.toUpperCase()
                            + ColorText.RESET.getColor() + " " + forecast;
                    formattedWeather += "\n" + WordUtils.wrap(weatherLine, 80) + "\n";
                    if (counter == 6) {
                        break;
                    }
                }
            }
        }
        return formattedWeather;
    }

    @Override
    public String toString() {
        return formatDwml(this.dwml);
    }

}
