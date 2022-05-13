pipeline {
    agent { docker { image 'maven:3.8.4-openjdk-11-slim' } }
	parameters{
	string ( name: 'theparam', defaultValue: 'emptyValue', description: "Useful param")
	}
    stages {
        stage('build') {
            steps {
                sh "echo ${params.theparam}"
            }
        }
    }
    post {
        always {
            archiveArtifacts artifacts: 'target/*.war', fingerprint: true
 //           junit 'target/surefire-reports/**/*.xml'
        }
    }
}