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

package com.aliyuncs.vpc.model.v20160428;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vpc.transform.v20160428.ListVpcEndpointServicesByEndUserResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListVpcEndpointServicesByEndUserResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private Long maxResults;

	private List<Service> services;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public Long getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Long maxResults) {
		this.maxResults = maxResults;
	}

	public List<Service> getServices() {
		return this.services;
	}

	public void setServices(List<Service> services) {
		this.services = services;
	}

	public static class Service {

		private String serviceId;

		private String serviceName;

		private String defaultPolicyDocument;

		private Boolean supportPolicy;

		private String serviceDomain;

		public String getServiceId() {
			return this.serviceId;
		}

		public void setServiceId(String serviceId) {
			this.serviceId = serviceId;
		}

		public String getServiceName() {
			return this.serviceName;
		}

		public void setServiceName(String serviceName) {
			this.serviceName = serviceName;
		}

		public String getDefaultPolicyDocument() {
			return this.defaultPolicyDocument;
		}

		public void setDefaultPolicyDocument(String defaultPolicyDocument) {
			this.defaultPolicyDocument = defaultPolicyDocument;
		}

		public Boolean getSupportPolicy() {
			return this.supportPolicy;
		}

		public void setSupportPolicy(Boolean supportPolicy) {
			this.supportPolicy = supportPolicy;
		}

		public String getServiceDomain() {
			return this.serviceDomain;
		}

		public void setServiceDomain(String serviceDomain) {
			this.serviceDomain = serviceDomain;
		}
	}

	@Override
	public ListVpcEndpointServicesByEndUserResponse getInstance(UnmarshallerContext context) {
		return	ListVpcEndpointServicesByEndUserResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
