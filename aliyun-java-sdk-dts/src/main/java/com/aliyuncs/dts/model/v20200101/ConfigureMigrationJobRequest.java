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
public class ConfigureMigrationJobRequest extends RpcAcsRequest<ConfigureMigrationJobResponse> {
	   

	private String sourceEndpointInstanceID;

	private String checkpoint;

	private String sourceEndpointEngineName;

	private String sourceEndpointOracleSID;

	private String destinationEndpointInstanceID;

	private String sourceEndpointIP;

	private String destinationEndpointPassword;

	private String migrationObject;

	private Boolean migrationModeDataIntialization;

	private String migrationJobId;

	private String sourceEndpointInstanceType;

	private String destinationEndpointEngineName;

	private String accountId;

	private Boolean migrationModeStructureIntialization;

	private Boolean migrationModeDataSynchronization;

	private String destinationEndpointRegion;

	private String sourceEndpointUserName;

	private String sourceEndpointDatabaseName;

	private String sourceEndpointPort;

	private String sourceEndpointOwnerID;

	private String destinationEndpointUserName;

	private String destinationEndpointOracleSID;

	private String destinationEndpointPort;

	private String sourceEndpointRegion;

	private String sourceEndpointRole;

	private String ownerId;

	private String destinationEndpointDataBaseName;

	private String sourceEndpointPassword;

	private String migrationReserved;

	private String destinationEndpointIP;

	private String migrationJobName;

	private String destinationEndpointInstanceType;
	public ConfigureMigrationJobRequest() {
		super("Dts", "2020-01-01", "ConfigureMigrationJob", "dts");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSourceEndpointInstanceID() {
		return this.sourceEndpointInstanceID;
	}

	public void setSourceEndpointInstanceID(String sourceEndpointInstanceID) {
		this.sourceEndpointInstanceID = sourceEndpointInstanceID;
		if(sourceEndpointInstanceID != null){
			putQueryParameter("SourceEndpoint.InstanceID", sourceEndpointInstanceID);
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

	public String getSourceEndpointEngineName() {
		return this.sourceEndpointEngineName;
	}

	public void setSourceEndpointEngineName(String sourceEndpointEngineName) {
		this.sourceEndpointEngineName = sourceEndpointEngineName;
		if(sourceEndpointEngineName != null){
			putQueryParameter("SourceEndpoint.EngineName", sourceEndpointEngineName);
		}
	}

	public String getSourceEndpointOracleSID() {
		return this.sourceEndpointOracleSID;
	}

	public void setSourceEndpointOracleSID(String sourceEndpointOracleSID) {
		this.sourceEndpointOracleSID = sourceEndpointOracleSID;
		if(sourceEndpointOracleSID != null){
			putQueryParameter("SourceEndpoint.OracleSID", sourceEndpointOracleSID);
		}
	}

	public String getDestinationEndpointInstanceID() {
		return this.destinationEndpointInstanceID;
	}

	public void setDestinationEndpointInstanceID(String destinationEndpointInstanceID) {
		this.destinationEndpointInstanceID = destinationEndpointInstanceID;
		if(destinationEndpointInstanceID != null){
			putQueryParameter("DestinationEndpoint.InstanceID", destinationEndpointInstanceID);
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

	public String getDestinationEndpointPassword() {
		return this.destinationEndpointPassword;
	}

	public void setDestinationEndpointPassword(String destinationEndpointPassword) {
		this.destinationEndpointPassword = destinationEndpointPassword;
		if(destinationEndpointPassword != null){
			putQueryParameter("DestinationEndpoint.Password", destinationEndpointPassword);
		}
	}

	public String getMigrationObject() {
		return this.migrationObject;
	}

	public void setMigrationObject(String migrationObject) {
		this.migrationObject = migrationObject;
		if(migrationObject != null){
			putBodyParameter("MigrationObject", migrationObject);
		}
	}

	public Boolean getMigrationModeDataIntialization() {
		return this.migrationModeDataIntialization;
	}

	public void setMigrationModeDataIntialization(Boolean migrationModeDataIntialization) {
		this.migrationModeDataIntialization = migrationModeDataIntialization;
		if(migrationModeDataIntialization != null){
			putQueryParameter("MigrationMode.DataIntialization", migrationModeDataIntialization.toString());
		}
	}

	public String getMigrationJobId() {
		return this.migrationJobId;
	}

	public void setMigrationJobId(String migrationJobId) {
		this.migrationJobId = migrationJobId;
		if(migrationJobId != null){
			putQueryParameter("MigrationJobId", migrationJobId);
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

	public String getDestinationEndpointEngineName() {
		return this.destinationEndpointEngineName;
	}

	public void setDestinationEndpointEngineName(String destinationEndpointEngineName) {
		this.destinationEndpointEngineName = destinationEndpointEngineName;
		if(destinationEndpointEngineName != null){
			putQueryParameter("DestinationEndpoint.EngineName", destinationEndpointEngineName);
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

	public Boolean getMigrationModeStructureIntialization() {
		return this.migrationModeStructureIntialization;
	}

	public void setMigrationModeStructureIntialization(Boolean migrationModeStructureIntialization) {
		this.migrationModeStructureIntialization = migrationModeStructureIntialization;
		if(migrationModeStructureIntialization != null){
			putQueryParameter("MigrationMode.StructureIntialization", migrationModeStructureIntialization.toString());
		}
	}

	public Boolean getMigrationModeDataSynchronization() {
		return this.migrationModeDataSynchronization;
	}

	public void setMigrationModeDataSynchronization(Boolean migrationModeDataSynchronization) {
		this.migrationModeDataSynchronization = migrationModeDataSynchronization;
		if(migrationModeDataSynchronization != null){
			putQueryParameter("MigrationMode.DataSynchronization", migrationModeDataSynchronization.toString());
		}
	}

	public String getDestinationEndpointRegion() {
		return this.destinationEndpointRegion;
	}

	public void setDestinationEndpointRegion(String destinationEndpointRegion) {
		this.destinationEndpointRegion = destinationEndpointRegion;
		if(destinationEndpointRegion != null){
			putQueryParameter("DestinationEndpoint.Region", destinationEndpointRegion);
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

	public String getDestinationEndpointOracleSID() {
		return this.destinationEndpointOracleSID;
	}

	public void setDestinationEndpointOracleSID(String destinationEndpointOracleSID) {
		this.destinationEndpointOracleSID = destinationEndpointOracleSID;
		if(destinationEndpointOracleSID != null){
			putQueryParameter("DestinationEndpoint.OracleSID", destinationEndpointOracleSID);
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

	public String getSourceEndpointRegion() {
		return this.sourceEndpointRegion;
	}

	public void setSourceEndpointRegion(String sourceEndpointRegion) {
		this.sourceEndpointRegion = sourceEndpointRegion;
		if(sourceEndpointRegion != null){
			putQueryParameter("SourceEndpoint.Region", sourceEndpointRegion);
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

	public String getMigrationJobName() {
		return this.migrationJobName;
	}

	public void setMigrationJobName(String migrationJobName) {
		this.migrationJobName = migrationJobName;
		if(migrationJobName != null){
			putQueryParameter("MigrationJobName", migrationJobName);
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

	@Override
	public Class<ConfigureMigrationJobResponse> getResponseClass() {
		return ConfigureMigrationJobResponse.class;
	}

}
