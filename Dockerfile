FROM tomcat

RUN addgroup tomcatusers && adduser --disabled-password tomcat && adduser tomcat tomcatusers
RUN chown -R tomcat:tomcatusers .
USER tomcat

ENV JAVA_OPTS="-Djava.security.egd=file:/dev/urandom"

COPY ./target/ksch-workflows.war /usr/local/tomcat/webapps/ksch-workflows.war

