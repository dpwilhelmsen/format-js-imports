package com.github.dpwilhelmsen.formatjsimports.services

import com.intellij.openapi.project.Project
import com.github.dpwilhelmsen.formatjsimports.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
