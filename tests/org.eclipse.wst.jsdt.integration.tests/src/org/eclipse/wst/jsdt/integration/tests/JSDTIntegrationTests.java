/******************************************************************************* 
 * Copyright (c) 2016-2017 Red Hat, Inc.
 * Distributed under license by Red Hat, Inc. All rights reserved.
 * This program is made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Red Hat, Inc. - initial API and implementation
 ******************************************************************************/

package org.eclipse.wst.jsdt.integration.tests;

import org.eclipse.wst.jsdt.integration.tests.nodejs.NodeJSDebuggerTest;
import org.eclipse.wst.jsdt.integration.tests.nodejs.NodeJSLauncherTest;
import org.eclipse.wst.jsdt.integration.tests.npm.NpmInitTest;
import org.eclipse.wst.jsdt.integration.tests.npm.NpmShortcutsTest;
import org.jboss.reddeer.junit.runner.RedDeerSuite;
import org.eclipse.wst.jsdt.integration.tests.bower.BowerInitTest;
import org.eclipse.wst.jsdt.integration.tests.bower.BowerUpdateTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(RedDeerSuite.class)
@Suite.SuiteClasses({	
	//NodeJS Debugger Tests
	NodeJSLauncherTest.class,
	NodeJSDebuggerTest.class,

	//npm
	NpmInitTest.class,
	NpmShortcutsTest.class,
	
	//Bower Tests
	BowerInitTest.class,
	BowerUpdateTest.class

	// ...
	
})
public class JSDTIntegrationTests {

}
