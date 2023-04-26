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
import com.aliyuncs.ecs.transform.v20160314.DescribeNetworkInsightsAnalysisesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeNetworkInsightsAnalysisesResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private Integer maxResults;

	private List<NetworkInsightsAnalysisSet> networkInsightsAnalysisSets;

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

	public List<NetworkInsightsAnalysisSet> getNetworkInsightsAnalysisSets() {
		return this.networkInsightsAnalysisSets;
	}

	public void setNetworkInsightsAnalysisSets(List<NetworkInsightsAnalysisSet> networkInsightsAnalysisSets) {
		this.networkInsightsAnalysisSets = networkInsightsAnalysisSets;
	}

	public static class NetworkInsightsAnalysisSet {

		private String networkInsightsPathId;

		private String networkInsightsAnalysisId;

		private String networkPathFound;

		private String status;

		private String creationTime;

		private String severity;

		public String getNetworkInsightsPathId() {
			return this.networkInsightsPathId;
		}

		public void setNetworkInsightsPathId(String networkInsightsPathId) {
			this.networkInsightsPathId = networkInsightsPathId;
		}

		public String getNetworkInsightsAnalysisId() {
			return this.networkInsightsAnalysisId;
		}

		public void setNetworkInsightsAnalysisId(String networkInsightsAnalysisId) {
			this.networkInsightsAnalysisId = networkInsightsAnalysisId;
		}

		public String getNetworkPathFound() {
			return this.networkPathFound;
		}

		public void setNetworkPathFound(String networkPathFound) {
			this.networkPathFound = networkPathFound;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getSeverity() {
			return this.severity;
		}

		public void setSeverity(String severity) {
			this.severity = severity;
		}
	}

	@Override
	public DescribeNetworkInsightsAnalysisesResponse getInstance(UnmarshallerContext context) {
		return	DescribeNetworkInsightsAnalysisesResponseUnmarshaller.unmarshall(this, context);
	}
}
