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

package com.aliyuncs.edas.model.v20170801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.edas.transform.v20170801.ListResourceGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListResourceGroupResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private List<ResGroupEntity> resourceGroupList;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ResGroupEntity> getResourceGroupList() {
		return this.resourceGroupList;
	}

	public void setResourceGroupList(List<ResGroupEntity> resourceGroupList) {
		this.resourceGroupList = resourceGroupList;
	}

	public static class ResGroupEntity {

		private Long updateTime;

		private String description;

		private String adminUserId;

		private Long createTime;

		private String name;

		private Long id;

		private String regionId;

		private List<EcsEntity> ecsList;

		private List<SlbEntity> slbList;

		public Long getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(Long updateTime) {
			this.updateTime = updateTime;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getAdminUserId() {
			return this.adminUserId;
		}

		public void setAdminUserId(String adminUserId) {
			this.adminUserId = adminUserId;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public List<EcsEntity> getEcsList() {
			return this.ecsList;
		}

		public void setEcsList(List<EcsEntity> ecsList) {
			this.ecsList = ecsList;
		}

		public List<SlbEntity> getSlbList() {
			return this.slbList;
		}

		public void setSlbList(List<SlbEntity> slbList) {
			this.slbList = slbList;
		}

		public static class EcsEntity {

			private String vpcId;

			private String sgId;

			private String status;

			private String privateIp;

			private Boolean expired;

			private String userId;

			private String hostName;

			private String instanceId;

			private Integer mem;

			private String regionId;

			private Integer cpu;

			private String innerIp;

			private String groupId;

			private String eip;

			private String description;

			private String instanceName;

			private String zoneId;

			private String serialNum;

			private String publicIp;

			private EcuEntity ecuEntity;

			private VpcEntity vpcEntity;

			public String getVpcId() {
				return this.vpcId;
			}

			public void setVpcId(String vpcId) {
				this.vpcId = vpcId;
			}

			public String getSgId() {
				return this.sgId;
			}

			public void setSgId(String sgId) {
				this.sgId = sgId;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getPrivateIp() {
				return this.privateIp;
			}

			public void setPrivateIp(String privateIp) {
				this.privateIp = privateIp;
			}

			public Boolean getExpired() {
				return this.expired;
			}

			public void setExpired(Boolean expired) {
				this.expired = expired;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public String getHostName() {
				return this.hostName;
			}

			public void setHostName(String hostName) {
				this.hostName = hostName;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public Integer getMem() {
				return this.mem;
			}

			public void setMem(Integer mem) {
				this.mem = mem;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public Integer getCpu() {
				return this.cpu;
			}

			public void setCpu(Integer cpu) {
				this.cpu = cpu;
			}

			public String getInnerIp() {
				return this.innerIp;
			}

			public void setInnerIp(String innerIp) {
				this.innerIp = innerIp;
			}

			public String getGroupId() {
				return this.groupId;
			}

			public void setGroupId(String groupId) {
				this.groupId = groupId;
			}

			public String getEip() {
				return this.eip;
			}

			public void setEip(String eip) {
				this.eip = eip;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getInstanceName() {
				return this.instanceName;
			}

			public void setInstanceName(String instanceName) {
				this.instanceName = instanceName;
			}

			public String getZoneId() {
				return this.zoneId;
			}

			public void setZoneId(String zoneId) {
				this.zoneId = zoneId;
			}

			public String getSerialNum() {
				return this.serialNum;
			}

			public void setSerialNum(String serialNum) {
				this.serialNum = serialNum;
			}

			public String getPublicIp() {
				return this.publicIp;
			}

			public void setPublicIp(String publicIp) {
				this.publicIp = publicIp;
			}

			public EcuEntity getEcuEntity() {
				return this.ecuEntity;
			}

			public void setEcuEntity(EcuEntity ecuEntity) {
				this.ecuEntity = ecuEntity;
			}

			public VpcEntity getVpcEntity() {
				return this.vpcEntity;
			}

			public void setVpcEntity(VpcEntity vpcEntity) {
				this.vpcEntity = vpcEntity;
			}

			public static class EcuEntity {

				private String vpcId;

				private Long updateTime;

				private String ipAddr;

				private Integer availableCpu;

				private Long createTime;

				private String userId;

				private String instanceId;

				private Integer mem;

				private String regionId;

				private String ecuId;

				private Integer cpu;

				private Boolean dockerEnv;

				private Boolean online;

				private Integer availableMem;

				private String zoneId;

				private String name;

				private Long heartbeatTime;

				public String getVpcId() {
					return this.vpcId;
				}

				public void setVpcId(String vpcId) {
					this.vpcId = vpcId;
				}

				public Long getUpdateTime() {
					return this.updateTime;
				}

				public void setUpdateTime(Long updateTime) {
					this.updateTime = updateTime;
				}

				public String getIpAddr() {
					return this.ipAddr;
				}

				public void setIpAddr(String ipAddr) {
					this.ipAddr = ipAddr;
				}

				public Integer getAvailableCpu() {
					return this.availableCpu;
				}

				public void setAvailableCpu(Integer availableCpu) {
					this.availableCpu = availableCpu;
				}

				public Long getCreateTime() {
					return this.createTime;
				}

				public void setCreateTime(Long createTime) {
					this.createTime = createTime;
				}

				public String getUserId() {
					return this.userId;
				}

				public void setUserId(String userId) {
					this.userId = userId;
				}

				public String getInstanceId() {
					return this.instanceId;
				}

				public void setInstanceId(String instanceId) {
					this.instanceId = instanceId;
				}

				public Integer getMem() {
					return this.mem;
				}

				public void setMem(Integer mem) {
					this.mem = mem;
				}

				public String getRegionId() {
					return this.regionId;
				}

				public void setRegionId(String regionId) {
					this.regionId = regionId;
				}

				public String getEcuId() {
					return this.ecuId;
				}

				public void setEcuId(String ecuId) {
					this.ecuId = ecuId;
				}

				public Integer getCpu() {
					return this.cpu;
				}

				public void setCpu(Integer cpu) {
					this.cpu = cpu;
				}

				public Boolean getDockerEnv() {
					return this.dockerEnv;
				}

				public void setDockerEnv(Boolean dockerEnv) {
					this.dockerEnv = dockerEnv;
				}

				public Boolean getOnline() {
					return this.online;
				}

				public void setOnline(Boolean online) {
					this.online = online;
				}

				public Integer getAvailableMem() {
					return this.availableMem;
				}

				public void setAvailableMem(Integer availableMem) {
					this.availableMem = availableMem;
				}

				public String getZoneId() {
					return this.zoneId;
				}

				public void setZoneId(String zoneId) {
					this.zoneId = zoneId;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public Long getHeartbeatTime() {
					return this.heartbeatTime;
				}

				public void setHeartbeatTime(Long heartbeatTime) {
					this.heartbeatTime = heartbeatTime;
				}
			}

			public static class VpcEntity {

				private String status;

				private String vpcName;

				private String vpcId;

				private String description;

				private Boolean expired;

				private String cidrblock;

				private String userId;

				private Integer ecsNum;

				private String regionId;

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
				}

				public String getVpcName() {
					return this.vpcName;
				}

				public void setVpcName(String vpcName) {
					this.vpcName = vpcName;
				}

				public String getVpcId() {
					return this.vpcId;
				}

				public void setVpcId(String vpcId) {
					this.vpcId = vpcId;
				}

				public String getDescription() {
					return this.description;
				}

				public void setDescription(String description) {
					this.description = description;
				}

				public Boolean getExpired() {
					return this.expired;
				}

				public void setExpired(Boolean expired) {
					this.expired = expired;
				}

				public String getCidrblock() {
					return this.cidrblock;
				}

				public void setCidrblock(String cidrblock) {
					this.cidrblock = cidrblock;
				}

				public String getUserId() {
					return this.userId;
				}

				public void setUserId(String userId) {
					this.userId = userId;
				}

				public Integer getEcsNum() {
					return this.ecsNum;
				}

				public void setEcsNum(Integer ecsNum) {
					this.ecsNum = ecsNum;
				}

				public String getRegionId() {
					return this.regionId;
				}

				public void setRegionId(String regionId) {
					this.regionId = regionId;
				}
			}
		}

		public static class SlbEntity {

			private String slbId;

			private String vpcId;

			private String vswitchId;

			private Boolean expired;

			private String userId;

			private String addressType;

			private String networkType;

			private String regionId;

			private Integer groupId;

			private String address;

			private String slbName;

			private String slbStatus;

			public String getSlbId() {
				return this.slbId;
			}

			public void setSlbId(String slbId) {
				this.slbId = slbId;
			}

			public String getVpcId() {
				return this.vpcId;
			}

			public void setVpcId(String vpcId) {
				this.vpcId = vpcId;
			}

			public String getVswitchId() {
				return this.vswitchId;
			}

			public void setVswitchId(String vswitchId) {
				this.vswitchId = vswitchId;
			}

			public Boolean getExpired() {
				return this.expired;
			}

			public void setExpired(Boolean expired) {
				this.expired = expired;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public String getAddressType() {
				return this.addressType;
			}

			public void setAddressType(String addressType) {
				this.addressType = addressType;
			}

			public String getNetworkType() {
				return this.networkType;
			}

			public void setNetworkType(String networkType) {
				this.networkType = networkType;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public Integer getGroupId() {
				return this.groupId;
			}

			public void setGroupId(Integer groupId) {
				this.groupId = groupId;
			}

			public String getAddress() {
				return this.address;
			}

			public void setAddress(String address) {
				this.address = address;
			}

			public String getSlbName() {
				return this.slbName;
			}

			public void setSlbName(String slbName) {
				this.slbName = slbName;
			}

			public String getSlbStatus() {
				return this.slbStatus;
			}

			public void setSlbStatus(String slbStatus) {
				this.slbStatus = slbStatus;
			}
		}
	}

	@Override
	public ListResourceGroupResponse getInstance(UnmarshallerContext context) {
		return	ListResourceGroupResponseUnmarshaller.unmarshall(this, context);
	}
}
