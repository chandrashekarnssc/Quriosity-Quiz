package com.aacproject.example.quriosityquiz

object setData {
    fun getQuestion():ArrayList<QuestionData>{
        var que:ArrayList<QuestionData> = arrayListOf()
        var q1=QuestionData(
            "How many hearts does an octopus have",
            1,
            "9",
            "5",
            "3",
            "2",
            3
        )

        var q2=QuestionData(
            "Which animal has\n" +
                    "largest brain in the World",
        2,
        "Dolphin",
            "Octopus",
            "Blue Whale",
            "Sperm Whale",
            4
        )

        var q3=QuestionData(
            "The age of a lion can be determined from its",
            3,
            "Color of nose",
            "Length of tail",
            "Length of nails",
            "Color of its hair",
            1
        )

        var q4=QuestionData(
            "One horn rhino is found in",
            4,
            "Sumatra",
            "Africa",
            "India",
            "Sri Lanka",
            3
        )

        var q5=QuestionData(
            "Which one is the largest in size among the subspecies of tiger",
            5,
            "Siberian tiger ",
            "Indochinese tiger",
            "Sumatran tiger",
            "Bengal tiger",
            1
        )
        que.add(q1)
        que.add(q2)
        que.add(q3)
        que.add(q4)
        que.add(q5)
        return que
    }
}