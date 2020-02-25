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

package com.aliyuncs.dbs.model.v20190306;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dbs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateRestoreTaskRequest extends RpcAcsRequest<CreateRestoreTaskResponse> {
	   

	private Long backupGatewayId;

	private String destinationEndpointInstanceType;

	private String clientToken;

	private String backupPlanId;

	private String destinationEndpointRegion;

	private String destinationEndpointUserName;

	private String restoreObjects;

	private String restoreTaskName;

	private String restoreHome;

	private String destinationEndpointOracleSID;

	private Long restoreTime;

	private String destinationEndpointInstanceID;

	private Integer destinationEndpointPort;

	private String backupSetId;

	private String ownerId;

	private String restoreDir;

	private String destinationEndpointIP;

	private String destinationEndpointDatabaseName;

	private String duplicateConflict;

	private String destinationEndpointPassword;
	public CreateRestoreTaskRequest() {
		super("Dbs", "2019-03-06", "CreateRestoreTask");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getBackupGatewayId() {
		return this.backupGatewayId;
	}

	public void setBackupGatewayId(Long backupGatewayId) {
		this.backupGatewayId = backupGatewayId;
		if(backupGatewayId != null){
			putQueryParameter("BackupGatewayId", backupGatewayId.toString());
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

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getBackupPlanId() {
		return this.backupPlanId;
	}

	public void setBackupPlanId(String backupPlanId) {
		this.backupPlanId = backupPlanId;
		if(backupPlanId != null){
			putQueryParameter("BackupPlanId", backupPlanId);
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

	public String getDestinationEndpointUserName() {
		return this.destinationEndpointUserName;
	}

	public void setDestinationEndpointUserName(String destinationEndpointUserName) {
		this.destinationEndpointUserName = destinationEndpointUserName;
		if(destinationEndpointUserName != null){
			putQueryParameter("DestinationEndpointUserName", destinationEndpointUserName);
		}
	}

	public String getRestoreObjects() {
		return this.restoreObjects;
	}

	public void setRestoreObjects(String restoreObjects) {
		this.restoreObjects = restoreObjects;
		if(restoreObjects != null){
			putQueryParameter("RestoreObjects", restoreObjects);
		}
	}

	public String getRestoreTaskName() {
		return this.restoreTaskName;
	}

	public void setRestoreTaskName(String restoreTaskName) {
		this.restoreTaskName = restoreTaskName;
		if(restoreTaskName != null){
			putQueryParameter("RestoreTaskName", restoreTaskName);
		}
	}

	public String getRestoreHome() {
		return this.restoreHome;
	}

	public void setRestoreHome(String restoreHome) {
		this.restoreHome = restoreHome;
		if(restoreHome != null){
			putQueryParameter("RestoreHome", restoreHome);
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

	public Long getRestoreTime() {
		return this.restoreTime;
	}

	public void setRestoreTime(Long restoreTime) {
		this.restoreTime = restoreTime;
		if(restoreTime != null){
			putQueryParameter("RestoreTime", restoreTime.toString());
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

	public Integer getDestinationEndpointPort() {
		return this.destinationEndpointPort;
	}

	public void setDestinationEndpointPort(Integer destinationEndpointPort) {
		this.destinationEndpointPort = destinationEndpointPort;
		if(destinationEndpointPort != null){
			putQueryParameter("DestinationEndpointPort", destinationEndpointPort.toString());
		}
	}

	public String getBackupSetId() {
		return this.backupSetId;
	}

	public void setBackupSetId(String backupSetId) {
		this.backupSetId = backupSetId;
		if(backupSetId != null){
			putQueryParameter("BackupSetId", backupSetId);
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

	public String getRestoreDir() {
		return this.restoreDir;
	}

	public void setRestoreDir(String restoreDir) {
		this.restoreDir = restoreDir;
		if(restoreDir != null){
			putQueryParameter("RestoreDir", restoreDir);
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

	public String getDestinationEndpointDatabaseName() {
		return this.destinationEndpointDatabaseName;
	}

	public void setDestinationEndpointDatabaseName(String destinationEndpointDatabaseName) {
		this.destinationEndpointDatabaseName = destinationEndpointDatabaseName;
		if(destinationEndpointDatabaseName != null){
			putQueryParameter("DestinationEndpointDatabaseName", destinationEndpointDatabaseName);
		}
	}

	public String getDuplicateConflict() {
		return this.duplicateConflict;
	}

	public void setDuplicateConflict(String duplicateConflict) {
		this.duplicateConflict = duplicateConflict;
		if(duplicateConflict != null){
			putQueryParameter("DuplicateConflict", duplicateConflict);
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

	@Override
	public Class<CreateRestoreTaskResponse> getResponseClass() {
		return CreateRestoreTaskResponse.class;
	}

}
