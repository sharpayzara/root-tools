package com.rarnu.tools.neo.xposed.ads

import com.rarnu.tools.neo.xposed.XpUtils
import de.robv.android.xposed.XC_MethodReplacement
import de.robv.android.xposed.callbacks.XC_InitPackageResources
import de.robv.android.xposed.callbacks.XC_LoadPackage

/**
 * Created by rarnu on 11/18/16.
 */
object FuckCleanMaster {

    fun fuckCleanMaster(loadPackageParam: XC_LoadPackage.LoadPackageParam) {
        XpUtils.findAndHookMethod("com.miui.optimizecenter.result.DataModel", loadPackageParam.classLoader, "post", Map::class.java, XC_MethodReplacement.returnConstant(""))
        XpUtils.findAndHookMethod("com.miui.optimizecenter.config.MiStat", loadPackageParam.classLoader, "getChannel", XC_MethodReplacement.returnConstant("international"))
        val clsAdImageView = XpUtils.findClass(loadPackageParam.classLoader, "com.miui.optimizecenter.widget.AdImageView")
        val clsAdvertisement = XpUtils.findClass(loadPackageParam.classLoader, "com.miui.optimizecenter.result.Advertisement")
        if (clsAdImageView != null && clsAdvertisement != null) {
            XpUtils.findAndHookMethod("com.miui.optimizecenter.result.CleanResultActivity", loadPackageParam.classLoader, "startAdCountdown", clsAdImageView, clsAdvertisement, XC_MethodReplacement.returnConstant(null))
            XpUtils.findAndHookMethod("com.miui.optimizecenter.result.CleanResultActivity", loadPackageParam.classLoader, "addAdvertisementEvent", String::class.java, clsAdvertisement, XC_MethodReplacement.returnConstant(null))
        }
    }

    fun fuckResource(initPackageResourcesParam: XC_InitPackageResources.InitPackageResourcesParam) {
        initPackageResourcesParam.res.setReplacement(initPackageResourcesParam.packageName, "string", "no_network", "")
    }

}
