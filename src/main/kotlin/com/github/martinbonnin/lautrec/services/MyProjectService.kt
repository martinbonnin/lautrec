package com.github.martinbonnin.lautrec.services

import com.intellij.openapi.project.Project
import com.github.martinbonnin.lautrec.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
