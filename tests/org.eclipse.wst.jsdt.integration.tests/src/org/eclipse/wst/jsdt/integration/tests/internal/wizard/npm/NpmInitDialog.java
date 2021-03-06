/******************************************************************************* 
 * Copyright (c) 2016 Red Hat, Inc.
 * Distributed under license by Red Hat, Inc. All rights reserved.
 * This program is made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Red Hat, Inc. - initial API and implementation
 ******************************************************************************/
package org.eclipse.wst.jsdt.integration.tests.internal.wizard.npm;

import org.jboss.reddeer.jface.wizard.NewWizardDialog;

/**
 * Represents the wizard for creating package.json file
 * 
 * @author Pavol Srna
 *
 */
public class NpmInitDialog extends NewWizardDialog {

	public NpmInitDialog() {
		super("JavaScript", "npm Init");
	}
}
