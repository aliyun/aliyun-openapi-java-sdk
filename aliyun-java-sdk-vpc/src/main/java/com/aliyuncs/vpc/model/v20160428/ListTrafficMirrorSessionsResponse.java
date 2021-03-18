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

	private String requestId;

	private String nextToken;

	private String totalCount;

	private List<TrafficMirrorSession> trafficMirrorSessions;

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

		private String trafficMirrorSessionName;

		private String trafficMirrorSessionDescription;

		private String trafficMirrorSessionId;

		private String trafficMirrorSessionStatus;

		private String trafficMirrorTargetId;

		private String trafficMirrorTargetType;

		private String trafficMirrorFilterId;

		private Integer virtualNetworkId;

		private Integer priority;

		private Boolean enabled;

		private Integer packetLength;

		private String trafficMirrorSessionBusinessStatus;

		private List<String> trafficMirrorSourceIds;

		public String getTrafficMirrorSessionName() {
			return this.trafficMirrorSessionName;
		}

		public void setTrafficMirrorSessionName(String trafficMirrorSessionName) {
			this.trafficMirrorSessionName = trafficMirrorSessionName;
		}

		public String getTrafficMirrorSessionDescription() {
			return this.trafficMirrorSessionDescription;
		}

		public void setTrafficMirrorSessionDescription(String trafficMirrorSessionDescription) {
			this.trafficMirrorSessionDescription = trafficMirrorSessionDescription;
		}

		public String getTrafficMirrorSessionId() {
			return this.trafficMirrorSessionId;
		}

		public void setTrafficMirrorSessionId(String trafficMirrorSessionId) {
			this.trafficMirrorSessionId = trafficMirrorSessionId;
		}

		public String getTrafficMirrorSessionStatus() {
			return this.trafficMirrorSessionStatus;
		}

		public void setTrafficMirrorSessionStatus(String trafficMirrorSessionStatus) {
			this.trafficMirrorSessionStatus = trafficMirrorSessionStatus;
		}

		public String getTrafficMirrorTargetId() {
			return this.trafficMirrorTargetId;
		}

		public void setTrafficMirrorTargetId(String trafficMirrorTargetId) {
			this.trafficMirrorTargetId = trafficMirrorTargetId;
		}

		public String getTrafficMirrorTargetType() {
			return this.trafficMirrorTargetType;
		}

		public void setTrafficMirrorTargetType(String trafficMirrorTargetType) {
			this.trafficMirrorTargetType = trafficMirrorTargetType;
		}

		public String getTrafficMirrorFilterId() {
			return this.trafficMirrorFilterId;
		}

		public void setTrafficMirrorFilterId(String trafficMirrorFilterId) {
			this.trafficMirrorFilterId = trafficMirrorFilterId;
		}

		public Integer getVirtualNetworkId() {
			return this.virtualNetworkId;
		}

		public void setVirtualNetworkId(Integer virtualNetworkId) {
			this.virtualNetworkId = virtualNetworkId;
		}

		public Integer getPriority() {
			return this.priority;
		}

		public void setPriority(Integer priority) {
			this.priority = priority;
		}

		public Boolean getEnabled() {
			return this.enabled;
		}

		public void setEnabled(Boolean enabled) {
			this.enabled = enabled;
		}

		public Integer getPacketLength() {
			return this.packetLength;
		}

		public void setPacketLength(Integer packetLength) {
			this.packetLength = packetLength;
		}

		public String getTrafficMirrorSessionBusinessStatus() {
			return this.trafficMirrorSessionBusinessStatus;
		}

		public void setTrafficMirrorSessionBusinessStatus(String trafficMirrorSessionBusinessStatus) {
			this.trafficMirrorSessionBusinessStatus = trafficMirrorSessionBusinessStatus;
		}

		public List<String> getTrafficMirrorSourceIds() {
			return this.trafficMirrorSourceIds;
		}

		public void setTrafficMirrorSourceIds(List<String> trafficMirrorSourceIds) {
			this.trafficMirrorSourceIds = trafficMirrorSourceIds;
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
