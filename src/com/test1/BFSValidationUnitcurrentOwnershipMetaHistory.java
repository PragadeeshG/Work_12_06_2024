package com.test1;

public class BFSValidationUnitcurrentOwnershipMetaHistory {
	private String historyDate;
	private String bfsCode;
	private String functionMeta;
	private String currentOwnership;
	private String certStatusFlag;
	private boolean certStatusDone;
	private String certStatusType;
	private String actedBy;
	private String certStatusOrigin;
	private String updatedFromOrigin;
	private String removedFromOrigin;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public BFSValidationUnitcurrentOwnershipMetaHistory() {

	}

	public BFSValidationUnitcurrentOwnershipMetaHistory(String historyDate, String bfsCode, String functionMeta,
			String currentOwnership, String certStatusFlag, boolean certStatusDone, String certStatusType,
			String actedBy, String certStatusOrigin, String updatedFromOrigin, String removedFromOrigin,
			String creationDate, String modifiedDate, String entityState) {
		super();
		this.historyDate = historyDate;
		this.bfsCode = bfsCode;
		this.functionMeta = functionMeta;
		this.currentOwnership = currentOwnership;
		this.certStatusFlag = certStatusFlag;
		this.certStatusDone = certStatusDone;
		this.certStatusType = certStatusType;
		this.actedBy = actedBy;
		this.certStatusOrigin = certStatusOrigin;
		this.updatedFromOrigin = updatedFromOrigin;
		this.removedFromOrigin = removedFromOrigin;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public String getHistoryDate() {
		return historyDate;
	}

	public void setHistoryDate(String historyDate) {
		this.historyDate = historyDate;
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

	public String getCertStatusFlag() {
		return certStatusFlag;
	}

	public void setCertStatusFlag(String certStatusFlag) {
		this.certStatusFlag = certStatusFlag;
	}

	public boolean isCertStatusDone() {
		return certStatusDone;
	}

	public void setCertStatusDone(boolean certStatusDone) {
		this.certStatusDone = certStatusDone;
	}

	public String getCertStatusType() {
		return certStatusType;
	}

	public void setCertStatusType(String certStatusType) {
		this.certStatusType = certStatusType;
	}

	public String getActedBy() {
		return actedBy;
	}

	public void setActedBy(String actedBy) {
		this.actedBy = actedBy;
	}

	public String getCertStatusOrigin() {
		return certStatusOrigin;
	}

	public void setCertStatusOrigin(String certStatusOrigin) {
		this.certStatusOrigin = certStatusOrigin;
	}

	public String getUpdatedFromOrigin() {
		return updatedFromOrigin;
	}

	public void setUpdatedFromOrigin(String updatedFromOrigin) {
		this.updatedFromOrigin = updatedFromOrigin;
	}

	public String getRemovedFromOrigin() {
		return removedFromOrigin;
	}

	public void setRemovedFromOrigin(String removedFromOrigin) {
		this.removedFromOrigin = removedFromOrigin;
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
