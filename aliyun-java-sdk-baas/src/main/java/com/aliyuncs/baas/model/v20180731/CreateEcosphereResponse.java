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

package com.aliyuncs.baas.model.v20180731;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.baas.transform.v20180731.CreateEcosphereResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateEcosphereResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer errorCode;

	private String errorMessage;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Integer getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private String consortiumId;

		private String name;

		private String regionId;

		private String zoneId;

		private String code;

		private String domain;

		private String description;

		private String ownerBid;

		private Long ownerUid;

		private String ordererType;

		private String channelPolicy;

		private Integer ordererCount;

		private Integer memberCount;

		private Integer channelCount;

		private String specName;

		private String clusterState;

		private String serviceState;

		private String createTime;

		private List<Organization> organizations;

		private Specification specification;

		public String getConsortiumId() {
			return this.consortiumId;
		}

		public void setConsortiumId(String consortiumId) {
			this.consortiumId = consortiumId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getDomain() {
			return this.domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getOwnerBid() {
			return this.ownerBid;
		}

		public void setOwnerBid(String ownerBid) {
			this.ownerBid = ownerBid;
		}

		public Long getOwnerUid() {
			return this.ownerUid;
		}

		public void setOwnerUid(Long ownerUid) {
			this.ownerUid = ownerUid;
		}

		public String getOrdererType() {
			return this.ordererType;
		}

		public void setOrdererType(String ordererType) {
			this.ordererType = ordererType;
		}

		public String getChannelPolicy() {
			return this.channelPolicy;
		}

		public void setChannelPolicy(String channelPolicy) {
			this.channelPolicy = channelPolicy;
		}

		public Integer getOrdererCount() {
			return this.ordererCount;
		}

		public void setOrdererCount(Integer ordererCount) {
			this.ordererCount = ordererCount;
		}

		public Integer getMemberCount() {
			return this.memberCount;
		}

		public void setMemberCount(Integer memberCount) {
			this.memberCount = memberCount;
		}

		public Integer getChannelCount() {
			return this.channelCount;
		}

		public void setChannelCount(Integer channelCount) {
			this.channelCount = channelCount;
		}

		public String getSpecName() {
			return this.specName;
		}

		public void setSpecName(String specName) {
			this.specName = specName;
		}

		public String getClusterState() {
			return this.clusterState;
		}

		public void setClusterState(String clusterState) {
			this.clusterState = clusterState;
		}

		public String getServiceState() {
			return this.serviceState;
		}

		public void setServiceState(String serviceState) {
			this.serviceState = serviceState;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public List<Organization> getOrganizations() {
			return this.organizations;
		}

		public void setOrganizations(List<Organization> organizations) {
			this.organizations = organizations;
		}

		public Specification getSpecification() {
			return this.specification;
		}

		public void setSpecification(Specification specification) {
			this.specification = specification;
		}

		public static class Organization {

			private String name;

			private String code;

			private String domain;

			private String description;

			private String clusterState;

			private String serviceState;

			private String createTime;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getCode() {
				return this.code;
			}

			public void setCode(String code) {
				this.code = code;
			}

			public String getDomain() {
				return this.domain;
			}

			public void setDomain(String domain) {
				this.domain = domain;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getClusterState() {
				return this.clusterState;
			}

			public void setClusterState(String clusterState) {
				this.clusterState = clusterState;
			}

			public String getServiceState() {
				return this.serviceState;
			}

			public void setServiceState(String serviceState) {
				this.serviceState = serviceState;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}
		}

		public static class Specification {

			private String name;

			private String title;

			private Integer numOfNodes;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getTitle() {
				return this.title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public Integer getNumOfNodes() {
				return this.numOfNodes;
			}

			public void setNumOfNodes(Integer numOfNodes) {
				this.numOfNodes = numOfNodes;
			}
		}
	}

	@Override
	public CreateEcosphereResponse getInstance(UnmarshallerContext context) {
		return	CreateEcosphereResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
