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

package com.aliyuncs.hitsdb.model.v20200615;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.hitsdb.transform.v20200615.GetInstanceIpWhiteListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetInstanceIpWhiteListResponse extends AcsResponse {

	private String instanceId;

	private String requestId;

	private List<GroupListItem> groupList;

	private List<String> ipList;

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<GroupListItem> getGroupList() {
		return this.groupList;
	}

	public void setGroupList(List<GroupListItem> groupList) {
		this.groupList = groupList;
	}

	public List<String> getIpList() {
		return this.ipList;
	}

	public void setIpList(List<String> ipList) {
		this.ipList = ipList;
	}

	public static class GroupListItem {

		private String groupName;

		private String securityIpList;

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

		public String getSecurityIpList() {
			return this.securityIpList;
		}

		public void setSecurityIpList(String securityIpList) {
			this.securityIpList = securityIpList;
		}
	}

	@Override
	public GetInstanceIpWhiteListResponse getInstance(UnmarshallerContext context) {
		return	GetInstanceIpWhiteListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
