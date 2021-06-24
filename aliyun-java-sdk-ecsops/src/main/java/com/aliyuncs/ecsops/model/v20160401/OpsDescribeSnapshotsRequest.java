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
public class OpsDescribeSnapshotsRequest extends RpcAcsRequest<OpsDescribeSnapshotsResponse> {
	   

	private Long resourceOwnerId;

	private String snapshotIds;

	private String snapshotName;

	private Integer pageNumber;

	private Boolean createFinished;

	private String fuzzySnapshotName;

	private Integer pageSize;

	private String diskId;

	private String snapshotTypes;

	private String sourceDiskType;

	private String createTimeFrom;

	private String instanceId;

	private String createTimeTo;

	private String auditParamStr;
	public OpsDescribeSnapshotsRequest() {
		super("Ecsops", "2016-04-01", "OpsDescribeSnapshots", "ecsops");
		setMethod(MethodType.POST);
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getSnapshotIds() {
		return this.snapshotIds;
	}

	public void setSnapshotIds(String snapshotIds) {
		this.snapshotIds = snapshotIds;
		if(snapshotIds != null){
			putQueryParameter("SnapshotIds", snapshotIds);
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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public Boolean getCreateFinished() {
		return this.createFinished;
	}

	public void setCreateFinished(Boolean createFinished) {
		this.createFinished = createFinished;
		if(createFinished != null){
			putQueryParameter("CreateFinished", createFinished.toString());
		}
	}

	public String getFuzzySnapshotName() {
		return this.fuzzySnapshotName;
	}

	public void setFuzzySnapshotName(String fuzzySnapshotName) {
		this.fuzzySnapshotName = fuzzySnapshotName;
		if(fuzzySnapshotName != null){
			putQueryParameter("FuzzySnapshotName", fuzzySnapshotName);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
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

	public String getSnapshotTypes() {
		return this.snapshotTypes;
	}

	public void setSnapshotTypes(String snapshotTypes) {
		this.snapshotTypes = snapshotTypes;
		if(snapshotTypes != null){
			putQueryParameter("SnapshotTypes", snapshotTypes);
		}
	}

	public String getSourceDiskType() {
		return this.sourceDiskType;
	}

	public void setSourceDiskType(String sourceDiskType) {
		this.sourceDiskType = sourceDiskType;
		if(sourceDiskType != null){
			putQueryParameter("SourceDiskType", sourceDiskType);
		}
	}

	public String getCreateTimeFrom() {
		return this.createTimeFrom;
	}

	public void setCreateTimeFrom(String createTimeFrom) {
		this.createTimeFrom = createTimeFrom;
		if(createTimeFrom != null){
			putQueryParameter("CreateTimeFrom", createTimeFrom);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getCreateTimeTo() {
		return this.createTimeTo;
	}

	public void setCreateTimeTo(String createTimeTo) {
		this.createTimeTo = createTimeTo;
		if(createTimeTo != null){
			putQueryParameter("CreateTimeTo", createTimeTo);
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
	public Class<OpsDescribeSnapshotsResponse> getResponseClass() {
		return OpsDescribeSnapshotsResponse.class;
	}

}
