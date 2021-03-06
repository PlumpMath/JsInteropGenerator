package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "HTMLQuoteElement"
)
interface HTMLQuoteElement extends HTMLElement {
  @JsProperty
  String getCite();

  @JsProperty
  void setCite(String value);
}
