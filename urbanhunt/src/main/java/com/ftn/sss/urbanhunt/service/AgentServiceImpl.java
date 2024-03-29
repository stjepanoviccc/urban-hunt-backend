package com.ftn.sss.urbanhunt.service;

import com.ftn.sss.urbanhunt.model.Agent;
import com.ftn.sss.urbanhunt.repository.interfaces.AgentRepository;
import com.ftn.sss.urbanhunt.service.interfaces.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AgentServiceImpl implements AgentService {
    private final AgentRepository agentRepository;

    @Autowired
    public AgentServiceImpl(AgentRepository agentRepository) {
        this.agentRepository = agentRepository;
    }

}
