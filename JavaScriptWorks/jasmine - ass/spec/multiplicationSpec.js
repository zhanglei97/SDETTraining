describe("MultiplierUtils", function(){
    var multiCal;
    
    beforeEach(function(){
        multiCal = new MultiplierUtils(10 );
    })

    it("Testing input is not a number", function(){        
            expect(multiCal.valueDisplay("abc123")).toEqual("not a number");      
    })


    it("Testing input is a nagative number", function(){
            expect(multiCal.valueDisplay(-1)).toEqual("not a positive number");     
    })

    it("Testing input number 10", function(){        
        expect(multiCal.valueDisplay(10)).toEqual("success");  
  
    })

});


