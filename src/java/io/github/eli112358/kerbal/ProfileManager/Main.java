package io.github.eli112358.kerbal.ProfileManager;

import java.io.File;
import java.util.HashMap;
public class Main {
	public static File settingsFile;
	public static HashMap<String, File> settings = new HashMap<>();
	public static HashMap<String, File> mods = new HashMap<>();
	public static HashMap<String, Profile> profiles = new HashMap<>();
	public static void main(String[] args) {
	}
	public static void reloadAll() {
		reloadMods();
		reloadProfiles();
		reloadSettings();
	}
	public static void reloadMods() {
	}
	public static void reloadProfiles() {
	}
	public static void reloadSettings() {
	}
	public static void saveAll() {
		saveMods();
		saveProfiles();
		saveSettings();
	}
	public static void saveMods() {
	}
	public static void saveProfiles() {
	}
	public static void saveSettings() {
	}
}
