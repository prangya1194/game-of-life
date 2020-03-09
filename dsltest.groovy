job('amazon-test') {
    scm {
        git('https://github.com/asish029/game-of-life.git')
    }
    
    steps {
        maven('-e clean package')
    }
    steps {
       shell("curl -v -u admin:admin -T /home/asish/.jenkins/workspace/amazon-test/gameoflife-web/target/gameoflife.war 'http://127.0.1.1:8080/manager/text/deploy?path=/gameoflife&update=true'")
    }
}
