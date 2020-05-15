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
import com.aliyuncs.csb.transform.v20171118.GetServiceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetServiceResponse extends AcsResponse {

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

		private Service service;

		public Service getService() {
			return this.service;
		}

		public void setService(Service service) {
			this.service = service;
		}

		public static class Service {

			private String accessParamsJSON;

			private Boolean active;

			private String alias;

			private Boolean allVisiable;

			private String approveUserId;

			private String casTargets;

			private String consumeTypesJSON;

			private Long createTime;

			private Long csbId;

			private String errDefJSON;

			private Long id;

			private String interfaceName;

			private String ipBlackStr;

			private String ipWhiteStr;

			private String modelVersion;

			private Long modifiedTime;

			private String oldVersion;

			private String openRestfulPath;

			private Boolean ottFlag;

			private String ownerId;

			private String policyHandler;

			private String principalName;

			private Long projectId;

			private String projectName;

			private String provideType;

			private String routeConfJson;

			private Boolean sSL;

			private String scope;

			private String serviceName;

			private String serviceOpenRestfulPath;

			private String serviceProviderType;

			private String serviceVersion;

			private Boolean skipAuth;

			private String statisticName;

			private Integer status;

			private String userId;

			private Boolean validConsumeTypes;

			private Boolean validProvideType;

			private List<ServiceVersion> serviceVersionsList;

			private List<VisiableGroup> visiableGroupList;

			private List<String> casServTargets;

			private List<String> consumeTypes;

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

			public String getApproveUserId() {
				return this.approveUserId;
			}

			public void setApproveUserId(String approveUserId) {
				this.approveUserId = approveUserId;
			}

			public String getCasTargets() {
				return this.casTargets;
			}

			public void setCasTargets(String casTargets) {
				this.casTargets = casTargets;
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

			public String getIpBlackStr() {
				return this.ipBlackStr;
			}

			public void setIpBlackStr(String ipBlackStr) {
				this.ipBlackStr = ipBlackStr;
			}

			public String getIpWhiteStr() {
				return this.ipWhiteStr;
			}

			public void setIpWhiteStr(String ipWhiteStr) {
				this.ipWhiteStr = ipWhiteStr;
			}

			public String getModelVersion() {
				return this.modelVersion;
			}

			public void setModelVersion(String modelVersion) {
				this.modelVersion = modelVersion;
			}

			public Long getModifiedTime() {
				return this.modifiedTime;
			}

			public void setModifiedTime(Long modifiedTime) {
				this.modifiedTime = modifiedTime;
			}

			public String getOldVersion() {
				return this.oldVersion;
			}

			public void setOldVersion(String oldVersion) {
				this.oldVersion = oldVersion;
			}

			public String getOpenRestfulPath() {
				return this.openRestfulPath;
			}

			public void setOpenRestfulPath(String openRestfulPath) {
				this.openRestfulPath = openRestfulPath;
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

			public String getPolicyHandler() {
				return this.policyHandler;
			}

			public void setPolicyHandler(String policyHandler) {
				this.policyHandler = policyHandler;
			}

			public String getPrincipalName() {
				return this.principalName;
			}

			public void setPrincipalName(String principalName) {
				this.principalName = principalName;
			}

			public Long getProjectId() {
				return this.projectId;
			}

			public void setProjectId(Long projectId) {
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

			public String getRouteConfJson() {
				return this.routeConfJson;
			}

			public void setRouteConfJson(String routeConfJson) {
				this.routeConfJson = routeConfJson;
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

			public String getServiceOpenRestfulPath() {
				return this.serviceOpenRestfulPath;
			}

			public void setServiceOpenRestfulPath(String serviceOpenRestfulPath) {
				this.serviceOpenRestfulPath = serviceOpenRestfulPath;
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

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
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

			public List<ServiceVersion> getServiceVersionsList() {
				return this.serviceVersionsList;
			}

			public void setServiceVersionsList(List<ServiceVersion> serviceVersionsList) {
				this.serviceVersionsList = serviceVersionsList;
			}

			public List<VisiableGroup> getVisiableGroupList() {
				return this.visiableGroupList;
			}

			public void setVisiableGroupList(List<VisiableGroup> visiableGroupList) {
				this.visiableGroupList = visiableGroupList;
			}

			public List<String> getCasServTargets() {
				return this.casServTargets;
			}

			public void setCasServTargets(List<String> casServTargets) {
				this.casServTargets = casServTargets;
			}

			public List<String> getConsumeTypes() {
				return this.consumeTypes;
			}

			public void setConsumeTypes(List<String> consumeTypes) {
				this.consumeTypes = consumeTypes;
			}

			public static class ServiceVersion {

				private Boolean active;

				private Boolean allVisiable;

				private Long id;

				private String oldVersion;

				private Boolean ottFlag;

				private Boolean sSL;

				private String scope;

				private String serviceVersion;

				private Boolean skipAuth;

				private String statisticName;

				private Integer status;

				private Boolean validConsumeTypes;

				private Boolean validProvideType;

				public Boolean getActive() {
					return this.active;
				}

				public void setActive(Boolean active) {
					this.active = active;
				}

				public Boolean getAllVisiable() {
					return this.allVisiable;
				}

				public void setAllVisiable(Boolean allVisiable) {
					this.allVisiable = allVisiable;
				}

				public Long getId() {
					return this.id;
				}

				public void setId(Long id) {
					this.id = id;
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

			public static class VisiableGroup {

				private Long id;

				private Long groupId;

				private String userId;

				private Long serviceId;

				private Long createTime;

				private Long modifiedTime;

				private Integer status;

				public Long getId() {
					return this.id;
				}

				public void setId(Long id) {
					this.id = id;
				}

				public Long getGroupId() {
					return this.groupId;
				}

				public void setGroupId(Long groupId) {
					this.groupId = groupId;
				}

				public String getUserId() {
					return this.userId;
				}

				public void setUserId(String userId) {
					this.userId = userId;
				}

				public Long getServiceId() {
					return this.serviceId;
				}

				public void setServiceId(Long serviceId) {
					this.serviceId = serviceId;
				}

				public Long getCreateTime() {
					return this.createTime;
				}

				public void setCreateTime(Long createTime) {
					this.createTime = createTime;
				}

				public Long getModifiedTime() {
					return this.modifiedTime;
				}

				public void setModifiedTime(Long modifiedTime) {
					this.modifiedTime = modifiedTime;
				}

				public Integer getStatus() {
					return this.status;
				}

				public void setStatus(Integer status) {
					this.status = status;
				}
			}
		}
	}

	@Override
	public GetServiceResponse getInstance(UnmarshallerContext context) {
		return	GetServiceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
