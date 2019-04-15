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

package com.aliyuncs.ecsinc.model.v20160314;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsinc.transform.v20160314.InnerDiskFindDiskByDiskIdResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class InnerDiskFindDiskByDiskIdResponse extends AcsResponse {

	private String requestId;

	private ErrorCode errorCode;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ErrorCode getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(ErrorCode errorCode) {
		this.errorCode = errorCode;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class ErrorCode {

		private String code;

		private String message;

		private Boolean isSuccess;

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public Boolean getIsSuccess() {
			return this.isSuccess;
		}

		public void setIsSuccess(Boolean isSuccess) {
			this.isSuccess = isSuccess;
		}
	}

	public static class Data {

		private String seq;

		private Boolean enableAutoSnapshot;

		private Boolean active;

		private Integer diskSize;

		private String diskDesc;

		private String businessStatus;

		private String zoneNo;

		private String regionNo;

		private String diskCategory;

		private String snapshotNo;

		private String houyiDiskId;

		private String diskName;

		private String productCode;

		private String mountPoint;

		private Boolean deleteAutoSnapshot;

		private String imageNo;

		private Long id;

		private Boolean bootable;

		private Boolean deleteWithInstance;

		private String diskType;

		private String ecsInstanceId;

		private String lastAttachTime;

		private String lastDetachTime;

		private String izNo;

		private Boolean portable;

		private Integer iopsSize;

		private String autoSnapshotPolicyId;

		private List<Tag> tags;

		public String getSeq() {
			return this.seq;
		}

		public void setSeq(String seq) {
			this.seq = seq;
		}

		public Boolean getEnableAutoSnapshot() {
			return this.enableAutoSnapshot;
		}

		public void setEnableAutoSnapshot(Boolean enableAutoSnapshot) {
			this.enableAutoSnapshot = enableAutoSnapshot;
		}

		public Boolean getActive() {
			return this.active;
		}

		public void setActive(Boolean active) {
			this.active = active;
		}

		public Integer getDiskSize() {
			return this.diskSize;
		}

		public void setDiskSize(Integer diskSize) {
			this.diskSize = diskSize;
		}

		public String getDiskDesc() {
			return this.diskDesc;
		}

		public void setDiskDesc(String diskDesc) {
			this.diskDesc = diskDesc;
		}

		public String getBusinessStatus() {
			return this.businessStatus;
		}

		public void setBusinessStatus(String businessStatus) {
			this.businessStatus = businessStatus;
		}

		public String getZoneNo() {
			return this.zoneNo;
		}

		public void setZoneNo(String zoneNo) {
			this.zoneNo = zoneNo;
		}

		public String getRegionNo() {
			return this.regionNo;
		}

		public void setRegionNo(String regionNo) {
			this.regionNo = regionNo;
		}

		public String getDiskCategory() {
			return this.diskCategory;
		}

		public void setDiskCategory(String diskCategory) {
			this.diskCategory = diskCategory;
		}

		public String getSnapshotNo() {
			return this.snapshotNo;
		}

		public void setSnapshotNo(String snapshotNo) {
			this.snapshotNo = snapshotNo;
		}

		public String getHouyiDiskId() {
			return this.houyiDiskId;
		}

		public void setHouyiDiskId(String houyiDiskId) {
			this.houyiDiskId = houyiDiskId;
		}

		public String getDiskName() {
			return this.diskName;
		}

		public void setDiskName(String diskName) {
			this.diskName = diskName;
		}

		public String getProductCode() {
			return this.productCode;
		}

		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}

		public String getMountPoint() {
			return this.mountPoint;
		}

		public void setMountPoint(String mountPoint) {
			this.mountPoint = mountPoint;
		}

		public Boolean getDeleteAutoSnapshot() {
			return this.deleteAutoSnapshot;
		}

		public void setDeleteAutoSnapshot(Boolean deleteAutoSnapshot) {
			this.deleteAutoSnapshot = deleteAutoSnapshot;
		}

		public String getImageNo() {
			return this.imageNo;
		}

		public void setImageNo(String imageNo) {
			this.imageNo = imageNo;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Boolean getBootable() {
			return this.bootable;
		}

		public void setBootable(Boolean bootable) {
			this.bootable = bootable;
		}

		public Boolean getDeleteWithInstance() {
			return this.deleteWithInstance;
		}

		public void setDeleteWithInstance(Boolean deleteWithInstance) {
			this.deleteWithInstance = deleteWithInstance;
		}

		public String getDiskType() {
			return this.diskType;
		}

		public void setDiskType(String diskType) {
			this.diskType = diskType;
		}

		public String getEcsInstanceId() {
			return this.ecsInstanceId;
		}

		public void setEcsInstanceId(String ecsInstanceId) {
			this.ecsInstanceId = ecsInstanceId;
		}

		public String getLastAttachTime() {
			return this.lastAttachTime;
		}

		public void setLastAttachTime(String lastAttachTime) {
			this.lastAttachTime = lastAttachTime;
		}

		public String getLastDetachTime() {
			return this.lastDetachTime;
		}

		public void setLastDetachTime(String lastDetachTime) {
			this.lastDetachTime = lastDetachTime;
		}

		public String getIzNo() {
			return this.izNo;
		}

		public void setIzNo(String izNo) {
			this.izNo = izNo;
		}

		public Boolean getPortable() {
			return this.portable;
		}

		public void setPortable(Boolean portable) {
			this.portable = portable;
		}

		public Integer getIopsSize() {
			return this.iopsSize;
		}

		public void setIopsSize(Integer iopsSize) {
			this.iopsSize = iopsSize;
		}

		public String getAutoSnapshotPolicyId() {
			return this.autoSnapshotPolicyId;
		}

		public void setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
			this.autoSnapshotPolicyId = autoSnapshotPolicyId;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public static class Tag {

			private String key;

			private String value;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}
	}

	@Override
	public InnerDiskFindDiskByDiskIdResponse getInstance(UnmarshallerContext context) {
		return	InnerDiskFindDiskByDiskIdResponseUnmarshaller.unmarshall(this, context);
	}
}
