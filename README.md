Exercises from book "Test-Driven Java Development" by Viktor Farcic and Alex Garcia
===========================

1. Remote Controlled Ship Kata:

    Develop an program that moves a ship around Earth seas.
    Earth is represented as a grid.

    Following requirements should be fulfilled one at a time using TDD approach:

    Req. 01: You are given the initial starting point (x, y) of a ship and the direction (n, s, e, w) it is facing.

    Req. 02: Implement commands that move the ship forward and backward (f, b).

    Req. 03: Implement commands that turn the ship left and right (l, r).

    Req. 04: The ship can receive a string with commands ("lrfb" is equivalent to left, right, forward, backwards).

    Req. 05: Earth, as any other planet is a sphere. Implement wrapping from one edge of the grid to another.

    Req. 06: Not the whole planet consists of seas. Roughly 30% is surface are islands and continents. Implement surface detection before  each move to a new position. If a command encounters surface, the ship aborts the move, stays on the current position and reports the     obstacle.

2. Connect4 game

    Connect4 is a two-player connection game, in which the players first choose a color and then take turns dropping colored discs from the top into a seven-column, six-row, vertically suspended grid. The pieces fall straight down, occupying the next available space within the column. The objective of the game is to connect four of one's own discs of the same color next to each other vertically, horizontally, or diagonally, before your opponent connects four of theirs.
    
    Following requirements should be fulfilled one at a time using TDD approach:
    
    Req. 01: The board is composed of seven columns and six rows, all positions are emptys.
    
    Req. 02: Players introduce discs on the top of the columns. The introduced disc drops down the board if the column is empty. Future discs introduced in the same column will stack over the previous ones.
    
    Req. 03: It is a two-person game, so there is one color for each player. One player uses red ('R') and the other one uses green ('G'). Players alternate turns, inserting one disc every time.
    
    Req. 04: We want feedback when either an event or an error occurs within the game. The output shows the status of the board after every move.
    
    Req. 05: When no more discs can be inserted, the game finishes, and it is considered a draw.
    
    Req. 06: If a player inserts a disc and connects more than three discs of his color in a straight vertical line, then that player wins.
    
    Req. 07: The same happens in a horizontal line direction.
    
    Req. 08: The same happens in a diagonal line direction.