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

public class GetNrOfIncomingConnections extends CustomJavaAction<Long>
{
	private IMendixObject __index;
	private restservices.proxies.ChangeLog index;

	public GetNrOfIncomingConnections(IContext context, IMendixObject index)
	{
		super(context);
		this.__index = index;
	}

	@Override
	public Long executeAction() throws Exception
	{
		this.index = __index == null ? null : restservices.proxies.ChangeLog.initialize(getContext(), __index);

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
		return "GetNrOfIncomingConnections";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
