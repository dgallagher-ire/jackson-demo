package jackson.demo;

import com.fasterxml.jackson.databind.ObjectMapper;

public class MapperSingleton {

	private static MapperSingleton instance;
	private static final Object lock = new Object();
	private final ObjectMapper mapper;

	private MapperSingleton() {
		this.mapper = new ObjectMapper();
	}

	public final ObjectMapper getMapper() {
		return this.mapper;
	}

	public static final MapperSingleton getInstance() {
		if (instance == null) {
			synchronized (lock) {
				if (instance == null) {
					instance = new MapperSingleton();
				}
			}
		}
		return instance;
	}

}
