// Generated source.
// Generator: org.eclipse.wst.jsdt.chromium.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/trunk/Source/devtools/protocol.json@<unknown>

package org.eclipse.wst.jsdt.chromium.internal.wip.protocol.input.network;

/**
 Returns all browser cookies. Depending on the backend support, will return detailed cookie information in the <code>cookies</code> field.
 */
@org.eclipse.wst.jsdt.chromium.internal.protocolparser.JsonType
public interface GetCookiesData {
  /**
   Array of cookie objects.
   */
  java.util.List<org.eclipse.wst.jsdt.chromium.internal.wip.protocol.input.network.CookieValue> cookies();

}
