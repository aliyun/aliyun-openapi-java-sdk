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
import com.aliyuncs.ecsinc.transform.v20160314.InnerImageQueryImgsByParamResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class InnerImageQueryImgsByParamResponse extends AcsResponse {

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

		private String snapshotNo;

		private String format;

		private String isPublic;

		private String regionNo;

		private Integer imageSize;

		private String importOSSBucket;

		private String status;

		private String owner;

		private Long virtBaseImageId;

		private String displayName;

		private String quoteType;

		private String imageCategory;

		private String gmtRelease;

		private String imageProductCode;

		private Long aliUid;

		private String version;

		private String gmtModified;

		private String progress;

		private String importOSSObject;

		private Boolean supportIoOptimizedInstance;

		private String remark;

		private String visibility;

		private String bid;

		private Long id;

		private String imageId;

		private Long srcImageId;

		private String gmtCreated;

		private String name;

		private List<Tag> tags;

		private OsTypeModel osTypeModel;

		public String getSnapshotNo() {
			return this.snapshotNo;
		}

		public void setSnapshotNo(String snapshotNo) {
			this.snapshotNo = snapshotNo;
		}

		public String getFormat() {
			return this.format;
		}

		public void setFormat(String format) {
			this.format = format;
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

		public Integer getImageSize() {
			return this.imageSize;
		}

		public void setImageSize(Integer imageSize) {
			this.imageSize = imageSize;
		}

		public String getImportOSSBucket() {
			return this.importOSSBucket;
		}

		public void setImportOSSBucket(String importOSSBucket) {
			this.importOSSBucket = importOSSBucket;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getOwner() {
			return this.owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public Long getVirtBaseImageId() {
			return this.virtBaseImageId;
		}

		public void setVirtBaseImageId(Long virtBaseImageId) {
			this.virtBaseImageId = virtBaseImageId;
		}

		public String getDisplayName() {
			return this.displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}

		public String getQuoteType() {
			return this.quoteType;
		}

		public void setQuoteType(String quoteType) {
			this.quoteType = quoteType;
		}

		public String getImageCategory() {
			return this.imageCategory;
		}

		public void setImageCategory(String imageCategory) {
			this.imageCategory = imageCategory;
		}

		public String getGmtRelease() {
			return this.gmtRelease;
		}

		public void setGmtRelease(String gmtRelease) {
			this.gmtRelease = gmtRelease;
		}

		public String getImageProductCode() {
			return this.imageProductCode;
		}

		public void setImageProductCode(String imageProductCode) {
			this.imageProductCode = imageProductCode;
		}

		public Long getAliUid() {
			return this.aliUid;
		}

		public void setAliUid(Long aliUid) {
			this.aliUid = aliUid;
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

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getProgress() {
			return this.progress;
		}

		public void setProgress(String progress) {
			this.progress = progress;
		}

		public String getImportOSSObject() {
			return this.importOSSObject;
		}

		public void setImportOSSObject(String importOSSObject) {
			this.importOSSObject = importOSSObject;
		}

		public Boolean getSupportIoOptimizedInstance() {
			return this.supportIoOptimizedInstance;
		}

		public void setSupportIoOptimizedInstance(Boolean supportIoOptimizedInstance) {
			this.supportIoOptimizedInstance = supportIoOptimizedInstance;
		}

		public String getRemark() {
			return this.remark;
		}

		public void setRemark(String remark) {
			this.remark = remark;
		}

		public String getVisibility() {
			return this.visibility;
		}

		public void setVisibility(String visibility) {
			this.visibility = visibility;
		}

		public String getBid() {
			return this.bid;
		}

		public void setBid(String bid) {
			this.bid = bid;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

		public Long getSrcImageId() {
			return this.srcImageId;
		}

		public void setSrcImageId(Long srcImageId) {
			this.srcImageId = srcImageId;
		}

		public String getGmtCreated() {
			return this.gmtCreated;
		}

		public void setGmtCreated(String gmtCreated) {
			this.gmtCreated = gmtCreated;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public OsTypeModel getOsTypeModel() {
			return this.osTypeModel;
		}

		public void setOsTypeModel(OsTypeModel osTypeModel) {
			this.osTypeModel = osTypeModel;
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

		public static class OsTypeModel {

			private String platform;

			private Long id;

			private Integer osBit;

			private Integer minCpu;

			private Integer minMemory;

			private Integer maxCpu;

			private Integer maxMemory;

			private String kind;

			private String osName;

			private String osMemo;

			private String type;

			public String getPlatform() {
				return this.platform;
			}

			public void setPlatform(String platform) {
				this.platform = platform;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public Integer getOsBit() {
				return this.osBit;
			}

			public void setOsBit(Integer osBit) {
				this.osBit = osBit;
			}

			public Integer getMinCpu() {
				return this.minCpu;
			}

			public void setMinCpu(Integer minCpu) {
				this.minCpu = minCpu;
			}

			public Integer getMinMemory() {
				return this.minMemory;
			}

			public void setMinMemory(Integer minMemory) {
				this.minMemory = minMemory;
			}

			public Integer getMaxCpu() {
				return this.maxCpu;
			}

			public void setMaxCpu(Integer maxCpu) {
				this.maxCpu = maxCpu;
			}

			public Integer getMaxMemory() {
				return this.maxMemory;
			}

			public void setMaxMemory(Integer maxMemory) {
				this.maxMemory = maxMemory;
			}

			public String getKind() {
				return this.kind;
			}

			public void setKind(String kind) {
				this.kind = kind;
			}

			public String getOsName() {
				return this.osName;
			}

			public void setOsName(String osName) {
				this.osName = osName;
			}

			public String getOsMemo() {
				return this.osMemo;
			}

			public void setOsMemo(String osMemo) {
				this.osMemo = osMemo;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
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
	public InnerImageQueryImgsByParamResponse getInstance(UnmarshallerContext context) {
		return	InnerImageQueryImgsByParamResponseUnmarshaller.unmarshall(this, context);
	}
}
