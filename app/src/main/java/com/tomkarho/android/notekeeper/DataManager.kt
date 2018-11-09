package com.tomkarho.android.notekeeper

class DataManager {
    val courses = HashMap<String, CourseInfo>()
    val cotes = ArrayList<NoteInfo>()

    init {
        initializeCourses()
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
}