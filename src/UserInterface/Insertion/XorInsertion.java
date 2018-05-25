package UserInterface.Insertion;

import UserInterface.Controllers.GameGrid;

public class XorInsertion extends LogicGate{

    @Override
    public void topDirection(GameGrid.Tile[][] grid, int x, int y) {
        grid[x][y].yellowTile();
        grid[x][y-1].yellowTile();
        grid[x][y-2].yellowTile();
        grid[x+2][y].yellowTile();
        grid[x+2][y-1].yellowTile();
        grid[x+2][y-2].yellowTile();
        grid[x-1][y-3].yellowTile();
        grid[x+3][y-3].yellowTile();
        grid[x-2][y-4].yellowTile();
        grid[x+4][y-4].yellowTile();
        grid[x-2][y-5].yellowTile();
        grid[x+4][y-5].yellowTile();
        grid[x][y-5].yellowTile();
        grid[x+1][y-5].yellowTile();
        grid[x+2][y-5].yellowTile();
        grid[x-1][y-6].yellowTile();
        grid[x][y-6].yellowTile();
        grid[x+2][y-6].yellowTile();
        grid[x+3][y-6].yellowTile();
        grid[x][y-7].yellowTile();
        grid[x+1][y-7].yellowTile();
        grid[x+2][y-7].yellowTile();
        grid[x][y-8].yellowTile();
        grid[x+1][y-8].yellowTile();
        grid[x+2][y-8].yellowTile();
        grid[x+1][y-9].yellowTile();
        grid[x+1][y-10].yellowTile();
        
        
    }

    @Override
    public void bottomDirection(GameGrid.Tile[][] grid, int x, int y) {
        grid[x][y].yellowTile();
        grid[x-2][y].yellowTile();
        grid[x][y+1].yellowTile();
        grid[x-2][y+1].yellowTile();
        grid[x-2][y+2].yellowTile();
        grid[x][y+2].yellowTile();
        grid[x+1][y+3].yellowTile();
        grid[x-3][y+3].yellowTile();
        grid[x-4][y+4].yellowTile();
        grid[x+2][y+4].yellowTile();
        grid[x-4][y+5].yellowTile();
        grid[x+2][y+5].yellowTile();
        grid[x][y+5].yellowTile();
        grid[x-1][y+5].yellowTile();
        grid[x-2][y+5].yellowTile();
        grid[x-3][y+6].yellowTile();
        grid[x-2][y+6].yellowTile();
        grid[x][y+6].yellowTile();
        grid[x+1][y+6].yellowTile();
        grid[x-2][y+7].yellowTile();
        grid[x-1][y+7].yellowTile();
        grid[x][y+7].yellowTile();
        grid[x-2][y+8].yellowTile();
        grid[x-1][y+8].yellowTile();
        grid[x][y+8].yellowTile();
        grid[x-1][y+9].yellowTile();
        grid[x-1][y+10].yellowTile();
    }

    @Override
    public void leftDirection(GameGrid.Tile[][] grid, int x, int y) {
        grid[x][y].yellowTile();
        grid[x][y-2].yellowTile();
        grid[x-1][y].yellowTile();
        grid[x-1][y-2].yellowTile();
        grid[x-2][y].yellowTile();
        grid[x-2][y-2].yellowTile();
        grid[x-3][y+1].yellowTile();
        grid[x-3][y-3].yellowTile();
        grid[x-4][y+2].yellowTile();
        grid[x-4][y-4].yellowTile();
        grid[x-5][y+2].yellowTile();
        grid[x-5][y-4].yellowTile();
        grid[x-5][y].yellowTile();
        grid[x-5][y-1].yellowTile();
        grid[x-5][y-2].yellowTile();
        grid[x-6][y+1].yellowTile();
        grid[x-6][y].yellowTile();
        grid[x-6][y-2].yellowTile();
        grid[x-6][y-3].yellowTile();
        grid[x-7][y].yellowTile();
        grid[x-7][y-1].yellowTile();
        grid[x-7][y-2].yellowTile();
        grid[x-8][y].yellowTile();
        grid[x-8][y-1].yellowTile();
        grid[x-8][y-2].yellowTile();
        grid[x-9][y-1].yellowTile();
        grid[x-10][y-1].yellowTile();
    }

    @Override
    public void rightDirection(GameGrid.Tile[][] grid, int x, int y) {
        grid[x][y].yellowTile();
        grid[x][y+2].yellowTile();
        grid[x+1][y].yellowTile();
        grid[x+1][y+2].yellowTile();
        grid[x+2][y].yellowTile();
        grid[x+2][y+2].yellowTile();
        grid[x+3][y-1].yellowTile();
        grid[x+3][y+3].yellowTile();
        grid[x+4][y-2].yellowTile();
        grid[x+4][y+4].yellowTile();
        grid[x+5][y-2].yellowTile();
        grid[x+5][y+4].yellowTile();
        grid[x+5][y].yellowTile();
        grid[x+5][y+1].yellowTile();
        grid[x+5][y+2].yellowTile();
        grid[x+6][y-1].yellowTile();
        grid[x+6][y].yellowTile();
        grid[x+6][y+2].yellowTile();
        grid[x+6][y+3].yellowTile();
        grid[x+7][y].yellowTile();
        grid[x+7][y+1].yellowTile();
        grid[x+7][y+2].yellowTile();
        grid[x+8][y].yellowTile();
        grid[x+8][y+1].yellowTile();
        grid[x+8][y+2].yellowTile();
        grid[x+9][y+1].yellowTile();
        grid[x+10][y+1].yellowTile();
    }
    
}
