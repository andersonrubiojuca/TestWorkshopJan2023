package br.com.wesjon.testworkshopjan2023

import android.app.Activity
import android.app.Instrumentation
import androidx.test.espresso.intent.matcher.IntentMatchers.hasComponent
import androidx.test.espresso.intent.Intents.intending

class homeArrange(action: homeArrange.() -> Unit) {
    init {
        action.invoke(this)
    }

    fun mockHomeActivityCall(){
        intending(hasComponent(HomeActivity::class.java.name))
            .respondWith(Instrumentation.ActivityResult(Activity.RESULT_CANCELED, null))
    }
}