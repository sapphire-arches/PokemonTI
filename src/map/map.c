#include "map.h"

int map_getindex (char x, char y) {
	return x + y * MAP_HEIGHT;
}
