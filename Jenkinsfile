pipeline {
  agent any 
    stages {
      stage('Checkout') {
        steps {
          checkout scm
        }
      }
      stage('build and package') {
        steps {
          sh 'mvn clean package'
        }
      }
    }
}
