pipeline{
    agent any
    tools {
        maven 'M3'
    }
    stages{
        stage('Build'){
            steps{
                sh "We are on branch ${params.BRANCH}"
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
        stage('Deploy'){
            steps{
                sh 'echo Deploying the application...'
                sleep "${params.SLEEP}"
            }
        }
    }
}