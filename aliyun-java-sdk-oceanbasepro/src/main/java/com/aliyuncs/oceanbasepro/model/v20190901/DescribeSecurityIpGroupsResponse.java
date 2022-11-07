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

package com.aliyuncs.oceanbasepro.model.v20190901;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.oceanbasepro.transform.v20190901.DescribeSecurityIpGroupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSecurityIpGroupsResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private List<SecurityIpGroupsItem> securityIpGroups;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<SecurityIpGroupsItem> getSecurityIpGroups() {
		return this.securityIpGroups;
	}

	public void setSecurityIpGroups(List<SecurityIpGroupsItem> securityIpGroups) {
		this.securityIpGroups = securityIpGroups;
	}

	public static class SecurityIpGroupsItem {

		private String securityIps;

		private String securityIpGroupName;

		public String getSecurityIps() {
			return this.securityIps;
		}

		public void setSecurityIps(String securityIps) {
			this.securityIps = securityIps;
		}

		public String getSecurityIpGroupName() {
			return this.securityIpGroupName;
		}

		public void setSecurityIpGroupName(String securityIpGroupName) {
			this.securityIpGroupName = securityIpGroupName;
		}
	}

	@Override
	public DescribeSecurityIpGroupsResponse getInstance(UnmarshallerContext context) {
		return	DescribeSecurityIpGroupsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
