public static int findMissing(int[] numbers)
{
    // TODO: code me
    int temp1 = numbers[1] - numbers[0];;
    int temp2 = numbers[numbers.length-1] - numbers[numbers.length-2];
    int realDiff = -1;
    int result = -1;

      realDiff = Math.abs(temp1) < Math.abs(temp2) ? temp1 : temp2; 
 
      if(realDiff == 0) return numbers[0];
    
    A: for(int i = 0; i < numbers.length-1; i++) {
      if(numbers[i+1] - numbers[i] != realDiff) {
        result = numbers[i] + realDiff;
        break A;
      }
    }
    
    return result;
}