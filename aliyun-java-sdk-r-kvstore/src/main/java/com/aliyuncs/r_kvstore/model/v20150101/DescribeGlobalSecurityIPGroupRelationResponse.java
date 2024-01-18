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

package com.aliyuncs.r_kvstore.model.v20150101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.r_kvstore.transform.v20150101.DescribeGlobalSecurityIPGroupRelationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeGlobalSecurityIPGroupRelationResponse extends AcsResponse {

	private String dBClusterId;

	private String requestId;

	private List<GlobalSecurityIPGroupRelItem> globalSecurityIPGroupRel;

	public String getDBClusterId() {
		return this.dBClusterId;
	}

	public void setDBClusterId(String dBClusterId) {
		this.dBClusterId = dBClusterId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<GlobalSecurityIPGroupRelItem> getGlobalSecurityIPGroupRel() {
		return this.globalSecurityIPGroupRel;
	}

	public void setGlobalSecurityIPGroupRel(List<GlobalSecurityIPGroupRelItem> globalSecurityIPGroupRel) {
		this.globalSecurityIPGroupRel = globalSecurityIPGroupRel;
	}

	public static class GlobalSecurityIPGroupRelItem {

		private String globalSecurityGroupId;

		private String gIpList;

		private String regionId;

		private String whitelistNetType;

		private String globalIgName;

		public String getGlobalSecurityGroupId() {
			return this.globalSecurityGroupId;
		}

		public void setGlobalSecurityGroupId(String globalSecurityGroupId) {
			this.globalSecurityGroupId = globalSecurityGroupId;
		}

		public String getGIpList() {
			return this.gIpList;
		}

		public void setGIpList(String gIpList) {
			this.gIpList = gIpList;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getWhitelistNetType() {
			return this.whitelistNetType;
		}

		public void setWhitelistNetType(String whitelistNetType) {
			this.whitelistNetType = whitelistNetType;
		}

		public String getGlobalIgName() {
			return this.globalIgName;
		}

		public void setGlobalIgName(String globalIgName) {
			this.globalIgName = globalIgName;
		}
	}

	@Override
	public DescribeGlobalSecurityIPGroupRelationResponse getInstance(UnmarshallerContext context) {
		return	DescribeGlobalSecurityIPGroupRelationResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
