package com.kramptest.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DemoService {

    @Autowired
    private DemoRepository demoRepository;

    public List<DemoEntity> getAllEntities() {
        return demoRepository.findAll();
    }

    public Optional<DemoEntity> getEntityById(Long id) {
        return demoRepository.findById(id);
    }

    public DemoEntity createOrUpdateEntity(DemoEntity entity) {
        return demoRepository.save(entity);
    }

    public void deleteEntity(Long id) {
        demoRepository.deleteById(id);
    }
}
