package hhm.mokuai.rukou

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import hhm.mokuai.accountmanager.activity.LoginActivity
import hhm.mokuai.finance.activity.FinanceHomeActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun goToLogin(v: View) {
        startActivity(Intent(this, LoginActivity::class.java))
    }

    fun goToFinance(v: View) {
        startActivity(Intent(this, FinanceHomeActivity::class.java))
    }
}
