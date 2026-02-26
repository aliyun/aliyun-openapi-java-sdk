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
import com.aliyuncs.eiam.transform.v20211201.ListApplicationSupportedProvisionProtocolTypesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListApplicationSupportedProvisionProtocolTypesResponse extends AcsResponse {

	private String requestId;

	private ApplicationSupportedProvisionProtocolType applicationSupportedProvisionProtocolType;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ApplicationSupportedProvisionProtocolType getApplicationSupportedProvisionProtocolType() {
		return this.applicationSupportedProvisionProtocolType;
	}

	public void setApplicationSupportedProvisionProtocolType(ApplicationSupportedProvisionProtocolType applicationSupportedProvisionProtocolType) {
		this.applicationSupportedProvisionProtocolType = applicationSupportedProvisionProtocolType;
	}

	public static class ApplicationSupportedProvisionProtocolType {

		private List<String> provisionProtocolType;

		public List<String> getProvisionProtocolType() {
			return this.provisionProtocolType;
		}

		public void setProvisionProtocolType(List<String> provisionProtocolType) {
			this.provisionProtocolType = provisionProtocolType;
		}
	}

	@Override
	public ListApplicationSupportedProvisionProtocolTypesResponse getInstance(UnmarshallerContext context) {
		return	ListApplicationSupportedProvisionProtocolTypesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
