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

package com.aliyuncs.ecd.model.v20200930;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecd.transform.v20200930.DescribeUserConnectTimeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeUserConnectTimeResponse extends AcsResponse {

	private String requestId;

	private Integer count;

	private String nextToken;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String oversoldGroupId;

		private String userGroupId;

		private String endUserId;

		private String userDesktopId;

		private String startConnectTime;

		private String endConnectTime;

		public String getOversoldGroupId() {
			return this.oversoldGroupId;
		}

		public void setOversoldGroupId(String oversoldGroupId) {
			this.oversoldGroupId = oversoldGroupId;
		}

		public String getUserGroupId() {
			return this.userGroupId;
		}

		public void setUserGroupId(String userGroupId) {
			this.userGroupId = userGroupId;
		}

		public String getEndUserId() {
			return this.endUserId;
		}

		public void setEndUserId(String endUserId) {
			this.endUserId = endUserId;
		}

		public String getUserDesktopId() {
			return this.userDesktopId;
		}

		public void setUserDesktopId(String userDesktopId) {
			this.userDesktopId = userDesktopId;
		}

		public String getStartConnectTime() {
			return this.startConnectTime;
		}

		public void setStartConnectTime(String startConnectTime) {
			this.startConnectTime = startConnectTime;
		}

		public String getEndConnectTime() {
			return this.endConnectTime;
		}

		public void setEndConnectTime(String endConnectTime) {
			this.endConnectTime = endConnectTime;
		}
	}

	@Override
	public DescribeUserConnectTimeResponse getInstance(UnmarshallerContext context) {
		return	DescribeUserConnectTimeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
