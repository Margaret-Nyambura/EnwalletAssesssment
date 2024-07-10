package com.example.enwalletassignmentapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.enwalletassignmentapp.databinding.WalletListItemBinding

class WalletAdapter (var walletList: List<Wallet>): RecyclerView.Adapter<WalletViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WalletViewHolder {
        val binding = WalletListItemBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return WalletViewHolder(binding)
    }

    override fun onBindViewHolder(holder: WalletViewHolder, position: Int) {
        val wallet = walletList[position]
        holder.binding.tvSalary.text = wallet.tvSalary
        holder.binding.tvKes5.text = wallet.tvKes5
        holder.binding.tvDate1.text = wallet.tvDate
    }

    override fun getItemCount(): Int {
        return walletList.size
    }
}

class WalletViewHolder(var binding: WalletListItemBinding): RecyclerView.ViewHolder(binding.root)
