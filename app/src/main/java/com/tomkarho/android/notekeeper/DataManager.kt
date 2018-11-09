package com.tomkarho.android.notekeeper

object DataManager {
    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        initializeCourses()
        initializeNotes()
    }

    private fun initializeCourses() {
        var c = CourseInfo("android_intents", "Android programming with intents")
        courses[c.courseId] = c

        c = CourseInfo(courseId = "android_async", title = "Android async programming and services")

        courses[c.courseId] = c

        // Notice how the order is reversed
        c = CourseInfo(title = "Java fundementals", courseId = "java_fundementals")

        courses[c.courseId] = c
    }

    private fun initializeNotes() {
        notes.add(NoteInfo(courses["java_fundementals"]!!, "TEST", "TEST"))
    }
}