pipeline {
    agent any
    stages {
        stage('Trigger Job on Start') {
            steps {
                script {
                    build job: 'pipelineJob', wait: false
                }
            }
        }
    }
}