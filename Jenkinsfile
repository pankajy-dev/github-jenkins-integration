pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Starting build stage...'
                sh 'mvn clean compile'
                echo 'Build stage completed.'
            }
        }
        stage('Test') {
            steps {
                echo 'Starting test stage...'
                sh 'mvn test'
                echo 'Test stage completed.'
            }
        }
        stage('Archive Test Results') {
            steps {
                echo 'Archiving test results...'
                junit '**/target/surefire-reports/*.xml'
                echo 'Test results archived.'
            }
        }
    }
}
