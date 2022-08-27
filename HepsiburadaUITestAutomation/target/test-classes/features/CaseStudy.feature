Feature: Test Case Scenarios

  Background:
    Given verify that homepage is open

  Scenario Outline: give plus point to the review
    When I search for '<searchKey>'
    And I click on product number '<productNumber>' in the search result page
    And I navigate to the comments tab
    Then I give plus point to the comment number '<commentNumber>' and assert if a comment exist
    Examples:
      | searchKey | productNumber | commentNumber |
      | samsung   | 2             | 1             |