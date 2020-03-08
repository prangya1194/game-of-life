job('amazon-compile1') {
    scm {
        git('https://github.com/asish029/game-of-life.git')
    }
    triggers {
        scm('* * * * *')
    }
    steps {
        maven('-e clean test')
    }
}
