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
import com.aliyuncs.ecsinc.transform.v20160314.InnerImageDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class InnerImageDetailResponse extends AcsResponse {

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

		private String name;

		private Long srcImageId;

		private String imageId;

		private String gmtCreated;

		private Long id;

		private String bid;

		private Boolean supportIoOptimizedInstance;

		private String remark;

		private String visibility;

		private String importOSSObject;

		private String gmtModified;

		private String progress;

		private String version;

		private String imageProductCode;

		private Long aliUid;

		private String gmtRelease;

		private String imageCategory;

		private String displayName;

		private String owner;

		private String status;

		private String importOSSBucket;

		private String regionNo;

		private String format;

		private Integer imageSize;

		private String snapshotNo;

		private List<Tag> tags;

		private List<ImageDiskMappingModel> imageDiskMappingModels;

		private OsTypeModel osTypeModel;

		private QuoteType quoteType;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Long getSrcImageId() {
			return this.srcImageId;
		}

		public void setSrcImageId(Long srcImageId) {
			this.srcImageId = srcImageId;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
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

		public String getBid() {
			return this.bid;
		}

		public void setBid(String bid) {
			this.bid = bid;
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

		public String getImportOSSObject() {
			return this.importOSSObject;
		}

		public void setImportOSSObject(String importOSSObject) {
			this.importOSSObject = importOSSObject;
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

		public String getGmtRelease() {
			return this.gmtRelease;
		}

		public void setGmtRelease(String gmtRelease) {
			this.gmtRelease = gmtRelease;
		}

		public String getImageCategory() {
			return this.imageCategory;
		}

		public void setImageCategory(String imageCategory) {
			this.imageCategory = imageCategory;
		}

		public String getDisplayName() {
			return this.displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}

		public String getOwner() {
			return this.owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getImportOSSBucket() {
			return this.importOSSBucket;
		}

		public void setImportOSSBucket(String importOSSBucket) {
			this.importOSSBucket = importOSSBucket;
		}

		public String getRegionNo() {
			return this.regionNo;
		}

		public void setRegionNo(String regionNo) {
			this.regionNo = regionNo;
		}

		public String getFormat() {
			return this.format;
		}

		public void setFormat(String format) {
			this.format = format;
		}

		public Integer getImageSize() {
			return this.imageSize;
		}

		public void setImageSize(Integer imageSize) {
			this.imageSize = imageSize;
		}

		public String getSnapshotNo() {
			return this.snapshotNo;
		}

		public void setSnapshotNo(String snapshotNo) {
			this.snapshotNo = snapshotNo;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public List<ImageDiskMappingModel> getImageDiskMappingModels() {
			return this.imageDiskMappingModels;
		}

		public void setImageDiskMappingModels(List<ImageDiskMappingModel> imageDiskMappingModels) {
			this.imageDiskMappingModels = imageDiskMappingModels;
		}

		public OsTypeModel getOsTypeModel() {
			return this.osTypeModel;
		}

		public void setOsTypeModel(OsTypeModel osTypeModel) {
			this.osTypeModel = osTypeModel;
		}

		public QuoteType getQuoteType() {
			return this.quoteType;
		}

		public void setQuoteType(QuoteType quoteType) {
			this.quoteType = quoteType;
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

		public static class ImageDiskMappingModel {

			private String snapshotId;

			private Integer size;

			private String device;

			private String diskType;

			private String format;

			private String importOSSBucket;

			private String importOSSObject;

			public String getSnapshotId() {
				return this.snapshotId;
			}

			public void setSnapshotId(String snapshotId) {
				this.snapshotId = snapshotId;
			}

			public Integer getSize() {
				return this.size;
			}

			public void setSize(Integer size) {
				this.size = size;
			}

			public String getDevice() {
				return this.device;
			}

			public void setDevice(String device) {
				this.device = device;
			}

			public String getDiskType() {
				return this.diskType;
			}

			public void setDiskType(String diskType) {
				this.diskType = diskType;
			}

			public String getFormat() {
				return this.format;
			}

			public void setFormat(String format) {
				this.format = format;
			}

			public String getImportOSSBucket() {
				return this.importOSSBucket;
			}

			public void setImportOSSBucket(String importOSSBucket) {
				this.importOSSBucket = importOSSBucket;
			}

			public String getImportOSSObject() {
				return this.importOSSObject;
			}

			public void setImportOSSObject(String importOSSObject) {
				this.importOSSObject = importOSSObject;
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

			private String osName;

			private String osMemo;

			private String type;

			private Kind kind;

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

			public Kind getKind() {
				return this.kind;
			}

			public void setKind(Kind kind) {
				this.kind = kind;
			}

			public static class Kind {

				private String kind;

				public String getKind() {
					return this.kind;
				}

				public void setKind(String kind) {
					this.kind = kind;
				}
			}
		}

		public static class QuoteType {

			private String quoteType;

			public String getQuoteType() {
				return this.quoteType;
			}

			public void setQuoteType(String quoteType) {
				this.quoteType = quoteType;
			}
		}
	}

	@Override
	public InnerImageDetailResponse getInstance(UnmarshallerContext context) {
		return	InnerImageDetailResponseUnmarshaller.unmarshall(this, context);
	}
}
