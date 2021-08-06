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
import com.aliyuncs.ess.transform.v20140828.DescribeLifecycleActionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLifecycleActionsResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private Integer maxResults;

	private Integer totalCount;

	private List<LifecycleAction> lifecycleActions;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<LifecycleAction> getLifecycleActions() {
		return this.lifecycleActions;
	}

	public void setLifecycleActions(List<LifecycleAction> lifecycleActions) {
		this.lifecycleActions = lifecycleActions;
	}

	public static class LifecycleAction {

		private String lifecycleActionToken;

		private String lifecycleActionStatus;

		private String lifecycleActionResult;

		private String lifecycleHookId;

		private List<String> instanceIds;

		public String getLifecycleActionToken() {
			return this.lifecycleActionToken;
		}

		public void setLifecycleActionToken(String lifecycleActionToken) {
			this.lifecycleActionToken = lifecycleActionToken;
		}

		public String getLifecycleActionStatus() {
			return this.lifecycleActionStatus;
		}

		public void setLifecycleActionStatus(String lifecycleActionStatus) {
			this.lifecycleActionStatus = lifecycleActionStatus;
		}

		public String getLifecycleActionResult() {
			return this.lifecycleActionResult;
		}

		public void setLifecycleActionResult(String lifecycleActionResult) {
			this.lifecycleActionResult = lifecycleActionResult;
		}

		public String getLifecycleHookId() {
			return this.lifecycleHookId;
		}

		public void setLifecycleHookId(String lifecycleHookId) {
			this.lifecycleHookId = lifecycleHookId;
		}

		public List<String> getInstanceIds() {
			return this.instanceIds;
		}

		public void setInstanceIds(List<String> instanceIds) {
			this.instanceIds = instanceIds;
		}
	}

	@Override
	public DescribeLifecycleActionsResponse getInstance(UnmarshallerContext context) {
		return	DescribeLifecycleActionsResponseUnmarshaller.unmarshall(this, context);
	}
}
