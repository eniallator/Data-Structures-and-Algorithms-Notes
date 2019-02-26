# Notes

## Announcements

- Compare lab class work with solutions
- NORBERT

## Overview

- Extimating efficiency
- Empirical analysis
- Growth rate

## Whats Efficiency

- How the number of processes grows in relation to the size/type of input
- Usually people mean run-time efficiency, rather than space efficiency

## Running Time

- Most algorithms transform input data to output data
- Running time typically grows with the input size
- We may consider:
  - Best case: But how useful?
  - Average case: Often difficult to determine.
  - Worst case: More meaningful; easier to analyze than the average case
- Only really care about the worst case

## Experimental Studies

- Measure things objectively
- Observed - essentially the opposite of theoretical
- Real data that actually happened (TESTING)
  - Test all sorts of data sets
  - In theory, we don't want the software to rely on anything to do with the hardware

### Limitations

- Necessary to actually implement the algorithm
- Necessary to run the algorithm on lots of inputs
- In order to compare two algorithms, the same hardware/software environments must be used

## Alternative Methodology

- Think about the algorithm as a function
- Look at how it grows in terms of the input size
- `n` refers to the input size
- High level description of the algorithm instead of an implementation
  - Pseudo-code description

### Pseudo-Code

- High level description
- More structured than English
- Less detailed than a program
- Preferred notation for describing algorithms

## Primitive Implementations

- Low-level instruction
  - Constant execution time
  - Largely independant of the programming language
- Use number of primitive operations executed as a measure of running time
  - Just count them! 😂

## Estimating Running Time

- `T(n)` saying time depends on n
- Use Big-O
- Know time complexities

### Big O

- Don't care about the lower order terms
- Just take the highest order and then that's the Big-O notation then
- **TRIGGERED** the rows on the left of the slide didn't line up with the right side

## Review

- Performance:
  - Run-time
  - Space
- Analysis of input size
- Empirical evaluation problematic
- Analyse growth rates instead
  - Look for bounds on growth
  - Big-O notation
