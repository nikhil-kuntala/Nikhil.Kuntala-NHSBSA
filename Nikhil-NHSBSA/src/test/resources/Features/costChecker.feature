Feature: feature to test the NHS Cost Checker Functionality

  Scenario Outline: Check if we get a result on submitting the answers for England
    Given the User is on Start page
    And the user clicks on Start Now button
    When the User selects the Country they Live in as England
    And the User selects whether their GP is out of England as NO
    And the User Selects which Country is their Dental Practice in as England
    And the User enters their DOB as <DD> <MM> <YYYY>
    And the User selects if they have a partner as Yes
    And the User selects if they claim any benefits or tax credits as No
    And the User answers if they are pregnant or had child in last year as No
    And the User selects if they have any injury or illness due to Army Service as No
    And the User selects if they have diabetes as Yes
    And the User selects if they are affected by any serious conditions as No
    And the User selects if they live in care home as No
    And the User selects if they have more than 16K savings as Yes
    Then the User is shown the NHS Costs Status in result page

    Examples: 
      | DD | MM | YYYY |
      | 23 | 06 | 1996 |

  Scenario Outline: Check if we get a result on submitting the answers for Scotland
    Given the User is on Start page
    And the user clicks on Start Now button
    When the User selects the Country they Live in as Scotland
    And the User selects whether they live in highlands as No
    And the User Selects which Country is their Dental Practice in as Scotland
    And the User enters their DOB as <DD> <MM> <YYYY>
    And the User selects if they have a partner as No
    And the User selects if they claim any benefits or tax credits as No
    And the User answers if they are pregnant or had child in last year as Yes
    And the User selects if they have any injury or illness due to Army Service as Yes
    And the User selects if they live in care home as Yes
    And the User selects if they have more than 16K savings as No
    Then the User is shown the NHS Costs Status in result page

    Examples: 
      | DD | MM | YYYY |
      | 26 | 07 | 1998 |

  Scenario Outline: Check if we get a result on submitting the answers for Wales
    Given the User is on Start page
    And the user clicks on Start Now button
    When the User selects the Country they Live in as Wales
    And the User selects whether their GP is out of England as Yes
    And the User Selects which Country is their Dental Practice in as Wales
    And the User enters their DOB as <DD> <MM> <YYYY>
    And the User selects if they have a partner as No
    And the User selects if they claim any benefits or tax credits as No
    And the User answers if they are pregnant or had child in last year as Yes
    And the User selects if they have any injury or illness due to Army Service as No
    And the User selects if they have diabetes as No
    And the User selects if they have glaucoma as Yes
    And the User selects if they live in care home as No
    And the User selects if they have more than 16K savings as Yes
    Then the User is shown the NHS Costs Status in result page

    Examples: 
      | DD | MM | YYYY |
      | 09 | 08 | 1987 |

  Scenario Outline: Check if we get a result on submitting the answers for Northern Ireland
    Given the User is on Start page
    And the user clicks on Start Now button
    When the User selects the Country they Live in as Northern Ireland
    Then the User is shown the service unavailable message in result page

  Scenario Outline: Check if we get an error message if we click next without selecting any option
    Given the User is on Start page
    And the user clicks on Start Now button
    When the User clicks on next button without selecting any option
    Then the User is shown an error message
