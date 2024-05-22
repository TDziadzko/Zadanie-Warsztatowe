Feature: Adding new address

  Scenario Outline: Adding the second address as an existing user

    Given I'm on the "https://mystore-testlab.coderslab.pl"
    When I sign in using email "hhunbhpyknwhgwmqkq@tcwlx.com" and password "12345"
    And I click on the Addresses icon in Your account section
    Then I land on the "https://mystore-testlab.coderslab.pl/index.php?controller=addresses" page
    When I click at the Create new address button
    And I enter new address "<alias>", "<address>", "<city>", "<postalcode>", "<country>", "<phone>"
    Then I can see new address
    And I check if the new address contains previously entered data
    And I remove the address
    And I can see the address has been removed
    And I close the browser

    Examples:

      |alias|address|city|postalcode|country|phone|
      |Address1|Pyszałka 45|Bytom|11-111|Poland|03534523|
      |Address2|Mickiewicza 8|Krakow |22-222|United Kingdom|0456456456|
      |Address3 |Kopernika 22|Chunjo|33-553|China|0789789789|