package org.devops

class GitUtils implements Serializable {
    def steps
    GitUtils(steps) { this.steps = steps }
    def cloneRepo(String repoURL, String branch){
        sh "git clone -b ${branch} ${repoURL}"
    }
}