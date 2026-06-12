package org.devops

class GitUtils {
    static void cloneRepo(String repoURL, String branch){
        sh "git clone -b ${branch} ${repoURL}"
    }
}