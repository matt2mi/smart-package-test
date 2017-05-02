run = require('./setup')

run.run(function(maven) {
   maven.deploy('bouhanef-repository-release');
})
