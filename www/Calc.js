var exec = require('cordova/exec');

function Calc() {
 console.log("Calc.js: is created");
}

Calc.prototype.addition = function(successCallback, errorCallback, options){
/*
success
*/
cordova.exec(successCallback, errorCallback, "Calc", "add", [options])
}

Calc.prototype.subtraction = function(successCallback, errorCallback, options){
/*
success
*/
cordova.exec(successCallback, errorCallback, "Calc", "sub", [options])
}


Calc.prototype.multiplication = function(successCallback, errorCallback, options){
/*
success
*/
cordova.exec(successCallback, errorCallback, "Calc", "mul", [options])
}


Calc.prototype.division = function(successCallback, errorCallback, options){
/*
success
*/
cordova.exec(successCallback, errorCallback, "Calc", "div", [options])
}

var calc = new Calc();
module.exports = calc;

