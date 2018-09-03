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
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.csb.transform.v20171118.FindServiceListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class FindServiceListResponse extends AcsResponse {

	private String message;

	private Integer code;

	private String requestId;

	private Data data;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
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

		private Integer currentPage;

		private Integer pageNumber;

		private Integer total;

		private List<Service> serviceList;

		public Integer getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(Integer currentPage) {
			this.currentPage = currentPage;
		}

		public Integer getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Integer pageNumber) {
			this.pageNumber = pageNumber;
		}

		public Integer getTotal() {
			return this.total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}

		public List<Service> getServiceList() {
			return this.serviceList;
		}

		public void setServiceList(List<Service> serviceList) {
			this.serviceList = serviceList;
		}

		public static class Service {

			private String alias;

			private Boolean allVisiable;

			private Long createTime;

			private Long csbId;

			private String description;

			private Long id;

			private String interfaceName;

			private Long modifiedTime;

			private String orderInfo;

			private String ownerId;

			private String principalName;

			private Long projectId;

			private String projectName;

			private String scope;

			private String serviceName;

			private String serviceVersion;

			private Boolean skipAuth;

			private String statisticName;

			private Integer status;

			private String userId;

			private String casTargets;

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

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
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

			public Long getModifiedTime() {
				return this.modifiedTime;
			}

			public void setModifiedTime(Long modifiedTime) {
				this.modifiedTime = modifiedTime;
			}

			public String getOrderInfo() {
				return this.orderInfo;
			}

			public void setOrderInfo(String orderInfo) {
				this.orderInfo = orderInfo;
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

			public String getCasTargets() {
				return this.casTargets;
			}

			public void setCasTargets(String casTargets) {
				this.casTargets = casTargets;
			}
		}
	}

	@Override
	public FindServiceListResponse getInstance(UnmarshallerContext context) {
		return	FindServiceListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
