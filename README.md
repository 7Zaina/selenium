1- PREREQUIS:
- installation de JAVA (JDK) et MAVEN
2- sur vscode, créez un profil selenium, et installez les extensions Cucumber, Debugger for Java, Intellicode, Intellicode Completions
2- Création d'un projet Maven
- Ctrl+Shift+P => Create Java Project => Maven => maven archtype quickstart => version (1.4) => nommer le projet (com.selenium) => saisissez cours par exemple pour le artifact id => tapez Entrer pour toutes les questions sur votre terminal.
3- expliquer la structure du projet (src/main pour l'application metier) et (src/test pour les tests), (dependances contenu dans le fichier pom.xml)
4- modifiez le pom.xml, pour qu'il charge le version 5 de junit (voir pom.xml)
5- redigez une premiere classe (soustraction_positive), et un premier test junit, puis accedez au dossier cours (racine du projet), puis lancez le test avec la commande mvn test.
6- modifiez le test pour qu'il échoue, et refaites le test.
###########################################
1- créez un repertoire data, et un ficher csv "jdd.csv", contenant vos jeux de données, pour notre test, il contiendra trois colonnes (a, b, r). les données represente ce que doit renvoyer le test.
2- ajoutez les annotations nécessaires à votre test (remarquez que @Test à été remplacé par @ParameterizedTest)
3- lancez les tests avec mvn test, vous devriez voir autant de test qu'il y a d'entrées dans votre JDD. (Tests run: 4, Failures: 0, Errors: 0, Skipped: 0)
################################################
1- créez une 2eme fonction diff, et ajoutez deux autres tests
2- ajoutez des tags à vos tests, sauf le dernier
3- lancez les tests avec les commandes mvn test -Dgroups=soustraction, mvn test -Dgroups=atypique, mvn test -Dgroups=typique, mvn test -Dtest=AppTest. combien de tests on été lancé à chaque fois?, remarquez la différence entre -Dgroups et -Dtest.
################################################
1- supprimez les classes java et les anciens tests, ou créz un vouveau projet java
2- ajoutez la dependance de selenium:
 Ctrl+Shift+P => Maven: Add a dependency => saisissez "selenium-java" => selectionnez celle du package org.seleniumhq.selenium. vous devriez voir la dependance dans le fichier pom.xml
3- créez une classe de test (la convention de nommage doit etre *Test.java, *Tests.java ou *TestCase.java), puis créez un premier test, et instanciez un web driver, recuperez vos web elements et faites une assertion junit.
4- lancez votre test via la commande mvn test
 ###################################################
1- dans votre classe ajoutez deux hooks pour gerer votre navigateur, les hook sont annotée par @BeforeEach et @AfterEach, votre navigateur se fermera automatiquement apres chaque test.
2- ajouter une variable d'environnement pour lancer vos tests sur différents navigateurs:
  créez une variable browser et recuperez sa valeur depuis la ligne de commande comme ceci: System.getProperty("browser", "chrome"). chrome ici est une valeur par défaut.
3- faite un switch/case pour instancier le navigateur adéquat
4- lancez vos tests avec la commande mvn test -Dbrowser="firefox", vos tests se lanceront sur le navigateur firefox.
