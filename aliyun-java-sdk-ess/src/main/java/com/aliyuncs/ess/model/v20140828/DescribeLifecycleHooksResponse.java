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

package com.aliyuncs.ess.model.v20140828;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ess.transform.v20140828.DescribeLifecycleHooksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLifecycleHooksResponse extends AcsResponse {

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private String requestId;

	private List<LifecycleHook> lifecycleHooks;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

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

	public List<LifecycleHook> getLifecycleHooks() {
		return this.lifecycleHooks;
	}

	public void setLifecycleHooks(List<LifecycleHook> lifecycleHooks) {
		this.lifecycleHooks = lifecycleHooks;
	}

	public static class LifecycleHook {

		private String scalingGroupId;

		private String lifecycleHookId;

		private String lifecycleHookName;

		private String defaultResult;

		private Integer heartbeatTimeout;

		private String lifecycleTransition;

		private String notificationMetadata;

		private String notificationArn;

		public String getScalingGroupId() {
			return this.scalingGroupId;
		}

		public void setScalingGroupId(String scalingGroupId) {
			this.scalingGroupId = scalingGroupId;
		}

		public String getLifecycleHookId() {
			return this.lifecycleHookId;
		}

		public void setLifecycleHookId(String lifecycleHookId) {
			this.lifecycleHookId = lifecycleHookId;
		}

		public String getLifecycleHookName() {
			return this.lifecycleHookName;
		}

		public void setLifecycleHookName(String lifecycleHookName) {
			this.lifecycleHookName = lifecycleHookName;
		}

		public String getDefaultResult() {
			return this.defaultResult;
		}

		public void setDefaultResult(String defaultResult) {
			this.defaultResult = defaultResult;
		}

		public Integer getHeartbeatTimeout() {
			return this.heartbeatTimeout;
		}

		public void setHeartbeatTimeout(Integer heartbeatTimeout) {
			this.heartbeatTimeout = heartbeatTimeout;
		}

		public String getLifecycleTransition() {
			return this.lifecycleTransition;
		}

		public void setLifecycleTransition(String lifecycleTransition) {
			this.lifecycleTransition = lifecycleTransition;
		}

		public String getNotificationMetadata() {
			return this.notificationMetadata;
		}

		public void setNotificationMetadata(String notificationMetadata) {
			this.notificationMetadata = notificationMetadata;
		}

		public String getNotificationArn() {
			return this.notificationArn;
		}

		public void setNotificationArn(String notificationArn) {
			this.notificationArn = notificationArn;
		}
	}

	@Override
	public DescribeLifecycleHooksResponse getInstance(UnmarshallerContext context) {
		return	DescribeLifecycleHooksResponseUnmarshaller.unmarshall(this, context);
	}
}
