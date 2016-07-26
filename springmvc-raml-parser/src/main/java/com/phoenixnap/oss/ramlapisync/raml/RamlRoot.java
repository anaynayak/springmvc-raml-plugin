package com.phoenixnap.oss.ramlapisync.raml;

import java.util.List;
import java.util.Map;

/**
 * @author armin.weisser
 */
public interface RamlRoot extends RamlResourceRoot {

    String getMediaType();

    List<Map<String, String>> getSchemas();

    void setBaseUri(String baseUri);

    void setVersion(String version);

    void setTitle(String title);

    void setDocumentation(List<RamlDocumentationItem> documentationItems);

    void setMediaType(String mediaType);

    String getBaseUri();
}