package com.application.cvirms.service;

import com.application.cvirms.dto.features.Flag;
import com.application.cvirms.repo.DocumentRepository;
import com.application.cvirms.repo.FlagRepository;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PoliceService {

    @Autowired
    private FlagRepository flagRepository;
    @Autowired
    private DocumentRepository documentRepository;

    public void addFlag(Flag flag) {

        documentRepository.save(flag.getDocument());
        flagRepository.save(flag);
    }

    public List<Flag> showFlags() {

      return flagRepository.findAll();
    }
}
