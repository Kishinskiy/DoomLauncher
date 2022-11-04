import os
from enum import Enum
from pathlib import Path

HOME = str(Path.home())


class Folder:
    DOOM_PATH = os.path.join(HOME, "Doom")
    MODS = os.path.join(DOOM_PATH, "mods")
    MAPS = os.path.join(DOOM_PATH, "maps")
    WADS = os.path.join(DOOM_PATH, "wads")


class Doom:

    def __init__(self):
        self.engine = Engine().gzdoom
        self.wad = Wad.DOOM2.value
        self.mods = []

    def run(self):
        stream = os.popen(f"{self.engine} -iwad {self.wad} -file {' '.join(self.mods)}")
        output = stream.read()
        return output

    def add_mods(self, mod_list):
        self.mods.extend(mod_list)


class Engine:
    def __init__(self):
        self.gzdoom = os.path.abspath("/Applications/GZDoom.app/Contents/MacOS/gzdoom")
        self.zandronum = os.path.abspath("/Applications/Zandronum.app/Contents/MacOS/zandronum")


class Wad(Enum):
    DOOM = os.path.join(Folder.WADS, "DOOM.WAD")
    DOOM2 = os.path.join(Folder.WADS, "DOOM2.WAD")
    MASTER_LEVELS = os.path.join(Folder.WADS, "MASTERLEVELS.WAD")
    NERVE = os.path.join(Folder.WADS, "NERVE.WAD")
    PLUTONIA = os.path.join(Folder.WADS, "PLUTONIA.WAD")
    TNT = os.path.join(Folder.WADS, "TNT.WAD")
    SIGIL = os.path.join(Folder.WADS, "SIGIL.WAD")
    LOST_EPISODES = os.path.join(Folder.WADS, "JM2.WAD")
