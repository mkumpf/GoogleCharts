// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package excelimporter.proxies;

public enum ReferenceDataHandling
{
	Overwrite(new String[][] { new String[] { "en_US", "Overwrite" }, new String[] { "nl_NL", "Overschrijven" }, new String[] { "en_GB", "Overwrite" }, new String[] { "en_ZA", "Overwrite" } }),
	Append(new String[][] { new String[] { "en_US", "Append" }, new String[] { "nl_NL", "Aanvullen" }, new String[] { "en_GB", "Append" }, new String[] { "en_ZA", "Append" } });

	private java.util.Map<String,String> captions;

	private ReferenceDataHandling(String[][] captionStrings)
	{
		this.captions = new java.util.HashMap<String,String>();
		for (String[] captionString : captionStrings)
			captions.put(captionString[0], captionString[1]);
	}

	public String getCaption(String languageCode)
	{
		if (captions.containsKey(languageCode))
			return captions.get(languageCode);
		return captions.get("en_US");
	}

	public String getCaption()
	{
		return captions.get("en_US");
	}
}
