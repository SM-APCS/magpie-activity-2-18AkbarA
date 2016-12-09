/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity2;
/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Mr. T
 * @version December 2016
 */

public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		if(statement.equals("")){
			response = "Enter something, you fool!";
		}
		else if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (statement.indexOf("mantis") >= 0)
		{
			response = "Ah. I have heard of this ‘praying mantis’.";
		}
		else if (statement.indexOf("car") >= 0)
		{
			response = "Do you like Ferraris?";
		}
		else if (statement.indexOf("test") >= 0)
		{
			response = "Hope you do well.";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		
		else if (statement.indexOf("dog") > -1 || statement.indexOf("cat") > -1){
			response = "Tell me more about your pets.";
		}
		
		else if (statement.indexOf("mr. tholking") > -1 || statement.indexOf("mr tholking") > -1){
			response = "That dude sounds cool, bro.";
		}
		
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
		else if (whichResponse == 4)
		{
			response = "Huh. I see.";
		}
		else if (whichResponse == 5)
		{
			response = "Cool story bro. Don't tell it again.";
		}
		
		return response;
	}
}
