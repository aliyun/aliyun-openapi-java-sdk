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

package com.aliyuncs.mse.model.v20190531;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mse.transform.v20190531.ListGatewayServiceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListGatewayServiceResponse extends AcsResponse {

	private String requestId;

	private Integer httpStatusCode;

	private String message;

	private Integer code;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long totalSize;

		private Integer pageNumber;

		private Integer pageSize;

		private List<Services> result;

		public Long getTotalSize() {
			return this.totalSize;
		}

		public void setTotalSize(Long totalSize) {
			this.totalSize = totalSize;
		}

		public Integer getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Integer pageNumber) {
			this.pageNumber = pageNumber;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public List<Services> getResult() {
			return this.result;
		}

		public void setResult(List<Services> result) {
			this.result = result;
		}

		public static class Services {

			private Long id;

			private String name;

			private String gatewayUniqueId;

			private Long gatewayId;

			private String sourceType;

			private String namespace;

			private String groupName;

			private Long sourceId;

			private String serviceNameInRegistry;

			private String metaInfo;

			private String gmtCreate;

			private String gmtModified;

			private String serviceProtocol;

			private Long servicePort;

			private String healehStatus;

			private List<VersionsItem> versions;

			private List<String> ips;

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

			public String getGatewayUniqueId() {
				return this.gatewayUniqueId;
			}

			public void setGatewayUniqueId(String gatewayUniqueId) {
				this.gatewayUniqueId = gatewayUniqueId;
			}

			public Long getGatewayId() {
				return this.gatewayId;
			}

			public void setGatewayId(Long gatewayId) {
				this.gatewayId = gatewayId;
			}

			public String getSourceType() {
				return this.sourceType;
			}

			public void setSourceType(String sourceType) {
				this.sourceType = sourceType;
			}

			public String getNamespace() {
				return this.namespace;
			}

			public void setNamespace(String namespace) {
				this.namespace = namespace;
			}

			public String getGroupName() {
				return this.groupName;
			}

			public void setGroupName(String groupName) {
				this.groupName = groupName;
			}

			public Long getSourceId() {
				return this.sourceId;
			}

			public void setSourceId(Long sourceId) {
				this.sourceId = sourceId;
			}

			public String getServiceNameInRegistry() {
				return this.serviceNameInRegistry;
			}

			public void setServiceNameInRegistry(String serviceNameInRegistry) {
				this.serviceNameInRegistry = serviceNameInRegistry;
			}

			public String getMetaInfo() {
				return this.metaInfo;
			}

			public void setMetaInfo(String metaInfo) {
				this.metaInfo = metaInfo;
			}

			public String getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(String gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public String getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(String gmtModified) {
				this.gmtModified = gmtModified;
			}

			public String getServiceProtocol() {
				return this.serviceProtocol;
			}

			public void setServiceProtocol(String serviceProtocol) {
				this.serviceProtocol = serviceProtocol;
			}

			public Long getServicePort() {
				return this.servicePort;
			}

			public void setServicePort(Long servicePort) {
				this.servicePort = servicePort;
			}

			public String getHealehStatus() {
				return this.healehStatus;
			}

			public void setHealehStatus(String healehStatus) {
				this.healehStatus = healehStatus;
			}

			public List<VersionsItem> getVersions() {
				return this.versions;
			}

			public void setVersions(List<VersionsItem> versions) {
				this.versions = versions;
			}

			public List<String> getIps() {
				return this.ips;
			}

			public void setIps(List<String> ips) {
				this.ips = ips;
			}

			public static class VersionsItem {

				private String name;

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}
			}
		}
	}

	@Override
	public ListGatewayServiceResponse getInstance(UnmarshallerContext context) {
		return	ListGatewayServiceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
