package io.github.eli112358.kerbal.ProfileManager;

import java.io.File;
import java.util.ArrayList;
public class Profile implements Stored {
	private boolean active = false;
	private String name;
	private File file;
	private ArrayList<String> mods;
	public Profile(String name) {
		this.name=name;
	}
	public Profile(File file) {
		this.file=file;
	}
	public String getName() {
		return name;
	}
	public File getFile() {
		return file;
	}
	public ArrayList<String> getMods() {
		return mods;
	}
	public void addMod(String mod) {
		mods.add(mod);
		mods.sort(String::compareToIgnoreCase);
	}
	public boolean removeMod(String mod) {
		return mods.remove(mod);
	}
	public boolean isActive() {
		return active;
	}
	public void activate() {
	}
	@Override
	public void reload() {
	}
	@Override
	public void save() {
	}
}
