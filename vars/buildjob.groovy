def call(String name)
{
pipeline {
   agent any 
     stages {
	stage('Demo'){
	  steps {
	    echo 'I think this will work'
		}
}
     }
}
     }
