pipelineJob('product-fail-checkstyle-branch-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/OrexAn/JenkinsTest'
                    }
                    branch 'failed-checkstyle-job'
                }
            }
        }
    }
}

pipelineJob('product-fail-spotbugs-branch-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/OrexAn/JenkinsTest'
                    }
                    branch 'failed-spotbugs-job'
                }
            }
        }
    }
}

pipelineJob('product-dependency-check-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/OrexAn/JenkinsTest'
                    }
                    branch 'failed-dependency-check-job'
                }
            }
        }
    }
}
