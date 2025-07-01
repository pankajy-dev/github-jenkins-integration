pipeline {
    agent any

    stages {
        stage('Test') {
            steps {
                echo 'Running a simple test!'
            }
        }
        stage('Create and Archive File') {
            steps {
                // Create a file with some content
                sh 'echo "This is a sample output" > sample.txt'
                // Archive the file so it's downloadable from Jenkins
                archiveArtifacts artifacts: 'sample.txt'
            }
        }
    }
}
