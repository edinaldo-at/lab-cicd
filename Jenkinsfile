pipeline {
    agent any

    tools {
        maven 'maven-3.6.0'
        jdk 'jdk-8'
    }

    stages {
        stage('Stop') {
            steps {
               sh 'docker stop taskapp-api'
               sh 'docker rm taskapp-api'
               sh 'docker stop taskapp-mongodb'
               sh 'docker rm taskapp-mongodb'
               sh 'docker-compose down || true'
            }
        }
        stage('Build') {
            steps {
               sh 'mvn -B -DskipTests clean package'
               sh 'docker-compose build'
            }
        }
        stage('Deploy') {
            steps {
               sh 'docker-compose up -d'
            }
        }
    }
}
