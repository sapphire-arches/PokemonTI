#List of all source files.
SRC=src/ren/renderer.c src/map/map.c src/main.c

#Controls build target.
TAR=+ti8x
#This should work for all + and Silver edition calcs. See the z88dk wiki or
#the zcc man page for target names of other platforms.
all:
	zcc $(TAR) -lm -startup=2 -Isrc/ -obuild/POKE.obj -create-app $(SRC)
clean: #Clean target. ZCC is nice and cleans up all it's crap after compile.
	rm build/*
