job('amazon-test') {
    scm {
        git('https://github.com/asish029/game-of-life.git')
    }
    
    steps {
        maven('-e clean package')
    }
    postBuildSteps('SUCCESS') {
    }    shell("curl --upload-file **/*.war "http://admin:admin@localhost:8080/manager/deploy?path=/debug&update=true")
}
