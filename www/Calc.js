cordova.define("com.sathiya.calc.Calc", function(require, exports, module) { var exec = require('cordova/exec');

function Calc() {
 console.log("Calc.js: is created");
}

Calc.prototype.addition = function(successCallback, errorCallback, options){
/*
success
*/
cordova.exec(successCallback, errorCallback, "Calc", "add", [options])
}

 var calc = new Calc();
 module.exports = calc;

});
