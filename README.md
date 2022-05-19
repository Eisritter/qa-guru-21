# Проект по автоматизации тестирования для мобильного приложения Wikipedia

## 📃 Содержание:

- [Технологии и инструменты](#computer-технологии-и-инструменты)
- [Реализованные проверки](#boom-Реализованные-проверки)
- [Сборка в Jenkins](#-сборка-в-jenkins)
- [Запуск из терминала](#computer-Запуск-тестов-из-терминала)
- [Отчет в Allure report](#-отчет-в-allure-report)
- [Отчет в Telegram](#-уведомление-в-telegram-при-помощи-бота)
- [Видео пример прохождения тестов](#-видео-пример-прохождения-теста)

## :computer: Технологии и инструменты
<p align="center">
<img width="6%" title="IntelliJ IDEA" src="image/logo/Intelij_IDEA.svg">
<img width="6%" title="Java" src="image/logo/Java.svg">
<img width="6%" title="Selenide" src="image/logo/Selenide.svg">
<img width="6%" title="Selenoid" src="image/logo/Selenoid.svg">
<img width="6%" title="Allure Report" src="image/logo/Allure_Report.svg">
<img width="6%" title="Gradle" src="image/logo/Gradle.svg">
<img width="6%" title="JUnit5" src="image/logo/JUnit5.svg">
<img width="6%" title="GitHub" src="image/logo/GitHub.svg">
<img width="6%" title="Jenkins" src="image/logo/Jenkins.svg">
<img width="6%" title="Telegram" src="image/logo/Telegram.svg">
</p>

## :boom: Реализованные проверки

- На странице скачивания для Windows есть кнопка 'Скачать бесплатно'
- У заголовка вкладки верный текст
- Страница тарифов TrueConf Online открывается
- Кнопка 'Войти в конференцию' кликабельна
- На странице блога есть ссылка на вебинары

## <img src="image/logo/Jenkins.svg" width="25" height="25"  alt="Jenkins"/></a> Сборка в Jenkins
<a target="_blank" href="https://jenkins.autotests.cloud/job/C11-eisritter-unit13-homework/">Jenkins job</a>
<p align="center">
<a href="https://jenkins.autotests.cloud/job/C11-eisritter-unit13-homework/"><img src="image/screenshots/jenkins-dashboard.png" alt="Jenkins"/></a>
</p>

### :maple_leaf: Параметры сборки в Jenkins:

- browser (браузер, по умолчанию chrome)
- browserSize (размер окна браузера, по умолчанию 1920x1080)
- remoteDriverUrl (логин, пароль и адрес удаленного сервера selenoid или grid)
- threads (количество потоков)
- AlureNotificationVersion (версия AllureNotification)

## :computer: Запуск тестов из терминала

Локальный запуск:
```
gradle clean test
```

Удаленный запуск:
```
clean
test
-Dbrowser=${BROWSER}
-DbrowserVersion=${BROWSER_VERSION}
-DbrowserSize=${BROWSER_SIZE}
-DbrowserMobileView="${BROWSER_MOBILE}"
-DremoteDriverUrl=https://${USER}:${PASSWORD}@${REMOTE_DRIVER_URL}/wd/hub/
-DvideoStorage=https://${REMOTE_DRIVER_URL}/video/
-Dthreads=${THREADS}
```
## <img src="image/logo/Allure_Report.svg" width="25" height="25"  alt="Allure"/></a> Отчет в <a target="_blank" href="https://jenkins.autotests.cloud/job/C11-eisritter-unit13-homework/allure">Allure report</a>

### :lady_beetle: Основное окно

<p align="center">
<img title="Allure Overview Dashboard" src="image/screenshots/allure-main-page.png">
</p>

### :cherries: Тесты

<p align="center">
<img title="Allure Tests" src="image/screenshots/allure-test-page.png">
</p>

## <img src="image/logo/Telegram.svg" width="25" height="25"  alt="Allure"/></a> Уведомление в Telegram при помощи бота

<p align="center">
<img title="Telegram bot" src="image/screenshots/telegram_bot.png" >
</p>


## <img src="image/logo/Selenoid.svg" width="25" height="25"  alt="Allure"/></a> Видео пример прохождения теста

<p align="center">
<img title="Selenoid Video" src="image/gif/testvideo.gif" alt="video"> 
</p>

