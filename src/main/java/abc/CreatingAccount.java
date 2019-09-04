package abc;

public class CreatingAccount
{
private String name;

public CreatingAccount createAccount(String name)  //method to create account
{
	CreatingAccount acc = new CreatingAccount();
     acc.name = name;
     return acc;
}
}