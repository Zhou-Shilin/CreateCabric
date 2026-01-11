# CreateCafe (Fabric)

Addon to the Create mod for Minecraft Fabric 1.21.1

Adds Boba Tea and Iced Coffee drinks that give the player potion effects.

## Fabric Port

This is a port of the Create Cafe mod to Fabric. 

### Requirements
- Minecraft 1.21.1
- Fabric Loader 0.16.0+
- Fabric API
- Create Fabric (when available for 1.21.1)

### Building

```bash
./gradlew build
```

The built jar will be in `build/libs/`.

### Known Limitations

This port is a work in progress. Some features from the NeoForge version may not be fully implemented:

1. **Fluids**: The fluid system has been simplified. Full fluid integration with Create machines will be added when Create Fabric for 1.21.1 is available.

2. **Caffeine Crash Effect**: The automatic caffeine crash effect when the caffeinated effect expires is not yet implemented (requires mixin).

3. **Loot Modifiers**: Global loot modifiers from NeoForge have not been ported to Fabric's loot table system yet.

### Credits

- Original mod by Myst (1mphuls3)
- Fabric port contributions welcome!
