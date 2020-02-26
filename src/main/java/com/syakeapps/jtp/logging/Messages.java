package com.syakeapps.jtp.logging;

import ch.qos.cal10n.BaseName;
import ch.qos.cal10n.Locale;
import ch.qos.cal10n.LocaleData;

/**
 * Enum of logging messages.
 */
@BaseName("messages")
@LocaleData(defaultCharset = "UTF8",
        value = { @Locale("en_US"), @Locale("ja_JP") })
public enum Messages {
    EXAMPLE
}
