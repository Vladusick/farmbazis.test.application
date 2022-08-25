package rest.dao;

import rest.model.DataObject;

import java.sql.*;

public class FarmRepository {

    public Connection connectToDatabase() {
        Connection connection = null;

        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/farmbazis", "postgres", "qwerty123");
            if (connection != null) {
                System.out.println("DB Connected");
            }
            else {
                System.out.println("Connection failed");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

    public DataObject queryResultById(Connection connection, int id) {
        DataObject dataObject = new DataObject();

        try {
            String sql = "SELECT check_id, nds, drug, fabr, form, srok_godn, quantity, sum_rozn FROM sales WHERE check_id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int check_id = resultSet.getInt("check_id");
                int nds = resultSet.getInt("nds");
                String drug = resultSet.getString("drug");
                String fabr = resultSet.getString("fabr");
                String form = resultSet.getString("form");
                String srok_godn = resultSet.getString("srok_godn");
                int quantity = resultSet.getInt("quantity");
                double sum_rozn = resultSet.getDouble("sum_rozn");
                dataObject.setCheck_id(check_id);
                dataObject.setNds(nds);
                dataObject.setDrug(drug);
                dataObject.setFabr(fabr);
                dataObject.setForm(form);
                dataObject.setSrokGodn(srok_godn);
                dataObject.setQuanity(quantity);
                dataObject.setSumRozn(sum_rozn);

                System.out.println("query result = " + dataObject.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataObject;
    }
}
