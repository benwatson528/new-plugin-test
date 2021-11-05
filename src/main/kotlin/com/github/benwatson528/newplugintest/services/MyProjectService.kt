package com.github.benwatson528.newplugintest.services

import com.intellij.openapi.project.Project
import com.github.benwatson528.newplugintest.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
