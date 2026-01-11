# CreateCafe (Fabric Port)

A Fabric port of the CreateCafe addon to the Create mod for Minecraft 1.20.1.

Adds Boba Tea and Iced Coffee drinks that give the player potion effects.

## Building

**Note**: This project requires internet access to Fabric's Maven repository to download dependencies.

To build the mod, run:

```bash
./gradlew build
```

The built JAR file will be located in `build/libs/`.

## Requirements

- Minecraft 1.20.1
- Fabric Loader 0.15.0+
- Fabric API 0.91.0+
- Java 17+

## Dependencies

- Create Fabric (for full integration with Create mod recipes)

## Features

### Drinks
- **Speed Drinks**: Mango, Lime, Strawberry, Peach, Plum, Jackfruit, Apricot, Durian, Fig, Grape, Grapefruit, Starfruit, Mandarin milk teas
- **Regeneration Drinks**: Blood Orange, Lychee, Blueberry, Pineapple, Apple, Pumpkin, Avocado, Sweetberry, Tamarind, Papaya, Redlove milk teas
- **Strength Drinks**: Mana Berry, Kiwi, Orange, Yucca, Aloe, Coconut, Persimmon, Pomegranate, Raspberry, Pomelo milk teas
- **Resistance Drinks**: Lemon, Watermelon, Vanilla, Banana, Cherry, Blackberry, Dragonfruit, Gooseberry, Guava, Passionfruit, Lavender, Citron milk teas
- **Special Drinks**: Barberry (Fire Resistance), Oreo (Super Drink with multiple effects)

### Iced Coffee
- Regular Iced Coffee with caffeinated effect
- Iced Coffee with Milk (clears status effects)
- Flavored variants: Strawberry, Vanilla, Raspberry, Mint, Caramel, Coconut, Banana

### Items
- Oreo cookies and related items
- Boba and boba cups
- Coffee beans, roasted coffee, coffee grounds
- Cassava seeds and roots
- Tapioca flour

### Effects
- **Caffeinated**: Gives speed boost, followed by caffeine crash when it wears off
- **Caffeine Crash**: Slowness effect after caffeinated effect ends

### Crops
- Coffee plants
- Cassava plants

## Configuration

The mod includes simple configuration options:
- `giveEmptyCups`: Whether drinks return empty cups (default: true)
- `effectDuration`: Duration of drink effects in seconds (default: 10)

## License

GPL-2.0 license

## Credits

Original mod by 1mphuls3
Fabric port for Minecraft 1.20.1
