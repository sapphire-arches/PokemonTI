all:
	zcc +ti8xansi -lm -startup=2 -obuild/POKE -create-app ./src/main.c
