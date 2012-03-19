#include "renderer.h"

void ren_draw_map (int xStart, int yStart) {
	char x,y, mx, my;
	unsigned char val;
	
	putsprite (SPR_AND, 0, 0, spr_clear);
	
	for (x = 0; x < 94; x += 8) {
		for (y = 0; y < 62; y += 8) {
			mx = x / 8;
			my = y / 8;
			val = map_map [map_getindex (xStart + mx, yStart + my)];
			switch (val) {
				case MAP_GRASS_DEC : putsprite (SPR_OR, x, y, spr_tile_grass); break;
				case MAP_NONE: break;
				default: break;
			}
		}
	}
}
