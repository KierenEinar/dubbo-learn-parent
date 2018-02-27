mvn clean compile install package
cd dubbo-learn-provider/target
java -jar -Dspring.profiles.active=dev dubbo-learn-provider-0.0.1-SNAPSHOT.jar
cd ~/dubbo-learn-parent/dubbo-learn-web/
cp dubbo-learn-web.war ~/jetty/webapps/
cd ~/jetty
java -jar start.jar