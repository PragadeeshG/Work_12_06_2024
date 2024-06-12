package com.test1;

public class BFSValidationUnitcurrentOwnershipMeta {
	private String bfsCode;
	private String functionMeta;
	private String currentOwnership;
	private String departmentCode;
	private boolean modelPartitionType;
	private Integer functionSystem;
	private boolean bfsfunctionType;
	private String bfsfunctionSystem;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public BFSValidationUnitcurrentOwnershipMeta() {

	}

	public BFSValidationUnitcurrentOwnershipMeta(String bfsCode, String functionMeta, String currentOwnership,
			String departmentCode, boolean modelPartitionType, Integer functionSystem, boolean bfsfunctionType,
			String bfsfunctionSystem, String creationDate, String modifiedDate, String entityState) {
		super();
		this.bfsCode = bfsCode;
		this.functionMeta = functionMeta;
		this.currentOwnership = currentOwnership;
		this.departmentCode = departmentCode;
		this.modelPartitionType = modelPartitionType;
		this.functionSystem = functionSystem;
		this.bfsfunctionType = bfsfunctionType;
		this.bfsfunctionSystem = bfsfunctionSystem;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public String getBfsCode() {
		return bfsCode;
	}

	public void setBfsCode(String bfsCode) {
		this.bfsCode = bfsCode;
	}

	public String getFunctionMeta() {
		return functionMeta;
	}

	public void setFunctionMeta(String functionMeta) {
		this.functionMeta = functionMeta;
	}

	public String getCurrentOwnership() {
		return currentOwnership;
	}

	public void setCurrentOwnership(String currentOwnership) {
		this.currentOwnership = currentOwnership;
	}

	public String getDepartmentCode() {
		return departmentCode;
	}

	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}

	public boolean isModelPartitionType() {
		return modelPartitionType;
	}

	public void setModelPartitionType(boolean modelPartitionType) {
		this.modelPartitionType = modelPartitionType;
	}

	public Integer getFunctionSystem() {
		return functionSystem;
	}

	public void setFunctionSystem(Integer functionSystem) {
		this.functionSystem = functionSystem;
	}

	public boolean isBfsfunctionType() {
		return bfsfunctionType;
	}

	public void setBfsfunctionType(boolean bfsfunctionType) {
		this.bfsfunctionType = bfsfunctionType;
	}

	public String getBfsfunctionSystem() {
		return bfsfunctionSystem;
	}

	public void setBfsfunctionSystem(String bfsfunctionSystem) {
		this.bfsfunctionSystem = bfsfunctionSystem;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
