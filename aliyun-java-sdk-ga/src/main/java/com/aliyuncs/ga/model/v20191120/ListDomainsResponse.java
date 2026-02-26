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

package com.aliyuncs.ga.model.v20191120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ga.transform.v20191120.ListDomainsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDomainsResponse extends AcsResponse {

	private Integer totalCount;

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private List<DomainsItem> domains;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<DomainsItem> getDomains() {
		return this.domains;
	}

	public void setDomains(List<DomainsItem> domains) {
		this.domains = domains;
	}

	public static class DomainsItem {

		private String domain;

		private String state;

		private List<AcceleratorsItem> accelerators;

		public String getDomain() {
			return this.domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public List<AcceleratorsItem> getAccelerators() {
			return this.accelerators;
		}

		public void setAccelerators(List<AcceleratorsItem> accelerators) {
			this.accelerators = accelerators;
		}

		public static class AcceleratorsItem {

			private String acceleratorId;

			private String name;

			private String serviceId;

			private Boolean serviceManaged;

			private List<ServiceManagedInfosItem> serviceManagedInfos;

			public String getAcceleratorId() {
				return this.acceleratorId;
			}

			public void setAcceleratorId(String acceleratorId) {
				this.acceleratorId = acceleratorId;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getServiceId() {
				return this.serviceId;
			}

			public void setServiceId(String serviceId) {
				this.serviceId = serviceId;
			}

			public Boolean getServiceManaged() {
				return this.serviceManaged;
			}

			public void setServiceManaged(Boolean serviceManaged) {
				this.serviceManaged = serviceManaged;
			}

			public List<ServiceManagedInfosItem> getServiceManagedInfos() {
				return this.serviceManagedInfos;
			}

			public void setServiceManagedInfos(List<ServiceManagedInfosItem> serviceManagedInfos) {
				this.serviceManagedInfos = serviceManagedInfos;
			}

			public static class ServiceManagedInfosItem {

				private String action;

				private String childType;

				private Boolean isManaged;

				public String getAction() {
					return this.action;
				}

				public void setAction(String action) {
					this.action = action;
				}

				public String getChildType() {
					return this.childType;
				}

				public void setChildType(String childType) {
					this.childType = childType;
				}

				public Boolean getIsManaged() {
					return this.isManaged;
				}

				public void setIsManaged(Boolean isManaged) {
					this.isManaged = isManaged;
				}
			}
		}
	}

	@Override
	public ListDomainsResponse getInstance(UnmarshallerContext context) {
		return	ListDomainsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
