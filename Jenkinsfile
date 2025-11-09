pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh '''echo "Hey I am maven having version number "
echo man --version
mvn clean package'''
      }
    }

    stage('Test') {
      steps {
        sh 'mvn test'
      }
    }

    stage('Making Jar File') {
      steps {
        sh 'mvn clean install'
      }
    }

  }
  tools {
    maven 'M3'
  }
}