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

package com.aliyuncs.petadata.model.v20160101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.petadata.transform.v20160101.DescribeSecurityIPsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSecurityIPsResponse extends AcsResponse {

	private String requestId;

	private String instanceId;

	private String securityIPList;

	private List<SecurityIpGroup> securityIPs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getSecurityIPList() {
		return this.securityIPList;
	}

	public void setSecurityIPList(String securityIPList) {
		this.securityIPList = securityIPList;
	}

	public List<SecurityIpGroup> getSecurityIPs() {
		return this.securityIPs;
	}

	public void setSecurityIPs(List<SecurityIpGroup> securityIPs) {
		this.securityIPs = securityIPs;
	}

	public static class SecurityIpGroup {

		private String securityIPListName;

		private String securityIPListAttribute;

		private String securityIPList;

		public String getSecurityIPListName() {
			return this.securityIPListName;
		}

		public void setSecurityIPListName(String securityIPListName) {
			this.securityIPListName = securityIPListName;
		}

		public String getSecurityIPListAttribute() {
			return this.securityIPListAttribute;
		}

		public void setSecurityIPListAttribute(String securityIPListAttribute) {
			this.securityIPListAttribute = securityIPListAttribute;
		}

		public String getSecurityIPList() {
			return this.securityIPList;
		}

		public void setSecurityIPList(String securityIPList) {
			this.securityIPList = securityIPList;
		}
	}

	@Override
	public DescribeSecurityIPsResponse getInstance(UnmarshallerContext context) {
		return	DescribeSecurityIPsResponseUnmarshaller.unmarshall(this, context);
	}
}
