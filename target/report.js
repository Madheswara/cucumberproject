$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/Tvpurchase.feature");
formatter.feature({
  "name": "Tvpurchasevalidation",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tv"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user enter the search URL",
  "keyword": "Given "
});
formatter.match({
  "location": "TvpurchaseSetup.user_enter_the_search_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user login the page",
  "keyword": "And "
});
formatter.match({
  "location": "TvpurchaseSetup.user_login_the_page()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//button[text()\u003d\u0027✕\u0027]\"}\n  (Session info: chrome\u003d105.0.5195.127)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-24L2G75\u0027, ip: \u0027192.168.16.153\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002718.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 105.0.5195.127, chrome: {chromedriverVersion: 105.0.5195.52 (412c95e51883..., userDataDir: C:\\Users\\et\\AppData\\Local\\T...}, goog:chromeOptions: {debuggerAddress: localhost:52759}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: de7ab6399693dc61228f4baf93233cce\n*** Element info: {Using\u003dxpath, value\u003d//button[text()\u003d\u0027✕\u0027]}\r\n\tat java.base/jdk.internal.reflect.DirectConstructorHandleAccessor.newInstance(DirectConstructorHandleAccessor.java:67)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:483)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat com.flipkart.stepdefinition.TvpurchaseSetup.user_login_the_page(TvpurchaseSetup.java:38)\r\n\tat ✽.user login the page(src/test/resources/Features/Tvpurchase.feature:7)\r\n",
  "status": "failed"
});
formatter.scenario({
  "name": "Sony Tv purchase by hardcode",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tv"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "search the Tv",
  "keyword": "When "
});
formatter.match({
  "location": "TvpurchaseSetup.search_the_Tv()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "windows handling and select TV",
  "keyword": "And "
});
formatter.match({
  "location": "TvpurchaseSetup.windows_handling_and_select_TV()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "takescreenshot price details",
  "keyword": "And "
});
formatter.match({
  "location": "TvpurchaseSetup.takescreenshot_price_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "quit the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "TvpurchaseSetup.quit_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});