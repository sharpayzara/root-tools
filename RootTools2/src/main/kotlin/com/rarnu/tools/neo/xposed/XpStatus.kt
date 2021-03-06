package com.rarnu.tools.neo.xposed

object XpStatus {

    enum class Mode {
        NDK, JVM
    }

    var mode = Mode.NDK

    val PKGNAME = "com.rarnu.tools.neo"
    val PREF = "settings"

    val KEY_REMOVESEARCHBAR = "removesearchbar"
    val KEY_THEMECRACK = "themecrack"
    val KEY_REMOVEAD = "removead"
    val KEY_ROOTCRACK = "rootcrack"
    val KEY_CORECRACK = "corecrack"
    val KEY_NOUPDATE = "noupate"
    val KEY_MINUS_SCREEN = "minusscreen"
    val KEY_KEEP_MTZ = "keepmtz"

    // settings
    val KEY_WORK_MODE = "work_mode"
    val KEY_AD_CHOOSE = "ad_choose"
    val KEY_DEEP_CLEAN = "deep_clean"

    // ad fucker for special apps
    val KEY_AD_WEATHER = "fuck_weather"
    val KEY_AD_MUSIC = "fuck_music"
    val KEY_AD_VIDEO = "fuck_video"
    val KEY_AD_SEARCHBOX = "fuck_searchbox"
    val KEY_AD_MMS = "fuck_mms"
    val KEY_AD_FILEEXPLORER = "fuck_fileexplorer"
    val KEY_AD_DOWNLOAD = "fuck_download"
    val KEY_AD_CLEANMASTER = "fuck_cleanmaster"
    val KEY_AD_CALENDAR = "fuck_calendar"
    val KEY_AD_BROWSER = "fuck_browser"
    val KEY_AD_THEMEMANAGER = "fuck_thememanager"
    val KEY_AD_SYSTEM = "fuck_system"
    val KEY_AD_MARKET = "fuck_market"
    val KEY_AD_SETTINGS = "fuck_settins"

    var canWriteSdcard = false

    fun isEnable(): Boolean = false
}
