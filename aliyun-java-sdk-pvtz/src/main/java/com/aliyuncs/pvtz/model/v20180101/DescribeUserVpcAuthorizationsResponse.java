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

package com.aliyuncs.pvtz.model.v20180101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.pvtz.transform.v20180101.DescribeUserVpcAuthorizationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeUserVpcAuthorizationsResponse extends AcsResponse {

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private Integer totalPages;

	private Integer totalItems;

	private List<User> users;

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getTotalPages() {
		return this.totalPages;
	}

	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}

	public Integer getTotalItems() {
		return this.totalItems;
	}

	public void setTotalItems(Integer totalItems) {
		this.totalItems = totalItems;
	}

	public List<User> getUsers() {
		return this.users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public static class User {

		private String authType;

		private Long authorizedUserId;

		private String authorizedAliyunId;

		private String createTime;

		private Long createTimestamp;

		public String getAuthType() {
			return this.authType;
		}

		public void setAuthType(String authType) {
			this.authType = authType;
		}

		public Long getAuthorizedUserId() {
			return this.authorizedUserId;
		}

		public void setAuthorizedUserId(Long authorizedUserId) {
			this.authorizedUserId = authorizedUserId;
		}

		public String getAuthorizedAliyunId() {
			return this.authorizedAliyunId;
		}

		public void setAuthorizedAliyunId(String authorizedAliyunId) {
			this.authorizedAliyunId = authorizedAliyunId;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public Long getCreateTimestamp() {
			return this.createTimestamp;
		}

		public void setCreateTimestamp(Long createTimestamp) {
			this.createTimestamp = createTimestamp;
		}
	}

	@Override
	public DescribeUserVpcAuthorizationsResponse getInstance(UnmarshallerContext context) {
		return	DescribeUserVpcAuthorizationsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
