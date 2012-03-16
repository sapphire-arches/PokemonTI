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
				map_map [map_get_index (x, y)] = MAP_GRASS_DEC;
			} else {
				map_map [map_get_index (x, y)] = MAP_NONE;
			}
		}
	}
	
	for (x = 0; x < 94; x += 8) {
		for (y = 0; y < 62; y += 8) {
			switch (map_map[map_get_index (x / 8, y / 8)]) {
				case MAP_GRASS_DEC:
					putsprite (SPR_OR, x, y, spr_tile_grass);
					break;
				case MAP_NONE:
					break;
				default:
					break;
			}
		}
	}
	getk ();
}
