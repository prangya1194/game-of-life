job('amazon-compile1') {
    scm {
        git('https://github.com/asish029/game-of-life.git')
    }
    triggers {
        scm('0 * * * *')
    }
    steps {
        maven('-e clean test')
    }
}
