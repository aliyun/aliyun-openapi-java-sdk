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

package com.aliyuncs.ecs.model.v20140526;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.ListPluginStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPluginStatusResponse extends AcsResponse {

	private Long pageSize;

	private String requestId;

	private Long pageNumber;

	private Long totalCount;

	private String nextToken;

	private List<InstancePluginStatus> instancePluginStatusSet;

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<InstancePluginStatus> getInstancePluginStatusSet() {
		return this.instancePluginStatusSet;
	}

	public void setInstancePluginStatusSet(List<InstancePluginStatus> instancePluginStatusSet) {
		this.instancePluginStatusSet = instancePluginStatusSet;
	}

	public static class InstancePluginStatus {

		private String instanceId;

		private List<PluginStatus> pluginStatusSet;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public List<PluginStatus> getPluginStatusSet() {
			return this.pluginStatusSet;
		}

		public void setPluginStatusSet(List<PluginStatus> pluginStatusSet) {
			this.pluginStatusSet = pluginStatusSet;
		}

		public static class PluginStatus {

			private String pluginStatus;

			private String pluginVersion;

			private String pluginName;

			private String firstHeartbeatTime;

			private String lastHeartbeatTime;

			public String getPluginStatus() {
				return this.pluginStatus;
			}

			public void setPluginStatus(String pluginStatus) {
				this.pluginStatus = pluginStatus;
			}

			public String getPluginVersion() {
				return this.pluginVersion;
			}

			public void setPluginVersion(String pluginVersion) {
				this.pluginVersion = pluginVersion;
			}

			public String getPluginName() {
				return this.pluginName;
			}

			public void setPluginName(String pluginName) {
				this.pluginName = pluginName;
			}

			public String getFirstHeartbeatTime() {
				return this.firstHeartbeatTime;
			}

			public void setFirstHeartbeatTime(String firstHeartbeatTime) {
				this.firstHeartbeatTime = firstHeartbeatTime;
			}

			public String getLastHeartbeatTime() {
				return this.lastHeartbeatTime;
			}

			public void setLastHeartbeatTime(String lastHeartbeatTime) {
				this.lastHeartbeatTime = lastHeartbeatTime;
			}
		}
	}

	@Override
	public ListPluginStatusResponse getInstance(UnmarshallerContext context) {
		return	ListPluginStatusResponseUnmarshaller.unmarshall(this, context);
	}
}
