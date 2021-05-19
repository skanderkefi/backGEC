@tag
Feature: Admin can get all users.

	Scenario: Admin get list of users
		Given Admin has an empty list of users
		When Admin get all users from database
		Then list can not be empty 
		
  @tag2
  Scenario: There is no users in the database
		Given Admin has empty list of users
		When Admin search all users from database
		Then list must be empty 