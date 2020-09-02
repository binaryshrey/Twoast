package com.example.twoast;

import android.content.Context;
import android.widget.Toast;

public class Twoast {
    public static void Text(Context context, String message){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
