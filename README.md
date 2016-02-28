# worthington-weather

Reads a dwml (Digital Weather Markup Language) file and prints the weather to the command line.

## usage

java -jar dwml-1.0-SNAPSHOT-jar-with-dependencies.jar

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

ie, http://forecast.weather.gov/MapClick.php?lat=40.1008&lon=-83.0271&unit=0&lg=english&FcstType=dwml


