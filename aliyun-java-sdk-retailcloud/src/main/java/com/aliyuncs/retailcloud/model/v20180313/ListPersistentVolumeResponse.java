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

package com.aliyuncs.retailcloud.model.v20180313;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.retailcloud.transform.v20180313.ListPersistentVolumeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPersistentVolumeResponse extends AcsResponse {

	private String requestId;

	private Integer code;

	private Integer pageSize;

	private Integer pageNumber;

	private Long totalCount;

	private String errMsg;

	private List<PersistentVolumeDetail> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public String getErrMsg() {
		return this.errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public List<PersistentVolumeDetail> getData() {
		return this.data;
	}

	public void setData(List<PersistentVolumeDetail> data) {
		this.data = data;
	}

	public static class PersistentVolumeDetail {

		private String name;

		private String capacity;

		private String accessModes;

		private String reclaimPolicy;

		private String status;

		private String pvcName;

		private String mountDir;

		private String storageClass;

		private String reason;

		private String createTime;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCapacity() {
			return this.capacity;
		}

		public void setCapacity(String capacity) {
			this.capacity = capacity;
		}

		public String getAccessModes() {
			return this.accessModes;
		}

		public void setAccessModes(String accessModes) {
			this.accessModes = accessModes;
		}

		public String getReclaimPolicy() {
			return this.reclaimPolicy;
		}

		public void setReclaimPolicy(String reclaimPolicy) {
			this.reclaimPolicy = reclaimPolicy;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getPvcName() {
			return this.pvcName;
		}

		public void setPvcName(String pvcName) {
			this.pvcName = pvcName;
		}

		public String getMountDir() {
			return this.mountDir;
		}

		public void setMountDir(String mountDir) {
			this.mountDir = mountDir;
		}

		public String getStorageClass() {
			return this.storageClass;
		}

		public void setStorageClass(String storageClass) {
			this.storageClass = storageClass;
		}

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}
	}

	@Override
	public ListPersistentVolumeResponse getInstance(UnmarshallerContext context) {
		return	ListPersistentVolumeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
