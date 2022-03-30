package com.github.zishuaihao.mybatislog.services

import com.intellij.openapi.project.Project
import com.github.zishuaihao.mybatislog.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
