Feature: bot for the site klavagonki

  Background: i`m on the main paige

    Given click quick start button "https://klavogonki.ru/go?type=normal"

    Scenario: BOT starts the game and enter some word
      When Start the game
      And Wait thirty seconds
      And Write word in the cycle