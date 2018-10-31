def call(String result){
pipeline {
    agent any
    stages {
        stage('Build') { 
            steps {
             echo 'mvn clean compile'
                
            }
        }
    }
 }
 }
