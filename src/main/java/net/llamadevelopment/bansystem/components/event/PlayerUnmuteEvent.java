package net.llamadevelopment.bansystem.components.event;

import cn.nukkit.event.HandlerList;
import cn.nukkit.event.player.PlayerEvent;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PlayerUnmuteEvent extends PlayerEvent {

    private final String target;
    private static final HandlerList handlers = new HandlerList();

}