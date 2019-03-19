package io.github.eli112358.kerbal.ProfileManager;

import java.io.File;
import java.util.HashMap;
public class StoredMap<T> extends HashMap<String, T> implements Stored {
	private File file;
	public StoredMap(File file) {
		this.file=file;
	}
	@Override
	public void reload() {
	}
	@Override
	public void save() {
	}
}
