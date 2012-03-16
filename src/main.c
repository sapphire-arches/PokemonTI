/******************************\
*   Entry point.               *
\******************************/

#include "main.h"

main()
{
	char x, y;
	putsprite (SPR_OR, 0, 0, spr_wait);
	for (x = 0; x < MAP_WIDTH; ++x) {
		for (y = 0; y < MAP_HEIGHT; ++y) {
			if (rand () < RAND_MAX / 4) {
				map_map [map_getindex (x, y)] = MAP_GRASS_DEC;
			} else {
				map_map [map_getindex (x, y)] = MAP_NONE;
			}
		}
	}
	
	ren_draw_map (0, 0);
	
	getk ();
}
