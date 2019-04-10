package com.acme.ecm.core.storage;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.nuxeo.ecm.core.api.DocumentLocation;
import org.nuxeo.ecm.core.storage.DefaultFulltextParser;

public class CustomFulltextParser extends DefaultFulltextParser {

    protected static final Log log = LogFactory.getLog(CustomFulltextParser.class);

    @Override
    public void parse(String s, String path, String mimeType, DocumentLocation documentLocation, List<String> strings) {
        if (log.isDebugEnabled()) {
            log.debug("<parse> path: [" + path + "] string: [" + s + "] documentLocation: " + documentLocation);
        }
        super.parse(s, path, mimeType, documentLocation, strings);
        if ("dc:title".equals(path)) {
            strings.add(s);
        }
        if (log.isDebugEnabled()) {
            log.debug("<parse> strings: " + strings);
        }
    }

}
