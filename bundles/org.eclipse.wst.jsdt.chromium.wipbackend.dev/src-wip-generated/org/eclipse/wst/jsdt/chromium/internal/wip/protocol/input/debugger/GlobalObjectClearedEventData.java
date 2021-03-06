// Generated source.
// Generator: org.eclipse.wst.jsdt.chromium.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/trunk/Source/devtools/protocol.json@<unknown>

package org.eclipse.wst.jsdt.chromium.internal.wip.protocol.input.debugger;

/**
 Called when global has been cleared and debugger client should reset its state. Happens upon navigation or reload.
 */
@org.eclipse.wst.jsdt.chromium.internal.protocolparser.JsonType(allowsOtherProperties=true)
public interface GlobalObjectClearedEventData extends org.eclipse.wst.jsdt.chromium.internal.protocolparser.JsonObjectBased {
  public static final org.eclipse.wst.jsdt.chromium.internal.wip.protocol.input.WipEventType<org.eclipse.wst.jsdt.chromium.internal.wip.protocol.input.debugger.GlobalObjectClearedEventData> TYPE
      = new org.eclipse.wst.jsdt.chromium.internal.wip.protocol.input.WipEventType<org.eclipse.wst.jsdt.chromium.internal.wip.protocol.input.debugger.GlobalObjectClearedEventData>("Debugger.globalObjectCleared", org.eclipse.wst.jsdt.chromium.internal.wip.protocol.input.debugger.GlobalObjectClearedEventData.class) {
    @Override public org.eclipse.wst.jsdt.chromium.internal.wip.protocol.input.debugger.GlobalObjectClearedEventData parse(org.eclipse.wst.jsdt.chromium.internal.wip.protocol.input.WipGeneratedParserRoot parser, org.json.simple.JSONObject obj) throws org.eclipse.wst.jsdt.chromium.internal.protocolparser.JsonProtocolParseException {
      return parser.parseDebuggerGlobalObjectClearedEventData(obj);
    }
  };
}
