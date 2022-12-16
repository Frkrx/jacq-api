package com.m2i.jacqapi.repository;

import com.m2i.jacqapi.model.Workspace;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IWorkspaceRepository extends JpaRepository<Workspace,Long> {
}
