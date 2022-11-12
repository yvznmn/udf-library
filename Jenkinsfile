pipeline {
    agent {
        label 'workers'
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