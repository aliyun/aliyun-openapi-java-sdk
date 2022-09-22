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
import com.aliyuncs.ga.transform.v20191120.ListCustomRoutingEndpointGroupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCustomRoutingEndpointGroupsResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageSize;

	private Integer pageNumber;

	private List<EndpointGroupsItem> endpointGroups;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<EndpointGroupsItem> getEndpointGroups() {
		return this.endpointGroups;
	}

	public void setEndpointGroups(List<EndpointGroupsItem> endpointGroups) {
		this.endpointGroups = endpointGroups;
	}

	public static class EndpointGroupsItem {

		private String acceleratorId;

		private String listenerId;

		private String endpointGroupId;

		private String name;

		private String description;

		private String endpointGroupRegion;

		private String state;

		private List<String> endpointGroupIpList;

		private List<String> endpointGroupUnconfirmedIpList;

		public String getAcceleratorId() {
			return this.acceleratorId;
		}

		public void setAcceleratorId(String acceleratorId) {
			this.acceleratorId = acceleratorId;
		}

		public String getListenerId() {
			return this.listenerId;
		}

		public void setListenerId(String listenerId) {
			this.listenerId = listenerId;
		}

		public String getEndpointGroupId() {
			return this.endpointGroupId;
		}

		public void setEndpointGroupId(String endpointGroupId) {
			this.endpointGroupId = endpointGroupId;
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

		public String getEndpointGroupRegion() {
			return this.endpointGroupRegion;
		}

		public void setEndpointGroupRegion(String endpointGroupRegion) {
			this.endpointGroupRegion = endpointGroupRegion;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public List<String> getEndpointGroupIpList() {
			return this.endpointGroupIpList;
		}

		public void setEndpointGroupIpList(List<String> endpointGroupIpList) {
			this.endpointGroupIpList = endpointGroupIpList;
		}

		public List<String> getEndpointGroupUnconfirmedIpList() {
			return this.endpointGroupUnconfirmedIpList;
		}

		public void setEndpointGroupUnconfirmedIpList(List<String> endpointGroupUnconfirmedIpList) {
			this.endpointGroupUnconfirmedIpList = endpointGroupUnconfirmedIpList;
		}
	}

	@Override
	public ListCustomRoutingEndpointGroupsResponse getInstance(UnmarshallerContext context) {
		return	ListCustomRoutingEndpointGroupsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
