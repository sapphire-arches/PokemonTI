/****************************************
* This file includes deffinitions for all
*of the declarations for the renderers.
*other files contain the implementations.
*****************************************/

#ifndef RENDERER_H_INCLUDED
#define RENDERER_H_INCLUDED

#include <games.h>
#include <graphics.h>
#include "map/map.h"
#include "sprites.h"

extern void ren_draw_map (int xStart, int yStart);

extern void ren_clear_screen (void);

extern void ren_clear_area (char x, char y, char w, char h);

extern void ren_draw_arrow (char x, char y);

#endif
