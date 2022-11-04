#!/bin/env python3
import os

from Game.ClusterFuck import ClusterFuck
from Doom import Wad, Folder

doom = ClusterFuck()


map = os.path.join(Folder.MAPS, "blood_revealed.wad")

doom.mods.append(map)


def main():
    print(doom.run())


if __name__ == '__main__':
    main()
