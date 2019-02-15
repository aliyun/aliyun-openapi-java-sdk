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

package com.aliyuncs.dds.model.v20151201;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dds.transform.v20151201.SampleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SampleResponse extends AcsResponse {

	private String requestId;

	private String securityIps;

	private List<SecurityIpGroup> securityIpGroups;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSecurityIps() {
		return this.securityIps;
	}

	public void setSecurityIps(String securityIps) {
		this.securityIps = securityIps;
	}

	public List<SecurityIpGroup> getSecurityIpGroups() {
		return this.securityIpGroups;
	}

	public void setSecurityIpGroups(List<SecurityIpGroup> securityIpGroups) {
		this.securityIpGroups = securityIpGroups;
	}

	public static class SecurityIpGroup {

		private String securityIpGroupName;

		private String securityIpGroupAttribute;

		private String securityIpList;

		public String getSecurityIpGroupName() {
			return this.securityIpGroupName;
		}

		public void setSecurityIpGroupName(String securityIpGroupName) {
			this.securityIpGroupName = securityIpGroupName;
		}

		public String getSecurityIpGroupAttribute() {
			return this.securityIpGroupAttribute;
		}

		public void setSecurityIpGroupAttribute(String securityIpGroupAttribute) {
			this.securityIpGroupAttribute = securityIpGroupAttribute;
		}

		public String getSecurityIpList() {
			return this.securityIpList;
		}

		public void setSecurityIpList(String securityIpList) {
			this.securityIpList = securityIpList;
		}
	}

	@Override
	public SampleResponse getInstance(UnmarshallerContext context) {
		return	SampleResponseUnmarshaller.unmarshall(this, context);
	}
}
