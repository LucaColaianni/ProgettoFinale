package it.aulab.learningplatform2.service;

import java.util.List;
import java.util.Map;

public interface CrudService<Read , Create , Update, ID> {

    List<Read> readAll();
    List<Read> read();
    Read create(Create createDTO);
    Read update(Update updateDTO);
    Read delete(ID id);

}
