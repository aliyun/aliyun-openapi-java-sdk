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
import com.aliyuncs.eiam.transform.v20211201.GetApplicationProvisioningScopeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetApplicationProvisioningScopeResponse extends AcsResponse {

	private String requestId;

	private ApplicationProvisioningScope applicationProvisioningScope;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ApplicationProvisioningScope getApplicationProvisioningScope() {
		return this.applicationProvisioningScope;
	}

	public void setApplicationProvisioningScope(ApplicationProvisioningScope applicationProvisioningScope) {
		this.applicationProvisioningScope = applicationProvisioningScope;
	}

	public static class ApplicationProvisioningScope {

		private List<String> organizationalUnitIds;

		public List<String> getOrganizationalUnitIds() {
			return this.organizationalUnitIds;
		}

		public void setOrganizationalUnitIds(List<String> organizationalUnitIds) {
			this.organizationalUnitIds = organizationalUnitIds;
		}
	}

	@Override
	public GetApplicationProvisioningScopeResponse getInstance(UnmarshallerContext context) {
		return	GetApplicationProvisioningScopeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
