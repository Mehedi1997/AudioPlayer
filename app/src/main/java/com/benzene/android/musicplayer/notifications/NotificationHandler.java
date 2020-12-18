//package com.benzene.android.musicplayer.notifications;
//
//import android.content.Context;
//
//import com.google.android.gms.analytics.HitBuilders;
//import com.o3dr.android.client.Drone;
//import com.o3dr.services.android.lib.drone.attribute.error.ErrorType;
//import com.uavstation.android.utils.analytics.GAUtils;
//
///**
// * This class handles DroidPlanner's status bar, and audible notifications. It
// * also provides support for the Android Wear functionality.
// */
//public class NotificationHandler {
//
//    /**
//     * Defines the methods that need to be supported by Droidplanner's
//     * notification provider types (i.e: audible (text to speech), status bar).
//     */
//    interface NotificationProvider {
//        void init();
//
//        /**
//         * Release resources used by the provider.
//         */
//        void onTerminate();
//    }
//
//    /**
//     * Handles Droidplanner's status bar notification.
//     */
//    private final StatusBarNotificationProvider mStatusBarNotification;
//
//    private final Context context;
//
//    public NotificationHandler(Context context, Drone drone) {
//        this.context = context;
//        mStatusBarNotification = new StatusBarNotificationProvider(context, drone);
//    }
//
//    public void onAutopilotError(String errorName) {
//        final ErrorType errorType = ErrorType.getErrorById(errorName);
//        if (errorType != null && ErrorType.NO_ERROR != errorType) {
//            final HitBuilders.EventBuilder eventBuilder = new HitBuilders.EventBuilder()
//                    .setCategory(GAUtils.Category.FAILSAFE)
//                    .setAction("Autopilot error")
//                    .setLabel(errorType.getLabel(context).toString());
//            GAUtils.sendEvent(eventBuilder);
//        }
//    }
//
//    public void init() {
//        mStatusBarNotification.init();
//    }
//
//    public void terminate() {
//        mStatusBarNotification.onTerminate();
//    }
//}
