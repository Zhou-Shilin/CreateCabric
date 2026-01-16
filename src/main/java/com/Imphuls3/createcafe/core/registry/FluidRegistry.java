package com.Imphuls3.createcafe.core.registry;

import com.Imphuls3.createcafe.CreateCafe;

/**
 * FluidRegistry - Placeholder for fluid registration
 * 
 * Note: The original Forge version used Registrate from Create mod for complex fluid
 * registration with buckets and flowing variants. For the Fabric port, fluid registration
 * is simplified. Full fluid support may require additional dependencies like
 * Create Fabric's Registrate or custom fluid implementation.
 * 
 * For now, this is a placeholder that can be expanded later with proper
 * Fabric fluid support.
 */
public class FluidRegistry {
    
    public static void register() {
        // Fluid registration is currently disabled for the Fabric port
        // The original mod registered ~50 different milk tea fluids using Registrate
        // This will need to be implemented using Fabric's fluid API or Create Fabric's utilities
        CreateCafe.LOGGER.info("FluidRegistry: Fluid registration is pending Fabric implementation");
    }
}
