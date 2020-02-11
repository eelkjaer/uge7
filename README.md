# Uge 7 - 2. Gruppe

## Terminal øvelser  ✔️
Øvelserne er ikke tænkt så man skal kunne komme i mål ved at følge en beskrivelse. Derfor er vi der til at hjælpe.

1) Øvelser med pwd, cd og mkdir
  * åben din terminal. Du skal sikre dig at du står i dit "home-dir" vha kommandoen pwd (a la /c/user/brugernavn)
  * cd til Documents og mkdir en ny mappe 
2) Øvelser med find, grep, wc, jar og | 
  * ***pak filen ud i den nye mappe (enten med din stifinder eller i terminalen (så skal du bruge gzip og tar).***


```
Kommando = tar -xvf leJOS_EV3_0.9.1-beta.tar.gz
```


  * ***brug find | grep til at finde ud af hvor mange jar-filer der er i lib-folderen***


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
