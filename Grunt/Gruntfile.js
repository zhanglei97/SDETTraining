module.exports= function(grunt){

grunt.initConfig({
  concat: {
   css: {
      src: ['css/*.css'],
      dest: 'build/css/style.css',
    },

     js: {
      src: ['js/*.js'],
      dest: 'build/js/scripts.js',
    },
  },
  watch: {
  js: {
    files: ['js/**/*.js'],
    tasks: ['concat:js']
  },
  css: {
    files: ['css/**/*.css'],
    tasks: ['concat:css']
  }
},
});

grunt.loadNpmTasks('grunt-contrib-watch');
grunt.loadNpmTasks('grunt-contrib-concat');
// 
grunt.registerTask('default', ['concat', 'watch']);
};