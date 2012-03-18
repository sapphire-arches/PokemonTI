#ifndef _MAP_H_INCLUDED
#define _MAP_H_INCLUDED

#define MAP_WIDTH 35
#define MAP_HEIGHT 35

//Tile type deffinitions
#define MAP_NONE 0
#define MAP_GRASS_DEC 1
#define MAP_ROAD_UP 2
#define MAP_ROAD_LEFT 3

unsigned char map_map [MAP_WIDTH * MAP_HEIGHT];

extern int map_getindex (char x, char y);

#endif
