function reverseWords(sentence) {
    let reversedWords = "";
  
    for (let i = 0; i < sentence.length; i++) {
      let word = "";
  
      while (i < sentence.length && sentence[i] !== " ") {
        word += sentence[i];
        i++;
      }
  
      reversedWords += reverseWord(word) + " ";
    }
  
    return reversedWords;
  }
  
  function reverseWord(word) {
    let reversedWord = "";
  
    for (let i = word.length - 1; i >= 0; i--) {
      reversedWord += word[i];
    }
  
    return reversedWord;
  }
  
  const inputSentence = "This is a sunny day";
  const reversedWords = reverseWords(inputSentence);
  console.log(reversedWords);