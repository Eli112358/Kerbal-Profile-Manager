package io.github.eli112358.kerbal.ProfileManager;

import java.io.File;
public class Main {
	public static FolderLocation installLocation = new FolderLocation("game-install");
	public static FolderLocation managerLocation = new FolderLocation("manager");
	public static StoredMap<File> mods;
	public static StoredMap<Profile> profiles;
	public static void main(String[] args) {
		if(installLocation.getProperty() == null || managerLocation.getProperty() == null) {
			setup();
		}
	}
	public static void reloadAll() {
		installLocation.reload();
		managerLocation.reload();
		mods.reload();
		profiles.reload();
	}
	public static void saveAll() {
		installLocation.save();
		managerLocation.save();
		mods.save();
		profiles.save();
	}
	private static void setup() {
	}
}
