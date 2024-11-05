FROM jenkins/jenkins:lts-jdk17

COPY plugins.txt /usr/share/jenkins/ref/plugins.txt

RUN ls /usr/share/jenkins/ref/

RUN jenkins-plugin-cli -f /usr/share/jenkins/ref/plugins.txt

ENV JAVA_OPTS -Djenkins.install.runSetupWizard=false