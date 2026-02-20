function calculate(operation) {
  const num1 = parseFloat(document.getElementById("num1").value);
  const num2 = parseFloat(document.getElementById("num2").value);
  let result;
  let str;

  switch (operation) {
    case 'add':
      result = num1 + num2;
      str = num1 +" + "+ num2 +" = "+ result; 
      break;
    case 'subtract':
      result = num1 - num2;
      str = num1 +" - "+ num2 +" = "+ result;
      break;
    case 'multiply':
      result = num1 * num2;
      str = num1 +" * "+ num2 +" = "+ result;
      break;
    case 'divide':
      result = num2 !== 0 ? num1 / num2 : "Cannot divide by zero";
      str = num1 +" / "+ num2 +" = "+ result;
      break;
    case 'square':
      result = `Square of ${num1} is ${num1 * num1}`;
      str = result;
      break;
    default:
      result = "Invalid operation";
  }

  document.getElementById("result").textContent = "Result: " + str;
}
