/**
 * @param {number[]} nums
 * @param {Function} funct
 * @param {number} init
 * @return {number}
 */

var reduce = function (nums, funct, init) {

    let val = init;

    for (let i = 0; i < nums.length; i++) {
        val = funct(val, nums[i]);
    }

    return val;
};
