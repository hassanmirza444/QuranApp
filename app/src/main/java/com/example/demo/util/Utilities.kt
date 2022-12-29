package com.example.demo.util

import android.content.Context
import android.widget.Toast

object Utilities {
    fun showToast(context: Context, msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }

    fun EnglishToArabic(text: String): String {
        var localizedNumber = text
        //  if (HelperFunctions.getCurrentLocale() == "ar") {
        localizedNumber = (text + "")
            .replace("1".toRegex(), "١").replace("2".toRegex(), "٢")
            .replace("3".toRegex(), "٣").replace("4".toRegex(), "٤")
            .replace("5".toRegex(), "٥").replace("6".toRegex(), "٦")
            .replace("7".toRegex(), "٧").replace("8".toRegex(), "٨")
            .replace("9".toRegex(), "٩").replace("0".toRegex(), "٠")
        //   }
        return localizedNumber
    }

    fun isPalindrome(inputString: String): Boolean {
        val sb = StringBuilder(inputString)

        //reverse the string
        val reverseStr = sb.reverse().toString()

        //compare reversed string with input string
        return inputString.equals(reverseStr, ignoreCase = true)
    }

    fun EnglishToArabicReversed(text: String): String {
        var localizedNumber = text
        //  if (HelperFunctions.getCurrentLocale() == "ar") {
        localizedNumber = (text + "")
            .replace("1".toRegex(), "١").replace("2".toRegex(), "٢")
            .replace("3".toRegex(), "٣").replace("4".toRegex(), "٤")
            .replace("5".toRegex(), "٥").replace("6".toRegex(), "٦")
            .replace("7".toRegex(), "٧").replace("8".toRegex(), "٨")
            .replace("9".toRegex(), "٩").replace("0".toRegex(), "٠")
        //   }
        return localizedNumber.reversed()
    }
}