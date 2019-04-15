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
import com.aliyuncs.ecsinc.transform.v20160314.InnerInstanceDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class InnerInstanceDetailResponse extends AcsResponse {

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

		private String systemDeviceCategory;

		private String vncHost;

		private Integer intensiveNet;

		private String safetyQuota;

		private Integer vncPort;

		private String zoneNo;

		private String instanceName;

		private String regionNo;

		private String hostname;

		private Boolean networkValidation;

		private Integer internetTx;

		private Integer internetRx;

		private String platform;

		private String vlanNo;

		private String status;

		private String creationTime;

		private Integer mem;

		private Integer intensiveIo;

		private String ncId;

		private Integer bps;

		private String vncPassword;

		private String ecsName;

		private String innerIp;

		private String realZoneNo;

		private String serialNumber;

		private String izNo;

		private Integer cores;

		private Integer intranetTx;

		private Integer intensiveCpu;

		private String imageProductCode;

		private Integer intranetRx;

		private String securityControl;

		private String rackId;

		private Integer disk;

		private List<Group> groups;

		private PublicIp publicIp;

		private Img img;

		private StatusNote statusNote;

		public String getSystemDeviceCategory() {
			return this.systemDeviceCategory;
		}

		public void setSystemDeviceCategory(String systemDeviceCategory) {
			this.systemDeviceCategory = systemDeviceCategory;
		}

		public String getVncHost() {
			return this.vncHost;
		}

		public void setVncHost(String vncHost) {
			this.vncHost = vncHost;
		}

		public Integer getIntensiveNet() {
			return this.intensiveNet;
		}

		public void setIntensiveNet(Integer intensiveNet) {
			this.intensiveNet = intensiveNet;
		}

		public String getSafetyQuota() {
			return this.safetyQuota;
		}

		public void setSafetyQuota(String safetyQuota) {
			this.safetyQuota = safetyQuota;
		}

		public Integer getVncPort() {
			return this.vncPort;
		}

		public void setVncPort(Integer vncPort) {
			this.vncPort = vncPort;
		}

		public String getZoneNo() {
			return this.zoneNo;
		}

		public void setZoneNo(String zoneNo) {
			this.zoneNo = zoneNo;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getRegionNo() {
			return this.regionNo;
		}

		public void setRegionNo(String regionNo) {
			this.regionNo = regionNo;
		}

		public String getHostname() {
			return this.hostname;
		}

		public void setHostname(String hostname) {
			this.hostname = hostname;
		}

		public Boolean getNetworkValidation() {
			return this.networkValidation;
		}

		public void setNetworkValidation(Boolean networkValidation) {
			this.networkValidation = networkValidation;
		}

		public Integer getInternetTx() {
			return this.internetTx;
		}

		public void setInternetTx(Integer internetTx) {
			this.internetTx = internetTx;
		}

		public Integer getInternetRx() {
			return this.internetRx;
		}

		public void setInternetRx(Integer internetRx) {
			this.internetRx = internetRx;
		}

		public String getPlatform() {
			return this.platform;
		}

		public void setPlatform(String platform) {
			this.platform = platform;
		}

		public String getVlanNo() {
			return this.vlanNo;
		}

		public void setVlanNo(String vlanNo) {
			this.vlanNo = vlanNo;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public Integer getMem() {
			return this.mem;
		}

		public void setMem(Integer mem) {
			this.mem = mem;
		}

		public Integer getIntensiveIo() {
			return this.intensiveIo;
		}

		public void setIntensiveIo(Integer intensiveIo) {
			this.intensiveIo = intensiveIo;
		}

		public String getNcId() {
			return this.ncId;
		}

		public void setNcId(String ncId) {
			this.ncId = ncId;
		}

		public Integer getBps() {
			return this.bps;
		}

		public void setBps(Integer bps) {
			this.bps = bps;
		}

		public String getVncPassword() {
			return this.vncPassword;
		}

		public void setVncPassword(String vncPassword) {
			this.vncPassword = vncPassword;
		}

		public String getEcsName() {
			return this.ecsName;
		}

		public void setEcsName(String ecsName) {
			this.ecsName = ecsName;
		}

		public String getInnerIp() {
			return this.innerIp;
		}

		public void setInnerIp(String innerIp) {
			this.innerIp = innerIp;
		}

		public String getRealZoneNo() {
			return this.realZoneNo;
		}

		public void setRealZoneNo(String realZoneNo) {
			this.realZoneNo = realZoneNo;
		}

		public String getSerialNumber() {
			return this.serialNumber;
		}

		public void setSerialNumber(String serialNumber) {
			this.serialNumber = serialNumber;
		}

		public String getIzNo() {
			return this.izNo;
		}

		public void setIzNo(String izNo) {
			this.izNo = izNo;
		}

		public Integer getCores() {
			return this.cores;
		}

		public void setCores(Integer cores) {
			this.cores = cores;
		}

		public Integer getIntranetTx() {
			return this.intranetTx;
		}

		public void setIntranetTx(Integer intranetTx) {
			this.intranetTx = intranetTx;
		}

		public Integer getIntensiveCpu() {
			return this.intensiveCpu;
		}

		public void setIntensiveCpu(Integer intensiveCpu) {
			this.intensiveCpu = intensiveCpu;
		}

		public String getImageProductCode() {
			return this.imageProductCode;
		}

		public void setImageProductCode(String imageProductCode) {
			this.imageProductCode = imageProductCode;
		}

		public Integer getIntranetRx() {
			return this.intranetRx;
		}

		public void setIntranetRx(Integer intranetRx) {
			this.intranetRx = intranetRx;
		}

		public String getSecurityControl() {
			return this.securityControl;
		}

		public void setSecurityControl(String securityControl) {
			this.securityControl = securityControl;
		}

		public String getRackId() {
			return this.rackId;
		}

		public void setRackId(String rackId) {
			this.rackId = rackId;
		}

		public Integer getDisk() {
			return this.disk;
		}

		public void setDisk(Integer disk) {
			this.disk = disk;
		}

		public List<Group> getGroups() {
			return this.groups;
		}

		public void setGroups(List<Group> groups) {
			this.groups = groups;
		}

		public PublicIp getPublicIp() {
			return this.publicIp;
		}

		public void setPublicIp(PublicIp publicIp) {
			this.publicIp = publicIp;
		}

		public Img getImg() {
			return this.img;
		}

		public void setImg(Img img) {
			this.img = img;
		}

		public StatusNote getStatusNote() {
			return this.statusNote;
		}

		public void setStatusNote(StatusNote statusNote) {
			this.statusNote = statusNote;
		}

		public static class Group {

			private String groupNo;

			private String groupName;

			private String groupDesc;

			private Integer ecsCount;

			private String vpcInstanceId;

			private String gmtCreated;

			private String gmtModified;

			private List<Tag> tags;

			public String getGroupNo() {
				return this.groupNo;
			}

			public void setGroupNo(String groupNo) {
				this.groupNo = groupNo;
			}

			public String getGroupName() {
				return this.groupName;
			}

			public void setGroupName(String groupName) {
				this.groupName = groupName;
			}

			public String getGroupDesc() {
				return this.groupDesc;
			}

			public void setGroupDesc(String groupDesc) {
				this.groupDesc = groupDesc;
			}

			public Integer getEcsCount() {
				return this.ecsCount;
			}

			public void setEcsCount(Integer ecsCount) {
				this.ecsCount = ecsCount;
			}

			public String getVpcInstanceId() {
				return this.vpcInstanceId;
			}

			public void setVpcInstanceId(String vpcInstanceId) {
				this.vpcInstanceId = vpcInstanceId;
			}

			public String getGmtCreated() {
				return this.gmtCreated;
			}

			public void setGmtCreated(String gmtCreated) {
				this.gmtCreated = gmtCreated;
			}

			public String getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(String gmtModified) {
				this.gmtModified = gmtModified;
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

		public static class PublicIp {

			private String bindIp;

			private String assignNatIp;

			private String assignIp;

			public String getBindIp() {
				return this.bindIp;
			}

			public void setBindIp(String bindIp) {
				this.bindIp = bindIp;
			}

			public String getAssignNatIp() {
				return this.assignNatIp;
			}

			public void setAssignNatIp(String assignNatIp) {
				this.assignNatIp = assignNatIp;
			}

			public String getAssignIp() {
				return this.assignIp;
			}

			public void setAssignIp(String assignIp) {
				this.assignIp = assignIp;
			}
		}

		public static class Img {

			private String name;

			private String imageId;

			private Long srcImageId;

			private String gmtCreated;

			private Long id;

			private String bid;

			private String visibility;

			private String remark;

			private Boolean supportIoOptimizedInstance;

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

			private String format;

			private String regionNo;

			private Integer imageSize;

			private String snapshotNo;

			private List<Tag2> tags1;

			private OsTypeModel osTypeModel;

			private QuoteType quoteType;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
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

			public String getVisibility() {
				return this.visibility;
			}

			public void setVisibility(String visibility) {
				this.visibility = visibility;
			}

			public String getRemark() {
				return this.remark;
			}

			public void setRemark(String remark) {
				this.remark = remark;
			}

			public Boolean getSupportIoOptimizedInstance() {
				return this.supportIoOptimizedInstance;
			}

			public void setSupportIoOptimizedInstance(Boolean supportIoOptimizedInstance) {
				this.supportIoOptimizedInstance = supportIoOptimizedInstance;
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

			public String getFormat() {
				return this.format;
			}

			public void setFormat(String format) {
				this.format = format;
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

			public String getSnapshotNo() {
				return this.snapshotNo;
			}

			public void setSnapshotNo(String snapshotNo) {
				this.snapshotNo = snapshotNo;
			}

			public List<Tag2> getTags1() {
				return this.tags1;
			}

			public void setTags1(List<Tag2> tags1) {
				this.tags1 = tags1;
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

			public static class Tag2 {

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

		public static class StatusNote {

			private String noteCode;

			private String noteInfo;

			public String getNoteCode() {
				return this.noteCode;
			}

			public void setNoteCode(String noteCode) {
				this.noteCode = noteCode;
			}

			public String getNoteInfo() {
				return this.noteInfo;
			}

			public void setNoteInfo(String noteInfo) {
				this.noteInfo = noteInfo;
			}
		}
	}

	@Override
	public InnerInstanceDetailResponse getInstance(UnmarshallerContext context) {
		return	InnerInstanceDetailResponseUnmarshaller.unmarshall(this, context);
	}
}
