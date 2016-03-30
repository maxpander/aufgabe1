# KSwe SoSe 2016 - Aufgabe 1

Ziel dieser Aufgabe ist die Nutzung von GitHubs Pull Request
Feature zur kollaborativen Anpassung einer Java-Klasse.

## Beschreibung

Die Klasse `TeamMemberLogger.java` gibt momentan noch eine
Platzhaltermeldung aus. Passt im Team die Klasse so an, dass sie
alle Mitglieder des Teams (eines pro Zeile) ausgibt. Jedes Team-
Mitglied soll hierbei in seinem eigenen Fork die eigenen
Informationen einbinden.

## Ergebnis

Als Ergebnis soll bei Ausführung des Programms jedes Team-Mitglied
aufgelistet werden.

Beispielthalte Ausgabe:

```
2016-03-25 15:40:23 - Insgesamt 3 Team-Mitglieder:
2016-03-25 15:40:23 - Barbara Klein
2016-03-25 15:40:23 - Kevin Pearson
2016-03-25 15:40:24 - Ronny Bennett

```

## Zusatzaufgabe

* Nutzt zur Ausgabe nicht `System.out.println` sondern ein
Logging-Framework (z.B. `java.util.logging`, `SLF4J` oder
`Log4J`).
* Sortiert die Team-Mitglieder bei Vor- und Nachnamen
