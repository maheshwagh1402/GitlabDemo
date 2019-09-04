FROM jboss/wildfly
ADD WebApp.war /opt/jboss/wildfly/standalone/deployments/
