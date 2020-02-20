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
import com.aliyuncs.retailcloud.transform.v20180313.ListPersistentVolumeClaimResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPersistentVolumeClaimResponse extends AcsResponse {

	private Integer code;

	private Integer pageNumber;

	private String requestId;

	private Integer pageSize;

	private Long totalCount;

	private String errorMsg;

	private List<PersistentVolumeClaimDetail> data;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public List<PersistentVolumeClaimDetail> getData() {
		return this.data;
	}

	public void setData(List<PersistentVolumeClaimDetail> data) {
		this.data = data;
	}

	public static class PersistentVolumeClaimDetail {

		private String name;

		private String capacity;

		private String accessModes;

		private String status;

		private String storageClass;

		private String volumeName;

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

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getStorageClass() {
			return this.storageClass;
		}

		public void setStorageClass(String storageClass) {
			this.storageClass = storageClass;
		}

		public String getVolumeName() {
			return this.volumeName;
		}

		public void setVolumeName(String volumeName) {
			this.volumeName = volumeName;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}
	}

	@Override
	public ListPersistentVolumeClaimResponse getInstance(UnmarshallerContext context) {
		return	ListPersistentVolumeClaimResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
