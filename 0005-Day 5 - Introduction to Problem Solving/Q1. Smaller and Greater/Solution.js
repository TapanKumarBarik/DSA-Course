module.exports = {
  //param A : array of integers
  //return an integer
  solve: function (A) {
    let minNum = Number.MAX_SAFE_INTEGER;
    let maxNum = Number.MIN_SAFE_INTEGER;
    let result = 0;
    for (let i = 0; i < A.length; i++) {
      maxNum = Math.max(maxNum, A[i]);
      minNum = Math.min(minNum, A[i]);
    }

    for (let i = 0; i < A.length; i++) {
      if (A[i] > minNum && A[i] < maxNum) {
        result++;
      }
    }

    return result;
  },
};
