package com.example.enwalletassignmentapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.enwalletassignmentapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
   private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvWallet.layoutManager = LinearLayoutManager(this)
        displayWallets()
    }

    fun displayWallets(){
        val wallet1 = Wallet("", "Salary", "23700", "2024-04-15")
        val wallet2 = Wallet("", "Rent", "33700", "2024-05-14")
        val wallet3 = Wallet("", "Dividends", "43700", "2024-06-13")
        val wallet4 = Wallet("", "Electricity", "53700", "2024-07-12")
        val wallet5 = Wallet("", "Internet", "63700", "2024-08-11")
        val wallet6= Wallet("", "Shopping", "73700", "2024-09-10")
        val wallet7 = Wallet("", "Bus fare", "73700", "2024-09-10")
        val wallet8 = Wallet("", "Water bill", "73700", "2024-09-10")
        val wallet9 = Wallet("", "Hospital", "73700", "2024-09-10")
        val wallet10 = Wallet("", "School fees", "73700", "2024-09-10")
        val wallet11 = Wallet("", "Savings", "73700", "2024-09-10")


        val walletList = listOf(wallet1, wallet2, wallet3, wallet4, wallet5, wallet6, wallet7, wallet8, wallet9, wallet10, wallet11)
        val walletAdapter = WalletAdapter(walletList)
        binding.rvWallet.adapter = walletAdapter
    }
}
