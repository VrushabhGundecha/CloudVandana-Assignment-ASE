function display(value) {
  document.getElementById("result").value += value;
}

function
 
clearScreen() {
  document.getElementById("result").value = "";
}

function
 
calculate(operator) {
  var result = document.getElementById("result").value;

  switch (operator) {
    case "+":
      result += "+";
      break;
    case "-":
      result += "-";
      break;
    case "*":
      result += "*";
      break;
    case "/":
      result += "/";
      break;
    case "=":
      result = eval(result);
      break;
  }

  document.getElementById("result").value = result;
}