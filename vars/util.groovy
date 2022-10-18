def DEBUG = true

def shdbg(command) {
    if (DEBUG == 'true') {
        sh command
    }
}

def echodbg(message) {
    if (DEBUG == 'true') {
        echo "• " + message
    }
}
