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

package com.aliyuncs.resourcesharing.model.v20200110;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.resourcesharing.transform.v20200110.ListSharedTargetsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSharedTargetsResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private List<SharedTarget> sharedTargets;

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<SharedTarget> getSharedTargets() {
		return this.sharedTargets;
	}

	public void setSharedTargets(List<SharedTarget> sharedTargets) {
		this.sharedTargets = sharedTargets;
	}

	public static class SharedTarget {

		private String targetId;

		private String updateTime;

		private String createTime;

		private String resourceShareId;

		private Boolean external;

		private String targetProperty;

		public String getTargetId() {
			return this.targetId;
		}

		public void setTargetId(String targetId) {
			this.targetId = targetId;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getResourceShareId() {
			return this.resourceShareId;
		}

		public void setResourceShareId(String resourceShareId) {
			this.resourceShareId = resourceShareId;
		}

		public Boolean getExternal() {
			return this.external;
		}

		public void setExternal(Boolean external) {
			this.external = external;
		}

		public String getTargetProperty() {
			return this.targetProperty;
		}

		public void setTargetProperty(String targetProperty) {
			this.targetProperty = targetProperty;
		}
	}

	@Override
	public ListSharedTargetsResponse getInstance(UnmarshallerContext context) {
		return	ListSharedTargetsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
