# Примеры реализации UI-интерфейса на kotlin с использованием javaFX

## Модули:

* [common](fx/common) - несколько базовых классов, интерфейсов и утилит, используемых в примере
* [app](fx/app) - пример реализации приложения с использованием [библиотеки TornadoFx](https://tornadofx.io/),
  фреймворка [Kodein-DI](https://kodein.org/)
    * помимо понятного гайда про кодеин у них на сайте, есть неплохая статья на [хабре на русском языке](https://habr.com/ru/post/431696/)
      (она немного устарела, но всё равно хороша)
    
    * ещё вставил короткий пример работы с корутинами, скопированный из githab'а котлина: [CoroutinesSample.kt](fx/app/src/main/kotlin/ru/croc/ibelozor/kotlinfx/CoroutinesSampleLauncher.kt)
    
    * [SimpleJavaFxApp](fx/app/src/main/java/ru/croc/ibelozor/javafx/SimpleJavaFxApp.java) - пример приложения на java с 
    загрузкой View через fxml

## Настройка окружения, запуск проекта

* В проекте используется java11 (только потому что используем javaFx, по большому счёту больше она нигде не проявляется)

    * Соответственно, нужно указать java11 (или выше) как **Project SDK**
    
    * В настройках gradle убедиться, в качестве **Gradle JVM** установлена `Project SDK` 
    

2. Интерфейс приложения реализован с использованием javaFX, поэтому нужно либо отдельно её поставить (но это неудобно, 
   нужно добавлять в class-path), либо при разработке использовать дистрибутив JDK, в которой она уже есть. Например, 
   [Liberica JDK](https://libericajdk.ru/pages/downloads/#/java-11-lts) (скачать полную версию, содержащую LibericaFx)
   
## Other JavaFX examples
* [GitHub: daggerok/javafx-examples](https://github.com/daggerok/javafx-examples)
* [GitHub: daggerok/javafx-spring-boot-app](https://github.com/daggerok/javafx-spring-boot-app)
