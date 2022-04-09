FROM azul/zulu-openjdk:17-jre
MAINTAINER Ilija Neskovic
ENV JAR_FILE=hackathon-backend.jar

ARG TARGET_PATH=target/${JAR_FILE}
ADD ${TARGET_PATH} /${JAR_FILE}

ENTRYPOINT ["java","-jar","/hackathon-backend.jar", "HackathonBackendApplication"]