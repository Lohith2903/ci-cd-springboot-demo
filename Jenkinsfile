pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Docker Build') {
            steps {
                sh 'docker build -t springboot-check .'
            }
        }

        stage('Stop Old Container') {
            steps {
                sh 'docker stop springboot-check || true'
                sh 'docker rm springboot-check || true'
            }
        }

        stage('Run New Container') {
            steps {
                sh 'docker run -d --name springboot-check -p 8085:8085 springboot-check'
            }
        }
    }
}
