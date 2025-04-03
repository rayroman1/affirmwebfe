pipeline {
    agent any

    environment {
        // Define any environment variables if needed
    }

    stages {
        stage('Checkout') {
            steps {
                // Checkout the code from GitHub
                git branch: 'main', credentialsId: 'your-github-credentials-id', url: 'https://github.com/user/repository.git'
            }
        }

        stage('Build') {
            steps {
                // Define build steps, for example:
                sh 'echo Building the project...'
                // Your build steps can be customized here (e.g., Maven, Gradle, npm, etc.)
            }
        }

        stage('Test') {
            steps {
                // Define your test steps, e.g. run unit tests
                sh 'echo Running tests...'
            }
        }

        stage('Deploy') {
            steps {
                // Define deployment steps (can be customized as per the requirements)
                sh 'echo Deploying the project...'
            }
        }
    }

    post {
        always {
            // Actions that should always be executed (e.g., cleanup)
            echo 'This will always run, even if the pipeline fails.'
        }
    }
}
