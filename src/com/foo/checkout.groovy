package org.foo;

def checkOutFrom(repo) {
  git url: "git@https://github.com/balaji-tkr/demo-jenkins.git/${repo}"
}

return this
