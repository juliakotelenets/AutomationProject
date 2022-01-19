Feature: BBC
  As a user
  I want to test all main site functionality
  So that I can be sure that site works correctly

  Scenario Outline: Check the headline article
    Given User opens "<homePage>" page
    And User clicks on <newsSection> section button
    And User waiting for the news page to load
    Then User checks that the title matches the "<expectedHeadline>" one

    Examples:
      | homePage          |newsSection|expectedHeadline                               |
      |https://www.bbc.com|1          |Tonga says tsunami was 'unprecedented disaster'|

  Scenario Outline: Check secondary article titles
    Given User opens "<homePage>" page
    And User clicks on <newsSection> section button
    And User waiting for the news page to load
    Then User checks that article titles matches the expected

    Examples:
      | homePage            | newsSection |
      | https://www.bbc.com | 1           |

  Scenario: dss
    Given User opens Home page

  Scenario Outline: Check that headline are correct
    Given User opens "<homePage>" page
    And User clicks on <newsSection> section button
    And User waiting for the news page to load
    And User copies <firstCategory> category text of headline and paste it in search bar
    And User waiting for the search results page to load
    Then User checks that <firstArticle> article coincides "<expectations>"

    Examples:
      | homePage          | newsSection |firstCategory| firstArticle |expectations       |
      |https://www.bbc.com|1            |0            |0             |At The Edge of Asia|

  Scenario Outline: Check submit questions with empty email field
    Given User opens "<homePage>" page
    And User clicks on <newsSection> section button
    And User waiting for the news page to load
    And User clicks on news <coronavirusSection> section
    And User waiting for the news coronavirus page to load
    And User clicks on coronavirus story button
    And User clicks on questions form
    And User fills the questions field with "<questions>"
    And User fills the name field with "<name>"
    And User fills the phone number field with "<phoneNumber>"
    And User agree with conditions
    And User clicks on submit button
    Then User checks that error message is displayed

    Examples:
      | homePage          |newsSection|coronavirusSection|questions                    |name|phoneNumber  |
      |https://www.bbc.com|1          |1                 |How to subscribe to BBC news?|Sara|+380664583256|

  Scenario Outline: Check submit questions without accept terms
    Given User opens "<homePage>" page
    And User clicks on <newsSection> section button
    And User waiting for the news page to load
    And User clicks on news <coronavirusSection> section
    And User waiting for the news coronavirus page to load
    And User clicks on coronavirus story button
    And User clicks on questions form
    And User fills the questions field with "<questions>"
    And User fills the name field with "<name>"
    And User fills the email field with "<email>"
    And User fills the phone number field with "<phoneNumber>"
    And User clicks on submit button
    Then User checks that error message is displayed without agreement

    Examples:
      | homePage          |newsSection|coronavirusSection| questions                   |name| email          | phoneNumber |
      |https://www.bbc.com|1          |1                 |How to subscribe to BBC news?|Sara|lalala@gmail.com|+380664583256|

  Scenario Outline: Check submit questions with empty name field
    Given User opens "<homePage>" page
    And User clicks on <newsSection> section button
    And User waiting for the news page to load
    And User clicks on news <coronavirusSection> section
    And User waiting for the news coronavirus page to load
    And User clicks on coronavirus story button
    And User clicks on questions form
    And User fills the questions field with "<questions>"
    And User fills the email field with "<email>"
    And User fills the phone number field with "<phoneNumber>"
    And User agree with conditions
    And User clicks on submit button
    Then User checks that error message is displayed
    Examples:
      | homePage          |newsSection|coronavirusSection| questions                   | email          | phoneNumber |
      |https://www.bbc.com|1          |1                 |How to subscribe to BBC news?|lalala@gmail.com|+380664583256|

  Scenario Outline: Check that teams names and scores are correct first
    Given User opens "<homePage>" page
    And User clicks on <sportSection> section button
    And User waiting for the sport page to load
    And User clicks on sport <footballSection> section
    And User waiting for the sport football page to load
    And User clicks on sport football <scoresFixture> section
    And User finds the "<championship>"
    And User clicks on month by <indexMonth>
    Then User checks that expected "<firstTeam>", "<firstTeamScore>", "<secondTeam>", "<secondTeamScore>" of <indexOfTeamPair> team equals with actual
    And User clicks on teams by <indexOfTeamPair>
    And User waiting for the team pair page to load
    Then User checks that expected "<firstTeam>", "<firstTeamScore>", "<secondTeam>", "<secondTeamScore>" of <indexOfTeamOnPage> team equals with actual on team page

    Examples:
      | homePage          |sportSection|footballSection|scoresFixture|championship         |indexMonth|firstTeam | secondTeam    |firstTeamScore|secondTeamScore|indexOfTeamPair|indexOfTeamOnPage|
      |https://www.bbc.com|2           |1              |1            |Scottish Championship|11        |Kilmarnock|Greenock Morton|1             |1              |1              |0                |

  Scenario Outline: Check that teams names and scores are correct second
    Given User opens "<homePage>" page
    And User clicks on <sportSection> section button
    And User waiting for the sport page to load
    And User clicks on sport <footballSection> section
    And User waiting for the sport football page to load
    And User clicks on sport football <scoresFixture> section
    And User finds the "<championship>"
    And User clicks on month by <indexMonth>
    Then User checks that expected "<firstTeam>", "<firstTeamScore>", "<secondTeam>", "<secondTeamScore>" of <indexOfTeamPair> team equals with actual
    And User clicks on teams by <indexOfTeamPair>
    And User waiting for the team pair page to load
    Then User checks that expected "<firstTeam>", "<firstTeamScore>", "<secondTeam>", "<secondTeamScore>" of <indexOfTeamOnPage> team equals with actual on team page

    Examples:
      | homePage          |sportSection|footballSection|scoresFixture|championship         |indexMonth|firstTeam   |secondTeam         |firstTeamScore|secondTeamScore|indexOfTeamPair|indexOfTeamOnPage|
      |https://www.bbc.com|2           |1              |1            |Scottish Championship|0         |Raith Rovers|Heart of Midlothian|0             |4              |5              |0                |

  Scenario Outline: Check that teams names and scores are correct third
    Given User opens "<homePage>" page
    And User clicks on <sportSection> section button
    And User waiting for the sport page to load
    And User clicks on sport <footballSection> section
    And User waiting for the sport football page to load
    And User clicks on sport football <scoresFixture> section
    And User finds the "<championship>"
    And User clicks on month by <indexMonth>
    Then User checks that expected "<firstTeam>", "<firstTeamScore>", "<secondTeam>", "<secondTeamScore>" of <indexOfTeamPair> team equals with actual
    And User clicks on teams by <indexOfTeamPair>
    And User waiting for the team pair page to load
    Then User checks that expected "<firstTeam>", "<firstTeamScore>", "<secondTeam>", "<secondTeamScore>" of <indexOfTeamOnPage> team equals with actual on team page

    Examples:
      | homePage          |sportSection|footballSection|scoresFixture|championship              |indexMonth|firstTeam| secondTeam |firstTeamScore|secondTeamScore|indexOfTeamPair|indexOfTeamOnPage|
      |https://www.bbc.com|2           |1              |1            |Euro Under-21 Championship|5         |Spain U21|Portugal U21|0             |1              |1              |0                |

  Scenario Outline: Check that teams names and scores are correct fourth
    Given User opens "<homePage>" page
    And User clicks on <sportSection> section button
    And User waiting for the sport page to load
    And User clicks on sport <footballSection> section
    And User waiting for the sport football page to load
    And User clicks on sport football <scoresFixture> section
    And User finds the "<championship>"
    And User clicks on month by <indexMonth>
    Then User checks that expected "<firstTeam>", "<firstTeamScore>", "<secondTeam>", "<secondTeamScore>" of <indexOfTeamPair> team equals with actual
    And User clicks on teams by <indexOfTeamPair>
    And User waiting for the team pair page to load
    Then User checks that expected "<firstTeam>", "<firstTeamScore>", "<secondTeam>", "<secondTeamScore>" of <indexOfTeamOnPage> team equals with actual on team page

    Examples:
      | homePage          |sportSection|footballSection|scoresFixture|championship              |indexMonth|firstTeam   |secondTeam |firstTeamScore|secondTeamScore|indexOfTeamPair|indexOfTeamOnPage|
      |https://www.bbc.com|2           |1              |1            |Euro Under-21 Championship|2         |Portugal U21|England U21|2             |0              |11             |0                |

  Scenario Outline: Check that teams names and scores are correct fifth
    Given User opens "<homePage>" page
    And User clicks on <sportSection> section button
    And User waiting for the sport page to load
    And User clicks on sport <footballSection> section
    And User waiting for the sport football page to load
    And User clicks on sport football <scoresFixture> section
    And User finds the "<championship>"
    And User clicks on month by <indexMonth>
    Then User checks that expected "<firstTeam>", "<firstTeamScore>", "<secondTeam>", "<secondTeamScore>" of <indexOfTeamPair> team equals with actual
    And User clicks on teams by <indexOfTeamPair>
    And User waiting for the team pair page to load
    Then User checks that expected "<firstTeam>", "<firstTeamScore>", "<secondTeam>", "<secondTeamScore>" of <indexOfTeamOnPage> team equals with actual on team page

    Examples:
      | homePage          |sportSection|footballSection|scoresFixture|championship         |indexMonth|firstTeam          | secondTeam |firstTeamScore|secondTeamScore|indexOfTeamPair|indexOfTeamOnPage|
      |https://www.bbc.com|2           |1              |1            |Scottish Championship|0         |Heart of Midlothian|Raith Rovers|2             |3              |7              |0                |