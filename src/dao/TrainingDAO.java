package dao;

import training.Sport;

import java.util.List;

public interface TrainingDAO {

    void insert(Sport person);

    List<Sport> select();

}
