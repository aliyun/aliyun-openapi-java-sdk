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

package com.aliyuncs.csb.model.v20171118;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.csb.transform.v20171118.GetOrderResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetOrderResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Order order;

		public Order getOrder() {
			return this.order;
		}

		public void setOrder(Order order) {
			this.order = order;
		}

		public static class Order {

			private String alias;

			private Long credentialGroupId;

			private Long csbId;

			private String dauthGroupName;

			private Long gmtCreate;

			private Long gmtModified;

			private String groupName;

			private Long id;

			private String projectName;

			private Long serviceId;

			private String serviceName;

			private Integer serviceStatus;

			private String serviceVersion;

			private String statisticName;

			private Integer status;

			private String strictWhiteListJson;

			private String userId;

			private List<ErrorTypeCatagory> errorTypeCatagoryList;

			private List<String> strictWhiteList;

			private Service service;

			private SlaInfo slaInfo;

			private Total total;

			public String getAlias() {
				return this.alias;
			}

			public void setAlias(String alias) {
				this.alias = alias;
			}

			public Long getCredentialGroupId() {
				return this.credentialGroupId;
			}

			public void setCredentialGroupId(Long credentialGroupId) {
				this.credentialGroupId = credentialGroupId;
			}

			public Long getCsbId() {
				return this.csbId;
			}

			public void setCsbId(Long csbId) {
				this.csbId = csbId;
			}

			public String getDauthGroupName() {
				return this.dauthGroupName;
			}

			public void setDauthGroupName(String dauthGroupName) {
				this.dauthGroupName = dauthGroupName;
			}

			public Long getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(Long gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public Long getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(Long gmtModified) {
				this.gmtModified = gmtModified;
			}

			public String getGroupName() {
				return this.groupName;
			}

			public void setGroupName(String groupName) {
				this.groupName = groupName;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getProjectName() {
				return this.projectName;
			}

			public void setProjectName(String projectName) {
				this.projectName = projectName;
			}

			public Long getServiceId() {
				return this.serviceId;
			}

			public void setServiceId(Long serviceId) {
				this.serviceId = serviceId;
			}

			public String getServiceName() {
				return this.serviceName;
			}

			public void setServiceName(String serviceName) {
				this.serviceName = serviceName;
			}

			public Integer getServiceStatus() {
				return this.serviceStatus;
			}

			public void setServiceStatus(Integer serviceStatus) {
				this.serviceStatus = serviceStatus;
			}

			public String getServiceVersion() {
				return this.serviceVersion;
			}

			public void setServiceVersion(String serviceVersion) {
				this.serviceVersion = serviceVersion;
			}

			public String getStatisticName() {
				return this.statisticName;
			}

			public void setStatisticName(String statisticName) {
				this.statisticName = statisticName;
			}

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public String getStrictWhiteListJson() {
				return this.strictWhiteListJson;
			}

			public void setStrictWhiteListJson(String strictWhiteListJson) {
				this.strictWhiteListJson = strictWhiteListJson;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public List<ErrorTypeCatagory> getErrorTypeCatagoryList() {
				return this.errorTypeCatagoryList;
			}

			public void setErrorTypeCatagoryList(List<ErrorTypeCatagory> errorTypeCatagoryList) {
				this.errorTypeCatagoryList = errorTypeCatagoryList;
			}

			public List<String> getStrictWhiteList() {
				return this.strictWhiteList;
			}

			public void setStrictWhiteList(List<String> strictWhiteList) {
				this.strictWhiteList = strictWhiteList;
			}

			public Service getService() {
				return this.service;
			}

			public void setService(Service service) {
				this.service = service;
			}

			public SlaInfo getSlaInfo() {
				return this.slaInfo;
			}

			public void setSlaInfo(SlaInfo slaInfo) {
				this.slaInfo = slaInfo;
			}

			public Total getTotal() {
				return this.total;
			}

			public void setTotal(Total total) {
				this.total = total;
			}

			public static class ErrorTypeCatagory {

				private Integer total;

				private Integer errorNum;

				private String name;

				public Integer getTotal() {
					return this.total;
				}

				public void setTotal(Integer total) {
					this.total = total;
				}

				public Integer getErrorNum() {
					return this.errorNum;
				}

				public void setErrorNum(Integer errorNum) {
					this.errorNum = errorNum;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}
			}

			public static class Service {

				private String accessParamsJSON;

				private Boolean active;

				private String alias;

				private Boolean allVisiable;

				private String consumeTypesJSON;

				private Long createTime;

				private Long csbId;

				private String errDefJSON;

				private Long id;

				private String interfaceName;

				private String oldVersion;

				private Boolean ottFlag;

				private String ownerId;

				private String principalName;

				private String projectId;

				private String projectName;

				private String provideType;

				private Boolean sSL;

				private String scope;

				private String serviceName;

				private String serviceProviderType;

				private String serviceVersion;

				private Boolean skipAuth;

				private String statisticName;

				private Integer status;

				private Long userId;

				private Boolean validConsumeTypes;

				private Boolean validProvideType;

				public String getAccessParamsJSON() {
					return this.accessParamsJSON;
				}

				public void setAccessParamsJSON(String accessParamsJSON) {
					this.accessParamsJSON = accessParamsJSON;
				}

				public Boolean getActive() {
					return this.active;
				}

				public void setActive(Boolean active) {
					this.active = active;
				}

				public String getAlias() {
					return this.alias;
				}

				public void setAlias(String alias) {
					this.alias = alias;
				}

				public Boolean getAllVisiable() {
					return this.allVisiable;
				}

				public void setAllVisiable(Boolean allVisiable) {
					this.allVisiable = allVisiable;
				}

				public String getConsumeTypesJSON() {
					return this.consumeTypesJSON;
				}

				public void setConsumeTypesJSON(String consumeTypesJSON) {
					this.consumeTypesJSON = consumeTypesJSON;
				}

				public Long getCreateTime() {
					return this.createTime;
				}

				public void setCreateTime(Long createTime) {
					this.createTime = createTime;
				}

				public Long getCsbId() {
					return this.csbId;
				}

				public void setCsbId(Long csbId) {
					this.csbId = csbId;
				}

				public String getErrDefJSON() {
					return this.errDefJSON;
				}

				public void setErrDefJSON(String errDefJSON) {
					this.errDefJSON = errDefJSON;
				}

				public Long getId() {
					return this.id;
				}

				public void setId(Long id) {
					this.id = id;
				}

				public String getInterfaceName() {
					return this.interfaceName;
				}

				public void setInterfaceName(String interfaceName) {
					this.interfaceName = interfaceName;
				}

				public String getOldVersion() {
					return this.oldVersion;
				}

				public void setOldVersion(String oldVersion) {
					this.oldVersion = oldVersion;
				}

				public Boolean getOttFlag() {
					return this.ottFlag;
				}

				public void setOttFlag(Boolean ottFlag) {
					this.ottFlag = ottFlag;
				}

				public String getOwnerId() {
					return this.ownerId;
				}

				public void setOwnerId(String ownerId) {
					this.ownerId = ownerId;
				}

				public String getPrincipalName() {
					return this.principalName;
				}

				public void setPrincipalName(String principalName) {
					this.principalName = principalName;
				}

				public String getProjectId() {
					return this.projectId;
				}

				public void setProjectId(String projectId) {
					this.projectId = projectId;
				}

				public String getProjectName() {
					return this.projectName;
				}

				public void setProjectName(String projectName) {
					this.projectName = projectName;
				}

				public String getProvideType() {
					return this.provideType;
				}

				public void setProvideType(String provideType) {
					this.provideType = provideType;
				}

				public Boolean getSSL() {
					return this.sSL;
				}

				public void setSSL(Boolean sSL) {
					this.sSL = sSL;
				}

				public String getScope() {
					return this.scope;
				}

				public void setScope(String scope) {
					this.scope = scope;
				}

				public String getServiceName() {
					return this.serviceName;
				}

				public void setServiceName(String serviceName) {
					this.serviceName = serviceName;
				}

				public String getServiceProviderType() {
					return this.serviceProviderType;
				}

				public void setServiceProviderType(String serviceProviderType) {
					this.serviceProviderType = serviceProviderType;
				}

				public String getServiceVersion() {
					return this.serviceVersion;
				}

				public void setServiceVersion(String serviceVersion) {
					this.serviceVersion = serviceVersion;
				}

				public Boolean getSkipAuth() {
					return this.skipAuth;
				}

				public void setSkipAuth(Boolean skipAuth) {
					this.skipAuth = skipAuth;
				}

				public String getStatisticName() {
					return this.statisticName;
				}

				public void setStatisticName(String statisticName) {
					this.statisticName = statisticName;
				}

				public Integer getStatus() {
					return this.status;
				}

				public void setStatus(Integer status) {
					this.status = status;
				}

				public Long getUserId() {
					return this.userId;
				}

				public void setUserId(Long userId) {
					this.userId = userId;
				}

				public Boolean getValidConsumeTypes() {
					return this.validConsumeTypes;
				}

				public void setValidConsumeTypes(Boolean validConsumeTypes) {
					this.validConsumeTypes = validConsumeTypes;
				}

				public Boolean getValidProvideType() {
					return this.validProvideType;
				}

				public void setValidProvideType(Boolean validProvideType) {
					this.validProvideType = validProvideType;
				}
			}

			public static class SlaInfo {

				private String qph;

				private String qps;

				public String getQph() {
					return this.qph;
				}

				public void setQph(String qph) {
					this.qph = qph;
				}

				public String getQps() {
					return this.qps;
				}

				public void setQps(String qps) {
					this.qps = qps;
				}
			}

			public static class Total {

				private Integer errorNum;

				private Integer total;

				public Integer getErrorNum() {
					return this.errorNum;
				}

				public void setErrorNum(Integer errorNum) {
					this.errorNum = errorNum;
				}

				public Integer getTotal() {
					return this.total;
				}

				public void setTotal(Integer total) {
					this.total = total;
				}
			}
		}
	}

	@Override
	public GetOrderResponse getInstance(UnmarshallerContext context) {
		return	GetOrderResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
