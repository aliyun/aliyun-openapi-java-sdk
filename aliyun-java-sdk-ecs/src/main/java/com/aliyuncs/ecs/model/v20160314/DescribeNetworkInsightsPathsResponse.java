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

package com.aliyuncs.ecs.model.v20160314;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20160314.DescribeNetworkInsightsPathsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeNetworkInsightsPathsResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private Integer maxResults;

	private List<NetworkInsightsPathSet> networkInsightsPathSets;

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

	public List<NetworkInsightsPathSet> getNetworkInsightsPathSets() {
		return this.networkInsightsPathSets;
	}

	public void setNetworkInsightsPathSets(List<NetworkInsightsPathSet> networkInsightsPathSets) {
		this.networkInsightsPathSets = networkInsightsPathSets;
	}

	public static class NetworkInsightsPathSet {

		private String networkInsightsPathId;

		private String networkInsightsPathName;

		private String creationTime;

		private String source;

		private String sourceType;

		private String destination;

		private String destinationType;

		private String destinationPort;

		private String protocol;

		private String status;

		private String networkPathFound;

		private String severity;

		public String getNetworkInsightsPathId() {
			return this.networkInsightsPathId;
		}

		public void setNetworkInsightsPathId(String networkInsightsPathId) {
			this.networkInsightsPathId = networkInsightsPathId;
		}

		public String getNetworkInsightsPathName() {
			return this.networkInsightsPathName;
		}

		public void setNetworkInsightsPathName(String networkInsightsPathName) {
			this.networkInsightsPathName = networkInsightsPathName;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getSource() {
			return this.source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public String getSourceType() {
			return this.sourceType;
		}

		public void setSourceType(String sourceType) {
			this.sourceType = sourceType;
		}

		public String getDestination() {
			return this.destination;
		}

		public void setDestination(String destination) {
			this.destination = destination;
		}

		public String getDestinationType() {
			return this.destinationType;
		}

		public void setDestinationType(String destinationType) {
			this.destinationType = destinationType;
		}

		public String getDestinationPort() {
			return this.destinationPort;
		}

		public void setDestinationPort(String destinationPort) {
			this.destinationPort = destinationPort;
		}

		public String getBizProtocol() {
			return this.protocol;
		}

		public void setBizProtocol(String protocol) {
			this.protocol = protocol;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getNetworkPathFound() {
			return this.networkPathFound;
		}

		public void setNetworkPathFound(String networkPathFound) {
			this.networkPathFound = networkPathFound;
		}

		public String getSeverity() {
			return this.severity;
		}

		public void setSeverity(String severity) {
			this.severity = severity;
		}
	}

	@Override
	public DescribeNetworkInsightsPathsResponse getInstance(UnmarshallerContext context) {
		return	DescribeNetworkInsightsPathsResponseUnmarshaller.unmarshall(this, context);
	}
}
