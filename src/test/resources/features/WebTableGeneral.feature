Feature: Some of the general functionality verifications

  Scenario: Dropdown options verification

    Given user is already logged in to The Web table app
    When user is on the Order page
    Then user sees below options under “product” dropdown
      | MoneyCog   |
      | Familybea  |
      | Screenable |

  Scenario: Payment option verification

    Given user is already logged in to The Web table app
    When user is on the Order page
    Then user sees Visa as enabled option
    Then user sees MasterCard as enabled option
    Then user sees American Express as enabled option


  Scenario:
    Given user is already logged in to The Web table app
    When user is on the Order page
    Then user enters quantity "2"
    Then user clicks calculate button
    Then user enters customer name "Jane Doe"
    Then user enters street "7th Street"
    Then user enters city "New York"
    Then user enters state "New York"
    Then user enters zip "99999"
    Then user selects payment option "American Express"
    Then user credit card number "9999999999999999"
    Then user enters expiration date "12/25"
    Then user clicks to process order button
    Then user should see "Jane Doe" in the first row of web table

  @wips
  Scenario Outline:
    Given user is already logged in to The Web table app
    When user is on the Order page
    Then user enters quantity "<quantity>"
    Then user clicks calculate button
    Then user enters customer name "<fullName>"
    Then user enters street "<street>"
    Then user enters city "<city>"
    Then user enters state "<state>"
    Then user enters zip "<zip>"
    Then user selects payment option "<cardType>"
    Then user credit card number "<cardNumber>"
    Then user enters expiration date "<expDate>"
    Then user clicks to process order button
    Then user should see "<expectedName>" in the first row of web table
    Examples:
      | quantity | fullName | street     | city | state | zip   | cardType | cardNumber       | expDate | expectedName |
      | 3        | John Doe | 7th street | NY   | NY    | 99999 | Visa      | 9999999999999999 | 12/25   | John Doe     |
      | 3        | Jane Doe | 7th street | NY   | NY    | 99999 | Visa      | 9999999999999999 | 12/25   | Jane Doe     |
      | 3        | Jack Doe | 7th street | NY   | NY    | 99999 | Visa      | 9999999999999999 | 12/25   | Jack Doe     |
      #| 3        | Jen Doe  | 7th street | NY   | NY    | 99999 | Visa      | 9999999999999999 | 12/25   | Jen Doe      |
      #| 3        | Mike Doe | 7th street | NY   | NY    | 99999 | Visa      | 9999999999999999 | 12/25   | Mike Doe     |
      #| 3        | Mary Doe | 7th street | NY   | NY    | 99999 | Visa      | 9999999999999999 | 12/25   | Mary Doe     |








