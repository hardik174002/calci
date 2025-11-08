pipeline{
    agent any
    tools {
        maven 'M3'
    }
    stages{
        stage('Build'){
            steps{
                sh 'mvn clean package'
            }
        }
        stage('Test'){
            steps{
                sh 'mvn test'
            }
        }
        stage('Making Jar File'){
            steps{
                sh 'mvn clean install'
            }
        }
    }
}