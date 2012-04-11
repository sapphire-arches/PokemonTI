/******************************\
*   Entry point.               *
\******************************/

#include "main.h"
#include <stdio.h>
#include <stdlib.h>
#include <games.h>
#include "ren/renderer.h"

void init (void) {
    char x, y;

    for (x = 0; x < MAP_WIDTH; ++x) {
        for (y = 0; y < MAP_HEIGHT; ++y) {
            if (rand () < RAND_MAX / 4) {
                map_map [map_getindex (x, y)] = MAP_GRASS_DEC;
            } else {
                map_map [map_getindex (x, y)] = MAP_NONE;
            }
        }
    }
}

void main() {
    putsprite (SPR_OR, 10, 10, spr_wait);

    init ();

    ren_draw_map (0, 0);

    getk ();
}
