- All permutations of a string with distinct characters
ABC

ABC
ACB
BAC
BCA
CAB
CBA

--

A B C
A C B
B A C
B C A
C A B
C B A

--

A _ _ ("BC" is remaining)
A B _
A C _

permute( str, chars )
    -   choose one-by-one the characters for the first spot
    -   chars = all characters except the chosen character
    -   permute( str, chars )

B
C