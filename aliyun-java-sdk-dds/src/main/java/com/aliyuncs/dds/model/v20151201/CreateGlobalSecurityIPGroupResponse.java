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
import com.aliyuncs.dds.transform.v20151201.CreateGlobalSecurityIPGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateGlobalSecurityIPGroupResponse extends AcsResponse {

	private String requestId;

	private List<GlobalSecurityIPGroupItem> globalSecurityIPGroup;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<GlobalSecurityIPGroupItem> getGlobalSecurityIPGroup() {
		return this.globalSecurityIPGroup;
	}

	public void setGlobalSecurityIPGroup(List<GlobalSecurityIPGroupItem> globalSecurityIPGroup) {
		this.globalSecurityIPGroup = globalSecurityIPGroup;
	}

	public static class GlobalSecurityIPGroupItem {

		private String globalSecurityGroupId;

		private String globalIgName;

		private String securityIPType;

		private String gIpList;

		private String whitelistNetType;

		private String regionId;

		public String getGlobalSecurityGroupId() {
			return this.globalSecurityGroupId;
		}

		public void setGlobalSecurityGroupId(String globalSecurityGroupId) {
			this.globalSecurityGroupId = globalSecurityGroupId;
		}

		public String getGlobalIgName() {
			return this.globalIgName;
		}

		public void setGlobalIgName(String globalIgName) {
			this.globalIgName = globalIgName;
		}

		public String getSecurityIPType() {
			return this.securityIPType;
		}

		public void setSecurityIPType(String securityIPType) {
			this.securityIPType = securityIPType;
		}

		public String getGIpList() {
			return this.gIpList;
		}

		public void setGIpList(String gIpList) {
			this.gIpList = gIpList;
		}

		public String getWhitelistNetType() {
			return this.whitelistNetType;
		}

		public void setWhitelistNetType(String whitelistNetType) {
			this.whitelistNetType = whitelistNetType;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}
	}

	@Override
	public CreateGlobalSecurityIPGroupResponse getInstance(UnmarshallerContext context) {
		return	CreateGlobalSecurityIPGroupResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
