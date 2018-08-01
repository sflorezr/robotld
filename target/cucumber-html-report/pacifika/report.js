$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/features/Pruebas/dev/Compras/PDP/1StoreCredit.feature");
formatter.feature({
  "name": "Store Credit",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Limpia Carro aliada",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Estando en pagina de logeo",
  "keyword": "Given "
});
formatter.match({
  "location": "LogueoDesdeInicioDefinition.estando_en_pagina_de_logeo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Tengo datos a ingresar \"src/test/resources/datadrivenDev/usuarios.xls\"",
  "keyword": "And "
});
formatter.match({
  "location": "LogueoDesdeInicioDefinition.Tengo_datos_a_ingresar(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Logueo usuairo aliada",
  "keyword": "When "
});
formatter.match({
  "location": "LogueoDesdeInicioDefinition.Logueo_usuairo_aliada()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Limpia carro",
  "keyword": "And "
});
formatter.match({
  "location": "AgregarArticuloDefinition.limpia_carro()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Store Credit Mayor Compra usuario aliada",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Estando en Home",
  "keyword": "Given "
});
formatter.match({
  "location": "AgregarArticuloDefinition.estando_en_Home()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Tengo datos a ingresar \"src/test/resources/datadrivenDev/usuarios.xls\"",
  "keyword": "And "
});
formatter.match({
  "location": "LogueoDesdeInicioDefinition.Tengo_datos_a_ingresar(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Teniendo articulos a seleccionar \"src/test/resources/datadrivenDev/articulos.csv\"",
  "keyword": "And "
});
formatter.match({
  "location": "AgregarArticuloDefinition.teniendo_articulos_a_seleccionar(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Selecciona articulos desde PDP menor aliada \"250000\"",
  "keyword": "When "
});
formatter.match({
  "location": "AgregarArticuloDefinition.selecciona_articulos_desde_PDP_menor_aliada(int)"
});
formatter.result({
  "error_message": "net.serenitybdd.core.exceptions.SerenityManagedException: The following error occurred: Expected enabled element was not enabled\r\n\tat net.serenitybdd.core.pages.WebElementFacadeImpl.waitUntilEnabled(WebElementFacadeImpl.java:968)\r\n\tat com.lineadirecta.pacifika.pageobjets.BusquedaDeArticulosPorSubcategoriaPage.abrirpaginadeproducto(BusquedaDeArticulosPorSubcategoriaPage.java:140)\r\n\tat com.lineadirecta.pacifika.steps.BusquedaDeaArticulosPorSubcategoriaSteps.AbrirPDP(BusquedaDeaArticulosPorSubcategoriaSteps.java:53)\r\n\tat com.lineadirecta.pacifika.steps.BusquedaDeaArticulosPorSubcategoriaSteps$$EnhancerByCGLIB$$77f8046.CGLIB$AbrirPDP$4(\u003cgenerated\u003e)\r\n\tat com.lineadirecta.pacifika.steps.BusquedaDeaArticulosPorSubcategoriaSteps$$EnhancerByCGLIB$$77f8046$$FastClassByCGLIB$$42dd1ba0.invoke(\u003cgenerated\u003e)\r\n\tat net.sf.cglib.proxy.MethodProxy.invokeSuper(MethodProxy.java:228)\r\n\tat net.thucydides.core.steps.StepInterceptor.invokeMethod(StepInterceptor.java:450)\r\n\tat net.thucydides.core.steps.StepInterceptor.executeTestStepMethod(StepInterceptor.java:435)\r\n\tat net.thucydides.core.steps.StepInterceptor.runTestStep(StepInterceptor.java:410)\r\n\tat net.thucydides.core.steps.StepInterceptor.runOrSkipMethod(StepInterceptor.java:151)\r\n\tat net.thucydides.core.steps.StepInterceptor.testStepResult(StepInterceptor.java:138)\r\n\tat net.thucydides.core.steps.StepInterceptor.intercept(StepInterceptor.java:69)\r\n\tat com.lineadirecta.pacifika.steps.BusquedaDeaArticulosPorSubcategoriaSteps$$EnhancerByCGLIB$$77f8046.AbrirPDP(\u003cgenerated\u003e)\r\n\tat com.lineadirecta.pacifika.definition.AgregarArticuloDefinition.selecciona_articulos_desde_PDP_menor_aliada(AgregarArticuloDefinition.java:280)\r\n\tat ✽.Selecciona articulos desde PDP menor aliada \"250000\"(src/main/resources/features/Pruebas/dev/Compras/PDP/1StoreCredit.feature:15)\r\nCaused by: org.openqa.selenium.TimeoutException: Expected condition failed: waiting for By.xpath: html/body/main/div[6]/div[2]/section/div[1]/div[2]/div/div/div[2]/div[1]/div/a[1]/img to be enabled (tried for 5 second(s) with 100 MILLISECONDS interval)\r\n\tat org.openqa.selenium.support.ui.FluentWait.timeoutException(FluentWait.java:263)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:231)\r\n\tat net.serenitybdd.core.pages.WebElementFacadeImpl.waitUntilEnabled(WebElementFacadeImpl.java:965)\r\n\tat com.lineadirecta.pacifika.pageobjets.BusquedaDeArticulosPorSubcategoriaPage.abrirpaginadeproducto(BusquedaDeArticulosPorSubcategoriaPage.java:140)\r\n\tat com.lineadirecta.pacifika.steps.BusquedaDeaArticulosPorSubcategoriaSteps.AbrirPDP(BusquedaDeaArticulosPorSubcategoriaSteps.java:53)\r\n\tat com.lineadirecta.pacifika.steps.BusquedaDeaArticulosPorSubcategoriaSteps$$EnhancerByCGLIB$$77f8046.CGLIB$AbrirPDP$4(\u003cgenerated\u003e)\r\n\tat com.lineadirecta.pacifika.steps.BusquedaDeaArticulosPorSubcategoriaSteps$$EnhancerByCGLIB$$77f8046$$FastClassByCGLIB$$42dd1ba0.invoke(\u003cgenerated\u003e)\r\n\tat net.sf.cglib.proxy.MethodProxy.invokeSuper(MethodProxy.java:228)\r\n\tat net.thucydides.core.steps.StepInterceptor.invokeMethod(StepInterceptor.java:450)\r\n\tat net.thucydides.core.steps.StepInterceptor.executeTestStepMethod(StepInterceptor.java:435)\r\n\tat net.thucydides.core.steps.StepInterceptor.runTestStep(StepInterceptor.java:410)\r\n\tat net.thucydides.core.steps.StepInterceptor.runOrSkipMethod(StepInterceptor.java:151)\r\n\tat net.thucydides.core.steps.StepInterceptor.testStepResult(StepInterceptor.java:138)\r\n\tat net.thucydides.core.steps.StepInterceptor.intercept(StepInterceptor.java:69)\r\n\tat com.lineadirecta.pacifika.steps.BusquedaDeaArticulosPorSubcategoriaSteps$$EnhancerByCGLIB$$77f8046.AbrirPDP(\u003cgenerated\u003e)\r\n\tat com.lineadirecta.pacifika.definition.AgregarArticuloDefinition.selecciona_articulos_desde_PDP_menor_aliada(AgregarArticuloDefinition.java:280)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:32)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:26)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:37)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:40)\r\n\tat cucumber.api.TestStep.executeStep(TestStep.java:102)\r\n\tat cucumber.api.TestStep.run(TestStep.java:83)\r\n\tat cucumber.api.TestCase.run(TestCase.java:58)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:80)\r\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:140)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:117)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:55)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.apache.maven.surefire.junitcore.pc.Scheduler$1.run(Scheduler.java:393)\r\n\tat org.apache.maven.surefire.junitcore.pc.InvokerStrategy.schedule(InvokerStrategy.java:54)\r\n\tat org.apache.maven.surefire.junitcore.pc.Scheduler.schedule(Scheduler.java:352)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat cucumber.api.junit.Cucumber$1.evaluate(Cucumber.java:126)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.apache.maven.surefire.junitcore.pc.Scheduler$1.run(Scheduler.java:393)\r\n\tat java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)\r\n\tat java.util.concurrent.FutureTask.run(FutureTask.java:266)\r\n\tat java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)\r\n\tat java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)\r\n\tat java.lang.Thread.run(Thread.java:745)\r\nCaused by: org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"html/body/main/div[6]/div[2]/section/div[1]/div[2]/div/div/div[2]/div[1]/div/a[1]/img\"}\n  (Session info: chrome\u003d67.0.3396.99)\n  (Driver info: chromedriver\u003d2.37.544315 (730aa6a5fdba159ac9f4c1e8cbc59bf1b5ce12b7),platform\u003dWindows NT 6.1.7601 SP1 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.8.1\u0027, revision: \u00276e95a6684b\u0027, time: \u00272017-12-01T18:33:54.468Z\u0027\nSystem info: host: \u0027SP4L8Z362\u0027, ip: \u002710.7.28.141\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.remote.RemoteWebDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.37.544315 (730aa6a5fdba15..., userDataDir: C:\\Users\\41QS362\\AppData\\Lo...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 67.0.3396.99, webStorageEnabled: true}\nSession ID: dbbef7f04034eee8a4fb20b3f402abb6\n*** Element info: {Using\u003dxpath, value\u003dhtml/body/main/div[6]/div[2]/section/div[1]/div[2]/div/div/div[2]/div[1]/div/a[1]/img}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:601)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:371)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:473)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat net.thucydides.core.webdriver.WebDriverFacade.findElement(WebDriverFacade.java:278)\r\n\tat net.serenitybdd.core.pages.WebElementResolverByLocator.resolveForDriver(WebElementResolverByLocator.java:16)\r\n\tat net.serenitybdd.core.pages.WebElementFacadeImpl.getElement(WebElementFacadeImpl.java:209)\r\n\tat net.serenitybdd.core.pages.WebElementExpectations$3.apply(WebElementExpectations.java:63)\r\n\tat net.serenitybdd.core.pages.WebElementExpectations$3.apply(WebElementExpectations.java:55)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:208)\r\n\t... 57 more\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Logueo e Ir a Pasarela \"aliada\" mayor a \"250000\"",
  "keyword": "And "
});
formatter.match({
  "location": "LogueoDesdeInicioDefinition.logueo_e_Ir_a_Pasarela_mayor_a(String,int)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "No encuentra Pasarela \"Tu saldo a favor cubre el valor de tu compra.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StoreCreditDefinition.no_encuentra_Pasarela(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Store Credit Mayor Compra usuario aliada verifica pasarela",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Estando en Home",
  "keyword": "Given "
});
formatter.match({
  "location": "AgregarArticuloDefinition.estando_en_Home()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Tengo datos a ingresar \"src/test/resources/datadrivenDev/usuarios.xls\"",
  "keyword": "And "
});
formatter.match({
  "location": "LogueoDesdeInicioDefinition.Tengo_datos_a_ingresar(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Teniendo articulos a seleccionar \"src/test/resources/datadrivenDev/articulos.csv\"",
  "keyword": "And "
});
formatter.match({
  "location": "AgregarArticuloDefinition.teniendo_articulos_a_seleccionar(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Selecciona articulos desde PDP mayor aliada \"200000\"",
  "keyword": "When "
});
formatter.match({
  "location": "AgregarArticuloDefinition.selecciona_articulos_desde_PDP_mayor_aliada(int)"
});
formatter.result({
  "error_message": "net.serenitybdd.core.exceptions.SerenityManagedException: The following error occurred: unknown error: Element \u003cimg class\u003d\"lazy\" data-src\u003d\"/medias/sys_master/images/images/hcc/heb/8796406644766/P506552-1.jpg\" alt\u003d\"Blusa Manga Sisa Blanco\" title\u003d\"Blusa Manga Sisa Blanco\" src\u003d\"data:image/gif;base64,R0lGODlhAQABAIAAAP///wAAACH5BAEAAAAALAAAAAABAAEAAAICRAEAOw\u003d\u003d\"\u003e is not clickable at point (885, 404). Other element would receive the click: \u003cdiv class\u003d\"details mt-card-content\"\u003e...\u003c/div\u003e\n  (Session info: chrome\u003d67.0.3396.99)\n  (Driver info: chromedriver\u003d2.37.544315 (730aa6a5fdba159ac9f4c1e8cbc59bf1b5ce12b7),platform\u003dWindows NT 6.1.7601 SP1 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.8.1\u0027, revision: \u00276e95a6684b\u0027, time: \u00272017-12-01T18:33:54.468Z\u0027\nSystem info: host: \u0027SP4L8Z362\u0027, ip: \u002710.7.28.141\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.remote.RemoteWebDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.37.544315 (730aa6a5fdba15..., userDataDir: C:\\Users\\41QS362\\AppData\\Lo...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 67.0.3396.99, webStorageEnabled: true}\nSession ID: 6c2b18d3cb0175743af6e29f9cfedcb4\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:601)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:279)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\r\n\tat net.serenitybdd.core.pages.WebElementFacadeImpl.click(WebElementFacadeImpl.java:1046)\r\n\tat com.lineadirecta.pacifika.pageobjets.BusquedaDeArticulosPorSubcategoriaPage.abrirpaginadeproducto(BusquedaDeArticulosPorSubcategoriaPage.java:140)\r\n\tat com.lineadirecta.pacifika.steps.BusquedaDeaArticulosPorSubcategoriaSteps.AbrirPDP(BusquedaDeaArticulosPorSubcategoriaSteps.java:53)\r\n\tat com.lineadirecta.pacifika.steps.BusquedaDeaArticulosPorSubcategoriaSteps$$EnhancerByCGLIB$$77f8046.CGLIB$AbrirPDP$4(\u003cgenerated\u003e)\r\n\tat com.lineadirecta.pacifika.steps.BusquedaDeaArticulosPorSubcategoriaSteps$$EnhancerByCGLIB$$77f8046$$FastClassByCGLIB$$42dd1ba0.invoke(\u003cgenerated\u003e)\r\n\tat net.sf.cglib.proxy.MethodProxy.invokeSuper(MethodProxy.java:228)\r\n\tat net.thucydides.core.steps.StepInterceptor.invokeMethod(StepInterceptor.java:450)\r\n\tat net.thucydides.core.steps.StepInterceptor.executeTestStepMethod(StepInterceptor.java:435)\r\n\tat net.thucydides.core.steps.StepInterceptor.runTestStep(StepInterceptor.java:410)\r\n\tat net.thucydides.core.steps.StepInterceptor.runOrSkipMethod(StepInterceptor.java:151)\r\n\tat net.thucydides.core.steps.StepInterceptor.testStepResult(StepInterceptor.java:138)\r\n\tat net.thucydides.core.steps.StepInterceptor.intercept(StepInterceptor.java:69)\r\n\tat com.lineadirecta.pacifika.steps.BusquedaDeaArticulosPorSubcategoriaSteps$$EnhancerByCGLIB$$77f8046.AbrirPDP(\u003cgenerated\u003e)\r\n\tat com.lineadirecta.pacifika.definition.AgregarArticuloDefinition.selecciona_articulos_desde_PDP_mayor_aliada(AgregarArticuloDefinition.java:82)\r\n\tat ✽.Selecciona articulos desde PDP mayor aliada \"200000\"(src/main/resources/features/Pruebas/dev/Compras/PDP/1StoreCredit.feature:24)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Logueo e Ir a Pasarela \"aliada\" mayor a \"250000\"",
  "keyword": "And "
});
formatter.match({
  "location": "LogueoDesdeInicioDefinition.logueo_e_Ir_a_Pasarela_mayor_a(String,int)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verifica Pasarela",
  "keyword": "Then "
});
formatter.match({
  "location": "StoreCreditDefinition.verifica_pasarela()"
});
formatter.result({
  "status": "skipped"
});
});