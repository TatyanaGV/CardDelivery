[![Build status](https://ci.appveyor.com/api/projects/status/a2qdtjb756jxkqc7?svg=true)](https://ci.appveyor.com/project/TatyanaGV/selenide-homework-2-2)

## CardDelivery

Авто-тесты формы "Карта с доставкой".

##### Требования к содержимому полей:

* Город - один из административных центров субъектов РФ;
* Дата - не ранее трёх дней с текущей даты;
* Поле Фамилия и имя - разрешены только русские буквы, дефисы и пробелы;
* Поле телефон - только цифры (11 цифр), символ + (на первом месте);
* Флажок согласия должен быть выставлен;
* Тестируемая функциональность: отправка формы.

Поля Город и Дата заполняются через прямой ввод значений (без использования выбора из выпадающего списка и всплывающего календаря).

Условия: если все поля заполнены корректно, то форма переходит в состояние "Загрузки":

 ##### Инструментарий:
- JAVA8 - язык написания авто-тестов;
- JUnit - платформа для написания авто-тестов и их запуска;
- Gradle - система управления зависимостями;
- Git - хранение тестов;
- Continuous Integration (Appveyor) - система для сбора авто-тестов в автоматическом режиме;
- Selenide - фреймворк для автоматизированного тестирования веб-приложений;
- SUT - целевой сервис SUT (app-order.jar).