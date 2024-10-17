FROM openjdk:latest

WORKDIR /app

COPY . /app

RUN javac SmallestAndLargestSum.java

CMD ["java","SmallestAndLargestSum"]

