pipeline {
    agent any

    tools {
        maven 'maven-3.6.3'
        jdk 'jdk-8'
    }

    stages {
 	 stage('Destroy') {
	    steps {
	       sh 'docker stop taskapp-mongodb'
	       sh 'docker rm -f taskapp-mongodb'
	    }
	    steps {
	       sh 'docker stop taskapp-api'
	       sh 'docker rm -f taskapp-api'
	    }
	}
       
	 stage('Build') {
            steps {
               sh 'docker.compose start'
            }
        }
    }
}
