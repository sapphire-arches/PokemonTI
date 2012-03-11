/******************************\
*   Entry point.               *
\******************************/

#pragma string name PokemonTI
#pragma data icon 0x3C,0x42,0xA5,0xA5,0x81,0xA5,0x5A,0x3C;

#include <stdio.h>

main()
{
	printf ("Heh, no executable code yet! we are working on it!");
	//pause, so MirageOS doesn't come back, making it look like we crashed
	getk ();
}
