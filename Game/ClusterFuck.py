import os

from Doom import Doom, Engine, Folder


class ClusterFuck(Doom):
    def __init__(self):
        super().__init__()
        self.engine = Engine().zandronum
        self.game = os.path.join(Folder.DOOM_PATH, "Games/ClusterFuck")

        bulletpuff_fix = os.path.join(self.game, "bulletpuff_fix.wad")
        newtextcolors = os.path.join(self.game, "newtextcolors_260.pk3")
        complex_doom = os.path.join(self.game, "complex-doom.v26a2.pk3")
        lca = os.path.join(self.game, "lca-v1.5.9.6.pk3")
        randomons = os.path.join(self.game, "randomons-v1.2.5.0.pk3")
        complex_dust = os.path.join(self.game, "complex-dust-v1.7.1.pk3")
        insanelca_custom = os.path.join(self.game, "insanelca-custom-v1.3CF.1.pk3")
        hem_custom = os.path.join(self.game, "hem-custom-CF-v4.0.1.pk3")
        complex_dust_clusterfuck = os.path.join(self.game, "complex-dust-clusterfuck-v4.0.1.pk3")
        hp_bar = os.path.join(self.game, "hpbar-v16c.pk3")

        self.mods = [bulletpuff_fix, newtextcolors, complex_doom, lca, randomons, complex_dust, insanelca_custom,
                     hem_custom, complex_dust_clusterfuck, hp_bar]



