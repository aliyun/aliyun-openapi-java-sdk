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

package com.aliyuncs.adb.model.v20190315;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.adb.transform.v20190315.DescribeConnectionCountRecordsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeConnectionCountRecordsResponse extends AcsResponse {

	private String totalCount;

	private String requestId;

	private String dBClusterId;

	private List<Users> userRecords;

	private List<AccessIps> accessIpRecords;

	public String getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDBClusterId() {
		return this.dBClusterId;
	}

	public void setDBClusterId(String dBClusterId) {
		this.dBClusterId = dBClusterId;
	}

	public List<Users> getUserRecords() {
		return this.userRecords;
	}

	public void setUserRecords(List<Users> userRecords) {
		this.userRecords = userRecords;
	}

	public List<AccessIps> getAccessIpRecords() {
		return this.accessIpRecords;
	}

	public void setAccessIpRecords(List<AccessIps> accessIpRecords) {
		this.accessIpRecords = accessIpRecords;
	}

	public static class Users {

		private String user;

		private Long count;

		public String getUser() {
			return this.user;
		}

		public void setUser(String user) {
			this.user = user;
		}

		public Long getCount() {
			return this.count;
		}

		public void setCount(Long count) {
			this.count = count;
		}
	}

	public static class AccessIps {

		private String accessIp;

		private Long count;

		public String getAccessIp() {
			return this.accessIp;
		}

		public void setAccessIp(String accessIp) {
			this.accessIp = accessIp;
		}

		public Long getCount() {
			return this.count;
		}

		public void setCount(Long count) {
			this.count = count;
		}
	}

	@Override
	public DescribeConnectionCountRecordsResponse getInstance(UnmarshallerContext context) {
		return	DescribeConnectionCountRecordsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
