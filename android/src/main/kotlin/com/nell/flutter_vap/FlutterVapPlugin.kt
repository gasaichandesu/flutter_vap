package com.nell.flutter_vap

import androidx.annotation.NonNull

import io.flutter.embedding.engine.plugins.FlutterPlugin
import android.util.Log

class FlutterVapPlugin : FlutterPlugin {

    override fun onAttachedToEngine(@NonNull flutterPluginBinding: FlutterPlugin.FlutterPluginBinding) {
        flutterPluginBinding.platformViewRegistry.registerViewFactory("flutter_vap", NativeVapViewFactory(flutterPluginBinding.binaryMessenger))
        Log.d("flutter_vap", "Successfully registered vap plugin!!!")
    }

    override fun onDetachedFromEngine(@NonNull binding: FlutterPlugin.FlutterPluginBinding) {
    }
}
