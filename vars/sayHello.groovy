def call(name) {
    echo "Hello, ${name}!"
}

def call(version) {
    sh "mvn  --version"
}

