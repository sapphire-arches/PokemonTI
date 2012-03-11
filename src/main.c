/******************************\
*   Entry point.               *
\******************************/

#pragma string name PokemonTI
//Should be a big P, with a pokeball and a black border.
#pragma data mirage_icon 0x7f, 0x7f, 0x0, 0x6, 0xf8, 0xa5, 0xf8, 0xbb, 0x30, 0x36, 0x60, 
#0xef, 0xc0, 0x5f, 0x99, 0xb0, 0xb, 0x62, 0x4e, 0x47, 0xfd, 0x9, 0x9b, 0x8, 0xb0, 0xe, 
#0xff, 0x7f, 0x80;

#include <stdio.h>
#include <games.h>

main()
{
	printf ("Heh, no executable code yet! we are working on it!");
	//pause, so MirageOS doesn't come back, making it look like we crashed
	getk ();
}
