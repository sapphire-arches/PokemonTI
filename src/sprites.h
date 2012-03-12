/****************************************
* This file contains or points to all of
* the sprites used by the game, anywhere
* ever. Or it should. Report any arrays
* suspect to be chars not mentioned in
* this file to the repo owner immediatly.
*
* Also, all sprite deffinitions should
* start with spr_
****************************************/
#ifndef _SPRITES_H_INCLUDED
#define _SPRITES_H_INCLUDED

char spr_smile[] =
{
	8,8,
	0x3C, /* defb @00111100 ;  oooo   */
	0x42, /* defb @01000010 ; o    o  */
	0xA5, /* defb @10100101 ;o o  o o */
	0xA5, /* defb @10100101 ;o o  o o */
	0x81, /* defb @10000001 ;o      o	*/
	0xA5, /* defb @10100101 ;o o  o o */
	0x5A, /* defb @01011010 ; o oo o  */
	0x3C  /* defb @00111100 ;  oooo   */
};

#include "spr_tiles.h"

#endif
