Feature: Open site

  Scenario: Verify if the site loads
    Given  site http://sampleapp.tricentis.com/101/app.php
    When It loads
    Then Check title and some fields