package io.github.eli112358.kerbal.ProfileManager;

import java.io.File;
public class Main {
	public static Settings settings;
	public static StoredMap<File> mods;
	public static StoredMap<Profile> profiles;
	public static void main(String[] args) {
		if(System.getProperty(Settings.locationProperty) == null) {
			setup();
		}
	}
	public static void setup() {
	}
	public static void reloadAll() {
		mods.reload();
		profiles.reload();
		settings.reload();
	}
	public static void saveAll() {
		settings.save();
		mods.save();
		profiles.save();
	}
}
