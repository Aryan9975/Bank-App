# Use official Tomcat base image with JDK 17
FROM tomcat:10.1-jdk17

# Clean default apps (optional but cleaner)
RUN rm -rf /usr/local/tomcat/webapps/*

# Copy your WAR file to the webapps folder
COPY target/BANK-1.0-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war

# Expose the default Tomcat port
EXPOSE 8080

# Tomcat will auto-deploy ROOT.war
