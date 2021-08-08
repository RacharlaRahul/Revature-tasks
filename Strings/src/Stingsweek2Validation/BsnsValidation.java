package Stingsweek2Validation;

public class BsnsValidation {
	public boolean isValidUserName  (String name) throws InvalidUserNameException
	{
		if(name!=null && name.matches("[a-zA-Z0-9]{1,}"))
		{
			return true;
		}
		
		else {throw new InvalidUserNameException("Please write name using letters only");}
	}
   public boolean isValidPassword (String password) throws InvalidPasswordException
   {
	   if(password!=null && password.matches("[a-zA-Z0-9@&_.]{7,}"))
	   {
		   return true;
	   }
	   else {throw new InvalidPasswordException("Invalid Password");}
   }

}
