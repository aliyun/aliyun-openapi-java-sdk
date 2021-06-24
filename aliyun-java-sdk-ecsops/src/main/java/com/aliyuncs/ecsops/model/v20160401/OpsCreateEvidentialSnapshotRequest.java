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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class OpsCreateEvidentialSnapshotRequest extends RpcAcsRequest<OpsCreateEvidentialSnapshotResponse> {
	   

	private String description;

	private Long assignSnapshotOwnerId;

	private String snapshotName;

	private String diskId;

	private String auditParamStr;
	public OpsCreateEvidentialSnapshotRequest() {
		super("Ecsops", "2016-04-01", "OpsCreateEvidentialSnapshot", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public Long getAssignSnapshotOwnerId() {
		return this.assignSnapshotOwnerId;
	}

	public void setAssignSnapshotOwnerId(Long assignSnapshotOwnerId) {
		this.assignSnapshotOwnerId = assignSnapshotOwnerId;
		if(assignSnapshotOwnerId != null){
			putQueryParameter("AssignSnapshotOwnerId", assignSnapshotOwnerId.toString());
		}
	}

	public String getSnapshotName() {
		return this.snapshotName;
	}

	public void setSnapshotName(String snapshotName) {
		this.snapshotName = snapshotName;
		if(snapshotName != null){
			putQueryParameter("SnapshotName", snapshotName);
		}
	}

	public String getDiskId() {
		return this.diskId;
	}

	public void setDiskId(String diskId) {
		this.diskId = diskId;
		if(diskId != null){
			putQueryParameter("DiskId", diskId);
		}
	}

	public String getAuditParamStr() {
		return this.auditParamStr;
	}

	public void setAuditParamStr(String auditParamStr) {
		this.auditParamStr = auditParamStr;
		if(auditParamStr != null){
			putQueryParameter("AuditParamStr", auditParamStr);
		}
	}

	@Override
	public Class<OpsCreateEvidentialSnapshotResponse> getResponseClass() {
		return OpsCreateEvidentialSnapshotResponse.class;
	}

}
