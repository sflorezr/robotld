$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Pruebas/dev/Compras/PDP/CompraTarjetaDebito.feature");
formatter.feature({
  "name": "Compra con Tarjeta debito PDP",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "comprar con Tarjeta debito con usuario aliada caso feliz union de carro",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ejecutar"
    }
  ]
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
  "name": "Teniendo datos TD \"src/test/resources/datadrivenDev/TarjetaDebito.csv\"",
  "keyword": "And "
});
formatter.match({
  "location": "CompraTarjetaDebitoDefinition.teniendo_datos_TD(String)"
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
  "name": "Selecciona articulos desde PDP",
  "keyword": "When "
});
formatter.match({
  "location": "AgregarArticuloDefinition.selecciona_articulos_desde_PDP()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Logueo e Ir a Pasarela \"aliada\"",
  "keyword": "And "
});
formatter.match({
  "location": "LogueoDesdeInicioDefinition.Logueo_e_ir_a_Pasarela(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Ir a PSE",
  "keyword": "And "
});
formatter.match({
  "location": "CompraTarjetaDebitoDefinition.Ir_a_PSE()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Pagar Ahora",
  "keyword": "And "
});
formatter.match({
  "location": "CompraTCDefinition.pagar_Ahora()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Pasos para pago tarjeta debito \"feliz\"",
  "keyword": "And "
});
formatter.match({
  "location": "CompraTarjetaDebitoDefinition.pasos_para_pago_tarjeta_debito(String)"
});
formatter.result({
  "error_message": "net.serenitybdd.core.exceptions.SerenityManagedException: The following error occurred: Expected enabled element was not enabled\r\n\tat net.serenitybdd.core.pages.WebElementFacadeImpl.waitUntilEnabled(WebElementFacadeImpl.java:968)\r\n\tat net.serenitybdd.core.pages.WebElementFacadeImpl.waitUntilElementAvailable(WebElementFacadeImpl.java:807)\r\n\tat net.serenitybdd.core.pages.WebElementFacadeImpl.click(WebElementFacadeImpl.java:1044)\r\n\tat com.lineadirecta.pacifika.pageobjets.CompraTarjetaDebidoPage.Debug(CompraTarjetaDebidoPage.java:92)\r\n\tat com.lineadirecta.pacifika.steps.CompraTarjetaDebitoSteps.Debug(CompraTarjetaDebitoSteps.java:20)\r\n\tat com.lineadirecta.pacifika.steps.CompraTarjetaDebitoSteps$$EnhancerByCGLIB$$1d3afb0.CGLIB$Debug$1(\u003cgenerated\u003e)\r\n\tat com.lineadirecta.pacifika.steps.CompraTarjetaDebitoSteps$$EnhancerByCGLIB$$1d3afb0$$FastClassByCGLIB$$90785991.invoke(\u003cgenerated\u003e)\r\n\tat net.sf.cglib.proxy.MethodProxy.invokeSuper(MethodProxy.java:228)\r\n\tat net.thucydides.core.steps.StepInterceptor.invokeMethod(StepInterceptor.java:450)\r\n\tat net.thucydides.core.steps.StepInterceptor.executeTestStepMethod(StepInterceptor.java:435)\r\n\tat net.thucydides.core.steps.StepInterceptor.runTestStep(StepInterceptor.java:410)\r\n\tat net.thucydides.core.steps.StepInterceptor.runOrSkipMethod(StepInterceptor.java:151)\r\n\tat net.thucydides.core.steps.StepInterceptor.testStepResult(StepInterceptor.java:138)\r\n\tat net.thucydides.core.steps.StepInterceptor.intercept(StepInterceptor.java:69)\r\n\tat com.lineadirecta.pacifika.steps.CompraTarjetaDebitoSteps$$EnhancerByCGLIB$$1d3afb0.Debug(\u003cgenerated\u003e)\r\n\tat com.lineadirecta.pacifika.definition.CompraTarjetaDebitoDefinition.pasos_para_pago_tarjeta_debito(CompraTarjetaDebitoDefinition.java:47)\r\n\tat ✽.Pasos para pago tarjeta debito \"feliz\"(src/test/resources/features/Pruebas/dev/Compras/PDP/CompraTarjetaDebito.feature:90)\r\nCaused by: org.openqa.selenium.TimeoutException: Expected condition failed: waiting for By.xpath: //*[@id\u003d\u0027btnDebug\u0027] to be enabled (tried for 5 second(s) with 100 MILLISECONDS interval)\r\n\tat org.openqa.selenium.support.ui.FluentWait.timeoutException(FluentWait.java:263)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:231)\r\n\tat net.serenitybdd.core.pages.WebElementFacadeImpl.waitUntilEnabled(WebElementFacadeImpl.java:965)\r\n\tat net.serenitybdd.core.pages.WebElementFacadeImpl.waitUntilElementAvailable(WebElementFacadeImpl.java:807)\r\n\tat net.serenitybdd.core.pages.WebElementFacadeImpl.click(WebElementFacadeImpl.java:1044)\r\n\tat com.lineadirecta.pacifika.pageobjets.CompraTarjetaDebidoPage.Debug(CompraTarjetaDebidoPage.java:92)\r\n\tat com.lineadirecta.pacifika.steps.CompraTarjetaDebitoSteps.Debug(CompraTarjetaDebitoSteps.java:20)\r\n\tat com.lineadirecta.pacifika.steps.CompraTarjetaDebitoSteps$$EnhancerByCGLIB$$1d3afb0.CGLIB$Debug$1(\u003cgenerated\u003e)\r\n\tat com.lineadirecta.pacifika.steps.CompraTarjetaDebitoSteps$$EnhancerByCGLIB$$1d3afb0$$FastClassByCGLIB$$90785991.invoke(\u003cgenerated\u003e)\r\n\tat net.sf.cglib.proxy.MethodProxy.invokeSuper(MethodProxy.java:228)\r\n\tat net.thucydides.core.steps.StepInterceptor.invokeMethod(StepInterceptor.java:450)\r\n\tat net.thucydides.core.steps.StepInterceptor.executeTestStepMethod(StepInterceptor.java:435)\r\n\tat net.thucydides.core.steps.StepInterceptor.runTestStep(StepInterceptor.java:410)\r\n\tat net.thucydides.core.steps.StepInterceptor.runOrSkipMethod(StepInterceptor.java:151)\r\n\tat net.thucydides.core.steps.StepInterceptor.testStepResult(StepInterceptor.java:138)\r\n\tat net.thucydides.core.steps.StepInterceptor.intercept(StepInterceptor.java:69)\r\n\tat com.lineadirecta.pacifika.steps.CompraTarjetaDebitoSteps$$EnhancerByCGLIB$$1d3afb0.Debug(\u003cgenerated\u003e)\r\n\tat com.lineadirecta.pacifika.definition.CompraTarjetaDebitoDefinition.pasos_para_pago_tarjeta_debito(CompraTarjetaDebitoDefinition.java:47)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:32)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:26)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:37)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:40)\r\n\tat cucumber.api.TestStep.executeStep(TestStep.java:102)\r\n\tat cucumber.api.TestStep.run(TestStep.java:83)\r\n\tat cucumber.api.TestCase.run(TestCase.java:58)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:80)\r\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:140)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:117)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:55)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.apache.maven.surefire.junitcore.pc.Scheduler$1.run(Scheduler.java:393)\r\n\tat org.apache.maven.surefire.junitcore.pc.InvokerStrategy.schedule(InvokerStrategy.java:54)\r\n\tat org.apache.maven.surefire.junitcore.pc.Scheduler.schedule(Scheduler.java:352)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat cucumber.api.junit.Cucumber$1.evaluate(Cucumber.java:126)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.apache.maven.surefire.junitcore.pc.Scheduler$1.run(Scheduler.java:393)\r\n\tat java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)\r\n\tat java.util.concurrent.FutureTask.run(FutureTask.java:266)\r\n\tat java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)\r\n\tat java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)\r\n\tat java.lang.Thread.run(Thread.java:745)\r\nCaused by: org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@id\u003d\u0027btnDebug\u0027]\"}\n  (Session info: chrome\u003d69.0.3497.100)\n  (Driver info: chromedriver\u003d2.37.544315 (730aa6a5fdba159ac9f4c1e8cbc59bf1b5ce12b7),platform\u003dWindows NT 6.1.7601 SP1 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.8.1\u0027, revision: \u00276e95a6684b\u0027, time: \u00272017-12-01T18:33:54.468Z\u0027\nSystem info: host: \u0027SP4L8Z362\u0027, ip: \u002710.7.28.22\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027x86\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.remote.RemoteWebDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.37.544315 (730aa6a5fdba15..., userDataDir: C:\\Users\\41QS362\\AppData\\Lo...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 69.0.3497.100, webStorageEnabled: true}\nSession ID: 73e7c99f48b47da22f076d249d6fbf02\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\u0027btnDebug\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:601)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:371)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:473)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat net.thucydides.core.webdriver.WebDriverFacade.findElement(WebDriverFacade.java:278)\r\n\tat net.serenitybdd.core.pages.WebElementResolverByLocator.resolveForDriver(WebElementResolverByLocator.java:16)\r\n\tat net.serenitybdd.core.pages.WebElementFacadeImpl.getElement(WebElementFacadeImpl.java:209)\r\n\tat net.serenitybdd.core.pages.WebElementExpectations$3.apply(WebElementExpectations.java:63)\r\n\tat net.serenitybdd.core.pages.WebElementExpectations$3.apply(WebElementExpectations.java:55)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:208)\r\n\t... 59 more\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Verifico Mensaje Pago Tarjeta Debito \"feliz\"",
  "keyword": "Then "
});
formatter.match({
  "location": "CompraTarjetaDebitoDefinition.Verifico_Mensaje_Pago_Tarjeta_Debito(String)"
});
formatter.result({
  "status": "skipped"
});
});