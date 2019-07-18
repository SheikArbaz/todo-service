pipeline {
    agent {
        docker {
            image 'gradle'
        }
    }
    environment {
        DISABLE_AUTH = 'true'
        DB_ENGINE = 'sqlite'
    }
    stages {
        stage('build') {
            steps {
                sh 'gradle --version'
                sh 'printenv'
            }
        }
        stage('test') {
            steps {
                sh 'gradle clean build'
            }
        }
    }
    post {
        always {
            echo 'This will always run!!'
        }
        success {
            echo 'Successful!!'
        }
        failure {
            echo 'Failed!!'
        }
        unstable {
            echo 'Unstable!!'
        }
        changed {
            echo 'This will run only if the state of the Pipeline has changed'
            echo 'For example, if the Pipeline was previously failing but is now successful'
        }
    }
}
