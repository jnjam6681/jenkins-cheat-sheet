#!/usr/bin/env groovy
def call(body) {
    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()

    pipeline {
        agent any

        stages {
            stage('Initialize') {
                steps {
                    script {
                        echo 'Initialize...'
                        echo "${config.appName}"
                    }
                }
                post {
                    failure {
                        script { env.FAILURE_STAGE = 'Initialize' }
                    }
                }
            }

            stage('Test') {
                steps {
                    script {
                        echo 'Test...'
                    }
                }
                post {
                    failure {
                        script { env.FAILURE_STAGE = 'Test' }
                    }
                }
            }

            stage('Build') {
                steps {
                    script {
                        echo 'Build...'
                    }
                }
                post {
                    failure {
                        script { env.FAILURE_STAGE = 'Build' }
                    }
                }
            }
        }
    }
}