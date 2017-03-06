            function fnHellow(){
                console.log("welcome from head section")

                var name = prompt("enter your name: ");
                var age = parseInt(prompt("enter your age: "));

                console.log("your name is: "+name);
                console.log("your age is: "+age);

                if (age>18){
                     console.log("your age is: "+age +" and can get a license");
                     var mydev = document.getElementById("mydiv");
                     mydev.innerHTML="your age is: "+age +" and can get a license";
                } else{
                    console.log("your age is: "+age +" and need to wait");
                    var mydev = document.getElementById("mydiv");
                     mydev.innerHTML="your age is: "+age +" and need to wait";
                }
            }

            function calcuInput(){
                var num = parseInt(prompt("enter your preferred: "));
                for ( n=1; n<=num; n++){
                    console.log(num +" times " +n +" is " + num*n);
                }

            }

            function chkHi(){
                var var1 ="hi";
                var2="by";
            }

            function hilog(){
                console.log("var1: "+ var1);
                 console.log("var2: "+ var2);
            }