def call(int buildNumber) {
  if (buildNumber % 2 == 0) {
    ansiColor('xterm') {
               echo "The build number is even"
    }
          }
   else
     ansiColor('xterm') {
     echo "The build number is odd"
      }
}
