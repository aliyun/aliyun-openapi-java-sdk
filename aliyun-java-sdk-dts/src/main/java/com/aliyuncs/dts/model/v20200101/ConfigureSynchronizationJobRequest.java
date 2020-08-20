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
public class ConfigureSynchronizationJobRequest extends RpcAcsRequest<ConfigureSynchronizationJobResponse> {
	   

	private String sourceEndpointInstanceId;

	private String checkpoint;

	private String destinationEndpointInstanceId;

	private String sourceEndpointIP;

	private String synchronizationObjects;

	private String destinationEndpointPassword;

	private Boolean dataInitialization;

	private Boolean structureInitialization;

	private Boolean partitionKeyModifyTime_Minute;

	private Boolean partitionKeyModifyTime_Day;

	private String sourceEndpointInstanceType;

	private String synchronizationJobId;

	private String synchronizationJobName;

	private String accountId;

	private String sourceEndpointUserName;

	private String sourceEndpointDatabaseName;

	private Boolean partitionKeyModifyTime_Month;

	private String sourceEndpointPort;

	private String sourceEndpointOwnerID;

	private String destinationEndpointUserName;

	private String destinationEndpointPort;

	private Boolean partitionKeyModifyTime_Year;

	private String sourceEndpointRole;

	private String ownerId;

	private Boolean partitionKeyModifyTime_Hour;

	private String destinationEndpointDataBaseName;

	private String sourceEndpointPassword;

	private String migrationReserved;

	private String destinationEndpointIP;

	private String destinationEndpointInstanceType;

	private String synchronizationDirection;
	public ConfigureSynchronizationJobRequest() {
		super("Dts", "2020-01-01", "ConfigureSynchronizationJob", "dts");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSourceEndpointInstanceId() {
		return this.sourceEndpointInstanceId;
	}

	public void setSourceEndpointInstanceId(String sourceEndpointInstanceId) {
		this.sourceEndpointInstanceId = sourceEndpointInstanceId;
		if(sourceEndpointInstanceId != null){
			putQueryParameter("SourceEndpoint.InstanceId", sourceEndpointInstanceId);
		}
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

	public String getDestinationEndpointInstanceId() {
		return this.destinationEndpointInstanceId;
	}

	public void setDestinationEndpointInstanceId(String destinationEndpointInstanceId) {
		this.destinationEndpointInstanceId = destinationEndpointInstanceId;
		if(destinationEndpointInstanceId != null){
			putQueryParameter("DestinationEndpoint.InstanceId", destinationEndpointInstanceId);
		}
	}

	public String getSourceEndpointIP() {
		return this.sourceEndpointIP;
	}

	public void setSourceEndpointIP(String sourceEndpointIP) {
		this.sourceEndpointIP = sourceEndpointIP;
		if(sourceEndpointIP != null){
			putQueryParameter("SourceEndpoint.IP", sourceEndpointIP);
		}
	}

	public String getSynchronizationObjects() {
		return this.synchronizationObjects;
	}

	public void setSynchronizationObjects(String synchronizationObjects) {
		this.synchronizationObjects = synchronizationObjects;
		if(synchronizationObjects != null){
			putBodyParameter("SynchronizationObjects", synchronizationObjects);
		}
	}

	public String getDestinationEndpointPassword() {
		return this.destinationEndpointPassword;
	}

	public void setDestinationEndpointPassword(String destinationEndpointPassword) {
		this.destinationEndpointPassword = destinationEndpointPassword;
		if(destinationEndpointPassword != null){
			putQueryParameter("DestinationEndpoint.Password", destinationEndpointPassword);
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

	public Boolean getStructureInitialization() {
		return this.structureInitialization;
	}

	public void setStructureInitialization(Boolean structureInitialization) {
		this.structureInitialization = structureInitialization;
		if(structureInitialization != null){
			putQueryParameter("StructureInitialization", structureInitialization.toString());
		}
	}

	public Boolean getPartitionKeyModifyTime_Minute() {
		return this.partitionKeyModifyTime_Minute;
	}

	public void setPartitionKeyModifyTime_Minute(Boolean partitionKeyModifyTime_Minute) {
		this.partitionKeyModifyTime_Minute = partitionKeyModifyTime_Minute;
		if(partitionKeyModifyTime_Minute != null){
			putQueryParameter("PartitionKey.ModifyTime_Minute", partitionKeyModifyTime_Minute.toString());
		}
	}

	public Boolean getPartitionKeyModifyTime_Day() {
		return this.partitionKeyModifyTime_Day;
	}

	public void setPartitionKeyModifyTime_Day(Boolean partitionKeyModifyTime_Day) {
		this.partitionKeyModifyTime_Day = partitionKeyModifyTime_Day;
		if(partitionKeyModifyTime_Day != null){
			putQueryParameter("PartitionKey.ModifyTime_Day", partitionKeyModifyTime_Day.toString());
		}
	}

	public String getSourceEndpointInstanceType() {
		return this.sourceEndpointInstanceType;
	}

	public void setSourceEndpointInstanceType(String sourceEndpointInstanceType) {
		this.sourceEndpointInstanceType = sourceEndpointInstanceType;
		if(sourceEndpointInstanceType != null){
			putQueryParameter("SourceEndpoint.InstanceType", sourceEndpointInstanceType);
		}
	}

	public String getSynchronizationJobId() {
		return this.synchronizationJobId;
	}

	public void setSynchronizationJobId(String synchronizationJobId) {
		this.synchronizationJobId = synchronizationJobId;
		if(synchronizationJobId != null){
			putQueryParameter("SynchronizationJobId", synchronizationJobId);
		}
	}

	public String getSynchronizationJobName() {
		return this.synchronizationJobName;
	}

	public void setSynchronizationJobName(String synchronizationJobName) {
		this.synchronizationJobName = synchronizationJobName;
		if(synchronizationJobName != null){
			putQueryParameter("SynchronizationJobName", synchronizationJobName);
		}
	}

	public String getAccountId() {
		return this.accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
		if(accountId != null){
			putQueryParameter("AccountId", accountId);
		}
	}

	public String getSourceEndpointUserName() {
		return this.sourceEndpointUserName;
	}

	public void setSourceEndpointUserName(String sourceEndpointUserName) {
		this.sourceEndpointUserName = sourceEndpointUserName;
		if(sourceEndpointUserName != null){
			putQueryParameter("SourceEndpoint.UserName", sourceEndpointUserName);
		}
	}

	public String getSourceEndpointDatabaseName() {
		return this.sourceEndpointDatabaseName;
	}

	public void setSourceEndpointDatabaseName(String sourceEndpointDatabaseName) {
		this.sourceEndpointDatabaseName = sourceEndpointDatabaseName;
		if(sourceEndpointDatabaseName != null){
			putQueryParameter("SourceEndpoint.DatabaseName", sourceEndpointDatabaseName);
		}
	}

	public Boolean getPartitionKeyModifyTime_Month() {
		return this.partitionKeyModifyTime_Month;
	}

	public void setPartitionKeyModifyTime_Month(Boolean partitionKeyModifyTime_Month) {
		this.partitionKeyModifyTime_Month = partitionKeyModifyTime_Month;
		if(partitionKeyModifyTime_Month != null){
			putQueryParameter("PartitionKey.ModifyTime_Month", partitionKeyModifyTime_Month.toString());
		}
	}

	public String getSourceEndpointPort() {
		return this.sourceEndpointPort;
	}

	public void setSourceEndpointPort(String sourceEndpointPort) {
		this.sourceEndpointPort = sourceEndpointPort;
		if(sourceEndpointPort != null){
			putQueryParameter("SourceEndpoint.Port", sourceEndpointPort);
		}
	}

	public String getSourceEndpointOwnerID() {
		return this.sourceEndpointOwnerID;
	}

	public void setSourceEndpointOwnerID(String sourceEndpointOwnerID) {
		this.sourceEndpointOwnerID = sourceEndpointOwnerID;
		if(sourceEndpointOwnerID != null){
			putQueryParameter("SourceEndpoint.OwnerID", sourceEndpointOwnerID);
		}
	}

	public String getDestinationEndpointUserName() {
		return this.destinationEndpointUserName;
	}

	public void setDestinationEndpointUserName(String destinationEndpointUserName) {
		this.destinationEndpointUserName = destinationEndpointUserName;
		if(destinationEndpointUserName != null){
			putQueryParameter("DestinationEndpoint.UserName", destinationEndpointUserName);
		}
	}

	public String getDestinationEndpointPort() {
		return this.destinationEndpointPort;
	}

	public void setDestinationEndpointPort(String destinationEndpointPort) {
		this.destinationEndpointPort = destinationEndpointPort;
		if(destinationEndpointPort != null){
			putQueryParameter("DestinationEndpoint.Port", destinationEndpointPort);
		}
	}

	public Boolean getPartitionKeyModifyTime_Year() {
		return this.partitionKeyModifyTime_Year;
	}

	public void setPartitionKeyModifyTime_Year(Boolean partitionKeyModifyTime_Year) {
		this.partitionKeyModifyTime_Year = partitionKeyModifyTime_Year;
		if(partitionKeyModifyTime_Year != null){
			putQueryParameter("PartitionKey.ModifyTime_Year", partitionKeyModifyTime_Year.toString());
		}
	}

	public String getSourceEndpointRole() {
		return this.sourceEndpointRole;
	}

	public void setSourceEndpointRole(String sourceEndpointRole) {
		this.sourceEndpointRole = sourceEndpointRole;
		if(sourceEndpointRole != null){
			putQueryParameter("SourceEndpoint.Role", sourceEndpointRole);
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

	public Boolean getPartitionKeyModifyTime_Hour() {
		return this.partitionKeyModifyTime_Hour;
	}

	public void setPartitionKeyModifyTime_Hour(Boolean partitionKeyModifyTime_Hour) {
		this.partitionKeyModifyTime_Hour = partitionKeyModifyTime_Hour;
		if(partitionKeyModifyTime_Hour != null){
			putQueryParameter("PartitionKey.ModifyTime_Hour", partitionKeyModifyTime_Hour.toString());
		}
	}

	public String getDestinationEndpointDataBaseName() {
		return this.destinationEndpointDataBaseName;
	}

	public void setDestinationEndpointDataBaseName(String destinationEndpointDataBaseName) {
		this.destinationEndpointDataBaseName = destinationEndpointDataBaseName;
		if(destinationEndpointDataBaseName != null){
			putQueryParameter("DestinationEndpoint.DataBaseName", destinationEndpointDataBaseName);
		}
	}

	public String getSourceEndpointPassword() {
		return this.sourceEndpointPassword;
	}

	public void setSourceEndpointPassword(String sourceEndpointPassword) {
		this.sourceEndpointPassword = sourceEndpointPassword;
		if(sourceEndpointPassword != null){
			putQueryParameter("SourceEndpoint.Password", sourceEndpointPassword);
		}
	}

	public String getMigrationReserved() {
		return this.migrationReserved;
	}

	public void setMigrationReserved(String migrationReserved) {
		this.migrationReserved = migrationReserved;
		if(migrationReserved != null){
			putQueryParameter("MigrationReserved", migrationReserved);
		}
	}

	public String getDestinationEndpointIP() {
		return this.destinationEndpointIP;
	}

	public void setDestinationEndpointIP(String destinationEndpointIP) {
		this.destinationEndpointIP = destinationEndpointIP;
		if(destinationEndpointIP != null){
			putQueryParameter("DestinationEndpoint.IP", destinationEndpointIP);
		}
	}

	public String getDestinationEndpointInstanceType() {
		return this.destinationEndpointInstanceType;
	}

	public void setDestinationEndpointInstanceType(String destinationEndpointInstanceType) {
		this.destinationEndpointInstanceType = destinationEndpointInstanceType;
		if(destinationEndpointInstanceType != null){
			putQueryParameter("DestinationEndpoint.InstanceType", destinationEndpointInstanceType);
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

	@Override
	public Class<ConfigureSynchronizationJobResponse> getResponseClass() {
		return ConfigureSynchronizationJobResponse.class;
	}

}
