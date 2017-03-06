BankingUtils = function (principal, roi, time){
    this.principal = principal;
    this.roi = roi;
    this.time = time;
};


BankingUtils.prototype.calculateInterest =function(){
    // formula ptr/ 100
    val =  (this.getPrincipal() * this.getROI() * this.getTime() ) /100;
    return val;
}
   
// this function doesnot call principal this will be show in spy 
BankingUtils.prototype.calculateInterest1 =function(){
    // formula ptr/ 100
    val =  (this.getROI() * this.getTime() ) /100;
    return val;
}
   

BankingUtils.prototype.getPrincipal = function(){
    return this.principal;
};

BankingUtils.prototype.getROI =function(){
    return this.roi;
}

BankingUtils.prototype.getTime = function(){
    return this.time;
}

BankingUtils.prototype.approver = function(name){
    console.log("Approver is " + name);
}