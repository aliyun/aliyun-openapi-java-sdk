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

package com.aliyuncs.smartag.model.v20180313;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.smartag.transform.v20180313.DescribeSmartAccessGatewayClientUsersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSmartAccessGatewayClientUsersResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNo;

	private Integer pageSize;

	private List<User> users;

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

	public Integer getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<User> getUsers() {
		return this.users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public static class User {

		private String smartAccessGatewayId;

		private String clientIp;

		private String userMail;

		private String userName;

		private Boolean isStaticIp;

		private Boolean isSharedUser;

		private Integer bandwidth;

		public String getSmartAccessGatewayId() {
			return this.smartAccessGatewayId;
		}

		public void setSmartAccessGatewayId(String smartAccessGatewayId) {
			this.smartAccessGatewayId = smartAccessGatewayId;
		}

		public String getClientIp() {
			return this.clientIp;
		}

		public void setClientIp(String clientIp) {
			this.clientIp = clientIp;
		}

		public String getUserMail() {
			return this.userMail;
		}

		public void setUserMail(String userMail) {
			this.userMail = userMail;
		}

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public Boolean getIsStaticIp() {
			return this.isStaticIp;
		}

		public void setIsStaticIp(Boolean isStaticIp) {
			this.isStaticIp = isStaticIp;
		}

		public Boolean getIsSharedUser() {
			return this.isSharedUser;
		}

		public void setIsSharedUser(Boolean isSharedUser) {
			this.isSharedUser = isSharedUser;
		}

		public Integer getBandwidth() {
			return this.bandwidth;
		}

		public void setBandwidth(Integer bandwidth) {
			this.bandwidth = bandwidth;
		}
	}

	@Override
	public DescribeSmartAccessGatewayClientUsersResponse getInstance(UnmarshallerContext context) {
		return	DescribeSmartAccessGatewayClientUsersResponseUnmarshaller.unmarshall(this, context);
	}
}
