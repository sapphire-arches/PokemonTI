#include "renderer.h"

void ren_draw_map (int xStart, int yStart) {
    char x,y, mx, my;
    unsigned char val;

    for (y = 0; y < 62 / 2; ++y) {
        //Right shift is a multiply by two.
        undrawb (y, y, 94 - (y << 1), 61 - (y << 1));
    }

    for (x = 0; x < 94; x += 8) {
        for (y = 0; y < 62; y += 8) {
            //Right shifts are multiplies by two. Should give a (tiny) speed boost.
            mx = x >> 3;
            my = y >> 3;
            val = map_map [map_getindex (xStart + mx, yStart + my)];
            putsprite (SPR_XOR, x, y, spr_tile_blank);
            switch (val) {
                case MAP_GRASS_DEC : putsprite (SPR_OR, x, y, spr_tile_grass); break;
                case MAP_NONE: break;
                default: break;
            }
        }
    }
}
