package me.aziah.ranks;

import me.aziah.server.PlayerData;
import org.bukkit.entity.Player;

import static me.aziah.Inferris.*;

public class Tab {

    public void deploy(Player player){


        if(PlayerData.getDonorBranchID(player) == 0) {

            if (PlayerData.getStaffBranchID(player) == 3) {
                adminTeam.addEntry(player.getName());
            }
            if (PlayerData.getStaffBranchID(player) == 2) {
                modTeam.addEntry(player.getName());
            }
            if (PlayerData.getStaffBranchID(player) == 1) {
                helperTeam.addEntry(player.getName());
            }
        }

        if(PlayerData.getDonorBranchID(player) == 1) {
            if (PlayerData.getStaffBranchID(player) == 3) {
                adminTeam.addEntry(player.getName());
            }
            if (PlayerData.getStaffBranchID(player) == 2) {
                modTeam.addEntry(player.getName());
            }
            if (PlayerData.getStaffBranchID(player) == 1) {
                helperTeam.addEntry(player.getName());
            }
            if (PlayerData.getStaffBranchID(player) == 0) {
                donor1Team.addEntry(player.getName());
            }
        }

        if(PlayerData.getDonorBranchID(player) == 2) {
            if (PlayerData.getStaffBranchID(player) == 3) {
                adminTeam.addEntry(player.getName());
            }
            if (PlayerData.getStaffBranchID(player) == 2) {
                modTeam.addEntry(player.getName());
            }
            if (PlayerData.getStaffBranchID(player) == 1) {
                helperTeam.addEntry(player.getName());
            }
            if (PlayerData.getStaffBranchID(player) == 0) {
                donor2Team.addEntry(player.getName());
            }
        }

        if(PlayerData.getStaffBranchID(player) == 0 && PlayerData.getDonorBranchID(player) == 0){
            noneTeam.addEntry(player.getName());
        }

        /*Special*/
        if(PlayerData.getAffiliateBranchID(player) == 1){
            affiliate.addEntry(player.getName());
        }
    }

    public void removeEntries(Player player){
        adminTeam.removeEntry(player.getName());
        modTeam.removeEntry(player.getName());
        helperTeam.removeEntry(player.getName());
        donor2Team.removeEntry(player.getName());
        donor1Team.removeEntry(player.getName());
        affiliate.removeEntry(player.getName());
        noneTeam.removeEntry(player.getName());
    }
}