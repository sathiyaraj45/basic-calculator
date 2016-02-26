Hi,

Basic arithmetic operation logics apply to android native logic.

Sample:


 
 function basicCalculation()
 {
 Calc.addition(successHandler, errorHandler, {"firstValue":"10","secondValue":"20"});
 Calc.subtraction(successHandler, errorHandler, {"firstValue":"10","secondValue":"20"});
 Calc.multiplication(successHandler, errorHandler, {"firstValue":"10","secondValue":"20"});
 Calc.division(successHandler, errorHandler, {"firstValue":"10","secondValue":"20"});
 }
 
 function onDeviceReady() {
 // console.log("Device ready");
 }
 document.addEventListener("deviceready", onDeviceReady, false);




function successHandler (result) {
      	console.log(result)
}

function errorHandler (error) {
      console.log("error->" + JSON.stringify(error));
}
