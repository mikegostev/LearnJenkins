pipeline {
    agent { docker { image 'maven:3.8.4-openjdk-11-slim' } }
	parameters{
	string ( name: 'theparam', defaultValue: 'emptyValue', description: "Useful param")
	}
    stages {
        stage('build') {
            input {
                message "Should we continue?"
                ok "Yes, we should."
                submitter "alice,bob"
                parameters {
                    string(name: 'PERSON', defaultValue: 'Mr Jenkins', description: 'Who should I say hello to?')
                }
            }
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