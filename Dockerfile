FROM jenkins/jenkins:lts-jdk17

COPY plugins.txt /usr/share/jenkins/ref/plugins.txt

RUN ls /usr/share/jenkins/ref/

RUN jenkins-plugin-cli -f /usr/share/jenkins/ref/plugins.txt

COPY seedJob.xml /usr/share/jenkins/ref/jobs/seed-job/config.xml

COPY createJobs.groovy /var/jenkins_home/init.groovy.d/createJobs.groovy

COPY maven.xml /var/jenkins_home/hudson.tasks.Maven.xml

ENV JAVA_OPTS -Djenkins.install.runSetupWizard=false