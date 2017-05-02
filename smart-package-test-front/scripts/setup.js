var config = require('./maven-config.json')
var maven = require('maven-deploy');
var mkdirp = require('mkdirp');

var rootdir = 'dist-jar';
var dir = rootdir + '/public/';

maven.config(config);
exports.run = function (f) {
   var del = require('del');
   del(['dist-jar/**']).then(function (paths) {
      mkdirp(dir, function (err) {
         var copy = require('copy');
         copy("dist/*/**", dir, null, function (err, files) {
            copy("dist/*.**", dir, null, function (err, files) {
               f(maven);
            });
         });
      });
   });
}
