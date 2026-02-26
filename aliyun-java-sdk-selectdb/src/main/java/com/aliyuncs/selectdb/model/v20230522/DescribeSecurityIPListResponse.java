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

package com.aliyuncs.selectdb.model.v20230522;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.selectdb.transform.v20230522.DescribeSecurityIPListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSecurityIPListResponse extends AcsResponse {

	private String requestId;

	private String dBInstanceName;

	private List<GroupItemsItem> groupItems;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDBInstanceName() {
		return this.dBInstanceName;
	}

	public void setDBInstanceName(String dBInstanceName) {
		this.dBInstanceName = dBInstanceName;
	}

	public List<GroupItemsItem> getGroupItems() {
		return this.groupItems;
	}

	public void setGroupItems(List<GroupItemsItem> groupItems) {
		this.groupItems = groupItems;
	}

	public static class GroupItemsItem {

		private String groupName;

		private String aecurityIPType;

		private String groupTag;

		private String securityIPList;

		private String whitelistNetType;

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

		public String getAecurityIPType() {
			return this.aecurityIPType;
		}

		public void setAecurityIPType(String aecurityIPType) {
			this.aecurityIPType = aecurityIPType;
		}

		public String getGroupTag() {
			return this.groupTag;
		}

		public void setGroupTag(String groupTag) {
			this.groupTag = groupTag;
		}

		public String getSecurityIPList() {
			return this.securityIPList;
		}

		public void setSecurityIPList(String securityIPList) {
			this.securityIPList = securityIPList;
		}

		public String getWhitelistNetType() {
			return this.whitelistNetType;
		}

		public void setWhitelistNetType(String whitelistNetType) {
			this.whitelistNetType = whitelistNetType;
		}
	}

	@Override
	public DescribeSecurityIPListResponse getInstance(UnmarshallerContext context) {
		return	DescribeSecurityIPListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
