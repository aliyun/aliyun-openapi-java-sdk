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

package com.aliyuncs.cassandra.model.v20190101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cassandra.transform.v20190101.DescribeIpWhitelistGroupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeIpWhitelistGroupsResponse extends AcsResponse {

	private String requestId;

	private List<Group> groups;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Group> getGroups() {
		return this.groups;
	}

	public void setGroups(List<Group> groups) {
		this.groups = groups;
	}

	public static class Group {

		private String groupName;

		private Integer ipVersion;

		private List<String> ipList;

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

		public Integer getIpVersion() {
			return this.ipVersion;
		}

		public void setIpVersion(Integer ipVersion) {
			this.ipVersion = ipVersion;
		}

		public List<String> getIpList() {
			return this.ipList;
		}

		public void setIpList(List<String> ipList) {
			this.ipList = ipList;
		}
	}

	@Override
	public DescribeIpWhitelistGroupsResponse getInstance(UnmarshallerContext context) {
		return	DescribeIpWhitelistGroupsResponseUnmarshaller.unmarshall(this, context);
	}
}
