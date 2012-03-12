#Variable controls build target.
TAR=+ti8xansi #change to +ti83ansi to build for TI83's. This should work for all + and
#                    Silver edition calcs.
#                    See the z88dk wiki or the zcc man page for target names of other
#                    platforms.
all:
	zcc $(TAR) -startup=2 -obuild/POKE -create-app ./src/main.c

clean: #Clean target. ZCC is nice and cleans up all it's crap after compile.
	rm build/*
