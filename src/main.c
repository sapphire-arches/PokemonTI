/******************************\
*   Entry point.               *
\******************************/

#include "main.h"

main()
{
	char x, y;
	for (x = 0; x < 94; x+= 8) {
		for (y = 0; y < 62; y += 8) {
			if (rand() < RAND_MAX / 5)
				putsprite (spr_or, x, y, spr_tile_grass);
		}
	}
	getk ();
}
