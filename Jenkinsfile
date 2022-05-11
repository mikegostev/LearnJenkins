pipeline {
    agent { docker { image 'maven:3.8.4-openjdk-11-slim' } }
    stages {
        stage('build') {
            steps {
                sh 'mvn package'
            }
        }
        
        post {
	        always {
	            archiveArtifacts artifacts: 'build/libs/**/*.jar', fingerprint: true
	            junit 'build/reports/**/*.xml'
	        }
	    }
    }
}