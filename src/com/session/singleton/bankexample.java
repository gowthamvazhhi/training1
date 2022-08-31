package com.session.singleton;

class Database {
	private static Database dbObject;

	private Database() {
	}

	public static Database getInstance() {

		// create object if it's not already created
		if (dbObject == null) {
			synchronized (Database.class) {
				if (dbObject == null) {
					dbObject = new Database();
				}
			}

		}

		// returns the singleton object
		return dbObject;
	}

	public void getConnection() {
		System.out.println("You are now connected to the database.");
	}
}

class Main {
	public static void main(String[] args) {

		long start;
		long end;
		// refers to the only object of Database
		Database db1 = Database.getInstance();
		System.out.println("The hashcode is " + db1.hashCode());
		start = System.currentTimeMillis();
		db1.getConnection();
		end = System.currentTimeMillis();
		System.out.println(end - start);

		Database db2 = Database.getInstance();
		System.out.println("The hashcode is " + db2.hashCode());
		start = System.currentTimeMillis();
		db2.getConnection();
		end = System.currentTimeMillis();
		System.out.println(end - start);

	}
}
