function descendingSort(array) {
    for (let i = 0; i < array.length; i++) {
      for (let j = i + 1; j < array.length; j++) {
        if (array[i] < array[j]) {
          let temp = array[i];
          array[i] = array[j];
          array[j] = temp;
        }
      }
    }
  
    return array;
  }
  
  const inputArray = [1, 6, 2, 4, 1, 3];
  const sortedArray = descendingSort(inputArray);
  console.log(sortedArray);