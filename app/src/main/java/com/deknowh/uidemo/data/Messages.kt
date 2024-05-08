package com.deknowh.uidemo.data

import com.deknowh.uidemo.R

data class Messages(
    val image: Int,
    val senderUsername: String,
    val receiverUsername: String,
    val message: String
)


// object
val myChats = listOf(
    Messages(
        R.drawable.person1,
        "Alvine",
        "Martin",
        "I love coding"
    ),
    Messages(
        R.drawable.person3,
        "Denis",
        "Austin",
        "Today has been great"
    ),
    Messages(
        R.drawable.person4,
        "Linda",
        "Henry",
        "How are you doing"
    ),
    Messages(
        R.drawable.person5,
        "Justin",
        "Alex",
        "I want to see you"
    ),
    Messages(
        R.drawable.person6,
        "Juma",
        "Mathews",
        "How can I go about this"
    )
)