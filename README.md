# PATRIC 3 Data Landing Page cache generator

## Build
```
mvn clean compile assembly:single
```

## Running
```
java -DDataApi.Url=https://www.alpha.patricbrc.org/api/ -jar target/p3_dlp-1.0-SNAPSHOT-jar-with-dependencies.jar  ./ All
```

## Running with certs
```
java -DDataApi.Url=https://www.alpha.patricbrc.org/api/ -Djavax.net.ssl.trustStore=cacerts -jar target/p3_dlp-1.0-SNAPSHOT-jar-with-dependencies.jar  ./ All
```