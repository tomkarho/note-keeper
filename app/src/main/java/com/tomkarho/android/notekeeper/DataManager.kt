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
        notes.add(NoteInfo(courses["android_intents"]!!, "TEST1", "TEST1"))
        notes.add(NoteInfo(courses["android_async"]!!, "TEST2", "TEST2"))
        notes.add(NoteInfo(courses["android_intents"]!!, "TEST3", "TEST3"))
        notes.add(NoteInfo(courses["java_fundementals"]!!, "TEST4", "TEST4"))
        notes.add(NoteInfo(courses["java_fundementals"]!!, "TEST5", "TEST5"))
        notes.add(NoteInfo(courses["java_fundementals"]!!, "TEST6", "TEST6"))
    }
}