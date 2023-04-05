FROM openjdk:17-buster

ARG GRADLE_PREF="gradle-8.0.2"

RUN apt-get update && \
  apt-get install -y vim ant wget && \
  wget https://services.gradle.org/distributions/${GRADLE_PREF}-bin.zip -P /opt && \
  unzip -d /opt /opt/${GRADLE_PREF}-bin.zip && \
  ln -s /opt/${GRADLE_PREF} /opt/gradle && \
  echo export GRADLE_HOME=/opt/gradle >> ~/.bashrc && \
  echo export PATH='$GRADLE_HOME/bin:$PATH' >> ~/.bashrc && \
  rm /opt/${GRADLE_PREF}-bin.zip