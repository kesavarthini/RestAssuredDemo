Feature:
  Verify different GET operations using REST-assured


#  Scenario Outline: Verify one author of the Post
#    Given I perform GET operation for "/post"
#    And I verify that the status code is ok for "<URL>" and "<postNumber>"
#    And I verify the title for the "<URL>" and post number "<postNumber>" and the "<title>"
#
#  Examples:
#    |                     URL                          |postNumber| title    |
#    |     http://localhost:3000/posts/                 |  1       | daksh    |
#    |     http://localhost:3000/posts/                 |  2       | Mohana M |
#
#
#
#  Scenario Outline: Verify successfully POST addition of a new user
#    Given I perform the POST request for the new User at "<URL>"
#
#
#    Examples:
#    |URL                                    |
##    | http://localhost:3000/posts           |
#    |http://dummy.restapiexample.com/create |
#
#  Scenario Outline: Verify Parameter of GET
#    Given I perform GET operation for "/post"
#    And I verify the title for the "<URL>" and the "<title>" for GET Parameters
#
#    Examples:
#      |                     URL                          | title    |
#      |     http://localhost:3000/posts/                 | daksh    |

  Scenario Outline: Verify Query Parameter of GET
    Given I perform GET operation for "/post"
    And I verify the title for the "<URL>" and the "<title>" for GET Query Parameters

    Examples:
      |                     URL                          | title    |
      |     http://localhost:3000/posts/                 | daksh    |


