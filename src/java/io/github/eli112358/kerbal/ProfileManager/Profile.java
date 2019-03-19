package io.github.eli112358.kerbal.ProfileManager;

import java.io.File;
import java.util.ArrayList;
public class Profile {
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
	public void reload() {
	}
	public File getFile() {
		return file;
	}
}
