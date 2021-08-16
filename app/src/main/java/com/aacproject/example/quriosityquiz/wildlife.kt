package com.aacproject.example.quriosityquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_wildlife.*

class wildlife : AppCompatActivity() {

    private var questionList:ArrayList<QuestionData>?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wildlife)
        supportActionBar?.hide();
        setData.getQuestion()

        questionList=setData.getQuestion()
        var que=questionList!![0]
        question_text.text=que.question
        opt_1.text=que.option_one
        opt_2.text=que.option_two
        opt_3.text=que.option_three
        opt_4.text=que.option_four

        progress_bar.progress=1
        progress_bar.progress=questionList!!.size




    }
}