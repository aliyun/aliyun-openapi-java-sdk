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

package com.aliyuncs.eiam.model.v20211201;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eiam.transform.v20211201.ListIdentityProvidersForNetworkAccessEndpointResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListIdentityProvidersForNetworkAccessEndpointResponse extends AcsResponse {

	private String requestId;

	private Long totalCount;

	private String nextToken;

	private List<IdentityProviderForNetworkAccessEndpoint> identityProvidersForNetworkAccessEndpoint;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<IdentityProviderForNetworkAccessEndpoint> getIdentityProvidersForNetworkAccessEndpoint() {
		return this.identityProvidersForNetworkAccessEndpoint;
	}

	public void setIdentityProvidersForNetworkAccessEndpoint(List<IdentityProviderForNetworkAccessEndpoint> identityProvidersForNetworkAccessEndpoint) {
		this.identityProvidersForNetworkAccessEndpoint = identityProvidersForNetworkAccessEndpoint;
	}

	public static class IdentityProviderForNetworkAccessEndpoint {

		private String instanceId;

		private String identityProviderId;

		private String identityProviderName;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getIdentityProviderId() {
			return this.identityProviderId;
		}

		public void setIdentityProviderId(String identityProviderId) {
			this.identityProviderId = identityProviderId;
		}

		public String getIdentityProviderName() {
			return this.identityProviderName;
		}

		public void setIdentityProviderName(String identityProviderName) {
			this.identityProviderName = identityProviderName;
		}
	}

	@Override
	public ListIdentityProvidersForNetworkAccessEndpointResponse getInstance(UnmarshallerContext context) {
		return	ListIdentityProvidersForNetworkAccessEndpointResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
