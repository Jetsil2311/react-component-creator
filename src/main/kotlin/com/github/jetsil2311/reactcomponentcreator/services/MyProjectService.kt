package com.github.jetsil2311.reactcomponentcreator.services

import com.intellij.openapi.project.Project
import com.github.jetsil2311.reactcomponentcreator.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
