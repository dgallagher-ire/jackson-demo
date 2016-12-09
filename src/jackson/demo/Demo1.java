package jackson.demo;

/*
 * Convert JSON into a Java class
 */
public class Demo1 {

	public Demo1() {
	}

	public final void doIt() {
		try {
			final String json = GetJSON.getJson(GetJSON.SAMPLE1);
			System.out.println(json);
			final Person1 person1 = MapperSingleton.getInstance().getMapper()
					.readValue(json, Person1.class);
			System.out.println(person1.toString());
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	public static void main(String[] args) {
		System.out.println("Start");
		final Demo1 d1 = new Demo1();
		d1.doIt();
		System.exit(0);
	}

}
