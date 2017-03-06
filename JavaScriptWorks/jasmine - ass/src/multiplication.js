MultiplierUtils = function (keyIn){
    this.keyIn = keyIn;
};

   
MultiplierUtils.prototype.valueDisplay =function(keyIn){
    var num = this.keyIn;
    if (isNaN(parseFloat(keyIn)) ){
        return "not a number";
    } else if (keyIn<1){
        return "not a positive number";
    }
    else {
        for ( n=1; n<=num; n++){
            console.log(num +" times " +n +" is " + num*n);
        }    
        return "success";
    }
}
  