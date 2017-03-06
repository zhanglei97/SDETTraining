//npm install gulp -g
var gulp =              require('gulp');

// npm install gulp-imagemin --save-dev
var imagemin =          require('gulp-imagemin');

// npm install gulp-autoprefixer --save-dev
var autoprefix =        require('gulp-autoprefixer');

// npm install gulp-minify-css --save-dev
var minifyCSS =         require('gulp-minify-css');

// npm install gulp-concat --save-dev
var concat =            require('gulp-concat');

// npm install gulp-uglify --save-dev 
var uglify =            require('gulp-uglify');

// npm install browser-sync --save-dev
var browserSync =       require('browser-sync');

// or you can put everything in one line 
// npm install gulp gulp-imageimin gulp-autoprefixer gulp-minify-css gulp-concat gulp-uglify browser-sync 

// compress js with uglify

gulp.task('js', function(){
   gulp.src('src/*.js')
   .pipe(concat('script.js'))
   .pipe(uglify())
   .pipe(gulp.dest('build/src/'));
});

gulp.task('test', function(){
   gulp.src('spec/*.js')
   .pipe(concat('test.js'))
   .pipe(uglify())
   .pipe(gulp.dest('build/spec/'));
});

// to list of all 
gulp.task('browserSync', function() {
   browserSync.init({
      server: {
         baseDir: 'src'
      },
   });

   gulp.watch('src/*.js', ['js']);
    gulp.watch('spec/*.js', ['js']);

});


// to call multiple jobs have a default task 
// gulp.task('default',['imagemin','styles', 'browserSync', 'watch'], function(){})

gulp.task('default',['browserSync', 'test', 'js'], function(){})