### WhatsApp Android Helper

[![](https://jitpack.io/v/neel1998/WhatsappAndroidHelper.svg)](https://jitpack.io/#neel1998/WhatsappAndroidHelper)

This Android library allows to send messages from your Android app to any phone number (even unsaved) on WhatsApp.

### Depedency

To use this library add following repository in your `build.gradle` file.

```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
And then in `app.gradle` file add the following dependecy,

```
dependencies {
	        implementation 'com.github.neel1998:WhatsappAndroidHelper:1.0.1'
	}
```

### How to use

Using this library is absolutely easy. All you need to do is create an instance of `WhatsAppMessageSender` class and then call `sendMessage` method. This method takes the following three arguments:

1. Country code (String): Country code for phone number without preceeding "+". eg for India use "91"
2. Phone number (String): Phone number to which you wish to send the message. This number need not be saved in your contact but must be registered on whatsapp.
3. Message (String): The message you wish to send.

The following code snippet shows how to use this method,

```
import com.neel_trivedi.whatsappmessagesender.WhatsAppMessageSender;

import java.io.UnsupportedEncodingException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WhatsAppMessageSender messageSender = new WhatsAppMessageSender(this);
        try {
            messageSender.sendMessage("91", "8780679804", "hey there!");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}

```

### Contribute

If you find any issues bug do report on Github or file a PR. Thanks.
