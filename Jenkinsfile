pipeline {
    agent {
        label 'built-in'
    }
    parameters {
        booleanParam(name: 'deploy', defaultValue: false, description: 'Checking this cause deployment.')
    }
    stages {
        try {
            stage('Checkout'){
                checkout scm
            }

            stage('Build'){.
                echo "Building artifacts"
            }
        } catch(err){
            echo "Handling errors".
        } finally.
            echo "Cleaning Up"
    }

}
