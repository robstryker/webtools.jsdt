/*******************************************************************************
 * Copyright (c) 2010 IBM Corporation and others All rights reserved. This
 * program and the accompanying materials are made available under the terms of
 * the Eclipse Public License v1.0 which accompanies this distribution, and is
 * available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.wst.jsdt.debug.core.jsdi.connect;


/**
 * A {@link DisconnectedException} is thrown by either of the {@link PacketSendManager}
 * or {@link PacketReceiveManager} when a request is made and they have been disconnected
 * 
 * @since 1.0
 */
public final class DisconnectedException extends Exception {

	/**
	 * Constructor
	 * 
	 * @param message
	 * @param exception
	 */
	public DisconnectedException(String message, Exception exception) {
		super(message, exception);
	}
}
