# worthington-weather

Reads a dwml (Digital Weather Markup Language) file and prints the weather to the command line.

## requirements

* Java 7 or greater.
* Maven 3 or greater.
* git 2.5 or greater.

## usage

<pre>
git clone https://github.com/geocolumbus/worthington-weather.git weather
cd weather
mvn clean package
java -jar target/dwml-1.0-SNAPSHOT-jar-with-dependencies.jar
</pre>

## output

<pre>
--------------------------------------------------------------------------------
TONIGHT - Mostly clear, with a low around 36. South wind 8 to 10 mph.

SUNDAY - Sunny, with a high near 61. Breezy, with a southwest wind 10 to 15 mph
increasing to 20 to 25 mph in the afternoon. Winds could gust as high as 43 mph.

SUNDAY NIGHT - Showers likely and possibly a thunderstorm before 3am, then a
slight chance of showers between 3am and 4am. Increasing clouds, with a low
around 36. Breezy, with a southwest wind 14 to 22 mph becoming northwest after
midnight. Chance of precipitation is 60%. New rainfall amounts between a tenth
and quarter of an inch, except higher amounts possible in thunderstorms.

MONDAY - Mostly sunny, with a high near 49. Northwest wind 8 to 11 mph becoming
southwest in the afternoon.

MONDAY NIGHT - Partly cloudy, with a low around 36. Southwest wind 5 to 8 mph.

TUESDAY - Rain likely, mainly after 3pm. Mostly cloudy, with a high near 53.
Chance of precipitation is 70%. New precipitation amounts between a tenth and
quarter of an inch possible.
--------------------------------------------------------------------------------
</pre>

## customize

Change the url in Main to point to your coordinates.

1. Go to http://forecast.weather.gov/
1. Type in your zip code
1. Look along the right and scroll down for the "xml" button and press it.
1. You'll get back a "dwml" file. Copy the URL and paste it into src/main/java/com/tallgeorge/dwml/Main.java.
1. mvn clean package.
1. java -jar target/dwml-1.0-SNAPSHOT-jar-with-dependencies.jar


