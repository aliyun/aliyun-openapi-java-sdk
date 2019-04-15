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
import com.aliyuncs.ecsinc.transform.v20160314.InnerSnapshotDescribeMountedSnapshotsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class InnerSnapshotDescribeMountedSnapshotsResponse extends AcsResponse {

	private String requestId;

	private Integer count;

	private Integer pageNo;

	private Integer pageSize;

	private Integer totalCount;

	private List<Item> data;

	private ErrorCode errorCode;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Integer getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<Item> getData() {
		return this.data;
	}

	public void setData(List<Item> data) {
		this.data = data;
	}

	public ErrorCode getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(ErrorCode errorCode) {
		this.errorCode = errorCode;
	}

	public static class Item {

		private String device;

		private Long ecsOwnerAliUid;

		private String ecsInstanceId;

		private Long snapshotId;

		private String ecsRegionNo;

		private Long snapshotOwnerAliUid;

		private String status;

		private String mountedTime;

		public String getDevice() {
			return this.device;
		}

		public void setDevice(String device) {
			this.device = device;
		}

		public Long getEcsOwnerAliUid() {
			return this.ecsOwnerAliUid;
		}

		public void setEcsOwnerAliUid(Long ecsOwnerAliUid) {
			this.ecsOwnerAliUid = ecsOwnerAliUid;
		}

		public String getEcsInstanceId() {
			return this.ecsInstanceId;
		}

		public void setEcsInstanceId(String ecsInstanceId) {
			this.ecsInstanceId = ecsInstanceId;
		}

		public Long getSnapshotId() {
			return this.snapshotId;
		}

		public void setSnapshotId(Long snapshotId) {
			this.snapshotId = snapshotId;
		}

		public String getEcsRegionNo() {
			return this.ecsRegionNo;
		}

		public void setEcsRegionNo(String ecsRegionNo) {
			this.ecsRegionNo = ecsRegionNo;
		}

		public Long getSnapshotOwnerAliUid() {
			return this.snapshotOwnerAliUid;
		}

		public void setSnapshotOwnerAliUid(Long snapshotOwnerAliUid) {
			this.snapshotOwnerAliUid = snapshotOwnerAliUid;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getMountedTime() {
			return this.mountedTime;
		}

		public void setMountedTime(String mountedTime) {
			this.mountedTime = mountedTime;
		}
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

	@Override
	public InnerSnapshotDescribeMountedSnapshotsResponse getInstance(UnmarshallerContext context) {
		return	InnerSnapshotDescribeMountedSnapshotsResponseUnmarshaller.unmarshall(this, context);
	}
}
