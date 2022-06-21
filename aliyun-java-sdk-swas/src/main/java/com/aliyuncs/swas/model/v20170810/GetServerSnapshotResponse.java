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

package com.aliyuncs.swas.model.v20170810;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.swas.transform.v20170810.GetServerSnapshotResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetServerSnapshotResponse extends AcsResponse {

	private String status;

	private Boolean isSuccess;

	private Long rollBackTime;

	private String progress;

	private String sourceServerName;

	private String requestId;

	private String zoneId;

	private String sourceDiskName;

	private String resourceType;

	private String snapshotName;

	private String code;

	private String sourceDiskId;

	private String sourceDiskRemark;

	private String remark;

	private String snapshotId;

	private String sourceServerUid;

	private Integer sourceDiskSize;

	private Long creationTime;

	private String regionId;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Boolean getIsSuccess() {
		return this.isSuccess;
	}

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public Long getRollBackTime() {
		return this.rollBackTime;
	}

	public void setRollBackTime(Long rollBackTime) {
		this.rollBackTime = rollBackTime;
	}

	public String getProgress() {
		return this.progress;
	}

	public void setProgress(String progress) {
		this.progress = progress;
	}

	public String getSourceServerName() {
		return this.sourceServerName;
	}

	public void setSourceServerName(String sourceServerName) {
		this.sourceServerName = sourceServerName;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
	}

	public String getSourceDiskName() {
		return this.sourceDiskName;
	}

	public void setSourceDiskName(String sourceDiskName) {
		this.sourceDiskName = sourceDiskName;
	}

	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	public String getSnapshotName() {
		return this.snapshotName;
	}

	public void setSnapshotName(String snapshotName) {
		this.snapshotName = snapshotName;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getSourceDiskId() {
		return this.sourceDiskId;
	}

	public void setSourceDiskId(String sourceDiskId) {
		this.sourceDiskId = sourceDiskId;
	}

	public String getSourceDiskRemark() {
		return this.sourceDiskRemark;
	}

	public void setSourceDiskRemark(String sourceDiskRemark) {
		this.sourceDiskRemark = sourceDiskRemark;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getSnapshotId() {
		return this.snapshotId;
	}

	public void setSnapshotId(String snapshotId) {
		this.snapshotId = snapshotId;
	}

	public String getSourceServerUid() {
		return this.sourceServerUid;
	}

	public void setSourceServerUid(String sourceServerUid) {
		this.sourceServerUid = sourceServerUid;
	}

	public Integer getSourceDiskSize() {
		return this.sourceDiskSize;
	}

	public void setSourceDiskSize(Integer sourceDiskSize) {
		this.sourceDiskSize = sourceDiskSize;
	}

	public Long getCreationTime() {
		return this.creationTime;
	}

	public void setCreationTime(Long creationTime) {
		this.creationTime = creationTime;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	@Override
	public GetServerSnapshotResponse getInstance(UnmarshallerContext context) {
		return	GetServerSnapshotResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
