#Author: madhes.1010@gmail.com

Feature: Tvpurchasevalidation

Background:
    Given user enter the search URL
    And user login the page

 Scenario: Sony Tv purchase by hardcode
    When search the Tv 
    And windows handling and select TV
    And takescreenshot price details
    Then quit the browser
    
  Scenario: Sony Tv purchase by direct string
    When search the Tv "Sony tv"
    And windows handling and select TV
    And takescreenshot price details
    Then quit the browser
  Scenario: Sony Tv purchase by list
    When search the Tv by oneDim list
    | realme tv | samsung tv | LG tv |
    And windows handling and select TV
    And takescreenshot price details
    Then quit the browser
    
    Scenario: Sony Tv purchase by map
    When search the Tv by oneDim map 
    |A| realme tv |
    |B| samsung tv |
    |C| Sony tv |
    And windows handling and select TV
    And takescreenshot price details
    Then quit the browser
    
    Scenario Outline: Sony Tv purchase by outline
    When search the Tv "<Television>" 
    Examples:
    | Television |
    | realme tv |
    | samsung tv |
    | Sony tv |
    And windows handling and select TV
    And takescreenshot price details
    Then quit the browser
    
    