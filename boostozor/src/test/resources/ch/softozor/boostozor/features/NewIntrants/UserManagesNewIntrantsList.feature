Feature: User manages new intrants list
  As a User,
  I want to access my list of new intrants
  so that I can take further action

	# TODO: create branch for this

  Background: The User is logged in
    Given the User is logged in

	Scenario: The User adds intrants to the list
		Given the User's new intrants list is empty
		When he adds the following items to it
			| title 						| description |
			| go to the library | blablabla   |
			| buy carrots       | blabla      | 
			| visit grandma     | tralala     |
		Then his new intrants list contains those items timestamped

	# TODO: remove this
  Scenario: Display list of new intrants
    Given the User has a non-empty list of new intrants
    When the User fetches his new intrants list
    Then he gets his new intrants
		  # title
		  # description
		  # attachments
		  # timestamp