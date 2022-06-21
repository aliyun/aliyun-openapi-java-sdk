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
import com.aliyuncs.swas.transform.v20170810.GetDiskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDiskResponse extends AcsResponse {

	private String status;

	private String path;

	private Boolean isSuccess;

	private String requestId;

	private String zoneId;

	private Integer size;

	private Boolean isAttached;

	private String diskChargeType;

	private String diskCategory;

	private String resourceType;

	private Long iOPS;

	private String diskName;

	private String code;

	private String remark;

	private String attacthedServerName;

	private Boolean isSystemDisk;

	private String attachedServerUid;

	private Long creationTime;

	private String regionId;

	private String diskId;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Boolean getIsSuccess() {
		return this.isSuccess;
	}

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
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

	public Integer getSize() {
		return this.size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public Boolean getIsAttached() {
		return this.isAttached;
	}

	public void setIsAttached(Boolean isAttached) {
		this.isAttached = isAttached;
	}

	public String getDiskChargeType() {
		return this.diskChargeType;
	}

	public void setDiskChargeType(String diskChargeType) {
		this.diskChargeType = diskChargeType;
	}

	public String getDiskCategory() {
		return this.diskCategory;
	}

	public void setDiskCategory(String diskCategory) {
		this.diskCategory = diskCategory;
	}

	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	public Long getIOPS() {
		return this.iOPS;
	}

	public void setIOPS(Long iOPS) {
		this.iOPS = iOPS;
	}

	public String getDiskName() {
		return this.diskName;
	}

	public void setDiskName(String diskName) {
		this.diskName = diskName;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getAttacthedServerName() {
		return this.attacthedServerName;
	}

	public void setAttacthedServerName(String attacthedServerName) {
		this.attacthedServerName = attacthedServerName;
	}

	public Boolean getIsSystemDisk() {
		return this.isSystemDisk;
	}

	public void setIsSystemDisk(Boolean isSystemDisk) {
		this.isSystemDisk = isSystemDisk;
	}

	public String getAttachedServerUid() {
		return this.attachedServerUid;
	}

	public void setAttachedServerUid(String attachedServerUid) {
		this.attachedServerUid = attachedServerUid;
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

	public String getDiskId() {
		return this.diskId;
	}

	public void setDiskId(String diskId) {
		this.diskId = diskId;
	}

	@Override
	public GetDiskResponse getInstance(UnmarshallerContext context) {
		return	GetDiskResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
