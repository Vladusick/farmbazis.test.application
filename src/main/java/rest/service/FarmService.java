package rest.service;

import rest.dao.FarmRepository;
import rest.model.DataObject;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class FarmService {

    public List<DataObject> byId(int id) {
        DataObject dataObject;
        FarmRepository farmRepository = new FarmRepository();
        Connection connection = farmRepository.connectToDatabase();
        dataObject = farmRepository.queryResultById(connection, id);

        List<DataObject> dataObjects = new ArrayList<>();
        dataObjects.add(dataObject);
        return dataObjects;
    }
}
