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

package com.aliyuncs.emr.model.v20160408;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.ListRequiredServiceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListRequiredServiceResponse extends AcsResponse {

	private String requestId;

	private Boolean needOtherService;

	private List<Service> serviceList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getNeedOtherService() {
		return this.needOtherService;
	}

	public void setNeedOtherService(Boolean needOtherService) {
		this.needOtherService = needOtherService;
	}

	public List<Service> getServiceList() {
		return this.serviceList;
	}

	public void setServiceList(List<Service> serviceList) {
		this.serviceList = serviceList;
	}

	public static class Service {

		private String serviceName;

		private String serviceDisplayName;

		public String getServiceName() {
			return this.serviceName;
		}

		public void setServiceName(String serviceName) {
			this.serviceName = serviceName;
		}

		public String getServiceDisplayName() {
			return this.serviceDisplayName;
		}

		public void setServiceDisplayName(String serviceDisplayName) {
			this.serviceDisplayName = serviceDisplayName;
		}
	}

	@Override
	public ListRequiredServiceResponse getInstance(UnmarshallerContext context) {
		return	ListRequiredServiceResponseUnmarshaller.unmarshall(this, context);
	}
}
