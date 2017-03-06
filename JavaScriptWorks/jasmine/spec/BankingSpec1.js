describe("BankingUtils", function(){
    var citi;
    beforeEach(function(){
        citi = new BankingUtils(1000, 4, 10 );;
        spyOn(citi, "getTime");
        spyOn(citi, "getROI");
        spyOn(citi, "getPrincipal");
    })
    
    beforeEach(function(){
        citi = new BankingUtils(1000, 4, 10 );;
    })

    it("Testing spy for getting calculating interest", function(){
        // calling calculateInterest
        
            expect(citi.calculateInterest()).toEqual(400);      
    })


    xit("Testing spy for getting  with out interest", function(){
        // calling calculateInterest  
            expect(citi.calculateInterest1()).toEqual(40000);     
    })

    it("Testing spy for getting calculating interest with out principal", function(){
        // calling calculateInterest1 
        // which does not call principal 
        
        expect(citi.calculateInterest(400)).toEqual(40000);  
  
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

describe("test suite for check credit score", function(){
    it("check for pass credit score of 400+", function(){
        expect(citi.checkCreditScore(500).toBeTruely);
    })
    it("check for fail credit score of below 400", function(){
        expect(citi.checkCreditScore(399).toBeTruely);
    })
})