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
	    }
	    steps {
	       sh 'docker rm -f taskapp-mongodb'
	    }
	    steps {
	       sh 'docker stop taskapp-api'
	    }
	    steps {
	       sh 'docker rm -f taskapp-api'
	    }
	}
       
	 stage('Build') {
	    steps {
               sh 'mvn -B -DskipTests clean package'
            }
            steps {
               sh 'docker.compose start'
            }
        }
    }
}
