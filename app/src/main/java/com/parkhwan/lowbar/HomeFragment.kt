package com.parkhwan.lowbar

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import kr.co.prnd.readmore.ReadMoreTextView

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_1,container,false)
        val btnMap = view.findViewById<Button>(R.id.btnMap)
        val btnCall = view.findViewById<Button>(R.id.btnCall)
        val textView = view.findViewById<ReadMoreTextView>(R.id.tv_text)
        btnMap.setOnClickListener {
            val intent =Intent(this.activity,MapActivity::class.java)
            startActivity(intent)
        }

        textView.text = "  월" + "10:30 - 20:00\n" +
                "  화" + "10:30 - 20:00\n" +
                "  수" + "10:30 - 20:00\n" +
                "  목" + "10:30 - 20:00\n" +
                "  금" + "10:30 - 20:00\n" +
                "  토" + "10:00 - 22:00\n" +
                "  일" + "10:00 - 22:00"

        btnCall.setOnClickListener {
            var intent2 = Intent(Intent.ACTION_DIAL)
            intent2.data = Uri.parse("tel:050713168316")
            val packageManager = requireActivity().packageManager
            if(intent2.resolveActivity(packageManager) != null){
                startActivity(intent2)
            }
        }



        return view




    }

    
}