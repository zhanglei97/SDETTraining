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

// the task to minify the images to destination folder 
gulp.task('imagemin', function() {
   var img_src = 'src/images/**/*', img_dest = 'build/images';

   gulp.src(img_src)
   .pipe(imagemin())
   .pipe(gulp.dest(img_dest));
});


// the task to minify, append, combile in to one css file and browserSync
gulp.task('styles', function() {
   gulp.src(['src/styles/*.css'])
   .pipe(concat('styles.css'))
   .pipe(autoprefix('last 2 versions'))
   .pipe(minifyCSS())
   .pipe(gulp.dest('build/styles/'))
   .pipe(browserSync.reload({
       stream:true
   }));
});


// task to copy the html files to build html and to keep watch 
gulp.task('html', function() {
   gulp.src(['src/html/*.html'])
   .pipe(gulp.dest('build/html/'))
  
    .pipe(browserSync.reload({
       stream:true
   }));
});


// compress js with uglify

gulp.task('js', function(){
   gulp.src('src/scripts/*.js')
   .pipe(concat('script.js'))
   .pipe(uglify())
   .pipe(gulp.dest('build/scripts/'));
});



// to list of all 
gulp.task('browserSync', function() {
   browserSync.init({
      server: {
         baseDir: 'src'
      },
   });

   gulp.watch('src/html/*.html', ['html']);
   gulp.watch('src/styles/*.css', ['styles']);
   gulp.watch('src/scripts/*.js', ['js']);

});


// to call multiple jobs have a default task 
// gulp.task('default',['imagemin','styles', 'browserSync', 'watch'], function(){})

gulp.task('default',['browserSync', 'styles', 'html', 'js'], function(){})