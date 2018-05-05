package UserInterface.Insertion;

import UserInterface.Controllers.GameGrid;

public class OrInsertion implements Insertion{

    @Override
    public void insertTop(GameGrid.Tile[][] grid, int x, int y) {
        grid[x][y].yellowTile();
        grid[x+2][y].yellowTile();
        grid[x][y-1].yellowTile();
        grid[x+2][y-1].yellowTile();
        grid[x][y-2].yellowTile();
        grid[x+2][y-2].yellowTile();
        grid[x-1][y-3].yellowTile();
        grid[x+3][y-3].yellowTile();
        grid[x-1][y-4].yellowTile();
        grid[x+1][y-4].yellowTile();
        grid[x+3][y-4].yellowTile();
        grid[x][y-5].yellowTile();
        grid[x+1][y-5].yellowTile();
        grid[x+2][y-5].yellowTile();
        grid[x+1][y-6].yellowTile();
        grid[x+1][y-7].yellowTile();
        grid[x+1][y-8].yellowTile();
    }

    @Override
    public void insertBottom(GameGrid.Tile[][] grid, int x, int y) {
        grid[x][y].yellowTile();
        grid[x-2][y].yellowTile();
        grid[x][y+1].yellowTile();
        grid[x-2][y+1].yellowTile();
        grid[x][y+2].yellowTile();
        grid[x-2][y+2].yellowTile();
        grid[x-3][y+3].yellowTile();
        grid[x+1][y+3].yellowTile();
        grid[x-3][y+4].yellowTile();
        grid[x-1][y+4].yellowTile();
        grid[x+1][y+4].yellowTile();
        grid[x][y+5].yellowTile();
        grid[x-1][y+5].yellowTile();
        grid[x-2][y+5].yellowTile();
        grid[x-1][y+6].yellowTile();
        grid[x-1][y+7].yellowTile();
        grid[x-1][y+8].yellowTile();
    }

    @Override
    public void insertLeft(GameGrid.Tile[][] grid, int x, int y) {
        grid[x][y].yellowTile();
        grid[x][y-2].yellowTile();
        grid[x-1][y].yellowTile();
        grid[x-1][y-2].yellowTile();
        grid[x-2][y].yellowTile();
        grid[x-2][y-2].yellowTile();
        grid[x-3][y+1].yellowTile();
        grid[x-3][y-3].yellowTile();
        grid[x-4][y+1].yellowTile();
        grid[x-4][y-1].yellowTile();
        grid[x-4][y-3].yellowTile();
        grid[x-5][y].yellowTile();
        grid[x-5][y-1].yellowTile();
        grid[x-5][y-2].yellowTile();
        grid[x-6][y-1].yellowTile();
        grid[x-7][y-1].yellowTile();
        grid[x-8][y-1].yellowTile();
    }

    @Override
    public void insertRight(GameGrid.Tile[][] grid, int x, int y) {
        grid[x][y].yellowTile();
        grid[x][y+2].yellowTile();
        grid[x+1][y].yellowTile();
        grid[x+1][y+2].yellowTile();
        grid[x+2][y].yellowTile();
        grid[x+2][y+2].yellowTile();
        grid[x+3][y-1].yellowTile();
        grid[x+3][y+3].yellowTile();
        grid[x+4][y-1].yellowTile();
        grid[x+4][y+1].yellowTile();
        grid[x+4][y+3].yellowTile();
        grid[x+5][y].yellowTile();
        grid[x+5][y+1].yellowTile();
        grid[x+5][y+2].yellowTile();
        grid[x+6][y+1].yellowTile();
        grid[x+7][y+1].yellowTile();
        grid[x+8][y+1].yellowTile();
    }
    
}
