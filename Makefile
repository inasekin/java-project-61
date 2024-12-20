.DEFAULT_GOAL := build-run

clean:
	make -C app clean

build:
	make -C app build

install:
	make -C app install

run-dist:
	make -C app run-dist

run:
	make -C app run

lint:
	make -C app lint

build-run: build run

.PHONY: build clean install run-dist run lint build-run
