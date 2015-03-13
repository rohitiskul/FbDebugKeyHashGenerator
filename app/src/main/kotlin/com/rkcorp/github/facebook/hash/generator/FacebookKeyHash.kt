package com.rkcorp.github.facebook.hash.generator;

import android.content.Context
import android.content.pm.PackageManager
import android.content.pm.Signature
import java.security.MessageDigest
import android.util.Base64

/**
 *
 * Created by Rohit.Kulkarni on 3/13/15.
 */
class FacebookKeyHash(var context: Context) {

    fun generate(packageName: String): String {
        var keyHash = "";
        var pkgInfo = context.getPackageManager().getPackageInfo(packageName, PackageManager.GET_SIGNATURES)
        for (signature: Signature in pkgInfo.signatures) {
            val md = MessageDigest.getInstance("SHA")
            md.update(signature.toByteArray())
            keyHash = Base64.encodeToString(md.digest(), Base64.DEFAULT)
        }
        return keyHash
    }
}