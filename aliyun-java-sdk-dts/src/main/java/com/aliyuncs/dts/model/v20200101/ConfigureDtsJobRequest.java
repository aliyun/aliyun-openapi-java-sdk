/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.dts.model.v20200101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dts.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ConfigureDtsJobRequest extends RpcAcsRequest<ConfigureDtsJobResponse> {
	   

	private String checkpoint;

	private String sourceEndpointUserName;

	private String delayPhone;

	private String sourceEndpointIP;

	private String errorPhone;

	private String destinationEndpointUserName;

	private String dtsJobId;

	private String dbList;

	private String destinationEndpointOracleSID;

	private String destinationEndpointPort;

	private String sourceEndpointPassword;

	private String ownerId;

	private String jobType;

	private Long delayRuleTime;

	private String destinationEndpointIP;

	private String sourceEndpointInstanceType;

	private String dtsJobName;

	private String dtsInstanceId;

	private String synchronizationDirection;

	private String sourceEndpointRegion;

	private Boolean delayNotice;

	private String destinationEndpointInstanceType;

	private Boolean dataInitialization;

	private String sourceEndpointInstanceID;

	private Boolean structureInitialization;

	private String sourceEndpointOwnerID;

	private String sourceEndpointDatabaseName;

	private String destinationEndpointRegion;

	private String reserve;

	private Boolean dataSynchronization;

	private String destinationEndpointEngineName;

	private String destinationEndpointInstanceID;

	private String sourceEndpointPort;

	private String sourceEndpointOracleSID;

	private String destinationEndpointDataBaseName;

	private Boolean errorNotice;

	private String sourceEndpointRole;

	private String destinationEndpointPassword;

	private String sourceEndpointEngineName;
	public ConfigureDtsJobRequest() {
		super("Dts", "2020-01-01", "ConfigureDtsJob", "dts");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCheckpoint() {
		return this.checkpoint;
	}

	public void setCheckpoint(String checkpoint) {
		this.checkpoint = checkpoint;
		if(checkpoint != null){
			putQueryParameter("Checkpoint", checkpoint);
		}
	}

	public String getSourceEndpointUserName() {
		return this.sourceEndpointUserName;
	}

	public void setSourceEndpointUserName(String sourceEndpointUserName) {
		this.sourceEndpointUserName = sourceEndpointUserName;
		if(sourceEndpointUserName != null){
			putQueryParameter("SourceEndpointUserName", sourceEndpointUserName);
		}
	}

	public String getDelayPhone() {
		return this.delayPhone;
	}

	public void setDelayPhone(String delayPhone) {
		this.delayPhone = delayPhone;
		if(delayPhone != null){
			putQueryParameter("DelayPhone", delayPhone);
		}
	}

	public String getSourceEndpointIP() {
		return this.sourceEndpointIP;
	}

	public void setSourceEndpointIP(String sourceEndpointIP) {
		this.sourceEndpointIP = sourceEndpointIP;
		if(sourceEndpointIP != null){
			putQueryParameter("SourceEndpointIP", sourceEndpointIP);
		}
	}

	public String getErrorPhone() {
		return this.errorPhone;
	}

	public void setErrorPhone(String errorPhone) {
		this.errorPhone = errorPhone;
		if(errorPhone != null){
			putQueryParameter("ErrorPhone", errorPhone);
		}
	}

	public String getDestinationEndpointUserName() {
		return this.destinationEndpointUserName;
	}

	public void setDestinationEndpointUserName(String destinationEndpointUserName) {
		this.destinationEndpointUserName = destinationEndpointUserName;
		if(destinationEndpointUserName != null){
			putQueryParameter("DestinationEndpointUserName", destinationEndpointUserName);
		}
	}

	public String getDtsJobId() {
		return this.dtsJobId;
	}

	public void setDtsJobId(String dtsJobId) {
		this.dtsJobId = dtsJobId;
		if(dtsJobId != null){
			putQueryParameter("DtsJobId", dtsJobId);
		}
	}

	public String getDbList() {
		return this.dbList;
	}

	public void setDbList(String dbList) {
		this.dbList = dbList;
		if(dbList != null){
			putQueryParameter("DbList", dbList);
		}
	}

	public String getDestinationEndpointOracleSID() {
		return this.destinationEndpointOracleSID;
	}

	public void setDestinationEndpointOracleSID(String destinationEndpointOracleSID) {
		this.destinationEndpointOracleSID = destinationEndpointOracleSID;
		if(destinationEndpointOracleSID != null){
			putQueryParameter("DestinationEndpointOracleSID", destinationEndpointOracleSID);
		}
	}

	public String getDestinationEndpointPort() {
		return this.destinationEndpointPort;
	}

	public void setDestinationEndpointPort(String destinationEndpointPort) {
		this.destinationEndpointPort = destinationEndpointPort;
		if(destinationEndpointPort != null){
			putQueryParameter("DestinationEndpointPort", destinationEndpointPort);
		}
	}

	public String getSourceEndpointPassword() {
		return this.sourceEndpointPassword;
	}

	public void setSourceEndpointPassword(String sourceEndpointPassword) {
		this.sourceEndpointPassword = sourceEndpointPassword;
		if(sourceEndpointPassword != null){
			putQueryParameter("SourceEndpointPassword", sourceEndpointPassword);
		}
	}

	public String getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId);
		}
	}

	public String getJobType() {
		return this.jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
		if(jobType != null){
			putQueryParameter("JobType", jobType);
		}
	}

	public Long getDelayRuleTime() {
		return this.delayRuleTime;
	}

	public void setDelayRuleTime(Long delayRuleTime) {
		this.delayRuleTime = delayRuleTime;
		if(delayRuleTime != null){
			putQueryParameter("DelayRuleTime", delayRuleTime.toString());
		}
	}

	public String getDestinationEndpointIP() {
		return this.destinationEndpointIP;
	}

	public void setDestinationEndpointIP(String destinationEndpointIP) {
		this.destinationEndpointIP = destinationEndpointIP;
		if(destinationEndpointIP != null){
			putQueryParameter("DestinationEndpointIP", destinationEndpointIP);
		}
	}

	public String getSourceEndpointInstanceType() {
		return this.sourceEndpointInstanceType;
	}

	public void setSourceEndpointInstanceType(String sourceEndpointInstanceType) {
		this.sourceEndpointInstanceType = sourceEndpointInstanceType;
		if(sourceEndpointInstanceType != null){
			putQueryParameter("SourceEndpointInstanceType", sourceEndpointInstanceType);
		}
	}

	public String getDtsJobName() {
		return this.dtsJobName;
	}

	public void setDtsJobName(String dtsJobName) {
		this.dtsJobName = dtsJobName;
		if(dtsJobName != null){
			putQueryParameter("DtsJobName", dtsJobName);
		}
	}

	public String getDtsInstanceId() {
		return this.dtsInstanceId;
	}

	public void setDtsInstanceId(String dtsInstanceId) {
		this.dtsInstanceId = dtsInstanceId;
		if(dtsInstanceId != null){
			putQueryParameter("DtsInstanceId", dtsInstanceId);
		}
	}

	public String getSynchronizationDirection() {
		return this.synchronizationDirection;
	}

	public void setSynchronizationDirection(String synchronizationDirection) {
		this.synchronizationDirection = synchronizationDirection;
		if(synchronizationDirection != null){
			putQueryParameter("SynchronizationDirection", synchronizationDirection);
		}
	}

	public String getSourceEndpointRegion() {
		return this.sourceEndpointRegion;
	}

	public void setSourceEndpointRegion(String sourceEndpointRegion) {
		this.sourceEndpointRegion = sourceEndpointRegion;
		if(sourceEndpointRegion != null){
			putQueryParameter("SourceEndpointRegion", sourceEndpointRegion);
		}
	}

	public Boolean getDelayNotice() {
		return this.delayNotice;
	}

	public void setDelayNotice(Boolean delayNotice) {
		this.delayNotice = delayNotice;
		if(delayNotice != null){
			putQueryParameter("DelayNotice", delayNotice.toString());
		}
	}

	public String getDestinationEndpointInstanceType() {
		return this.destinationEndpointInstanceType;
	}

	public void setDestinationEndpointInstanceType(String destinationEndpointInstanceType) {
		this.destinationEndpointInstanceType = destinationEndpointInstanceType;
		if(destinationEndpointInstanceType != null){
			putQueryParameter("DestinationEndpointInstanceType", destinationEndpointInstanceType);
		}
	}

	public Boolean getDataInitialization() {
		return this.dataInitialization;
	}

	public void setDataInitialization(Boolean dataInitialization) {
		this.dataInitialization = dataInitialization;
		if(dataInitialization != null){
			putQueryParameter("DataInitialization", dataInitialization.toString());
		}
	}

	public String getSourceEndpointInstanceID() {
		return this.sourceEndpointInstanceID;
	}

	public void setSourceEndpointInstanceID(String sourceEndpointInstanceID) {
		this.sourceEndpointInstanceID = sourceEndpointInstanceID;
		if(sourceEndpointInstanceID != null){
			putQueryParameter("SourceEndpointInstanceID", sourceEndpointInstanceID);
		}
	}

	public Boolean getStructureInitialization() {
		return this.structureInitialization;
	}

	public void setStructureInitialization(Boolean structureInitialization) {
		this.structureInitialization = structureInitialization;
		if(structureInitialization != null){
			putQueryParameter("StructureInitialization", structureInitialization.toString());
		}
	}

	public String getSourceEndpointOwnerID() {
		return this.sourceEndpointOwnerID;
	}

	public void setSourceEndpointOwnerID(String sourceEndpointOwnerID) {
		this.sourceEndpointOwnerID = sourceEndpointOwnerID;
		if(sourceEndpointOwnerID != null){
			putQueryParameter("SourceEndpointOwnerID", sourceEndpointOwnerID);
		}
	}

	public String getSourceEndpointDatabaseName() {
		return this.sourceEndpointDatabaseName;
	}

	public void setSourceEndpointDatabaseName(String sourceEndpointDatabaseName) {
		this.sourceEndpointDatabaseName = sourceEndpointDatabaseName;
		if(sourceEndpointDatabaseName != null){
			putQueryParameter("SourceEndpointDatabaseName", sourceEndpointDatabaseName);
		}
	}

	public String getDestinationEndpointRegion() {
		return this.destinationEndpointRegion;
	}

	public void setDestinationEndpointRegion(String destinationEndpointRegion) {
		this.destinationEndpointRegion = destinationEndpointRegion;
		if(destinationEndpointRegion != null){
			putQueryParameter("DestinationEndpointRegion", destinationEndpointRegion);
		}
	}

	public String getReserve() {
		return this.reserve;
	}

	public void setReserve(String reserve) {
		this.reserve = reserve;
		if(reserve != null){
			putQueryParameter("Reserve", reserve);
		}
	}

	public Boolean getDataSynchronization() {
		return this.dataSynchronization;
	}

	public void setDataSynchronization(Boolean dataSynchronization) {
		this.dataSynchronization = dataSynchronization;
		if(dataSynchronization != null){
			putQueryParameter("DataSynchronization", dataSynchronization.toString());
		}
	}

	public String getDestinationEndpointEngineName() {
		return this.destinationEndpointEngineName;
	}

	public void setDestinationEndpointEngineName(String destinationEndpointEngineName) {
		this.destinationEndpointEngineName = destinationEndpointEngineName;
		if(destinationEndpointEngineName != null){
			putQueryParameter("DestinationEndpointEngineName", destinationEndpointEngineName);
		}
	}

	public String getDestinationEndpointInstanceID() {
		return this.destinationEndpointInstanceID;
	}

	public void setDestinationEndpointInstanceID(String destinationEndpointInstanceID) {
		this.destinationEndpointInstanceID = destinationEndpointInstanceID;
		if(destinationEndpointInstanceID != null){
			putQueryParameter("DestinationEndpointInstanceID", destinationEndpointInstanceID);
		}
	}

	public String getSourceEndpointPort() {
		return this.sourceEndpointPort;
	}

	public void setSourceEndpointPort(String sourceEndpointPort) {
		this.sourceEndpointPort = sourceEndpointPort;
		if(sourceEndpointPort != null){
			putQueryParameter("SourceEndpointPort", sourceEndpointPort);
		}
	}

	public String getSourceEndpointOracleSID() {
		return this.sourceEndpointOracleSID;
	}

	public void setSourceEndpointOracleSID(String sourceEndpointOracleSID) {
		this.sourceEndpointOracleSID = sourceEndpointOracleSID;
		if(sourceEndpointOracleSID != null){
			putQueryParameter("SourceEndpointOracleSID", sourceEndpointOracleSID);
		}
	}

	public String getDestinationEndpointDataBaseName() {
		return this.destinationEndpointDataBaseName;
	}

	public void setDestinationEndpointDataBaseName(String destinationEndpointDataBaseName) {
		this.destinationEndpointDataBaseName = destinationEndpointDataBaseName;
		if(destinationEndpointDataBaseName != null){
			putQueryParameter("DestinationEndpointDataBaseName", destinationEndpointDataBaseName);
		}
	}

	public Boolean getErrorNotice() {
		return this.errorNotice;
	}

	public void setErrorNotice(Boolean errorNotice) {
		this.errorNotice = errorNotice;
		if(errorNotice != null){
			putQueryParameter("ErrorNotice", errorNotice.toString());
		}
	}

	public String getSourceEndpointRole() {
		return this.sourceEndpointRole;
	}

	public void setSourceEndpointRole(String sourceEndpointRole) {
		this.sourceEndpointRole = sourceEndpointRole;
		if(sourceEndpointRole != null){
			putQueryParameter("SourceEndpointRole", sourceEndpointRole);
		}
	}

	public String getDestinationEndpointPassword() {
		return this.destinationEndpointPassword;
	}

	public void setDestinationEndpointPassword(String destinationEndpointPassword) {
		this.destinationEndpointPassword = destinationEndpointPassword;
		if(destinationEndpointPassword != null){
			putQueryParameter("DestinationEndpointPassword", destinationEndpointPassword);
		}
	}

	public String getSourceEndpointEngineName() {
		return this.sourceEndpointEngineName;
	}

	public void setSourceEndpointEngineName(String sourceEndpointEngineName) {
		this.sourceEndpointEngineName = sourceEndpointEngineName;
		if(sourceEndpointEngineName != null){
			putQueryParameter("SourceEndpointEngineName", sourceEndpointEngineName);
		}
	}

	@Override
	public Class<ConfigureDtsJobResponse> getResponseClass() {
		return ConfigureDtsJobResponse.class;
	}

}
