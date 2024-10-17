FROM OpenJDK:latest

WORKDIR /app

COPY . /app

RUN SmallestAndLargestSum.java

CMD ["java","SmallestAndLargestSum"]

