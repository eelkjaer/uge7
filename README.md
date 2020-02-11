# Uge 7
Denne uge foregår det hele i kommando-prompten og jeres almindelige teksteditor.
Jeg vil være der sammen med tutorerne til at hjælpe og svare på spørgsmål.

## Forberedelse
Allerførst .. mind dig selv om hvor pipe-tasten er på dit tastatur (|)
Dernæst .. tanken er ikke at I skal kunne løse alle opgaver. Men tag en bid af terminal-øvelserne og java-øvelserne.

Og nu igang .. 
Download lejos fra [dette link](https://sourceforge.net/projects/ev3.lejos.p/files/0.9.1-beta/).
OBS Windows-brugere. Det er vigtigt at man vælger filen leJOS_EV3_0.9.1-beta.tar.gz og ikke exe-filen. 
Lejos er et værktøj som gør det muligt at programmere en lego-ev3-robot med Java. Til denne uge skal vi bare bruge den som en "tilfældig"
zip-fil i forbindelse med øvelser i terminalen. Men såfremt vi får tid vil jeg inddrage det i undervisningen senere. 
Når filen er hentet ned på din computer skal du pakke den ud i den folder du laver i din terminal i næste øvelse

## Terminal øvelser  ✔️
Øvelserne er ikke tænkt så man skal kunne komme i mål ved at følge en beskrivelse. Derfor er vi der til at hjælpe.

1) Øvelser med pwd, cd og mkdir
  * åben din terminal. Du skal sikre dig at du står i dit "home-dir" vha kommandoen pwd (a la /c/user/brugernavn)
  * cd til Documents og mkdir en ny mappe 
2) Øvelser med find, grep, wc, jar og | 
  * pak filen ud i den nye mappe (enten med din stifinder eller i terminalen (så skal du bruge gzip og tar).
  * ***brug find | grep til at finde ud af hvor mange jar-filer der er i lib-folderen***

  8 .jar filer

```
PWD = /Documents/leJOS_EV3_0.9.1-beta/lib

Kommando = find . -type f -name "*.jar" | wc -l

Result = 8
```

  * ***brug jar kommandoen (den ligger i JAVA_HOME/bin, tjek dens optioner) til at se hvor mange klasser der er i ev3classes.jar (hint: kombiner jar-kommandoen med grep | wc)***
  
```
PWD = /Documents/leJOS_EV3_0.9.1-beta/lib/ev3

Kommando = jar tf ev3classes.jar | grep .class | wc -l

Result = 697
```


## Java øvelser. ✔️
Her er en række java-filer og en enkelt tekstfil. Hver fil indeholder en 
række opgaver som I regner sammen i jeres grupper på onsdag. 

1) CompilerError ✔️

2) CompilerErrorTwo ✔️

3) Escape ✔️

4) MyFirstProgram ✔️

5) Fractions ✔️

6) FirstAsciiArt ✔️

7) VarAndOperators ✔️
