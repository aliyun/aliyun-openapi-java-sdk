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
import com.aliyuncs.ecsinc.transform.v20160314.InnerImageQueryUserImagesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class InnerImageQueryUserImagesResponse extends AcsResponse {

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

		private String kind;

		private String version;

		private Boolean windowsOS;

		private Long aliUid;

		private String type;

		private String gmtRelease;

		private Integer minMemory;

		private Long osTypeId;

		private Integer maxCpu;

		private Integer minCpu;

		private String remark;

		private String gmtModified;

		private String imageNo;

		private String bid;

		private Integer osBit;

		private String gmtCreated;

		private Long id;

		private String osMemo;

		private Integer imageSize;

		private String isPublic;

		private String regionNo;

		private Integer maxMemory;

		private String snapshotNo;

		private String status;

		private String imageName;

		private String platform;

		private String osName;

		public String getKind() {
			return this.kind;
		}

		public void setKind(String kind) {
			this.kind = kind;
		}

		public String getBizVersion() {
			return this.version;
		}

		public void setBizVersion(String version) {
			this.version = version;
		}

		/**
		 * @deprecated use getBizVersion instead of this.
		 */
		@Deprecated
		public String getVersion() {
			return this.version;
		}

		/**
		 * @deprecated use setBizVersion instead of this.
		 */
		@Deprecated
		public void setVersion(String version) {
			this.version = version;
		}

		public Boolean getWindowsOS() {
			return this.windowsOS;
		}

		public void setWindowsOS(Boolean windowsOS) {
			this.windowsOS = windowsOS;
		}

		public Long getAliUid() {
			return this.aliUid;
		}

		public void setAliUid(Long aliUid) {
			this.aliUid = aliUid;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getGmtRelease() {
			return this.gmtRelease;
		}

		public void setGmtRelease(String gmtRelease) {
			this.gmtRelease = gmtRelease;
		}

		public Integer getMinMemory() {
			return this.minMemory;
		}

		public void setMinMemory(Integer minMemory) {
			this.minMemory = minMemory;
		}

		public Long getOsTypeId() {
			return this.osTypeId;
		}

		public void setOsTypeId(Long osTypeId) {
			this.osTypeId = osTypeId;
		}

		public Integer getMaxCpu() {
			return this.maxCpu;
		}

		public void setMaxCpu(Integer maxCpu) {
			this.maxCpu = maxCpu;
		}

		public Integer getMinCpu() {
			return this.minCpu;
		}

		public void setMinCpu(Integer minCpu) {
			this.minCpu = minCpu;
		}

		public String getRemark() {
			return this.remark;
		}

		public void setRemark(String remark) {
			this.remark = remark;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getImageNo() {
			return this.imageNo;
		}

		public void setImageNo(String imageNo) {
			this.imageNo = imageNo;
		}

		public String getBid() {
			return this.bid;
		}

		public void setBid(String bid) {
			this.bid = bid;
		}

		public Integer getOsBit() {
			return this.osBit;
		}

		public void setOsBit(Integer osBit) {
			this.osBit = osBit;
		}

		public String getGmtCreated() {
			return this.gmtCreated;
		}

		public void setGmtCreated(String gmtCreated) {
			this.gmtCreated = gmtCreated;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getOsMemo() {
			return this.osMemo;
		}

		public void setOsMemo(String osMemo) {
			this.osMemo = osMemo;
		}

		public Integer getImageSize() {
			return this.imageSize;
		}

		public void setImageSize(Integer imageSize) {
			this.imageSize = imageSize;
		}

		public String getIsPublic() {
			return this.isPublic;
		}

		public void setIsPublic(String isPublic) {
			this.isPublic = isPublic;
		}

		public String getRegionNo() {
			return this.regionNo;
		}

		public void setRegionNo(String regionNo) {
			this.regionNo = regionNo;
		}

		public Integer getMaxMemory() {
			return this.maxMemory;
		}

		public void setMaxMemory(Integer maxMemory) {
			this.maxMemory = maxMemory;
		}

		public String getSnapshotNo() {
			return this.snapshotNo;
		}

		public void setSnapshotNo(String snapshotNo) {
			this.snapshotNo = snapshotNo;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getImageName() {
			return this.imageName;
		}

		public void setImageName(String imageName) {
			this.imageName = imageName;
		}

		public String getPlatform() {
			return this.platform;
		}

		public void setPlatform(String platform) {
			this.platform = platform;
		}

		public String getOsName() {
			return this.osName;
		}

		public void setOsName(String osName) {
			this.osName = osName;
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
	public InnerImageQueryUserImagesResponse getInstance(UnmarshallerContext context) {
		return	InnerImageQueryUserImagesResponseUnmarshaller.unmarshall(this, context);
	}
}
