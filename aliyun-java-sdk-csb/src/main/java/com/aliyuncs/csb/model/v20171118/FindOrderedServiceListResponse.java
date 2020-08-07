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
import com.aliyuncs.csb.transform.v20171118.FindOrderedServiceListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class FindOrderedServiceListResponse extends AcsResponse {

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

		private Long total;

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

		public Long getTotal() {
			return this.total;
		}

		public void setTotal(Long total) {
			this.total = total;
		}

		public List<Order> getOrderList() {
			return this.orderList;
		}

		public void setOrderList(List<Order> orderList) {
			this.orderList = orderList;
		}

		public static class Order {

			private String serviceName;

			private String serviceVersion;

			private Integer orderStatus;

			private Long gmtCreate;

			private String serviceId;

			private Integer serviceStatus;

			private Long credentialGroupId;

			private Long gmtModified;

			private String projectName;

			private Long id;

			private String credentialGroupName;

			private SlaInfo slaInfo;

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

			public Integer getOrderStatus() {
				return this.orderStatus;
			}

			public void setOrderStatus(Integer orderStatus) {
				this.orderStatus = orderStatus;
			}

			public Long getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(Long gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public String getServiceId() {
				return this.serviceId;
			}

			public void setServiceId(String serviceId) {
				this.serviceId = serviceId;
			}

			public Integer getServiceStatus() {
				return this.serviceStatus;
			}

			public void setServiceStatus(Integer serviceStatus) {
				this.serviceStatus = serviceStatus;
			}

			public Long getCredentialGroupId() {
				return this.credentialGroupId;
			}

			public void setCredentialGroupId(Long credentialGroupId) {
				this.credentialGroupId = credentialGroupId;
			}

			public Long getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(Long gmtModified) {
				this.gmtModified = gmtModified;
			}

			public String getProjectName() {
				return this.projectName;
			}

			public void setProjectName(String projectName) {
				this.projectName = projectName;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getCredentialGroupName() {
				return this.credentialGroupName;
			}

			public void setCredentialGroupName(String credentialGroupName) {
				this.credentialGroupName = credentialGroupName;
			}

			public SlaInfo getSlaInfo() {
				return this.slaInfo;
			}

			public void setSlaInfo(SlaInfo slaInfo) {
				this.slaInfo = slaInfo;
			}

			public static class SlaInfo {

				private Long qps;

				private Long qph;

				public Long getQps() {
					return this.qps;
				}

				public void setQps(Long qps) {
					this.qps = qps;
				}

				public Long getQph() {
					return this.qph;
				}

				public void setQph(Long qph) {
					this.qph = qph;
				}
			}
		}
	}

	@Override
	public FindOrderedServiceListResponse getInstance(UnmarshallerContext context) {
		return	FindOrderedServiceListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
