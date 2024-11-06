pipelineJob('pipelineJob') {
    definition {
        cps {
            script( readFileFromWorkspace('pipelineJob.groovy') )
            sandbox()
        }
    }
}

pipelineJob('product-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/OrexAn/JenkinsTest'
                    }
                    branch 'master'
                }
            }
        }
    }
}
