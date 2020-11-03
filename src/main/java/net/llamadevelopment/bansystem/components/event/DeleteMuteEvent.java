package net.llamadevelopment.bansystem.components.event;

import cn.nukkit.event.HandlerList;
import cn.nukkit.event.player.PlayerEvent;

public class DeleteMuteEvent extends PlayerEvent {

    private final String id;
    private static final HandlerList handlers = new HandlerList();

    public DeleteMuteEvent(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public static HandlerList getHandlers() {
        return handlers;
    }

}
