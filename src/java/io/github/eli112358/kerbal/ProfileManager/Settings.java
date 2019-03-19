package io.github.eli112358.kerbal.ProfileManager;

import java.io.File;
public class Settings implements Stored {
	static final String locationProperty = "Kerbal-Profile-Manager-settings-file";
	private File file;
	public static String getLocationProperty() {
		return System.getProperty(locationProperty);
	}
	@Override
	public void reload() {
	}
	@Override
	public void save() {
	}
}
