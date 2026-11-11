val notif = NotificationCompat.Builder(context, channelId)
            .setSmallIcon(android.R.drawable.stat_notify_missed_call)
            .setContentTitle("تماس بی‌پاسخ از: $name")
            .setContentText(details)
            .setStyle(NotificationCompat.BigTextStyle().bigText("$details\nشماره تلفن: $number"))
            .setPriority(NotificationCompat.PRIORITY_HIGH)
            .setAutoCancel(true)
            .build()

        nm.notify(System.currentTimeMillis().toInt(), notif)
    }
}
