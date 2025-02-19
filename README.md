# 02_A_Selenium4_JavaDocCoverage


Review: ChromeOptions is captured for the CH90 Obsolete runner:-
            See section: d_WebDriver_methods


Validate WAIT functionality using Selenium4 libraries
    WAIT
        EXPLICIT 
                    .urlContains("google"))
                    WebElement firstResult1 = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//a/h3")));
        FLUENT
                    Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                       .withTimeout(Duration.ofSeconds(30))
                       .pollingEvery(Duration.ofSeconds(5))
                       .ignoring(NoSuchElementException.class);
        TRY WAITS
                    try {
                    Thread.sleep(10000);
                    } catch (InterruptedException e) {
                    e.printStackTrace();


Validate Lambda functionality
    Review ERR's 


