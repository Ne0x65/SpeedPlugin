package de.ne0x65;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerQuitListener implements Listener {

  @EventHandler
  public void onQuit(PlayerQuitEvent event) {
    Speed.getInstance().getSpeedCommand().getSpeed().remove(event.getPlayer());
    event.getPlayer().setWalkSpeed(0.2F);
    event.getPlayer().setFlySpeed(0.1F);

  }

}
