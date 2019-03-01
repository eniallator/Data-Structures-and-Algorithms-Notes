# Notes

## Searching A Line Of People Alphabetically Sorted

### First Way: Sequential Search

- Going through each person 1 by 1 and checking if they are the person you are trying to find
- Worst case: at the very end, so you end up going through the entire line first
- Best case: at the very start so only 1 check is performed
- O(n)

### Better Way: Binary Search

- Look in the middle of the line
  - If the person's name > the one being searched, do binary search on the second half
  - If the person's name < the one being searched, do binary search on the first half
  - If the person's name is the one being checked, return
  - If the line is length 0, not there
- O(logn)
