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
import com.aliyuncs.ecsinc.transform.v20160314.InnerEcsInstanceDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class InnerEcsInstanceDetailResponse extends AcsResponse {

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

		private Integer internetTx;

		private String vswitchInstanceId;

		private String instanceTypeFamily;

		private Boolean networkValidation;

		private String regionNo;

		private String instanceName;

		private String businessStatus;

		private String eip;

		private Long aliUid;

		private String houyiStatus;

		private Integer intranetTx;

		private Integer cores;

		private String innerIp;

		private String ecsName;

		private Integer bps;

		private String vpcInstanceId;

		private Long id;

		private String bid;

		private Integer mem;

		private String status;

		private Integer internetRx;

		private String hostname;

		private Integer eipBandwidth;

		private String zoneNo;

		private String natIp;

		private String instanceType;

		private String netWorkType;

		private Boolean deviceAvailable;

		private Boolean ioOptimized;

		private String systemDeviceCategory;

		private Integer disk;

		private String securityControl;

		private String eipInstanceId;

		private Integer intranetRx;

		private String izNo;

		private String serialNumber;

		private String realZoneNo;

		private String description;

		private String creationTime;

		private List<Tag> tags;

		private List<Group> groups;

		private PublicIp publicIp;

		private Img img;

		public Integer getInternetTx() {
			return this.internetTx;
		}

		public void setInternetTx(Integer internetTx) {
			this.internetTx = internetTx;
		}

		public String getVswitchInstanceId() {
			return this.vswitchInstanceId;
		}

		public void setVswitchInstanceId(String vswitchInstanceId) {
			this.vswitchInstanceId = vswitchInstanceId;
		}

		public String getInstanceTypeFamily() {
			return this.instanceTypeFamily;
		}

		public void setInstanceTypeFamily(String instanceTypeFamily) {
			this.instanceTypeFamily = instanceTypeFamily;
		}

		public Boolean getNetworkValidation() {
			return this.networkValidation;
		}

		public void setNetworkValidation(Boolean networkValidation) {
			this.networkValidation = networkValidation;
		}

		public String getRegionNo() {
			return this.regionNo;
		}

		public void setRegionNo(String regionNo) {
			this.regionNo = regionNo;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getBusinessStatus() {
			return this.businessStatus;
		}

		public void setBusinessStatus(String businessStatus) {
			this.businessStatus = businessStatus;
		}

		public String getEip() {
			return this.eip;
		}

		public void setEip(String eip) {
			this.eip = eip;
		}

		public Long getAliUid() {
			return this.aliUid;
		}

		public void setAliUid(Long aliUid) {
			this.aliUid = aliUid;
		}

		public String getHouyiStatus() {
			return this.houyiStatus;
		}

		public void setHouyiStatus(String houyiStatus) {
			this.houyiStatus = houyiStatus;
		}

		public Integer getIntranetTx() {
			return this.intranetTx;
		}

		public void setIntranetTx(Integer intranetTx) {
			this.intranetTx = intranetTx;
		}

		public Integer getCores() {
			return this.cores;
		}

		public void setCores(Integer cores) {
			this.cores = cores;
		}

		public String getInnerIp() {
			return this.innerIp;
		}

		public void setInnerIp(String innerIp) {
			this.innerIp = innerIp;
		}

		public String getEcsName() {
			return this.ecsName;
		}

		public void setEcsName(String ecsName) {
			this.ecsName = ecsName;
		}

		public Integer getBps() {
			return this.bps;
		}

		public void setBps(Integer bps) {
			this.bps = bps;
		}

		public String getVpcInstanceId() {
			return this.vpcInstanceId;
		}

		public void setVpcInstanceId(String vpcInstanceId) {
			this.vpcInstanceId = vpcInstanceId;
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

		public Integer getMem() {
			return this.mem;
		}

		public void setMem(Integer mem) {
			this.mem = mem;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Integer getInternetRx() {
			return this.internetRx;
		}

		public void setInternetRx(Integer internetRx) {
			this.internetRx = internetRx;
		}

		public String getHostname() {
			return this.hostname;
		}

		public void setHostname(String hostname) {
			this.hostname = hostname;
		}

		public Integer getEipBandwidth() {
			return this.eipBandwidth;
		}

		public void setEipBandwidth(Integer eipBandwidth) {
			this.eipBandwidth = eipBandwidth;
		}

		public String getZoneNo() {
			return this.zoneNo;
		}

		public void setZoneNo(String zoneNo) {
			this.zoneNo = zoneNo;
		}

		public String getNatIp() {
			return this.natIp;
		}

		public void setNatIp(String natIp) {
			this.natIp = natIp;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getNetWorkType() {
			return this.netWorkType;
		}

		public void setNetWorkType(String netWorkType) {
			this.netWorkType = netWorkType;
		}

		public Boolean getDeviceAvailable() {
			return this.deviceAvailable;
		}

		public void setDeviceAvailable(Boolean deviceAvailable) {
			this.deviceAvailable = deviceAvailable;
		}

		public Boolean getIoOptimized() {
			return this.ioOptimized;
		}

		public void setIoOptimized(Boolean ioOptimized) {
			this.ioOptimized = ioOptimized;
		}

		public String getSystemDeviceCategory() {
			return this.systemDeviceCategory;
		}

		public void setSystemDeviceCategory(String systemDeviceCategory) {
			this.systemDeviceCategory = systemDeviceCategory;
		}

		public Integer getDisk() {
			return this.disk;
		}

		public void setDisk(Integer disk) {
			this.disk = disk;
		}

		public String getSecurityControl() {
			return this.securityControl;
		}

		public void setSecurityControl(String securityControl) {
			this.securityControl = securityControl;
		}

		public String getEipInstanceId() {
			return this.eipInstanceId;
		}

		public void setEipInstanceId(String eipInstanceId) {
			this.eipInstanceId = eipInstanceId;
		}

		public Integer getIntranetRx() {
			return this.intranetRx;
		}

		public void setIntranetRx(Integer intranetRx) {
			this.intranetRx = intranetRx;
		}

		public String getIzNo() {
			return this.izNo;
		}

		public void setIzNo(String izNo) {
			this.izNo = izNo;
		}

		public String getSerialNumber() {
			return this.serialNumber;
		}

		public void setSerialNumber(String serialNumber) {
			this.serialNumber = serialNumber;
		}

		public String getRealZoneNo() {
			return this.realZoneNo;
		}

		public void setRealZoneNo(String realZoneNo) {
			this.realZoneNo = realZoneNo;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
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

		public static class Group {

			private String groupDesc;

			private String groupNo;

			private String groupName;

			public String getGroupDesc() {
				return this.groupDesc;
			}

			public void setGroupDesc(String groupDesc) {
				this.groupDesc = groupDesc;
			}

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
		}

		public static class PublicIp {

			private String assignIp;

			private String bindIp;

			private String assignNatIp;

			public String getAssignIp() {
				return this.assignIp;
			}

			public void setAssignIp(String assignIp) {
				this.assignIp = assignIp;
			}

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
		}

		public static class Img {

			private String name;

			private String imageNo;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getImageNo() {
				return this.imageNo;
			}

			public void setImageNo(String imageNo) {
				this.imageNo = imageNo;
			}
		}
	}

	@Override
	public InnerEcsInstanceDetailResponse getInstance(UnmarshallerContext context) {
		return	InnerEcsInstanceDetailResponseUnmarshaller.unmarshall(this, context);
	}
}
