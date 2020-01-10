package com.crivano.jflow.model;

import java.util.List;

public interface TaskDefinition {

	String getId();

	String getName();

	TaskKind getKind();

	String getTitle();

	String getAfter();

	ResponsibleKind getResponsibleKind();

	List<TaskDefinitionVariable> getVariable();

	List<TaskDefinitionDetour> getDetour();

	String getSubject();

	String getText();

}