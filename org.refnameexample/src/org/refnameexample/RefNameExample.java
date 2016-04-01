package org.refnameexample;

import org.osgi.service.component.ComponentContext;
import org.refname.RefName;

import aQute.bnd.annotation.component.Activate;
import aQute.bnd.annotation.component.Component;
import aQute.bnd.annotation.component.Deactivate;
import aQute.bnd.annotation.component.Reference;

@Component
public class RefNameExample {
	private RefName refName;
	
	@Activate()
	public void activate(ComponentContext cc) {

	}

	@Deactivate
	public void deactivate(ComponentContext cc) {

	}
	
	@Reference(name="SomeName")
	public void bindOtherName(RefName refName) {
		this.refName = refName;
	}
}
