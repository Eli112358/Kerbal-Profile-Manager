package io.github.eli112358.kerbal.ProfileManager;

import java.io.File;
public class FolderLocation implements Stored {
	private static final String propertyPrefix= "Kerbal-Profile-Manager-";
	private String propertySuffix;
	private File file;
	public FolderLocation(String propertySuffix) {
		this.propertySuffix = propertySuffix;
	}
	public File getFile() {
		return file;
	}
	public String getProperty() {
		return System.getProperty(propertyPrefix + propertySuffix);
	}
	public void setProperty(File location) {
		System.setProperty(propertyPrefix + propertySuffix, location.getAbsolutePath());
		reload();
	}
	@Override
	public void reload() {
		this.file = new File(getProperty());
	}
	@Override
	public void save() {
	}
}
