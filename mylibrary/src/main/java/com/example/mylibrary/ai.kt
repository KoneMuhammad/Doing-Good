package com.example.mylibrary

import com.google.firebase.Firebase
import com.google.firebase.ai.ai
import com.google.firebase.ai.type.GenerativeBackend

val model = Firebase.ai(backend = GenerativeBackend.googleAI())
    .generativeModel("gemini-2.5-flash")


