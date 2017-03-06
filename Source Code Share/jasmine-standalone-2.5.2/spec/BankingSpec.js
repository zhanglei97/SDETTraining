describe("BankingUtils", function(){
    var citi;

    beforeEach(function(){
        citi = new BankingUtils(1000, 4, 10 );;
        spyOn(citi, "getTime");
        spyOn(citi, "getROI");
        spyOn(citi, "getPrincipal");
    })

    it("Testing spy for getting calculating interest", function(){
        // calling calculateInterest
        
        citi.calculateInterest();
        expect(citi.getTime).toHaveBeenCalled();
        expect(citi.getROI).toHaveBeenCalled();     
        expect(citi.getPrincipal).toHaveBeenCalled();     
    })

    it("Testing spy for getting calculating interest with out principal", function(){
        // calling calculateInterest1 
        // which does not call principal 
        
        citi.calculateInterest1();
        expect(citi.getTime).toHaveBeenCalled();
        expect(citi.getROI).toHaveBeenCalled();     
        expect(citi.getPrincipal).toHaveBeenCalled();     
    })

});


describe("Spy with parameter", function(){

    beforeEach(function(){
        citi = new BankingUtils(1000, 4, 10 );
        spyOn(citi, "approver");
    })
    it("spies with parameter ", function(){
       
         citi.approver("Kumar")
        console.log("")
    })

    afterEach(function(){
        expect(citi.approver).toHaveBeenCalledWith("Kumar");
    })

});