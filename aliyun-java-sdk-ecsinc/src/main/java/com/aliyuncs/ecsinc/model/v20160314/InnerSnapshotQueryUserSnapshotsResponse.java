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
import com.aliyuncs.ecsinc.transform.v20160314.InnerSnapshotQueryUserSnapshotsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class InnerSnapshotQueryUserSnapshotsResponse extends AcsResponse {

	private String requestId;

	private Integer count;

	private Integer pageNo;

	private Integer pageSize;

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

		private String snapshotType;

		private String gmtModified;

		private String snapshotId;

		private Long aliUid;

		private String imgPc;

		private String diskType;

		private String snapshotNickname;

		private String deviceType;

		private String snapshotName;

		private String description;

		private Long id;

		private String ecsSnapshotStatus;

		private String gmtCreated;

		private String bid;

		private Long ecsId;

		private String diskId;

		private String snapshotProcess;

		private Integer status;

		private Integer snapshotSize;

		private String snapshotNo;

		private String quoteType;

		private Long imgId;

		private String deviceNo;

		private Integer diskSize;

		private List<Tag> tags;

		public String getSnapshotType() {
			return this.snapshotType;
		}

		public void setSnapshotType(String snapshotType) {
			this.snapshotType = snapshotType;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getSnapshotId() {
			return this.snapshotId;
		}

		public void setSnapshotId(String snapshotId) {
			this.snapshotId = snapshotId;
		}

		public Long getAliUid() {
			return this.aliUid;
		}

		public void setAliUid(Long aliUid) {
			this.aliUid = aliUid;
		}

		public String getImgPc() {
			return this.imgPc;
		}

		public void setImgPc(String imgPc) {
			this.imgPc = imgPc;
		}

		public String getDiskType() {
			return this.diskType;
		}

		public void setDiskType(String diskType) {
			this.diskType = diskType;
		}

		public String getSnapshotNickname() {
			return this.snapshotNickname;
		}

		public void setSnapshotNickname(String snapshotNickname) {
			this.snapshotNickname = snapshotNickname;
		}

		public String getDeviceType() {
			return this.deviceType;
		}

		public void setDeviceType(String deviceType) {
			this.deviceType = deviceType;
		}

		public String getSnapshotName() {
			return this.snapshotName;
		}

		public void setSnapshotName(String snapshotName) {
			this.snapshotName = snapshotName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getEcsSnapshotStatus() {
			return this.ecsSnapshotStatus;
		}

		public void setEcsSnapshotStatus(String ecsSnapshotStatus) {
			this.ecsSnapshotStatus = ecsSnapshotStatus;
		}

		public String getGmtCreated() {
			return this.gmtCreated;
		}

		public void setGmtCreated(String gmtCreated) {
			this.gmtCreated = gmtCreated;
		}

		public String getBid() {
			return this.bid;
		}

		public void setBid(String bid) {
			this.bid = bid;
		}

		public Long getEcsId() {
			return this.ecsId;
		}

		public void setEcsId(Long ecsId) {
			this.ecsId = ecsId;
		}

		public String getDiskId() {
			return this.diskId;
		}

		public void setDiskId(String diskId) {
			this.diskId = diskId;
		}

		public String getSnapshotProcess() {
			return this.snapshotProcess;
		}

		public void setSnapshotProcess(String snapshotProcess) {
			this.snapshotProcess = snapshotProcess;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Integer getSnapshotSize() {
			return this.snapshotSize;
		}

		public void setSnapshotSize(Integer snapshotSize) {
			this.snapshotSize = snapshotSize;
		}

		public String getSnapshotNo() {
			return this.snapshotNo;
		}

		public void setSnapshotNo(String snapshotNo) {
			this.snapshotNo = snapshotNo;
		}

		public String getQuoteType() {
			return this.quoteType;
		}

		public void setQuoteType(String quoteType) {
			this.quoteType = quoteType;
		}

		public Long getImgId() {
			return this.imgId;
		}

		public void setImgId(Long imgId) {
			this.imgId = imgId;
		}

		public String getDeviceNo() {
			return this.deviceNo;
		}

		public void setDeviceNo(String deviceNo) {
			this.deviceNo = deviceNo;
		}

		public Integer getDiskSize() {
			return this.diskSize;
		}

		public void setDiskSize(Integer diskSize) {
			this.diskSize = diskSize;
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
	public InnerSnapshotQueryUserSnapshotsResponse getInstance(UnmarshallerContext context) {
		return	InnerSnapshotQueryUserSnapshotsResponseUnmarshaller.unmarshall(this, context);
	}
}
