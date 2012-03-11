/******************************\
*   Entry point.               *
\******************************/

#pragma string name PokemonTI
//Icon is broken, but too lazy to fix it now.

//   ******
//  ********
//  **    **
//  **    **
//  **    **
//  ********
//  *******
//  **     **
//  **    ****
//  **   **  **
//  **   **  **
//  **    ****
//  **     **
#pragma data mirage_icon 0x1F,0x80,0x7F,0x80,0xC3,0x01,0x86,0x03,0x0C,0x07,0xF8,0x0F,0xE0,0x18,0x30,0x30,0xF0,0x63,0x30,0xC6,0x61,0x87,0x83,0x06,0x00,0x00,0x00,0x00,0x00,0x00;

#include <stdio.h>
#include <games.h>

main()
{
	printf ("Heh, no executable code yet! we are working on it!");
	//pause, so MirageOS doesn't come back, making it look like we crashed
	getk ();
}
