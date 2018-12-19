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
import java.util.Map;
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

		private Long id;

		private String name;

		private String description;

		private String adminUserId;

		private Long createTime;

		private Long updateTime;

		private String regionId;

		private List<EcsEntity> ecsList;

		private List<SlbEntity> slbList;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
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

		public Long getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(Long updateTime) {
			this.updateTime = updateTime;
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

			private String instanceId;

			private String instanceName;

			private String hostName;

			private String description;

			private String status;

			private String publicIp;

			private String innerIp;

			private String privateIp;

			private String eip;

			private String serialNum;

			private String userId;

			private String zoneId;

			private String regionId;

			private String instanceId1;

			private Boolean expired;

			private String sgId;

			private String vpcId;

			private String groupId;

			private Integer cpu;

			private Integer mem;

			private EcuEntity ecuEntity;

			private VpcEntity vpcEntity;

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getInstanceName() {
				return this.instanceName;
			}

			public void setInstanceName(String instanceName) {
				this.instanceName = instanceName;
			}

			public String getHostName() {
				return this.hostName;
			}

			public void setHostName(String hostName) {
				this.hostName = hostName;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getPublicIp() {
				return this.publicIp;
			}

			public void setPublicIp(String publicIp) {
				this.publicIp = publicIp;
			}

			public String getInnerIp() {
				return this.innerIp;
			}

			public void setInnerIp(String innerIp) {
				this.innerIp = innerIp;
			}

			public String getPrivateIp() {
				return this.privateIp;
			}

			public void setPrivateIp(String privateIp) {
				this.privateIp = privateIp;
			}

			public String getEip() {
				return this.eip;
			}

			public void setEip(String eip) {
				this.eip = eip;
			}

			public String getSerialNum() {
				return this.serialNum;
			}

			public void setSerialNum(String serialNum) {
				this.serialNum = serialNum;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public String getZoneId() {
				return this.zoneId;
			}

			public void setZoneId(String zoneId) {
				this.zoneId = zoneId;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getInstanceId1() {
				return this.instanceId1;
			}

			public void setInstanceId1(String instanceId1) {
				this.instanceId1 = instanceId1;
			}

			public Boolean getExpired() {
				return this.expired;
			}

			public void setExpired(Boolean expired) {
				this.expired = expired;
			}

			public String getSgId() {
				return this.sgId;
			}

			public void setSgId(String sgId) {
				this.sgId = sgId;
			}

			public String getVpcId() {
				return this.vpcId;
			}

			public void setVpcId(String vpcId) {
				this.vpcId = vpcId;
			}

			public String getGroupId() {
				return this.groupId;
			}

			public void setGroupId(String groupId) {
				this.groupId = groupId;
			}

			public Integer getCpu() {
				return this.cpu;
			}

			public void setCpu(Integer cpu) {
				this.cpu = cpu;
			}

			public Integer getMem() {
				return this.mem;
			}

			public void setMem(Integer mem) {
				this.mem = mem;
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

				private String ecuId;

				private Boolean online;

				private Boolean dockerEnv;

				private Long createTime;

				private Long updateTime;

				private String ipAddr;

				private Long heartbeatTime;

				private String userId;

				private String name;

				private String zoneId;

				private String regionId;

				private String instanceId;

				private String vpcId;

				private Integer availableCpu;

				private Integer availableMem;

				private Integer cpu;

				private Integer mem;

				public String getEcuId() {
					return this.ecuId;
				}

				public void setEcuId(String ecuId) {
					this.ecuId = ecuId;
				}

				public Boolean getOnline() {
					return this.online;
				}

				public void setOnline(Boolean online) {
					this.online = online;
				}

				public Boolean getDockerEnv() {
					return this.dockerEnv;
				}

				public void setDockerEnv(Boolean dockerEnv) {
					this.dockerEnv = dockerEnv;
				}

				public Long getCreateTime() {
					return this.createTime;
				}

				public void setCreateTime(Long createTime) {
					this.createTime = createTime;
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

				public Long getHeartbeatTime() {
					return this.heartbeatTime;
				}

				public void setHeartbeatTime(Long heartbeatTime) {
					this.heartbeatTime = heartbeatTime;
				}

				public String getUserId() {
					return this.userId;
				}

				public void setUserId(String userId) {
					this.userId = userId;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getZoneId() {
					return this.zoneId;
				}

				public void setZoneId(String zoneId) {
					this.zoneId = zoneId;
				}

				public String getRegionId() {
					return this.regionId;
				}

				public void setRegionId(String regionId) {
					this.regionId = regionId;
				}

				public String getInstanceId() {
					return this.instanceId;
				}

				public void setInstanceId(String instanceId) {
					this.instanceId = instanceId;
				}

				public String getVpcId() {
					return this.vpcId;
				}

				public void setVpcId(String vpcId) {
					this.vpcId = vpcId;
				}

				public Integer getAvailableCpu() {
					return this.availableCpu;
				}

				public void setAvailableCpu(Integer availableCpu) {
					this.availableCpu = availableCpu;
				}

				public Integer getAvailableMem() {
					return this.availableMem;
				}

				public void setAvailableMem(Integer availableMem) {
					this.availableMem = availableMem;
				}

				public Integer getCpu() {
					return this.cpu;
				}

				public void setCpu(Integer cpu) {
					this.cpu = cpu;
				}

				public Integer getMem() {
					return this.mem;
				}

				public void setMem(Integer mem) {
					this.mem = mem;
				}
			}

			public static class VpcEntity {

				private String vpcId;

				private String vpcName;

				private String regionId;

				private String userId;

				private String cidrblock;

				private String status;

				private String description;

				private Boolean expired;

				private Integer ecsNum;

				public String getVpcId() {
					return this.vpcId;
				}

				public void setVpcId(String vpcId) {
					this.vpcId = vpcId;
				}

				public String getVpcName() {
					return this.vpcName;
				}

				public void setVpcName(String vpcName) {
					this.vpcName = vpcName;
				}

				public String getRegionId() {
					return this.regionId;
				}

				public void setRegionId(String regionId) {
					this.regionId = regionId;
				}

				public String getUserId() {
					return this.userId;
				}

				public void setUserId(String userId) {
					this.userId = userId;
				}

				public String getCidrblock() {
					return this.cidrblock;
				}

				public void setCidrblock(String cidrblock) {
					this.cidrblock = cidrblock;
				}

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
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

				public Integer getEcsNum() {
					return this.ecsNum;
				}

				public void setEcsNum(Integer ecsNum) {
					this.ecsNum = ecsNum;
				}
			}
		}

		public static class SlbEntity {

			private String slbId;

			private String slbName;

			private String regionId;

			private String userId;

			private String address;

			private String slbStatus;

			private String addressType;

			private String vswitchId;

			private String vpcId;

			private String networkType;

			private Integer groupId;

			private Boolean expired;

			public String getSlbId() {
				return this.slbId;
			}

			public void setSlbId(String slbId) {
				this.slbId = slbId;
			}

			public String getSlbName() {
				return this.slbName;
			}

			public void setSlbName(String slbName) {
				this.slbName = slbName;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public String getAddress() {
				return this.address;
			}

			public void setAddress(String address) {
				this.address = address;
			}

			public String getSlbStatus() {
				return this.slbStatus;
			}

			public void setSlbStatus(String slbStatus) {
				this.slbStatus = slbStatus;
			}

			public String getAddressType() {
				return this.addressType;
			}

			public void setAddressType(String addressType) {
				this.addressType = addressType;
			}

			public String getVswitchId() {
				return this.vswitchId;
			}

			public void setVswitchId(String vswitchId) {
				this.vswitchId = vswitchId;
			}

			public String getVpcId() {
				return this.vpcId;
			}

			public void setVpcId(String vpcId) {
				this.vpcId = vpcId;
			}

			public String getNetworkType() {
				return this.networkType;
			}

			public void setNetworkType(String networkType) {
				this.networkType = networkType;
			}

			public Integer getGroupId() {
				return this.groupId;
			}

			public void setGroupId(Integer groupId) {
				this.groupId = groupId;
			}

			public Boolean getExpired() {
				return this.expired;
			}

			public void setExpired(Boolean expired) {
				this.expired = expired;
			}
		}
	}

	@Override
	public ListResourceGroupResponse getInstance(UnmarshallerContext context) {
		return	ListResourceGroupResponseUnmarshaller.unmarshall(this, context);
	}
}
