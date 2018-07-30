package com.pau101.wings.server.asm.plugin;

import com.pau101.wings.WingsMod;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;

import javax.annotation.Nullable;
import java.util.Map;

@IFMLLoadingPlugin.Name(WingsMod.ID)
@IFMLLoadingPlugin.MCVersion(MinecraftForge.MC_VERSION)
@IFMLLoadingPlugin.SortingIndex(1002)
@IFMLLoadingPlugin.TransformerExclusions("com.pau101.wings.server.asm.plugin.")
public final class WingsLoadingPlugin implements IFMLLoadingPlugin {
	@Override
	public String[] getASMTransformerClass() {
		return new String[] { "com.pau101.wings.server.asm.WingsRuntimePatcher" };
	}

	@Override
	public String getModContainerClass() {
		return null;
	}

	@Nullable
	@Override
	public String getSetupClass() {
		return null;
	}

	@Override
	public void injectData(Map<String, Object> data) {}

	@Override
	public String getAccessTransformerClass() {
		return null;
	}
}
