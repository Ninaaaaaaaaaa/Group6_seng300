Need to use Mysql and MysqlWorkbench in order to test the Login Window.

	-Run the userDB.sql file in your MysqlWorkbench to create a sql table(name is users) in the local host

	-change the username and password in database.peoperties to your Mysql localhost's username and password
Need to add mysql-connector-java-8.0.18.jar into Java Build Path(if you're using Eclipse).
	
	-right click project.
	-click 'Properties'.
	-find 'Java Build Path'.
	-choose'Add JARs...'.
	-choose 'JournalSystem'.
	-choose'lib'.
	-choose'mysql-connector-java-8.0.18.jar'.
	-click 'OK'.
	-click'Apply and Close'.
	

Achieved functionalities:
	
	1.Login Window GUI.
	2.Profile Window GUI.
	3.Submit Window GUI.
	3.Connected Login Window to Mysql database and retrive data.
	4.Validate user input username and password.

Unachieved funtionalities:
	
	1.Not be able to switch between Login/Profile/Submit


