package com.github.xiechaoandroid.template.services

import com.intellij.openapi.project.Project
import com.github.xiechaoandroid.template.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
