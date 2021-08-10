pipeline {
  agent any
  stages {
    stage('initial') {
      parallel {
        stage('first') {
          steps {
            echo 'Hello--1!!'
          }
        }
        stage('second') {
          steps {
            echo 'Hello--2!!'
          }
        }

      }
    }
    stage('Check') {
      steps {
        sh '''pwd
              echo "---End---"
              '''
      }
    }

  }
}