package jackson.demo;

import java.util.ArrayList;
import java.util.List;

public class Demo3 {

	public final void doIt() {
		try {
			// data
			final String json = GetJSON.getJson(GetJSON.SAMPLE3);
			System.out.println(json);
			// object from json data
			final Records records = MapperSingleton.getInstance().getMapper()
					.readValue(json, Records.class);
			// print out object as json
			System.out.println(MapperSingleton.getInstance().getMapper().writeValueAsString(records));
			// create new object
			final Records newRecords = new Records();
			final Record r1 = new Record();
			r1.setId(5);
			newRecords.addRecords(r1);
			final Record r2 = new Record();
			r2.setId(5);
			newRecords.addRecords(r2);
			// print out new object as json
			System.out.println(MapperSingleton.getInstance().getMapper().writeValueAsString(newRecords));
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	public static void main(String[] args) {
		System.out.println("Start");
		final Demo3 d = new Demo3();
		d.doIt();
		System.exit(0);
	}
	
	private static final class Records {
		private List<Record> records;
		
		public Records() {
		}
		
		public final void addRecords(final Record record) {
			if(this.records == null) {
				this.records = new ArrayList<>();
			}
			this.records.add(record);
		}

		public final List<Record> getRecords() {
			return records;
		}

		public final void setRecords(List<Record> records) {
			this.records = records;
		}
	}
	
	private static final class Record {
		private Integer id;
		
		public Record(){
		}

		public final Integer getId() {
			return id;
		}

		public final void setId(Integer id) {
			this.id = id;
		}
		
	}
}
