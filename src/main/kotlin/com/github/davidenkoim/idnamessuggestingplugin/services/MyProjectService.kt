package com.github.davidenkoim.idnamessuggestingplugin.services

import com.intellij.openapi.project.Project
import com.github.davidenkoim.idnamessuggestingplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
