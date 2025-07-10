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

package com.aliyuncs.gpdb.model.v20160503;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.gpdb.transform.v20160503.ListStreamingDataServicesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListStreamingDataServicesResponse extends AcsResponse {

	private String requestId;

	private Integer totalRecordCount;

	private List<Items> serviceItems;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalRecordCount() {
		return this.totalRecordCount;
	}

	public void setTotalRecordCount(Integer totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

	public List<Items> getServiceItems() {
		return this.serviceItems;
	}

	public void setServiceItems(List<Items> serviceItems) {
		this.serviceItems = serviceItems;
	}

	public static class Items {

		private String serviceId;

		private String serviceType;

		private String serviceName;

		private String serviceDescription;

		private String serviceSpec;

		private String status;

		private String serviceIp;

		private String servicePort;

		private String createTime;

		private String modifyTime;

		private Boolean serviceManaged;

		private String serviceOwnerId;

		public String getServiceId() {
			return this.serviceId;
		}

		public void setServiceId(String serviceId) {
			this.serviceId = serviceId;
		}

		public String getServiceType() {
			return this.serviceType;
		}

		public void setServiceType(String serviceType) {
			this.serviceType = serviceType;
		}

		public String getServiceName() {
			return this.serviceName;
		}

		public void setServiceName(String serviceName) {
			this.serviceName = serviceName;
		}

		public String getServiceDescription() {
			return this.serviceDescription;
		}

		public void setServiceDescription(String serviceDescription) {
			this.serviceDescription = serviceDescription;
		}

		public String getServiceSpec() {
			return this.serviceSpec;
		}

		public void setServiceSpec(String serviceSpec) {
			this.serviceSpec = serviceSpec;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getServiceIp() {
			return this.serviceIp;
		}

		public void setServiceIp(String serviceIp) {
			this.serviceIp = serviceIp;
		}

		public String getServicePort() {
			return this.servicePort;
		}

		public void setServicePort(String servicePort) {
			this.servicePort = servicePort;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(String modifyTime) {
			this.modifyTime = modifyTime;
		}

		public Boolean getServiceManaged() {
			return this.serviceManaged;
		}

		public void setServiceManaged(Boolean serviceManaged) {
			this.serviceManaged = serviceManaged;
		}

		public String getServiceOwnerId() {
			return this.serviceOwnerId;
		}

		public void setServiceOwnerId(String serviceOwnerId) {
			this.serviceOwnerId = serviceOwnerId;
		}
	}

	@Override
	public ListStreamingDataServicesResponse getInstance(UnmarshallerContext context) {
		return	ListStreamingDataServicesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
