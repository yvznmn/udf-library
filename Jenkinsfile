pipeline {
    agent {
        label 'built-in'
    }
    parameters {
        booleanParam(name: 'deploy', defaultValue: false, description: 'Checking this cause deployment.')
    }
    stages {
        stage('Checkout') {
            steps {
                script {
                    echo "Checkout"
                }
            }
        }
        stage('Build') {
            steps {
                script {
                    echo "Building Artifacts"
                }
            }
        }
    }

}
