pipeline {
    agent {
        label 'built-in'
    }
    parameters {
        booleanParam(name: 'deploy', defaultValue: false, description: 'Checking this cause deployment.')
    }
    stages {
        stage('Checkout') {
            echo "Checkout"
        }
        stage('Build') {
            echo "Building artifacts"
        }
    }

}
