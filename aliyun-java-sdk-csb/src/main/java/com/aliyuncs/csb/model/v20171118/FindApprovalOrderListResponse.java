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
import com.aliyuncs.csb.transform.v20171118.FindApprovalOrderListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class FindApprovalOrderListResponse extends AcsResponse {

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

		private Integer currentPage;

		private Integer pageNumber;

		private List<Order> orderList;

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

		public List<Order> getOrderList() {
			return this.orderList;
		}

		public void setOrderList(List<Order> orderList) {
			this.orderList = orderList;
		}

		public static class Order {

			private String alias;

			private Long credentialGroupId;

			private Long csbId;

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

			private String userName;

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

			public String getUserName() {
				return this.userName;
			}

			public void setUserName(String userName) {
				this.userName = userName;
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

			public static class SlaInfo {

				private Integer qph;

				private Integer qps;

				public Integer getQph() {
					return this.qph;
				}

				public void setQph(Integer qph) {
					this.qph = qph;
				}

				public Integer getQps() {
					return this.qps;
				}

				public void setQps(Integer qps) {
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
	public FindApprovalOrderListResponse getInstance(UnmarshallerContext context) {
		return	FindApprovalOrderListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
