/*
 * Copyright (C) NetStruxr, Inc. All rights reserved.
 *
 * This software is published under the terms of the NetStruxr
 * Public Software License version 0.5, a copy of which has been
 * included with this distribution in the LICENSE.NPL file.  */
package er.directtoweb;

import com.webobjects.appserver.*;
import com.webobjects.eocontrol.EOEnterpriseObject;
import er.extensions.ERXLogger;

/**
 * Default custom component used when componentName = "D2WCustomComponentWithArgs" and custom component was not  specified.<br />
 * 
 */

public class ERDDefaultCustomComponent extends WOComponent {

    public ERDDefaultCustomComponent(WOContext context) { super(context); }

    /** logging support */
    public static final ERXLogger log = ERXLogger.getERXLogger(ERDDefaultCustomComponent.class);

    public boolean isStateless() { return true; }

    public EOEnterpriseObject object() { return (EOEnterpriseObject)valueForBinding("object"); }
    public String key() { return (String)valueForBinding("key"); }

    public void appendToResponse(WOResponse response, WOContext context) {
        log.warn("Using default custom component for object: " + object() + " and key: " + key());
        super.appendToResponse(response, context);
    }

}