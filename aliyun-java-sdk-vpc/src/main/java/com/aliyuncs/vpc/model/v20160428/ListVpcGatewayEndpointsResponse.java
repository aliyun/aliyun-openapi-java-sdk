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
import com.aliyuncs.vpc.transform.v20160428.ListVpcGatewayEndpointsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListVpcGatewayEndpointsResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private Long totalCount;

	private Long maxResults;

	private List<Endpoint> endpoints;

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

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Long getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Long maxResults) {
		this.maxResults = maxResults;
	}

	public List<Endpoint> getEndpoints() {
		return this.endpoints;
	}

	public void setEndpoints(List<Endpoint> endpoints) {
		this.endpoints = endpoints;
	}

	public static class Endpoint {

		private String endpointId;

		private String endpointName;

		private String endpointDescription;

		private String serviceName;

		private String vpcId;

		private String policyDocument;

		private String creationTime;

		private String endpointStatus;

		private List<String> associatedRouteTables;

		public String getEndpointId() {
			return this.endpointId;
		}

		public void setEndpointId(String endpointId) {
			this.endpointId = endpointId;
		}

		public String getEndpointName() {
			return this.endpointName;
		}

		public void setEndpointName(String endpointName) {
			this.endpointName = endpointName;
		}

		public String getEndpointDescription() {
			return this.endpointDescription;
		}

		public void setEndpointDescription(String endpointDescription) {
			this.endpointDescription = endpointDescription;
		}

		public String getServiceName() {
			return this.serviceName;
		}

		public void setServiceName(String serviceName) {
			this.serviceName = serviceName;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getPolicyDocument() {
			return this.policyDocument;
		}

		public void setPolicyDocument(String policyDocument) {
			this.policyDocument = policyDocument;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getEndpointStatus() {
			return this.endpointStatus;
		}

		public void setEndpointStatus(String endpointStatus) {
			this.endpointStatus = endpointStatus;
		}

		public List<String> getAssociatedRouteTables() {
			return this.associatedRouteTables;
		}

		public void setAssociatedRouteTables(List<String> associatedRouteTables) {
			this.associatedRouteTables = associatedRouteTables;
		}
	}

	@Override
	public ListVpcGatewayEndpointsResponse getInstance(UnmarshallerContext context) {
		return	ListVpcGatewayEndpointsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
