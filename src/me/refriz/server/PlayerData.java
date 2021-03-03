package me.refriz.server;

import me.refriz.ranks.Rank;
import org.bukkit.entity.Player;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.List;

public class PlayerData {

    private static final HashMap<String, Integer> staffBranchID = new HashMap<>();
    private static final HashMap<String, Integer> donorBranchID = new HashMap<>();
    private static final HashMap<String, Integer> builderBranchID = new HashMap<>();

    private static int id;

    public static Integer getBranchNumber(Player player, String branchName) {
        try {
            Connection connection = DatabaseConnector.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT `" + branchName + "` FROM ranks WHERE `uuid` = '" + player.getUniqueId() + "'");
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                id = resultSet.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return id;
    }

    public static boolean getRank(List<Player> rank, Player player) {

        if (rank == Rank.ADMIN.getRank()) {

            return rank.contains(player);
        }
        if (rank == Rank.MOD.getRank()) {

            return rank.contains(player);
        }
        if (rank == Rank.HELPER.getRank()) {

            return rank.contains(player);
        }
        if (rank == Rank.DONOR.getRank()) {

            return rank.contains(player);
        }
        if (rank == Rank.NONE.getRank()) {
            return rank.contains(player);
        }
        return true;
    }

    public static HashMap<String, Integer> getStaffBranchID() {
        return staffBranchID;
    }

    public static HashMap<String, Integer> getDonorBranchID() {
        return donorBranchID;
    }

    public static HashMap<String, Integer> getBuilderBranchID() {
        return builderBranchID;
    }
}