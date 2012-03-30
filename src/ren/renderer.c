#include "renderer.h"

void ren_draw_map (int xStart, int yStart) {
    char x,y, mx, my;
    unsigned char val;

    //31 is 62 / 2
    for (y = 0; y < 31; ++y) {
        //Left shift is a multiply by two.
        undrawb (y, y, 61 - (y << 1), 93 - (y << 1));
    }

    for (x = 0; x < 94; x += 8) {
        for (y = 0; y < 62; y += 8) {
            //Right shifts are divides by two. Should give a (tiny) speed boost.
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

void ren_clear_screen (void) {
    char y;
    for (y = 0; y < 31; ++y) {
        undrawb (y, y, 61 - (y << 1), 93 - (y << 1));
    }
}

void ren_clear_area (char x, char y, char w, char h) {
    //i - iterator
    //m - max
    //f - flag (which way is greater? y or x)
    char i, m, f;
    if (w > h)
        f = 1;
    else
        f = 0;
    m = (f) ? w : h;

    if (f) {
        for (i = 0; i < w / 2; ++i) {
            undrawb (x + i, y + i, w - 1 - (i << 1), h - 1 - (i << 1));
        }
    } else {
        for (i = 0; i < h / 2; ++i) {
            undrawb (x + i, y + i, w - 1 - (i << 1), h - 1 - (i << 1));
        }
    }
}

void ren_draw_arrow (char x, char y) {
    draw (x, y, x + 5, y);
    draw (x + 1, y + 1, x + 4, y + 1);
    draw (x + 1, y + 2, x + 4, y + 2);
    draw (x + 3, y + 3, x + 3, y + 3);
}

