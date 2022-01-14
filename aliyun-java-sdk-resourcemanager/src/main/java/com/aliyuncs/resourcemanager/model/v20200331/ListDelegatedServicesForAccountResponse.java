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

package com.aliyuncs.resourcemanager.model.v20200331;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.resourcemanager.transform.v20200331.ListDelegatedServicesForAccountResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDelegatedServicesForAccountResponse extends AcsResponse {

	private String requestId;

	private List<DelegatedService> delegatedServices;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DelegatedService> getDelegatedServices() {
		return this.delegatedServices;
	}

	public void setDelegatedServices(List<DelegatedService> delegatedServices) {
		this.delegatedServices = delegatedServices;
	}

	public static class DelegatedService {

		private String delegationEnabledTime;

		private String servicePrincipal;

		public String getDelegationEnabledTime() {
			return this.delegationEnabledTime;
		}

		public void setDelegationEnabledTime(String delegationEnabledTime) {
			this.delegationEnabledTime = delegationEnabledTime;
		}

		public String getServicePrincipal() {
			return this.servicePrincipal;
		}

		public void setServicePrincipal(String servicePrincipal) {
			this.servicePrincipal = servicePrincipal;
		}
	}

	@Override
	public ListDelegatedServicesForAccountResponse getInstance(UnmarshallerContext context) {
		return	ListDelegatedServicesForAccountResponseUnmarshaller.unmarshall(this, context);
	}
}
