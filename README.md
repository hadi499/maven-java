# maven-java

mvn archetype:generate

----------pilihan-------

maven-archetype-quickstart

groupId : belajar
artifactId : belajar-maven
package : belajar.maven
version : 1.0-SNAPSHOT
  
  
  mvn compile
  mvn clean
  mvn test
  mvn package ---→ build paket repository tanpa repository pihak ke 3
  
  mvn compile-test
  
  mvn package assembly:single  ---→ build paket repository beserta repository pihak ke 3
  
  java -jar target/file jar
