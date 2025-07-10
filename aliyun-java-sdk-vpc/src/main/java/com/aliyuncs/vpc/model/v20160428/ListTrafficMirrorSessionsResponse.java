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

package com.aliyuncs.vpc.model.v20160428;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vpc.transform.v20160428.ListTrafficMirrorSessionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTrafficMirrorSessionsResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private String totalCount;

	private List<TrafficMirrorSession> trafficMirrorSessions;

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

	public String getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public List<TrafficMirrorSession> getTrafficMirrorSessions() {
		return this.trafficMirrorSessions;
	}

	public void setTrafficMirrorSessions(List<TrafficMirrorSession> trafficMirrorSessions) {
		this.trafficMirrorSessions = trafficMirrorSessions;
	}

	public static class TrafficMirrorSession {

		private String trafficMirrorTargetId;

		private String trafficMirrorSessionId;

		private Integer priority;

		private String trafficMirrorTargetType;

		private Integer packetLength;

		private String trafficMirrorSessionDescription;

		private String trafficMirrorSessionStatus;

		private Boolean enabled;

		private String trafficMirrorSessionBusinessStatus;

		private Integer virtualNetworkId;

		private String trafficMirrorFilterId;

		private String trafficMirrorSessionName;

		private String resourceGroupId;

		private String creationTime;

		private Integer trafficMirrorSourceTruncateMode;

		private List<Tag> tags;

		private List<String> trafficMirrorSourceIds;

		public String getTrafficMirrorTargetId() {
			return this.trafficMirrorTargetId;
		}

		public void setTrafficMirrorTargetId(String trafficMirrorTargetId) {
			this.trafficMirrorTargetId = trafficMirrorTargetId;
		}

		public String getTrafficMirrorSessionId() {
			return this.trafficMirrorSessionId;
		}

		public void setTrafficMirrorSessionId(String trafficMirrorSessionId) {
			this.trafficMirrorSessionId = trafficMirrorSessionId;
		}

		public Integer getPriority() {
			return this.priority;
		}

		public void setPriority(Integer priority) {
			this.priority = priority;
		}

		public String getTrafficMirrorTargetType() {
			return this.trafficMirrorTargetType;
		}

		public void setTrafficMirrorTargetType(String trafficMirrorTargetType) {
			this.trafficMirrorTargetType = trafficMirrorTargetType;
		}

		public Integer getPacketLength() {
			return this.packetLength;
		}

		public void setPacketLength(Integer packetLength) {
			this.packetLength = packetLength;
		}

		public String getTrafficMirrorSessionDescription() {
			return this.trafficMirrorSessionDescription;
		}

		public void setTrafficMirrorSessionDescription(String trafficMirrorSessionDescription) {
			this.trafficMirrorSessionDescription = trafficMirrorSessionDescription;
		}

		public String getTrafficMirrorSessionStatus() {
			return this.trafficMirrorSessionStatus;
		}

		public void setTrafficMirrorSessionStatus(String trafficMirrorSessionStatus) {
			this.trafficMirrorSessionStatus = trafficMirrorSessionStatus;
		}

		public Boolean getEnabled() {
			return this.enabled;
		}

		public void setEnabled(Boolean enabled) {
			this.enabled = enabled;
		}

		public String getTrafficMirrorSessionBusinessStatus() {
			return this.trafficMirrorSessionBusinessStatus;
		}

		public void setTrafficMirrorSessionBusinessStatus(String trafficMirrorSessionBusinessStatus) {
			this.trafficMirrorSessionBusinessStatus = trafficMirrorSessionBusinessStatus;
		}

		public Integer getVirtualNetworkId() {
			return this.virtualNetworkId;
		}

		public void setVirtualNetworkId(Integer virtualNetworkId) {
			this.virtualNetworkId = virtualNetworkId;
		}

		public String getTrafficMirrorFilterId() {
			return this.trafficMirrorFilterId;
		}

		public void setTrafficMirrorFilterId(String trafficMirrorFilterId) {
			this.trafficMirrorFilterId = trafficMirrorFilterId;
		}

		public String getTrafficMirrorSessionName() {
			return this.trafficMirrorSessionName;
		}

		public void setTrafficMirrorSessionName(String trafficMirrorSessionName) {
			this.trafficMirrorSessionName = trafficMirrorSessionName;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public Integer getTrafficMirrorSourceTruncateMode() {
			return this.trafficMirrorSourceTruncateMode;
		}

		public void setTrafficMirrorSourceTruncateMode(Integer trafficMirrorSourceTruncateMode) {
			this.trafficMirrorSourceTruncateMode = trafficMirrorSourceTruncateMode;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public List<String> getTrafficMirrorSourceIds() {
			return this.trafficMirrorSourceIds;
		}

		public void setTrafficMirrorSourceIds(List<String> trafficMirrorSourceIds) {
			this.trafficMirrorSourceIds = trafficMirrorSourceIds;
		}

		public static class Tag {

			private String key;

			private String value;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}
	}

	@Override
	public ListTrafficMirrorSessionsResponse getInstance(UnmarshallerContext context) {
		return	ListTrafficMirrorSessionsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
