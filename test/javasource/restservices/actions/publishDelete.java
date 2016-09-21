// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package restservices.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * Publish the deletion of the provided object to the outer world. This makes sure all external parties relying on the *changes* api of the service to receive an update. 
 * 
 * Note that normal GET operations will work also without publishUpdate actions. 
 * 
 * publishDelete can be used in afterDelete events
 */
public class publishDelete extends CustomJavaAction<Boolean>
{
	private IMendixObject source;

	public publishDelete(IContext context, IMendixObject source)
	{
		super(context);
		this.source = source;
	}

	@Override
	public Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		throw new com.mendix.systemwideinterfaces.MendixRuntimeException("Java action was not implemented");
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "publishDelete";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
