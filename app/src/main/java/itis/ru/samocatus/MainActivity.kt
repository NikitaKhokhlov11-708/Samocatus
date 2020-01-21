package itis.ru.samocatus

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (Random().nextInt() % 2 == 0)
            setTheme(R.style.SecondaryTheme)
        else
            setTheme(R.style.AppTheme)

        setContentView(R.layout.activity_main)
        rv_money_items.layoutManager = LinearLayoutManager(this)
        val adapter = MoneyItemAdapter({ moneyItem: MoneyItem -> })
        adapter.submitList(
            mutableListOf(
                MoneyItem("Кино", 1000, 0),
                MoneyItem("Игры", 2000, 1),
                MoneyItem("Кино", 1000, 2),
                MoneyItem("Кино", 1000, 3),
                MoneyItem("Кино", 3000, 4),
                MoneyItem("Кино", 2000, 5)
            )
        )
        rv_money_items.adapter = adapter
    }
}
