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

package com.aliyuncs.sddp.model.v20190103;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sddp.transform.v20190103.DescribeDataHubSubscriptionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDataHubSubscriptionsResponse extends AcsResponse {

	private String requestId;

	private Integer pageSize;

	private Integer currentPage;

	private Integer totalCount;

	private List<Subscription> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<Subscription> getItems() {
		return this.items;
	}

	public void setItems(List<Subscription> items) {
		this.items = items;
	}

	public static class Subscription {

		private Long id;

		private String name;

		private String description;

		private Long creationTime;

		private String state;

		private String applicationName;

		private Long userId;

		private String loginName;

		private String displayName;

		private Long subscriptionUserId;

		private String subscriptionUserName;

		private String subscriptionDisplayName;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Long getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(Long creationTime) {
			this.creationTime = creationTime;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getApplicationName() {
			return this.applicationName;
		}

		public void setApplicationName(String applicationName) {
			this.applicationName = applicationName;
		}

		public Long getUserId() {
			return this.userId;
		}

		public void setUserId(Long userId) {
			this.userId = userId;
		}

		public String getLoginName() {
			return this.loginName;
		}

		public void setLoginName(String loginName) {
			this.loginName = loginName;
		}

		public String getDisplayName() {
			return this.displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}

		public Long getSubscriptionUserId() {
			return this.subscriptionUserId;
		}

		public void setSubscriptionUserId(Long subscriptionUserId) {
			this.subscriptionUserId = subscriptionUserId;
		}

		public String getSubscriptionUserName() {
			return this.subscriptionUserName;
		}

		public void setSubscriptionUserName(String subscriptionUserName) {
			this.subscriptionUserName = subscriptionUserName;
		}

		public String getSubscriptionDisplayName() {
			return this.subscriptionDisplayName;
		}

		public void setSubscriptionDisplayName(String subscriptionDisplayName) {
			this.subscriptionDisplayName = subscriptionDisplayName;
		}
	}

	@Override
	public DescribeDataHubSubscriptionsResponse getInstance(UnmarshallerContext context) {
		return	DescribeDataHubSubscriptionsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
