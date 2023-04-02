# Informationssysteme II – Aufgabenblatt 1
## Aufgabe 1
### a) Was macht gradle?
Gradle ist ein Build-Tool, das hauptsächlich für Java verwendet wird. <br>
Aufgaben von Gradle sind beispielsweise das Kompilieren von Quellcode, das Ausführen von Tests, das Zusammenstellen von Bibliotheken und das Verwalten von Abhängigkeiten.
### b) Wobei hilft Dir SpringBoot? Ist SpringBoot gleich Spring Data JPA?
Spring Boot ist ein Java Framework, das die Erstellung von Anwendungen (u.A. mit Datenbankzugriff und Web-Controller) erleichtern soll.
Spring Data JPA (Java Persistance API) ist ein Teil des Spring-Frameworks und dient als Spezifikation für die Verwaltung von Datenbankzugriffen in Java-Anwendungen
### c) Welche Annotationen und Klassen sind relevant für die Persistenz?
Die wichtigsten Annotationen sind @Entity, @Table, @Id, @OneToMany und @ManyToOne. <br>
Die beiden letzteren dienen der Definition der Beziehung zwischen Enitäten. @Id kennzeichnet ein Attribut einer Klasse als Primärschlüssel.
### d) Was ist eine Entität?
Eine Entität ist ein Objekt, dass in der Datenbank gespeichert werden kann. Jede Entität hat dementsprechend einen Primärschlüssel, dass die Entität identifiziert.
### e) Was ist der Unterschied zwischen einer Entität und einem Valuetype (andere Begriffe: fachlicher Datentyp, Wertetyp)?
Während die Attribute einer Entität sich im Laufe der Zeit ändern können, bleibt ein Valuetyp nach Initialsierung unverändert.