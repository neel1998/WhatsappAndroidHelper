package com.neel_trivedi.whatsappmessagesender;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class WhatsAppMessageSender {

    private Context mContext;
    public WhatsAppMessageSender(Context context) {
        mContext = context;
    }

    public void sendMessage(String countryCode, String contactNumber, String message) throws UnsupportedEncodingException {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        String data = "https://api.whatsapp.com/send?phone=" + countryCode + contactNumber + "&text=" + URLEncoder.encode(message, "UTF-8");
        intent.setPackage("com.whatsapp");
        intent.setData(Uri.parse(data));
        mContext.startActivity(intent);
    }
}
