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

package com.aliyuncs.slb.model.v20140515;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.slb.transform.v20140515.DescribeMasterSlaveVServerGroupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeMasterSlaveVServerGroupsResponse extends AcsResponse {

	private String requestId;

	private List<MasterSlaveVServerGroup> masterSlaveVServerGroups;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<MasterSlaveVServerGroup> getMasterSlaveVServerGroups() {
		return this.masterSlaveVServerGroups;
	}

	public void setMasterSlaveVServerGroups(List<MasterSlaveVServerGroup> masterSlaveVServerGroups) {
		this.masterSlaveVServerGroups = masterSlaveVServerGroups;
	}

	public static class MasterSlaveVServerGroup {

		private String masterSlaveVServerGroupId;

		private String masterSlaveVServerGroupName;

		public String getMasterSlaveVServerGroupId() {
			return this.masterSlaveVServerGroupId;
		}

		public void setMasterSlaveVServerGroupId(String masterSlaveVServerGroupId) {
			this.masterSlaveVServerGroupId = masterSlaveVServerGroupId;
		}

		public String getMasterSlaveVServerGroupName() {
			return this.masterSlaveVServerGroupName;
		}

		public void setMasterSlaveVServerGroupName(String masterSlaveVServerGroupName) {
			this.masterSlaveVServerGroupName = masterSlaveVServerGroupName;
		}
	}

	@Override
	public DescribeMasterSlaveVServerGroupsResponse getInstance(UnmarshallerContext context) {
		return	DescribeMasterSlaveVServerGroupsResponseUnmarshaller.unmarshall(this, context);
	}
}
