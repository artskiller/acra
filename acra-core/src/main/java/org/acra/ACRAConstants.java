/*
 * Copyright (c) 2017
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.acra;

import android.content.Context;
import android.support.annotation.DrawableRes;
import android.support.annotation.StringRes;

import org.acra.model.Element;
import org.acra.model.StringElement;

/**
 * Responsible for collating those constants shared among the ACRA components.
 * 
 * @author William Ferguson
 * @since 4.3.0
 */
public final class ACRAConstants {
    private ACRAConstants(){}

    public static final String REPORTFILE_EXTENSION = ".stacktrace";

    /**
     * Suffix to be added to report files when they have been approved by the
     * user in NOTIFICATION mode
     */
    public static final String APPROVED_SUFFIX = "-approved";
    /**
     * This key is used to store the silent state of a report sent by
     * handleSilentException().
     */
    public static final String SILENT_SUFFIX = "-" + ReportField.IS_SILENT;
    /**
     * This is the maximum number of previously stored reports that we send
     * in one batch to avoid overloading the network.
     */
    public static final int MAX_SEND_REPORTS = 5;

    /**
     * Used in the intent starting CrashReportDialog to provide the name of the
     * latest generated report file in order to be able to associate the user
     * comment.
     */
    public static final String EXTRA_REPORT_FILE = "REPORT_FILE";

    /**
     * Used in the intent starting CrashReportDialog to provide the Exception that caused the crash.
     *
     * This can be used by any BaseCrashReportDialog subclass to custom the dialog.
     */
    public static final String EXTRA_REPORT_EXCEPTION = "REPORT_EXCEPTION";

    /**
     * Used in the intent starting CrashReportDialog to provide the AcraConfig to use when gathering the crash info.
     *
     * This can be used by any BaseCrashReportDialog subclass to custom the dialog.
     */
    public static final String EXTRA_REPORT_CONFIG = "REPORT_CONFIG";
    /**
     * This is the identifier (value = 666) use for the status bar notification issued when crashes occur.
     */
    public static final int NOTIF_CRASH_ID = 666;
    /**
     * Number of milliseconds to wait after displaying a toast.
     */
    public static final int TOAST_WAIT_DURATION = 2000;

    /**
     * A special String value to allow the usage of a pseudo-null default value
     * in annotation parameters.
     */
    public static final String NULL_VALUE = "ACRA-NULL-STRING";

    public static final boolean DEFAULT_REPORT_TO_ANDROID_FRAMEWORK = false;

    public static final int DEFAULT_SOCKET_TIMEOUT = 20000;

    public static final int DEFAULT_CONNECTION_TIMEOUT = 5000;

    public static final boolean DEFAULT_DELETE_UNAPPROVED_REPORTS_ON_APPLICATION_START = true;

    public static final boolean DEFAULT_DELETE_OLD_UNSENT_REPORTS_ON_APPLICATION_START = true;

    public static final int DEFAULT_DROPBOX_COLLECTION_MINUTES = 5;

    public static final boolean DEFAULT_INCLUDE_DROPBOX_SYSTEM_TAGS = false;

    public static final int DEFAULT_SHARED_PREFERENCES_MODE = Context.MODE_PRIVATE;

    @DrawableRes
    public static final int DEFAULT_NOTIFICATION_ICON = android.R.drawable.stat_notify_error;

    @DrawableRes
    public static final int DEFAULT_DIALOG_ICON = android.R.drawable.ic_dialog_alert;

    @StringRes
    public static final int DEFAULT_DIALOG_POSITIVE_BUTTON_TEXT = android.R.string.ok;

    @StringRes
    public static final int DEFAULT_DIALOG_NEGATIVE_BUTTON_TEXT = android.R.string.cancel;

    public static final int DEFAULT_RES_VALUE = 0;

    public static final String DEFAULT_STRING_VALUE = "";

    public static final int DEFAULT_LOGCAT_LINES = 100;

    public static final int DEFAULT_BUFFER_SIZE_IN_BYTES = 8192;

    public static final boolean DEFAULT_LOGCAT_FILTER_BY_PID = false;

    public static final boolean DEFAULT_NON_BLOCKING_READ_FOR_LOGCAT = false;

    public static final boolean DEFAULT_SEND_REPORTS_IN_DEV_MODE = true;

    public static final String DEFAULT_APPLICATION_LOGFILE = DEFAULT_STRING_VALUE;

    public static final int DEFAULT_APPLICATION_LOGFILE_LINES = DEFAULT_LOGCAT_LINES;

    /**
     * Default list of {@link ReportField}s to be sent in reports. You can set
     * your own list with
     * {@link org.acra.annotation.AcraCore#reportContent()}.
     */
    public static final ReportField[] DEFAULT_REPORT_FIELDS = { ReportField.REPORT_ID, ReportField.APP_VERSION_CODE, ReportField.APP_VERSION_NAME,
            ReportField.PACKAGE_NAME, ReportField.FILE_PATH, ReportField.PHONE_MODEL, ReportField.BRAND, ReportField.PRODUCT, ReportField.ANDROID_VERSION, ReportField.BUILD, ReportField.TOTAL_MEM_SIZE,
            ReportField.AVAILABLE_MEM_SIZE, ReportField.BUILD_CONFIG, ReportField.CUSTOM_DATA, ReportField.IS_SILENT, ReportField.STACK_TRACE, ReportField.INITIAL_CONFIGURATION, ReportField.CRASH_CONFIGURATION,
            ReportField.DISPLAY, ReportField.USER_COMMENT, ReportField.USER_EMAIL, ReportField.USER_APP_START_DATE, ReportField.USER_CRASH_DATE, ReportField.DUMPSYS_MEMINFO, ReportField.LOGCAT,
            ReportField.INSTALLATION_ID, ReportField.DEVICE_FEATURES, ReportField.ENVIRONMENT, ReportField.SHARED_PREFERENCES };

    public static final String DATE_TIME_FORMAT_STRING = "yyyy-MM-dd'T'HH:mm:ss.SSSZZZZZ";

    public static final String DEFAULT_CERTIFICATE_TYPE = "X.509";

    public static final Element NOT_AVAILABLE = new StringElement("N/A");

    public static final String UTF8 = "UTF-8";
}
