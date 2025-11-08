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
        stage('Run The Jar file'){
            steps{
                sh 'java -jar target/calculator-1.0-SNAPSHOT.jar'
            }
        }
    }
}