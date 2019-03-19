package io.github.eli112358.kerbal.ProfileManager;

import java.io.File;
public class Main {
	public static Settings settings;
	public static StoredMap<File> mods;
	public static StoredMap<Profile> profiles;
	public static void main(String[] args) {
		if(Settings.getLocationProperty() == null) {
			setup();
		}
	}
	public static void setup() {
	}
	public static void reloadAll() {
		settings.reload();
		mods.reload();
		profiles.reload();
	}
	public static void saveAll() {
		settings.save();
		mods.save();
		profiles.save();
	}
}
