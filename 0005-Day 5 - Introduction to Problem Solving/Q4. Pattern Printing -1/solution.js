module.exports = {
  //param A : integer
  //return a array of array of integers
  solve: function (A) {
    let arr = [];

    for (let i = 0; i < A; i++) {
      let ar = [];
      for (let j = 0; j < A; j++) {
        if (j <= i) {
          ar.push(j + 1);
        } else {
          ar.push(0);
        }
      }
      arr.push(ar);
    }

    return arr;
  },
};
